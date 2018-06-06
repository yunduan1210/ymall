package com.ymall.controller.backend;

import com.github.pagehelper.PageInfo;
import com.ymall.common.ServerResponse;
import com.ymall.pojo.vo.ProductDetailVo;
import com.ymall.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping("/getDetail.do")
    @ResponseBody
    public ServerResponse<ProductDetailVo> getDetail(Integer productId){
        return iProductService.getDetail(productId);
    }


    /**
     * 用户端产品搜索
     * @param keyword     商品名字
     * @param categoryId   品类Id
     * @param pageNum      分页
     * @param pageSize
     * @param orderBy      排序
     * @return
     */
    @RequestMapping("/list.do")
    @ResponseBody
    public ServerResponse<PageInfo> list(@RequestParam(value = "keyword",required = false) String keyword,
                                         @RequestParam(value = "categoryId",required = false) Integer categoryId,
                                         @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                         @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize,
                                         @RequestParam(value = "orderBy",defaultValue = "")String orderBy){
        return iProductService.list(keyword,categoryId,pageNum,pageSize,orderBy);
    }
}
