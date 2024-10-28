const base = {
    get() {
                return {
            url : "http://localhost:8080/shipindianbou/",
            name: "shipindianbou",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shipindianbou/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "视频信息网站"
        } 
    }
}
export default base
