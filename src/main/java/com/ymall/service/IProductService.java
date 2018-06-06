package com.ymall.service;

import com.github.pagehelper.PageInfo;
import com.ymall.common.ServerResponse;
import com.ymall.pojo.Product;
import com.ymall.pojo.vo.ProductDetailVo;

public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse getProductList(int pageNum, int pageSize);

    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);

    ServerResponse<ProductDetailVo> getDetail(Integer productId);

    ServerResponse<PageInfo> list(String keyword, Integer categoryId, int pageNum, int pageSize, String orderBy);
}
