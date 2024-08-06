classHeader(packageName,className) ::= <<
package <packageName>;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class <className>Impl implements <className> {

    final private DataAccessFacade dataAccessFacade;

    public <className>Impl(DataAccessFacade dataAccessFacade) {
        this.dataAccessFacade = dataAccessFacade;
    }

>>