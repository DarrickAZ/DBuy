package org.pussinboots.morning.cms.controller.administrator;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.pussinboots.morning.administrator.common.constant.UserReturnCode;
import org.pussinboots.morning.administrator.entity.Role;
import org.pussinboots.morning.administrator.entity.User;
import org.pussinboots.morning.administrator.entity.UserLoginLog;
import org.pussinboots.morning.administrator.pojo.vo.UserVO;
import org.pussinboots.morning.administrator.service.IUserLoginLogService;
import org.pussinboots.morning.administrator.service.IUserRoleService;
import org.pussinboots.morning.administrator.service.IUserService;
import org.pussinboots.morning.cms.common.result.CmsPageResult;
import org.pussinboots.morning.cms.common.result.CmsResult;
import org.pussinboots.morning.cms.common.security.AuthorizingUser;
import org.pussinboots.morning.cms.common.util.SingletonLoginUtils;
import org.pussinboots.morning.common.base.BaseController;
import org.pussinboots.morning.common.base.BasePageDTO;
import org.pussinboots.morning.common.constant.CommonReturnCode;
import org.pussinboots.morning.common.enums.StatusEnum;
import org.pussinboots.morning.common.exception.ValidateException;
import org.pussinboots.morning.common.support.page.PageInfo;
import org.pussinboots.morning.common.util.RegexUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
* 项目名称：morning-cms-web Maven Webapp
* 类名称：AdministratorInfoController
* 类描述：管理员个人信息表示层控制器
* 创建人：陈星星
* 创建时间：2017年4月2日 上午1:49:53
*
 */
@Controller
@RequestMapping(value = "/administrator/index")
@Api(value = "管理员首页", description = "管理员首页信息")
public class AdministratorIndexController extends BaseController {

	/**
	 * GET 管理员首页信息
	 * @return
	 */
	@ApiOperation(value = "管理员首页信息", notes = "管理员首页/管理员首页信息")
	//@RequiresPermissions("administrator:index")
	@GetMapping
	public String getInfoPage(Model model) {

		return "/modules/admin/admin_index";
	}

}
