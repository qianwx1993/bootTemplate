package com.smk.http.back.util;

import com.alibaba.fastjson.JSONObject;
import com.smk.form.local.res.BaseResForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Version 1.0
 * @Since JDK1.7
 * @Author HYK
 * @Company bangsun
 * @Date 2018/10/11 12:02
 */
@Slf4j
@Component("backHttpUtil1")
public class BackHttpUtil {

	/**
	 * 发送前保存日志
	 *
	 * @param sendJson 发送信息
	 */
	public void doBeforeHttp(JSONObject sendJson) {
		// biexptxnlogtb 后台发送日志表
	}

	/**
	 * 发送后更新日志
	 *
	 * @param backJson 返回日志
	 * @return 返回给前端的数据
	 */
	public BaseResForm doAfterHttp(JSONObject backJson) {
		// biexptxnlogtb 后台发送日志表
		String errCode = AccCenrJsonUtil.getJsonHeadErrCode(backJson);
		String errDisp = tranCode(errCode);

		BaseResForm baseResForm;

		if (AccCenrJsonUtil.isSuc(backJson)) {
			baseResForm = BaseResForm.success();
		} else {
			baseResForm = BaseResForm.back(errCode, errDisp);
		}

		return baseResForm;
	}


	/*交易应答码定义*/
	public static String tranCode(String errcode) {
		switch (errcode) {
			case "00":
				return "成功";
			case "03":
				return "无效商户";
			case "04":
				return "终端状态异常";
			case "05":
				return "无效终端";
			case "14":
				return "无效卡号";
			case "15":
				return "卡状态不正确，已挂失或冻结";
			case "16":
				return "卡帐户不存在";
			case "17":
				return "帐户状态不正确";
			case "20":
				return "用户卡号未启用";
			case "22":
				return "原交易已被冲正或被撤销";
			case "24":
				return "原交易不存在";
			case "2B":
				return "日切中，不允许交易";
			case "37":
				return "帐户余额密文校验错";
			case "39":
				return "与原交易金额不一致";
			case "3A":
				return "证件类型错";
			case "3B":
				return "证件号码错";
			case "51":
				return "无足够的存款";
			case "57":
				return "身份证信息不符";
			case "85":
				return "预付卡核心交互异常";
			case "96":
				return "系统异常、失效";
			case "97":
				return "POS终端号找不到";
			case "99":
				return "PIN格式错";
			case "A0":
				return "MAC校验错";
			case "A1":
				return "卡类型错误。非记名消费卡";
			case "A2":
				return "用户未开通网上支付功能";
			case "A3":
				return "用户单笔消费额度受限";
			case "A4":
				return "用户当日消费额度受限";
			case "A5":
				return "非记名消费卡不允许交易";
			case "A6":
				return "交易密码错误";
			case "A7":
				return "服务密码错误";
			case "A8":
				return "交易密码未修改";
			case "A9":
				return "交易密码不能修改为默认密码";
			case "B0":
				return "卡验证，该卡已开通市民卡账户功能";
			case "B1":
				return "卡验证，该卡卡管状态不正确";
			case "B2":
				return "市民卡开户，该卡不允许重复开同类型账户";
			case "B3":
				return "卡验证，该卡卡管中未找到";
			case "B4":
				return "该卡已绑定成人卡";
			case "B5":
				return "该卡已开通智慧医院功能";
			case "B6":
				return "卡管未启用";
			case "B7":
				return "卡管预挂失";
			case "B8":
				return "卡管正式挂失";
			case "B9":
				return "卡管注销";
			case "D0":
				return "黑名单商户";
			case "D1":
				return "黑名单卡片";
			case "D2":
				return "日充值笔数超限制";
			case "D3":
				return "日充值金额超限";
			case "D4":
				return "日消费笔数超限";
			case "D5":
				return "日消费金额超限";
			case "D6":
				return "月充值笔数超限制";
			case "D7":
				return "月充值金额超限";
			case "D8":
				return "月消费笔数超限";
			case "D9":
				return "月消费金额超限";
			case "DA":
				return "最大单笔充值金额超限";
			case "DB":
				return "最大单笔消费金额超限";
			case "7A":
				return "账户最大金额超限";
			case "F0":
				return "报文格式错误，解析失败";
			case "F1":
				return "请求参数不足";
			case "F2":
				return "请求参数异常";
			case "F3":
				return "该类型卡暂不支持";
			case "G1":
				return "账户余额大于0，不允许销户";
			case "G2":
				return "账户余额大于消费卡最低销户额度";
			case "G3":
				return "该卡类型不支持智慧医疗";
			case "G4":
				return "新卡已开户，不允许补换";
			case "G5":
				return "交易金额错误";
			case "G6":
				return "该证件号已有该类型记名卡，不允许再次开户";
			case "G7":
				return "刮刮卡不是激活状态，无法换卡";
			case "G8":
				return "新刮刮卡不是未激活状态，无法换卡";
			case "G9":
				return "刮刮卡金额不一致，无法换卡";
			case "H1":
				return "预付卡核心系统异常";
			case "H2":
				return "预付卡核心数据更新异常";
			case "H3":
				return "预付卡核心查询无交易记录";
			case "H4":
				return "预付卡核心账户不存在";
			case "H5":
				return "预付卡核心账户状态异常";
			case "H6":
				return "预付卡核心账户被冻结";
			case "H7":
				return "卡内余额过多，无法销卡";
			case "H8":
				return "线下转线上额度超限";
			case "H9":
				return "卡号已开卡，不能重复开卡";
			case "H0":
				return "退款金额超过原始金额";
			case "HA":
				return "订单号不存在";
			case "HB":
				return "已全部退款";
			case "HC":
				return "金额超限";
			case "HD":
				return "资金来源不明确";
			case "HE":
				return "记录不存在";
			case "HF":
				return "刷卡次数超限(老年卡一天只能刷5次)";
			case "HH":
				return "预付卡核心未知错误码";
			case "EE":
				return "后台请求失败";
			default:
				return "未知错误导致交易失败";
		}
	}

}
