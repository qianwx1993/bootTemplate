package com.smk.form.local.req;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * @Version 1.0
 * @Since JDK1.8
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/9/19 10:23
 */
@Data
@ToString(callSuper = true)
public class FaceDataUpReqForm extends BaseReqForm{
	private String idType;

	private String idCard;

	private String custName;

	@NotBlank(message = "hisSetSeq不能为空")
	private String hisSetSeq;

	private String faceSeq;

	@NotBlank(message = "socNo不能为空")
	private String socNo;

	/**00--实名认证通过 01--实名认证不通过 02--未经过实名*/
	@NotBlank(message = "realNameRes不能为空")
	private String realNameRes;

	@NotBlank(message = "hisOrgNo不能为空")
	private String hisOrgNo;
}
