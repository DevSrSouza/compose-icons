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

public val SolidGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 128.0f)
                curveToRelative(-0.6f, 0.0f, -1.1f, 0.2f, -1.6f, 0.2f)
                curveToRelative(1.1f, -5.2f, 1.6f, -10.6f, 1.6f, -16.2f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                curveToRelative(-24.6f, 0.0f, -46.3f, 11.3f, -61.0f, 28.8f)
                curveTo(256.4f, 24.8f, 219.3f, 0.0f, 176.0f, 0.0f)
                curveTo(114.1f, 0.0f, 64.0f, 50.1f, 64.0f, 112.0f)
                curveToRelative(0.0f, 7.3f, 0.8f, 14.3f, 2.1f, 21.2f)
                curveTo(27.8f, 145.8f, 0.0f, 181.5f, 0.0f, 224.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(88.0f, 374.2f)
                curveToRelative(-12.8f, 44.4f, -40.0f, 56.4f, -40.0f, 87.7f)
                curveToRelative(0.0f, 27.7f, 21.5f, 50.1f, 48.0f, 50.1f)
                reflectiveCurveToRelative(48.0f, -22.4f, 48.0f, -50.1f)
                curveToRelative(0.0f, -31.4f, -27.2f, -43.1f, -40.0f, -87.7f)
                curveToRelative(-2.2f, -8.1f, -13.5f, -8.5f, -16.0f, 0.0f)
                close()
                moveTo(248.0f, 374.2f)
                curveToRelative(-12.8f, 44.4f, -40.0f, 56.4f, -40.0f, 87.7f)
                curveToRelative(0.0f, 27.7f, 21.5f, 50.1f, 48.0f, 50.1f)
                reflectiveCurveToRelative(48.0f, -22.4f, 48.0f, -50.1f)
                curveToRelative(0.0f, -31.4f, -27.2f, -43.1f, -40.0f, -87.7f)
                curveToRelative(-2.2f, -8.1f, -13.5f, -8.5f, -16.0f, 0.0f)
                close()
                moveTo(408.0f, 374.2f)
                curveToRelative(-12.8f, 44.4f, -40.0f, 56.4f, -40.0f, 87.7f)
                curveToRelative(0.0f, 27.7f, 21.5f, 50.1f, 48.0f, 50.1f)
                reflectiveCurveToRelative(48.0f, -22.4f, 48.0f, -50.1f)
                curveToRelative(0.0f, -31.4f, -27.2f, -43.1f, -40.0f, -87.7f)
                curveToRelative(-2.2f, -8.1f, -13.5f, -8.5f, -16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
