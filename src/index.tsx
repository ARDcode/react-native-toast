import { NativeModules } from 'react-native';

type ToastType = {
  multiply(a: number, b: number): Promise<number>;
  show(message: string): void;
};

const { Toast } = NativeModules;

export default Toast as ToastType;
