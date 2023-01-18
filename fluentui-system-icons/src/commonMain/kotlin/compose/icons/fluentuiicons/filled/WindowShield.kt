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

public val FilledGroup.WindowShield: ImageVector
    get() {
        if (_windowShield != null) {
            return _windowShield!!
        }
        _windowShield = Builder(name = "WindowShield", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7495f, 3.0f)
                lineTo(17.9339f, 3.0051f)
                curveTo(19.5832f, 3.0973f, 20.9034f, 4.4175f, 20.9956f, 6.0656f)
                lineTo(21.0007f, 6.25f)
                verticalLineTo(12.6108f)
                curveTo(20.3138f, 12.4793f, 19.6558f, 12.1088f, 19.0059f, 11.4305f)
                lineTo(18.9999f, 11.4243f)
                lineTo(18.9995f, 8.0f)
                horizontalLineTo(5.0007f)
                lineTo(4.9995f, 17.75f)
                curveTo(4.9995f, 18.3972f, 5.4914f, 18.9295f, 6.1217f, 18.9935f)
                lineTo(6.2495f, 19.0f)
                horizontalLineTo(13.3757f)
                curveTo(13.5793f, 19.5953f, 13.8674f, 20.1462f, 14.2444f, 20.6457f)
                curveTo(14.3366f, 20.7678f, 14.4333f, 20.8859f, 14.5345f, 21.0f)
                horizontalLineTo(6.2495f)
                curveTo(4.5165f, 21.0f, 3.1003f, 19.6435f, 3.0047f, 17.9344f)
                lineTo(2.9995f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(2.9995f, 4.517f, 4.356f, 3.1007f, 6.0651f, 3.0051f)
                lineTo(6.2495f, 3.0f)
                horizontalLineTo(17.7495f)
                close()
                moveTo(19.0001f, 12.7644f)
                curveTo(19.6256f, 13.2375f, 20.2911f, 13.523f, 21.0007f, 13.6245f)
                curveTo(21.1971f, 13.6527f, 21.3969f, 13.6667f, 21.6001f, 13.6667f)
                curveTo(21.7934f, 13.6667f, 21.9547f, 13.8095f, 21.992f, 13.9994f)
                lineTo(22.0001f, 14.0833f)
                verticalLineTo(16.5844f)
                curveTo(22.0001f, 19.2663f, 20.6871f, 21.0896f, 18.1266f, 21.9786f)
                curveTo(18.0445f, 22.0071f, 17.9557f, 22.0071f, 17.8736f, 21.9786f)
                curveTo(17.1484f, 21.7268f, 16.5232f, 21.4f, 15.9996f, 21.0f)
                curveTo(15.2975f, 20.4636f, 14.778f, 19.7956f, 14.4448f, 19.0f)
                curveTo(14.1784f, 18.364f, 14.0311f, 17.6466f, 14.0045f, 16.8497f)
                lineTo(14.0001f, 16.5844f)
                verticalLineTo(14.0833f)
                curveTo(14.0001f, 13.8532f, 14.1792f, 13.6667f, 14.4001f, 13.6667f)
                curveTo(15.6235f, 13.6667f, 16.7235f, 13.1575f, 17.7179f, 12.122f)
                curveTo(17.8743f, 11.9592f, 18.1277f, 11.9594f, 18.2838f, 12.1223f)
                curveTo(18.5166f, 12.3652f, 18.7553f, 12.5792f, 19.0001f, 12.7644f)
                close()
            }
        }
        .build()
        return _windowShield!!
    }

private var _windowShield: ImageVector? = null
