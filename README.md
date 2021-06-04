## 部署

```bash
make deploy
```

会自动生成 vpc、 nas 和 log， 并且配置到 service 上

## 测试

直接在工作流控制台， 发起一个执行， 输入的参数是如下格式

```
{
    "oss_bucket_name":"pumpkin-video",
    "video_key":"inputs/480P.mov",
    "output_prefix":"outputs/",
    "segment_time_seconds":40,
    "execution_name":"test"
}
```

> tips：execution_name 最好跟 video 名字相关，并且唯一