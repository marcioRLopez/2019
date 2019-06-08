package aplicacion.controlador.validador;

import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author GRUPO10
 * Clase que valida los e-mail ingresados correspondientes al usuriao y propietario
 */


@FacesValidator("emailValidador")
public class EmailValidator implements Validator{
/**
 * atributo de tipo pattern (patron) que indica el orden de ingreso del e-mail
 */
    private Pattern pattern;
    /**
     * el patron indicado en orden
     */
  
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
/**
 * metodo que compila el patron de e-mail
 */
    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
    /**
     * metodo que sobre escribe , y controla el ingreso de un e-mail
     * de ser no correcto, indica un mensaje de error
     * @param fc faces context
     * @param uic objeto uic
     * @param o el parametro a controlar
     * @throws ValidatorException 
     */
    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        if(o == null) {
            return;
        }
         
        if(!pattern.matcher(o.toString()).matches()) {
           
            String mensajeExcepcion = o+" no es un E-mail valido";
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de validacion el email esta mal escrito", 
                        o + " no es un email valido;"));
        }
    }

   
    
}
