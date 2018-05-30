package org.springframework.boot.loader;

import com.tibbo.aggregate.common.context.*;
import com.tibbo.aggregate.common.plugin.*;

public class CustomLauncher extends AbstractContextPlugin {

    static {
        try {
            JarLauncher.main(new String[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void globalInit(Context rootContext) throws PluginException {
        super.globalInit(rootContext);
    }
}
