package com.ohgiraffers.section02.annotation.subsction01.primary;

import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service("pokemonServicePrimary")
public class PoketmonService {

    private Poketmon poketmon;

    @Autowired
    public PoketmonService(Poketmon poketmon) {
        this.poketmon = poketmon;
    }

    public void poketmonAttack(){
        poketmon.attack();
    }
}
