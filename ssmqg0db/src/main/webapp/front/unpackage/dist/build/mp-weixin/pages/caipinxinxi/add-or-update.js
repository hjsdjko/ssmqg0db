(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/caipinxinxi/add-or-update"],{"04b6":function(e,n,i){"use strict";i.r(n);var t=i("3198"),a=i("d6b1");for(var r in a)"default"!==r&&function(e){i.d(n,e,(function(){return a[e]}))}(r);i("af9f");var u,o=i("f0c5"),c=Object(o["a"])(a["default"],t["b"],t["c"],!1,null,"6e57d9b8",null,!1,t["a"],u);n["default"]=c.exports},3198:function(e,n,i){"use strict";var t;i.d(n,"b",(function(){return a})),i.d(n,"c",(function(){return r})),i.d(n,"a",(function(){return t}));var a=function(){var e=this,n=e.$createElement;e._self._c},r=[]},4918:function(e,n,i){"use strict";(function(e){i("ae9b");t(i("66fd"));var n=t(i("04b6"));function t(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,i("543d")["createPage"])},af9f:function(e,n,i){"use strict";var t=i("cbdd"),a=i.n(t);a.a},cbdd:function(e,n,i){},d28b:function(e,n,i){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var t=a(i("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function r(e,n,i,t,a,r,u){try{var o=e[r](u),c=o.value}catch(s){return void i(s)}o.done?n(c):Promise.resolve(c).then(t,a)}function u(e){return function(){var n=this,i=arguments;return new Promise((function(t,a){var u=e.apply(n,i);function o(e){r(u,t,a,o,c,"next",e)}function c(e){r(u,t,a,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(function(){return resolve(i("7d26"))}.bind(null,i)).catch(i.oe)},c={data:function(){return{ruleForm:{caipinbianhao:this.getUUID(),caipinmingcheng:"",caixi:"",tupian:"",shuliang:"",danjia:"",kouweipianhao:"",jianjie:""},caixiOptions:[],caixiIndex:0,user:{},ro:{caipinbianhao:!1,caipinmingcheng:!1,caixi:!1,tupian:!1,shuliang:!1,danjia:!1,kouweipianhao:!1,jianjie:!1}}},components:{wPicker:o},computed:{},onLoad:function(n){var i=this;return u(t.default.mark((function a(){var r,u,o,c;return t.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return r=e.getStorageSync("nowTable"),a.next=3,i.$api.session(r);case 3:return u=a.sent,i.user=u.data,a.next=7,i.$api.option("caixi","caixi",{});case 7:if(u=a.sent,i.caixiOptions=u.data,i.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(i.ruleForm.refid=n.refid,i.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=17;break}return i.ruleForm.id=n.id,a.next=15,i.$api.info("caipinxinxi",i.ruleForm.id);case 15:u=a.sent,i.ruleForm=u.data;case 17:if(!n.cross){a.next=56;break}o=e.getStorageSync("crossObj"),a.t0=t.default.keys(o);case 20:if((a.t1=a.t0()).done){a.next=56;break}if(c=a.t1.value,"caipinbianhao"!=c){a.next=26;break}return i.ruleForm.caipinbianhao=o[c],i.ro.caipinbianhao=!0,a.abrupt("continue",20);case 26:if("caipinmingcheng"!=c){a.next=30;break}return i.ruleForm.caipinmingcheng=o[c],i.ro.caipinmingcheng=!0,a.abrupt("continue",20);case 30:if("caixi"!=c){a.next=34;break}return i.ruleForm.caixi=o[c],i.ro.caixi=!0,a.abrupt("continue",20);case 34:if("tupian"!=c){a.next=38;break}return i.ruleForm.tupian=o[c],i.ro.tupian=!0,a.abrupt("continue",20);case 38:if("shuliang"!=c){a.next=42;break}return i.ruleForm.shuliang=o[c],i.ro.shuliang=!0,a.abrupt("continue",20);case 42:if("danjia"!=c){a.next=46;break}return i.ruleForm.danjia=o[c],i.ro.danjia=!0,a.abrupt("continue",20);case 46:if("kouweipianhao"!=c){a.next=50;break}return i.ruleForm.kouweipianhao=o[c],i.ro.kouweipianhao=!0,a.abrupt("continue",20);case 50:if("jianjie"!=c){a.next=54;break}return i.ruleForm.jianjie=o[c],i.ro.jianjie=!0,a.abrupt("continue",20);case 54:a.next=20;break;case 56:i.styleChange();case 57:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},caixiChange:function(e){this.caixiIndex=e.target.value,this.ruleForm.caixi=this.caixiOptions[this.caixiIndex]},tupianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.tupian=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return u(t.default.mark((function n(){return t.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(!e.ruleForm.shuliang||e.$validate.isIntNumer(e.ruleForm.shuliang)){n.next=3;break}return e.$utils.msg("数量应输入整数"),n.abrupt("return");case 3:if(!e.ruleForm.danjia||e.$validate.isIntNumer(e.ruleForm.danjia)){n.next=6;break}return e.$utils.msg("单价应输入整数"),n.abrupt("return");case 6:if(!e.ruleForm.id){n.next=11;break}return n.next=9,e.$api.update("caipinxinxi",e.ruleForm);case 9:n.next=13;break;case 11:return n.next=13,e.$api.add("caipinxinxi",e.ruleForm);case 13:e.$utils.msgBack("提交成功");case 14:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,i=n.getFullYear(),t=n.getMonth()+1,a=n.getDate();return"start"===e?i-=60:"end"===e&&(i+=2),t=t>9?t:"0"+t,a=a>9?a:"0"+a,"".concat(i,"-").concat(t,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,i("543d")["default"])},d6b1:function(e,n,i){"use strict";i.r(n);var t=i("d28b"),a=i.n(t);for(var r in t)"default"!==r&&function(e){i.d(n,e,(function(){return t[e]}))}(r);n["default"]=a.a}},[["4918","common/runtime","common/vendor"]]]);