import { NativeModules } from 'react-native';

type ToastType = {
  multiply(a: number, b: number): Promise<number>;
};

const { Toast } = NativeModules;

export default Toast as ToastType;
