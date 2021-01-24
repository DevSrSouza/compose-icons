package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.2f, 381.4f)
                lineToRelative(-49.6f, -60.6f)
                curveToRelative(-6.8f, -8.3f, -18.2f, -11.1f, -28.0f, -6.9f)
                lineToRelative(-112.0f, 48.0f)
                curveToRelative(-10.7f, 4.6f, -16.5f, 16.1f, -13.9f, 27.5f)
                lineToRelative(24.0f, 104.0f)
                curveToRelative(2.5f, 10.8f, 12.1f, 18.6f, 23.4f, 18.6f)
                curveToRelative(100.7f, 0.0f, 193.7f, -32.4f, 269.7f, -86.9f)
                lineToRelative(-80.0f, -61.8f)
                curveToRelative(-10.9f, 6.5f, -22.1f, 12.7f, -33.6f, 18.1f)
                close()
                moveTo(633.8f, 458.1f)
                lineTo(475.1f, 335.5f)
                curveTo(537.9f, 256.4f, 576.0f, 156.9f, 576.0f, 48.0f)
                curveToRelative(0.0f, -11.2f, -7.7f, -20.9f, -18.6f, -23.4f)
                lineToRelative(-104.0f, -24.0f)
                curveToRelative(-11.3f, -2.6f, -22.9f, 3.3f, -27.5f, 13.9f)
                lineToRelative(-48.0f, 112.0f)
                curveToRelative(-4.2f, 9.8f, -1.4f, 21.3f, 6.9f, 28.0f)
                lineToRelative(60.6f, 49.6f)
                curveToRelative(-12.2f, 26.1f, -27.9f, 50.3f, -46.0f, 72.8f)
                lineTo(45.5f, 3.4f)
                curveTo(38.5f, -2.0f, 28.5f, -0.8f, 23.0f, 6.2f)
                lineTo(3.4f, 31.4f)
                curveToRelative(-5.4f, 7.0f, -4.2f, 17.0f, 2.8f, 22.4f)
                lineToRelative(588.4f, 454.7f)
                curveToRelative(7.0f, 5.4f, 17.0f, 4.2f, 22.5f, -2.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.4f, -6.8f, 4.1f, -16.9f, -2.9f, -22.3f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
