import Vue from 'vue';
import Vuetify from 'vuetify/lib/framework';
import { readableColor } from 'polished';

Vue.use(Vuetify);

const themeColors = {
    surface:'',
    mainText:'',
    secondaryText:'',
    primary: '',
    'primary-darken-1': '',
    secondary: '',
    'secondary-darken-1': '',
    info: '',
    error: '',
    warning: '',
    success: '',
};
const defaultColors = {
    surface: '#FFFFFF', // 카드 배경색
    mainText:'#000000', // 메인 글자 색
    secondaryText:'#808080', // 서브 글자 색
    primary: '#1976D2', // 버특 및 상단 바 색상
    'primary-darken-1': '#1565C0', // 다이얼로그 상단 바 색상
    secondary: '#424242',
    'secondary-darken-1': '#212121',
    info: '#2196F3',
    error: '#FF5252',
    warning: '#FFC107',
    success: '#4CAF50',
};

Object.keys(themeColors).forEach(key => {
    if (!themeColors[key]) {
        themeColors[key] = defaultColors[key];
    }
});

const style = document.createElement('style');
style.type = 'text/css';

Object.keys(themeColors).forEach(themeColorName => {
    const contrastTextColor = readableColor(themeColors[themeColorName]);
    style.innerHTML += `.contrast-${themeColorName}-text { color: ${contrastTextColor} !important; }\n`;
});

document.getElementsByTagName('head')[0].appendChild(style);


export default new Vuetify({
    theme: {
        light: true,
        themes: {
            light: themeColors,
        },
    },
});
