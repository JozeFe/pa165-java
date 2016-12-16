package cz.fi.muni.pa165.rest.exceptions;

/**
 * @author Richard Trebichavský
 */
//@ResponseStatus(value = HttpStatus.NOT_FOUND, reason="The requested resource was not found")
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason="The requested resource was not found")
public class ResourceNotFoundException extends RuntimeException {
}
