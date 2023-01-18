package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7466f, 3.9995f)
                horizontalLineTo(10.2108f)
                curveTo(10.625f, 3.9995f, 10.9608f, 4.3353f, 10.9608f, 4.7495f)
                curveTo(10.9608f, 5.1292f, 10.6786f, 5.443f, 10.3126f, 5.4927f)
                lineTo(10.2108f, 5.4995f)
                horizontalLineTo(6.7466f)
                curveTo(5.5557f, 5.4995f, 4.5809f, 6.4247f, 4.5018f, 7.5955f)
                lineTo(4.4966f, 7.7495f)
                verticalLineTo(17.2495f)
                curveTo(4.4966f, 18.4404f, 5.4217f, 19.4152f, 6.5925f, 19.4944f)
                lineTo(6.7466f, 19.4995f)
                horizontalLineTo(16.2473f)
                curveTo(17.4382f, 19.4995f, 18.413f, 18.5744f, 18.4921f, 17.4036f)
                lineTo(18.4973f, 17.2495f)
                verticalLineTo(16.7518f)
                curveTo(18.4973f, 16.3375f, 18.8331f, 16.0018f, 19.2473f, 16.0018f)
                curveTo(19.627f, 16.0018f, 19.9408f, 16.2839f, 19.9905f, 16.65f)
                lineTo(19.9973f, 16.7518f)
                verticalLineTo(17.2495f)
                curveTo(19.9973f, 19.2538f, 18.425f, 20.8908f, 16.4465f, 20.9943f)
                lineTo(16.2473f, 20.9995f)
                horizontalLineTo(6.7466f)
                curveTo(4.7423f, 20.9995f, 3.1053f, 19.4272f, 3.0018f, 17.4487f)
                lineTo(2.9966f, 17.2495f)
                verticalLineTo(7.7495f)
                curveTo(2.9966f, 5.7453f, 4.5689f, 4.1083f, 6.5474f, 4.0047f)
                lineTo(6.7466f, 3.9995f)
                horizontalLineTo(10.2108f)
                horizontalLineTo(6.7466f)
                close()
                moveTo(14.5006f, 6.5438f)
                verticalLineTo(3.7495f)
                curveTo(14.5006f, 3.1256f, 15.2074f, 2.7895f, 15.6876f, 3.1393f)
                lineTo(15.7697f, 3.2083f)
                lineTo(21.7643f, 8.9583f)
                curveTo(22.0441f, 9.2266f, 22.0696f, 9.6576f, 21.8407f, 9.9556f)
                lineTo(21.7644f, 10.0407f)
                lineTo(15.7698f, 15.7926f)
                curveTo(15.3196f, 16.2246f, 14.5877f, 15.9472f, 14.5077f, 15.3584f)
                lineTo(14.5006f, 15.2514f)
                verticalLineTo(12.4495f)
                lineTo(14.1798f, 12.4433f)
                curveTo(11.5223f, 12.4354f, 9.2507f, 13.5265f, 7.3149f, 15.7445f)
                curveTo(6.8193f, 16.3124f, 5.8897f, 15.8764f, 6.0094f, 15.1323f)
                curveTo(6.8364f, 9.9919f, 9.6085f, 7.0878f, 14.1986f, 6.574f)
                lineTo(14.5006f, 6.5438f)
                verticalLineTo(3.7495f)
                verticalLineTo(6.5438f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
