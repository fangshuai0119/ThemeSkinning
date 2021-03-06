package solid.ren.themeskinning;

import solid.ren.skinlibrary.base.SkinBaseApplication;
import solid.ren.skinlibrary.config.SkinConfig;
import solid.ren.themeskinning.custom_attr.TabLayoutIndicatorAttr;

/**
 * Created by _SOLID
 * Date:2016/7/5
 * Time:10:06
 */
public class App extends SkinBaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        SkinConfig.setCanChangeStatusColor(true);
        SkinConfig.addSupportAttr("tabLayoutIndicator", new TabLayoutIndicatorAttr());
    }
}
