package harvey.ggc.edu.tourapp;

public class TabDetails {
    private String tabName;
    private MainActivity.PlaceholderFragment fragment;

    public TabDetails(String tabName, MainActivity.PlaceholderFragment fragment){
        this.tabName = tabName;
        this.fragment = fragment;
    }
    public String getTabName(){
        return tabName;
    }
    public void setTabName(String tabName){
        this.tabName = tabName;
    }
    public MainActivity.PlaceholderFragment getFragment(){
        return fragment;
    }
    public void setFragment(MainActivity.PlaceholderFragment fragment){
        this.fragment = fragment;
    }
}
