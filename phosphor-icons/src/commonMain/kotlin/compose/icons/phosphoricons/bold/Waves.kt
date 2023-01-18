package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.6f, 79.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 1.9f, -16.9f)
                curveToRelative(1.2f, -1.0f, 12.6f, -9.7f, 30.6f, -14.2f)
                reflectiveCurveToRelative(43.1f, -5.3f, 71.6f, 13.6f)
                curveToRelative(40.2f, 26.8f, 73.5f, 0.9f, 73.8f, 0.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 15.0f, 18.8f)
                curveToRelative(-1.2f, 1.0f, -12.6f, 9.7f, -30.6f, 14.2f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, -20.7f, 2.6f)
                curveToRelative(-14.7f, 0.0f, -32.3f, -3.8f, -50.9f, -16.2f)
                curveToRelative(-40.2f, -26.8f, -73.5f, -0.9f, -73.8f, -0.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 30.6f, 79.5f)
                close()
                moveTo(208.5f, 118.6f)
                curveToRelative(-0.3f, 0.3f, -33.6f, 26.2f, -73.8f, -0.6f)
                curveTo(106.2f, 99.1f, 80.0f, 100.1f, 63.1f, 104.4f)
                reflectiveCurveToRelative(-29.4f, 13.2f, -30.6f, 14.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 15.0f, 18.8f)
                curveToRelative(0.3f, -0.3f, 33.6f, -26.2f, 73.8f, 0.6f)
                curveToRelative(18.6f, 12.4f, 36.2f, 16.2f, 50.9f, 16.2f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, 20.7f, -2.6f)
                curveToRelative(18.0f, -4.5f, 29.4f, -13.2f, 30.6f, -14.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.0f, -18.8f)
                close()
                moveTo(208.5f, 174.6f)
                curveToRelative(-0.3f, 0.3f, -33.6f, 26.2f, -73.8f, -0.6f)
                curveToRelative(-28.5f, -18.9f, -54.7f, -17.9f, -71.6f, -13.6f)
                reflectiveCurveToRelative(-29.4f, 13.2f, -30.6f, 14.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.0f, 18.8f)
                curveToRelative(0.3f, -0.3f, 33.6f, -26.2f, 73.8f, 0.6f)
                curveToRelative(18.6f, 12.4f, 36.2f, 16.2f, 50.9f, 16.2f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, 20.7f, -2.6f)
                curveToRelative(18.0f, -4.5f, 29.4f, -13.2f, 30.6f, -14.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.0f, -18.8f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
