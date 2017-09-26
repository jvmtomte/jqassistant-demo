package jqademo.jacoco;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MappingServiceTest {

    private MappingService service = new MappingService();

    @Test
    public void shouldMap() {
        // given
        SourceBean sourceBean = new SourceBean();
        sourceBean.setProp1("prop1");
        sourceBean.setProp2("prop2");
        sourceBean.setProp3("prop3");
        SourceBeanMore more = new SourceBeanMore();
        more.setProp4("prop4");
        more.setProp5("prop5");
        more.setProp6("prop6");
        sourceBean.setMore(more);

        // when
        TargetBean targetBean = service.mapBean(sourceBean);

        // then
        assertThat(targetBean.getProp1()).isEqualTo("prop1");
        assertThat(targetBean.getProp2()).isEqualTo("prop2");
        assertThat(targetBean.getProp3()).isEqualTo("prop3");

        // I'm lazy, should be ok though
        assertThat(targetBean.getMore()).isNotNull();
    }


}
