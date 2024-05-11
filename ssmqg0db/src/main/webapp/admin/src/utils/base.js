const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmqg0db/",
            name: "ssmqg0db",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmqg0db/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "客家菜餐馆点菜系统小程序"
        } 
    }
}
export default base
