package com.ymall.service;

import com.ymall.common.ServerResponse;
import com.ymall.pojo.Product;
import com.ymall.pojo.vo.ProductDetailVo;

public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId,Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
}
