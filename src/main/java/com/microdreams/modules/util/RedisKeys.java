package com.microdreams.modules.util;

public enum RedisKeys {
    CAROUSEL("carousel", "轮播图缓存关键字后缀"),
    CARSKUDETAIL("cardetail", "根据车型id获取车型详情关键字后缀"),
    FINANCIAL("financial", "金融产品列表关键字后缀"),
    DETAIL_LIST_BY_TYPE_ID("detailListByTypeId","根据车型id获取车款列表"),
    CARBRAND("brand", "汽车品牌缓存关键字后缀"),
    HOTARBRAND("hotcarbrand", "热门汽车品牌缓存关键字后缀"),
    DEALER("dealer","经销商列表关键字后缀");



    private String key ;
    private String desc ;

    private RedisKeys( String key , String desc ){
        this.key = key ;
        this.desc = desc ;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
