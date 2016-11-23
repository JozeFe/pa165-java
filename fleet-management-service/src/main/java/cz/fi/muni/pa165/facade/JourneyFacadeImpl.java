package cz.fi.muni.pa165.facade;

import cz.fi.muni.pa165.dto.JourneyDTO;
import cz.fi.muni.pa165.service.interfaces.BeanMappingService;
import cz.fi.muni.pa165.service.interfaces.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Martin on 23.11.2016.
 */
@Service
@Transactional
public class JourneyFacadeImpl implements JourneyFacade {

    @Autowired
    private JourneyService journeyService;

    @Autowired
    private BeanMappingService beanMappingService;

    public List<JourneyDTO> getAllJourneys() {
        return beanMappingService.mapTo(journeyService.findAll(), JourneyDTO.class);
    }

    public List<JourneyDTO> getJourneysByEmployee(Long employeeId) {
        return beanMappingService.mapTo(journeyService.getJourneysByEmployee(employeeId), JourneyDTO.class);
    }

    public List<JourneyDTO> getJourneys(Date from, Date to, Long employeeId) {
        return beanMappingService.mapTo(journeyService.getAllJourneys(from, to, employeeId), JourneyDTO.class);
    }

    public void beginJourney(Long vehicleId, Long employeeId, Date startDate) {
        journeyService.createJourney(vehicleId, employeeId, startDate);
    }

    public void finishJourney(Long journeyId, Float drivenDistance, Date endDate) {
        journeyService.finalizeJourney(journeyId,drivenDistance,endDate);
    }
}
