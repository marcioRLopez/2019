package aplicacion.controlador.validador;
 
import java.util.Map;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.primefaces.validate.ClientValidator;
 
/**
 * Clase validadora de ingreso de un email y que este sea valido en su contexto 
 */
@FacesValidator("emailValidator")
public class EmailValidator implements Validator, ClientValidator {
 /**
  * atributo de tipo Pattern (patron de ingreso)
  */
    private Pattern pattern;
    
    /**
     * atributo de tipo String el cuaal indica el patro de ingreso correcto de un E-mail
     * indica el orden de las letras relacionado con la @
     */
  
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    /**
     * metodo que controla el patron de ingreso
     */
  
    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
 
    
    /**
     * metodo que comprueba si el email es valido para su ingreso, de no ser asi muestra un mensaje
     * @param context el contexto de ingreso
     * @param component el componente
     * @param value el valor
     * @throws ValidatorException 
     */
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if(value == null) {
            return;
        }
         
        if(!pattern.matcher(value.toString()).matches()) {
            String mensajeExcepcion = value+" no es un E-mail valido";
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de Validacion", 
                        value + "No es un E-mail Valido"));
        }
    }
 
    
;
/**
 * Metodo de sobreescritura
 * @return la validacion
 */
    @Override
    public Map<String, Object> getMetadata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValidatorId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    }
     
