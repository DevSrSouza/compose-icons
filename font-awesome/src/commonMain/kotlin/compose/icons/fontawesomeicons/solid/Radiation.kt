package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Radiation: ImageVector
    get() {
        if (_radiation != null) {
            return _radiation!!
        }
        _radiation = Builder(name = "Radiation", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 186.7f)
                curveToRelative(-23.9f, 13.8f, -40.0f, 39.7f, -40.0f, 69.3f)
                lineTo(32.0f, 256.0f)
                curveTo(14.3f, 256.0f, -0.2f, 241.6f, 2.0f, 224.1f)
                curveTo(10.7f, 154.0f, 47.8f, 92.7f, 101.3f, 52.0f)
                curveToRelative(14.1f, -10.7f, 33.8f, -5.3f, 42.7f, 10.0f)
                lineToRelative(72.0f, 124.7f)
                close()
                moveTo(256.0f, 336.0f)
                curveToRelative(14.6f, 0.0f, 28.2f, -3.9f, 40.0f, -10.7f)
                lineToRelative(72.0f, 124.8f)
                curveToRelative(8.8f, 15.3f, 3.7f, 35.1f, -12.6f, 41.9f)
                curveToRelative(-30.6f, 12.9f, -64.2f, 20.0f, -99.4f, 20.0f)
                reflectiveCurveToRelative(-68.9f, -7.1f, -99.4f, -20.0f)
                curveToRelative(-16.3f, -6.9f, -21.4f, -26.6f, -12.6f, -41.9f)
                lineToRelative(72.0f, -124.8f)
                curveToRelative(11.8f, 6.8f, 25.4f, 10.7f, 40.0f, 10.7f)
                close()
                moveTo(480.0f, 256.0f)
                lineToRelative(-144.0f, 0.0f)
                curveToRelative(0.0f, -29.6f, -16.1f, -55.5f, -40.0f, -69.3f)
                lineTo(368.0f, 62.0f)
                curveToRelative(8.8f, -15.3f, 28.6f, -20.7f, 42.7f, -10.0f)
                curveToRelative(53.6f, 40.7f, 90.6f, 102.0f, 99.4f, 172.1f)
                curveToRelative(2.2f, 17.5f, -12.4f, 31.9f, -30.0f, 31.9f)
                close()
                moveTo(256.0f, 208.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _radiation!!
    }

private var _radiation: ImageVector? = null
