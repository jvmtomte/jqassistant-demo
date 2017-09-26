package jqademo.jacoco;

public class MappingService {

    public TargetBean mapBean(SourceBean sourceBean) {
        TargetBean targetBean = new TargetBean();
        targetBean.setProp1(sourceBean.getProp1());
        targetBean.setProp2(sourceBean.getProp2());
        targetBean.setProp3(sourceBean.getProp3());
        TargetBeanMore more = new TargetBeanMore();
        more.setProp4(sourceBean.getMore().getProp4());
        more.setProp5(sourceBean.getMore().getProp5());
        //more.setProp6(sourceBean.getMore().getProp6()); here is our expected error!!!
        targetBean.setMore(more);
        return targetBean;
    }

}
