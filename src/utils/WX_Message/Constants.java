package utils.WX_Message;

public interface Constants {

//    String openId = "oTPru09dF2W_S5T99m8Dczw_2FNk";
    String templateId = "hutNVLCizflIPjCcYIV7O28Di_VW2DbvN6Lz7a-d4XM";
    String appId="wx4d3bae432c576379";
    String appSecret="575ab8e1bd8d542837fbb62ee29bc58e";
    String baseUrl="https://api.weixin.qq.com/cgi-bin";
    String getCurrentAutoReplyUrl=baseUrl+"/get_current_autoreply_info";
    String getTokenUrlPre=baseUrl+"/token";
    String addTemplateUrl=baseUrl+"/template/api_add_template";
    String delTemplateUrl=baseUrl+"/template/del_private_template";
    String sendMessageUrl=baseUrl+"/message/template/send";
    String getUserInfoUrl=baseUrl+"/user/info";
}
