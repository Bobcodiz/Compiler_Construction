package red.stevo.code;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Symbol {

    private String tokenName; //variable name

    private Object tokenValues; //value held by the variable

    private String tokenDataType; //the variable datatype.

    private String Scope; //variable scope.

}
