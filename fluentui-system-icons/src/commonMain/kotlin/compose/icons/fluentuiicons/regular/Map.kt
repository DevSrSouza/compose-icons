package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2034f, 3.9993f)
                lineTo(9.2504f, 3.998f)
                lineTo(9.2962f, 3.9993f)
                curveTo(9.3186f, 4.0005f, 9.3411f, 4.0029f, 9.3636f, 4.0063f)
                lineTo(9.3796f, 4.0101f)
                curveTo(9.465f, 4.0238f, 9.5499f, 4.0543f, 9.6308f, 4.1022f)
                lineTo(9.6827f, 4.1358f)
                lineTo(14.753f, 7.701f)
                lineTo(19.82f, 4.1391f)
                curveTo(20.2878f, 3.8103f, 20.9215f, 4.1059f, 20.9944f, 4.6482f)
                lineTo(21.0014f, 4.7527f)
                verticalLineTo(15.3852f)
                curveTo(21.0014f, 15.5945f, 20.914f, 15.7926f, 20.7632f, 15.9334f)
                lineTo(20.6827f, 15.9988f)
                lineTo(15.1827f, 19.8652f)
                curveTo(14.9158f, 20.0528f, 14.5948f, 20.0371f, 14.3549f, 19.8883f)
                lineTo(9.25f, 16.297f)
                lineTo(4.1803f, 19.8618f)
                curveTo(3.7126f, 20.1906f, 3.0789f, 19.8951f, 3.0059f, 19.3527f)
                lineTo(2.999f, 19.2483f)
                verticalLineTo(8.6157f)
                curveTo(2.999f, 8.4064f, 3.0864f, 8.2083f, 3.2371f, 8.0675f)
                lineTo(3.3177f, 8.0022f)
                lineTo(8.8177f, 4.1358f)
                curveTo(8.8817f, 4.0908f, 8.9488f, 4.0575f, 9.0172f, 4.0349f)
                lineTo(9.1396f, 4.0069f)
                lineTo(9.2034f, 3.9993f)
                close()
                moveTo(19.5014f, 6.1967f)
                lineTo(15.5014f, 9.0086f)
                verticalLineTo(17.8076f)
                lineTo(19.5014f, 14.9957f)
                verticalLineTo(6.1967f)
                close()
                moveTo(8.499f, 6.1933f)
                lineTo(4.499f, 9.0053f)
                verticalLineTo(17.8042f)
                lineTo(8.499f, 14.9923f)
                verticalLineTo(6.1933f)
                close()
                moveTo(10.0014f, 6.1933f)
                verticalLineTo(14.9923f)
                lineTo(14.0014f, 17.8042f)
                verticalLineTo(9.0053f)
                lineTo(10.0014f, 6.1933f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
