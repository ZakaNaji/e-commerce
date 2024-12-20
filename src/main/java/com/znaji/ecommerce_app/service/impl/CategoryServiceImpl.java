package com.znaji.ecommerce_app.service.impl;

import com.znaji.ecommerce_app.dto.CategoryDTO;
import com.znaji.ecommerce_app.dto.CategoryResponse;
import com.znaji.ecommerce_app.entity.Category;
import com.znaji.ecommerce_app.repository.CategoryRepository;
import com.znaji.ecommerce_app.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper ;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Category createCategory(Category category) {
        checkCategoryName(category.getCategoryName());
        return categoryRepository.save(category);
    }

    @Override
    public CategoryResponse findAllCategories(int pageNumber, int pageSize) {
        Page<Category> categories = categoryRepository.findAll(PageRequest.of(pageNumber, pageSize));
        List<CategoryDTO> categoryDTOS = categories.stream()
                .map(c -> modelMapper.map(c, CategoryDTO.class))
                .toList();
        CategoryResponse categoryResponse = new CategoryResponse(categoryDTOS);
        categoryResponse.setTotalPages(categories.getTotalPages());
        categoryResponse.setTotalElements(categories.getTotalElements());
        categoryResponse.setPageNumber(categories.getNumber());
        categoryResponse.setPageSize(categories.getSize());
        categoryResponse.setLastPage(categories.isLast());
        return categoryResponse;
    }

    @Override
    public Category updateCategory(Category category) {
        Category dbCat = categoryRepository.findById(category.getCategoryId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
        checkCategoryName(category.getCategoryName());
        dbCat.setCategoryName(category.getCategoryName());
        return categoryRepository.save(dbCat);
    }

    @Override
    public void deleteCategory(Long categoryId) {
        Category dbCat = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
        categoryRepository.delete(dbCat);
    }

    @Override
    public Category findCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
    }

    private void checkCategoryName(String categoryName) {
        if (categoryRepository.findByCategoryName(categoryName).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Category already exists");
        }
    }
}
