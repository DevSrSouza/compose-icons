package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.3f, 62.0f)
                curveToRelative(-6.8f, -11.8f, -27.1f, -14.0f, -57.2f, -6.1f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 36.0f, 128.0f)
                arcToRelative(84.5f, 84.5f, 0.0f, false, false, 1.0f, 13.4f)
                curveTo(15.1f, 163.5f, 6.9f, 182.2f, 13.7f, 194.0f)
                curveToRelative(4.1f, 7.2f, 13.0f, 10.8f, 26.2f, 10.8f)
                arcToRelative(115.3f, 115.3f, 0.0f, false, false, 24.7f, -3.1f)
                lineToRelative(6.3f, -1.6f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 220.0f, 128.0f)
                arcToRelative(84.5f, 84.5f, 0.0f, false, false, -1.0f, -13.4f)
                lineToRelative(4.5f, -4.6f)
                curveTo(242.2f, 89.6f, 248.7f, 73.1f, 242.3f, 62.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 82.4f, 67.9f)
                curveToRelative(-16.5f, 16.1f, -39.0f, 32.6f, -64.4f, 47.3f)
                reflectiveCurveTo(95.1f, 185.0f, 72.9f, 191.3f)
                arcTo(83.9f, 83.9f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(62.9f, 193.8f)
                curveToRelative(-22.2f, 5.0f, -38.0f, 3.6f, -42.3f, -3.8f)
                reflectiveCurveToRelative(2.6f, -22.2f, 18.3f, -39.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 24.7f, 42.7f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.2f, 83.2f, 0.0f, false, true, -47.4f, -14.7f)
                curveToRelative(21.5f, -6.6f, 45.6f, -17.4f, 69.4f, -31.2f)
                reflectiveCurveToRelative(45.2f, -29.2f, 61.7f, -44.5f)
                curveToRelative(0.2f, 2.1f, 0.3f, 4.3f, 0.3f, 6.4f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(192.4f, 62.3f)
                curveToRelative(22.4f, -5.1f, 38.7f, -3.8f, 43.0f, 3.7f)
                reflectiveCurveToRelative(-2.4f, 21.8f, -17.8f, 38.5f)
                curveToRelative(-0.2f, 0.2f, -0.3f, 0.4f, -0.5f, 0.5f)
                arcTo(92.8f, 92.8f, 0.0f, false, false, 192.4f, 62.3f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null
