package com.entity.view;

import com.entity.YonghutoushuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户投诉
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yonghutoushu")
public class YonghutoushuView extends YonghutoushuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 投诉类型的值
		*/
		private String yonghutoushuValue;
		/**
		* 投诉状态的值
		*/
		private String yonghutoushuStatusValue;



		//级联表 shangjia
			/**
			* 商家名称
			*/
			private String shangjiaName;
			/**
			* 联系方式
			*/
			private String shangjiaPhone;
			/**
			* 邮箱
			*/
			private String shangjiaEmail;
			/**
			* 营业执照展示
			*/
			private String shangjiaPhoto;
			/**
			* 商家星级类型
			*/
			private Integer shangjiaXingjiTypes;
				/**
				* 商家星级类型的值
				*/
				private String shangjiaXingjiValue;
			/**
			* 现有余额
			*/
			private Double newMoney;
			/**
			* 商家简介
			*/
			private String shangjiaContent;
			/**
			* 逻辑删除
			*/
			private Integer shangjiaDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public YonghutoushuView() {

	}

	public YonghutoushuView(YonghutoushuEntity yonghutoushuEntity) {
		try {
			BeanUtils.copyProperties(this, yonghutoushuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 投诉类型的值
			*/
			public String getYonghutoushuValue() {
				return yonghutoushuValue;
			}
			/**
			* 设置： 投诉类型的值
			*/
			public void setYonghutoushuValue(String yonghutoushuValue) {
				this.yonghutoushuValue = yonghutoushuValue;
			}
			/**
			* 获取： 投诉状态的值
			*/
			public String getYonghutoushuStatusValue() {
				return yonghutoushuStatusValue;
			}
			/**
			* 设置： 投诉状态的值
			*/
			public void setYonghutoushuStatusValue(String yonghutoushuStatusValue) {
				this.yonghutoushuStatusValue = yonghutoushuStatusValue;
			}



































				//级联表的get和set shangjia
					/**
					* 获取： 商家名称
					*/
					public String getShangjiaName() {
						return shangjiaName;
					}
					/**
					* 设置： 商家名称
					*/
					public void setShangjiaName(String shangjiaName) {
						this.shangjiaName = shangjiaName;
					}
					/**
					* 获取： 联系方式
					*/
					public String getShangjiaPhone() {
						return shangjiaPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setShangjiaPhone(String shangjiaPhone) {
						this.shangjiaPhone = shangjiaPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getShangjiaEmail() {
						return shangjiaEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setShangjiaEmail(String shangjiaEmail) {
						this.shangjiaEmail = shangjiaEmail;
					}
					/**
					* 获取： 营业执照展示
					*/
					public String getShangjiaPhoto() {
						return shangjiaPhoto;
					}
					/**
					* 设置： 营业执照展示
					*/
					public void setShangjiaPhoto(String shangjiaPhoto) {
						this.shangjiaPhoto = shangjiaPhoto;
					}
					/**
					* 获取： 商家星级类型
					*/
					public Integer getShangjiaXingjiTypes() {
						return shangjiaXingjiTypes;
					}
					/**
					* 设置： 商家星级类型
					*/
					public void setShangjiaXingjiTypes(Integer shangjiaXingjiTypes) {
						this.shangjiaXingjiTypes = shangjiaXingjiTypes;
					}


						/**
						* 获取： 商家星级类型的值
						*/
						public String getShangjiaXingjiValue() {
							return shangjiaXingjiValue;
						}
						/**
						* 设置： 商家星级类型的值
						*/
						public void setShangjiaXingjiValue(String shangjiaXingjiValue) {
							this.shangjiaXingjiValue = shangjiaXingjiValue;
						}

					/**
					* 获取： 商家简介
					*/
					public String getShangjiaContent() {
						return shangjiaContent;
					}
					/**
					* 设置： 商家简介
					*/
					public void setShangjiaContent(String shangjiaContent) {
						this.shangjiaContent = shangjiaContent;
					}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getShangjiaDelete() {
						return shangjiaDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShangjiaDelete(Integer shangjiaDelete) {
						this.shangjiaDelete = shangjiaDelete;
					}


				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}







}
