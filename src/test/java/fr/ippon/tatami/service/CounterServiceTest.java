package fr.ippon.tatami.service;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: dygcao
 * Date: 28/10/12
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 */
public class CounterServiceTest {

    @Inject
    public CounterService counterService;

    @Test
    public void shouldNotGetNbStatus(){
      assertThat(counterService.getNbStatus("dygcao"),nullValue());
    }

    @Test
    public void shouldNotGetNbFollowed(){
      assertThat(counterService.getNbStatus("dygcao"),nullValue());
    }

    @Test
    public void shouldNotGetNbFollowers(){
      assertThat(counterService.getNbStatus("jbenay"),nullValue());
    }

}


