package org.pussinboots.morning.cms.controller.product;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.pussinboots.morning.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Package org.pussinboots.morning.cms.controller.product
 * @Class ProductListController.java
 * @Author Darrick
 * @Date 2017年12月29日 上午10:49:49 
 * @Description 产品列表
 * @Versions 1.0
 */
@Controller
@RequestMapping(value="/product/list")
public class ProductListController extends BaseController{
	
	/**
	 * @Method toProductListPage  
	 * @Description:此处要加Model model 否则会报404错误  
	 * @param model
	 * @return
	 * @Author Darrick
	 * @Return String
	 * @Date 2017年12月29日 下午2:15:25
	 */
	@RequiresPermissions("product:list:view")
	@RequestMapping(value="/view",method = RequestMethod.GET)
	public String toProductListPage(Model model) {
		return "/modules/product/product_list";
	}
	
	
}
