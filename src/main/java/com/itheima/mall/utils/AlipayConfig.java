package com.itheima.mall.utils;

public class AlipayConfig {
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091800540249";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCfXtZhGSFL0Xis2Ye1ctkfUVkZeayF05P+lm/3MLoG/AW52XrFr1EaDIB2bPk4CknefHDfXdkuqWUncTcfpFY6TK7oARR+ha9gnIkWAaRXwmEOE4Tppw6iU5FRbR2mzRi37CK+zq1XKHpHdxCHyZOuW7Ngz75MMqpcSI4spxShzdUVxCmd/+j+UumChjXFmuWPE3yvHc6b6OqlxdgNGzCCwtznpwgf2GYlpaPcD8vWwhHMM7uhMxxiIPCjzXu7DgcHH6jqpAFEhaC1AOmPpcx5MSDgRPzT3NSHn78fBMiFmsWgh/1+g++J5btc6nP4aKJhIKGEPDw3bJb9ciXT+qBhAgMBAAECggEASZ8jA7n7Mq4yxA69bWn/uUL4GRenRi9GZ86RLKz60u0rq/42hAoIOjNaSNrwih3eoAP2lIkjIjYov37Ci0B8gPQZvJ17HTOen8/QWDUr+UqXUUxdEx8UWJKoR+hTUVHfwF86cdDCLMhLLKZpIYFSUrKT+/4cF9Ez9+ugmioZEuFpf5dui6BxwZ2Vgorp4n5khf/0suLddg66BG47s6iY6KNCuqhZMEgUh1CV2pVB+t05U7Cq1CLfBYKmdcB3JqonD7yqk/PptDsmcFHDTLp7E+dnYJ9fbwjYgD2kRb3tFzMieDH10lJcEztD3J/4tp//AbvXHEbiI1iNMJGz42uVvQKBgQDqkKJ3f4CNLj8NfX+/1TFnR3pgZMrkzvQrRtTq/uIr5fRgp/zqg38fBYTlfQgteztXLqXrB1Wozw9KaP1HrDoc/2XFnIYep7pnj1vNIPCaqDUjE2s3aGCg8TrDDtQwMvAEvmFe8p+xlwWEd5anuG5x31G58v2n35iCYYOmYSNzywKBgQCt7x4TVdDI85smyxuUaRMGHn+tjeGRihX4Rvd8kZTVwb+mlnIqMAtXlezMUD1VaqTBBGke4v5X4OHXIoMLeAhVidaRQMlFTJVJTVoPdyyGWI+YBpSnHoSVzRXkmoIrdAGjyub0joLnVtZyeflAA3YhK6UKhdIYoemawFFkrSovAwKBgDrcvMh8CIhlOJFsEujS2SjvuPgDkx7ECGXrynaGK7+UXzT6Mu+uu/HO8sCcFbdEG2oPXLeUCZzpCQ9FNXoM8DBiruleFBIRSSe/w+u//mDxIRSCRP+Mg+MfZf2Y9Qp7Xdvy4oBvJj/shAfv8rB4Cc8tmVaucZT0+VKOofjYm4rtAoGAGMDyJ9BLwX2h9Bht2WZG1dUbWKjblGnxjH8VE75oTy+exeedYdGqm5FzvPQidniR8AJfr4ygpAMWQRbhTY2MqhfO2Kc+vcUTbfY7Pf448PnDneA54brfJa6lUf6HTgXZgeULj3yEtsXOCUbAqVKUyk261E+NQgIxC9wY+VoHqd8CgYEA0y1TYq5nDhWqJfVzFqmx3cjQeIrh7rAFnopKdUPNRz0kJTMOQ16fJ+ov7LkeG4xL3kW65coM5PT5X03WbV4eUR269Rnh6UjrKTMqiCR4TZ2mOiemLz+lH15jNXzJ2mIVzHYAHh2k0qwDgLr3iXop8qqo7HCJXa9tFHTxJFmXrSc=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyhfr8DRizwaYpz9egjv5OxX2HkR2ClKXi7BHxbzBhqn25lfmwXb6xZ8DAePJ4mC3myupAp6diBLnxm4oSP8Pw33tJor+NYyxIxPm+MttGx+ETrYtxYv2ZDuymX9xQPwl6MRiHI3N01aZA7w3BxQWa2nbioKhCloWdjDLLW37kUskad7mSKkvt+MYPmqHnTBDgdvInQ4UIUs6wuBmaA51ZXRMoV2KYLHQoIzBfXDauFtPlACHMb0w+aoJn7S5EzpwYYcWLUmbxQ/V9bAnmZvloPxhBE6B3+ZHaubAN9EOI2N/kgRxRwEkMdvss3Z8dlGz1Cl0/66psWyC3AP15QsR4QIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:82/pay/alipayNotifyNotice";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:82/pay/alipayReturnNotice";

    // 签名方式
    public static String sign_type = "RSA2";

    // 返回格式
    public static String FORMAT = "json";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关日志
    public static String log_path = "F:\\支付资料\\alipay支付宝\\log";
}
