package com.bobexchen.novajavagithub.service;

import com.bobexchen.novajavagithub.model.PersonInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static com.bobexchen.novajavagithub.cache.NovaCache.peopleInfos;

@Service
public class LoginService {
    private Logger log = LoggerFactory.getLogger(LoginService.class);

    public void registerPersonalInfo(PersonInfo person) {
        peopleInfos.put(person.getNickname(), person);
    }


    public PersonInfo getAgeByName(String nickname) {
        log.warn("nickname is {}", nickname);
        if (nickname != null && peopleInfos.containsKey(nickname)) {
            log.warn("111");
            return peopleInfos.get(nickname);
        } else {
            log.warn("222");
            PersonInfo noPerson= new PersonInfo();
            noPerson.setNickname("none");
            noPerson.setAge(-1);
            return noPerson;
        }

    }
}
