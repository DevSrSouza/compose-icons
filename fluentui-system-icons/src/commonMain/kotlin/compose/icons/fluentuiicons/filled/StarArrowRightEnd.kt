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

public val FilledGroup.StarArrowRightEnd: ImageVector
    get() {
        if (_starArrowRightEnd != null) {
            return _starArrowRightEnd!!
        }
        _starArrowRightEnd = Builder(name = "StarArrowRightEnd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7878f, 3.1021f)
                curveTo(11.283f, 2.0988f, 12.7138f, 2.0988f, 13.209f, 3.1021f)
                lineTo(15.567f, 7.8799f)
                lineTo(20.8395f, 8.646f)
                curveTo(21.9468f, 8.8069f, 22.3889f, 10.1677f, 21.5877f, 10.9487f)
                lineTo(20.6821f, 11.8314f)
                curveTo(19.7411f, 11.3017f, 18.6548f, 10.9995f, 17.498f, 10.9995f)
                curveTo(13.9082f, 10.9995f, 10.998f, 13.9097f, 10.998f, 17.4995f)
                curveTo(10.998f, 18.1102f, 11.0823f, 18.7012f, 11.2397f, 19.2616f)
                lineTo(7.2825f, 21.342f)
                curveTo(6.2921f, 21.8627f, 5.1346f, 21.0217f, 5.3237f, 19.9189f)
                lineTo(6.2244f, 14.6676f)
                lineTo(2.4092f, 10.9487f)
                curveTo(1.6079f, 10.1677f, 2.0501f, 8.8069f, 3.1574f, 8.646f)
                lineTo(8.4299f, 7.8799f)
                lineTo(10.7878f, 3.1021f)
                close()
                moveTo(22.998f, 17.4995f)
                curveTo(22.998f, 20.5371f, 20.5356f, 22.9995f, 17.498f, 22.9995f)
                curveTo(14.4605f, 22.9995f, 11.998f, 20.5371f, 11.998f, 17.4995f)
                curveTo(11.998f, 14.4619f, 14.4605f, 11.9995f, 17.498f, 11.9995f)
                curveTo(20.5356f, 11.9995f, 22.998f, 14.4619f, 22.998f, 17.4995f)
                close()
                moveTo(14.498f, 16.9995f)
                curveTo(14.2219f, 16.9995f, 13.998f, 17.2234f, 13.998f, 17.4995f)
                curveTo(13.998f, 17.7757f, 14.2219f, 17.9995f, 14.498f, 17.9995f)
                lineTo(19.2909f, 17.9995f)
                lineTo(17.6445f, 19.646f)
                curveTo(17.4492f, 19.8412f, 17.4492f, 20.1578f, 17.6445f, 20.3531f)
                curveTo(17.8398f, 20.5483f, 18.1563f, 20.5483f, 18.3516f, 20.3531f)
                lineTo(20.8516f, 17.8531f)
                curveTo(21.0469f, 17.6578f, 21.0469f, 17.3412f, 20.8516f, 17.146f)
                lineTo(18.3516f, 14.646f)
                curveTo(18.1563f, 14.4507f, 17.8398f, 14.4507f, 17.6445f, 14.646f)
                curveTo(17.4492f, 14.8412f, 17.4492f, 15.1578f, 17.6445f, 15.3531f)
                lineTo(19.2909f, 16.9995f)
                lineTo(14.498f, 16.9995f)
                close()
            }
        }
        .build()
        return _starArrowRightEnd!!
    }

private var _starArrowRightEnd: ImageVector? = null
