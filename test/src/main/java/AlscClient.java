//import com.alibaba.alsc.client.api.AlscConsumeService;
//import com.alibaba.alsc.client.enums.BizTypeEnum;
//import com.alibaba.alsc.client.enums.OwnerTypeEnum;
//import com.alibaba.alsc.client.model.dto.AlscConsumeRecordInfo;
//import com.alibaba.alsc.client.request.RecordQueryRequest;
//import com.alibaba.alsc.client.result.MultiDataResult;
//import com.alibaba.fastjson.JSONObject;
//
//import com.google.common.collect.Lists;
//import com.taobao.hsf.app.api.util.HSFApiConsumerBean;
//
///**
// * 描述：调用口碑的接口查询消费记录
// *
// * @author minggang.tmg(橙鸢)
// * @date 2020/4/17
// */
//public class AlscClient {
//
//    public static void main(String[] args) throws Exception {
//
//        System.out.println(new AlscClient().sayHi());
//
//    }
//
//    public String sayHi() throws Exception {
//        HSFApiConsumerBean hsfApiConsumerBean = new HSFApiConsumerBean();
//        hsfApiConsumerBean.setInterfaceName("com.alibaba.alsc.client.api.AlscConsumeService");
//        hsfApiConsumerBean.setVersion("1.0.0.daily");
//        hsfApiConsumerBean.setGroup("HSF");
//        hsfApiConsumerBean.init(true);
//
//        AlscConsumeService alscConsumeService = (AlscConsumeService)hsfApiConsumerBean.getObject();
//
//        //RequestCtxUtil.setDirectTargetServerIp("11.164.85.167");
//        RecordQueryRequest param = buildParam();
//        MultiDataResult<AlscConsumeRecordInfo> queryResult = alscConsumeService.queryRecordInfo(param);
//        return JSONObject.toJSONString(queryResult);
//    }
//
//    /**
//     * 构建口碑参数
//     *
//     * @return
//     */
//    private RecordQueryRequest buildParam() {
//        RecordQueryRequest param = new RecordQueryRequest();
//        //用户支付宝ID
//        param.setOwnerId("2088302836347411");
//        //大麦订单号, 不传则查询用户全部订单
//        param.setBizNos(Lists.newArrayList("1100401542005571159"));
//        //固定值
//        param.setOwnerType(OwnerTypeEnum.ALIPAY.getCode());
//        //固定值
//        param.setBizTypes(Lists.newArrayList(BizTypeEnum.DAMAI.getCode()));
//        return param;
//    }
//
//}
