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

public val SolidGroup.Futbol: ImageVector
    get() {
        if (_futbol != null) {
            return _futbol!!
        }
        _futbol = Builder(name = "Futbol", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 136.967f, -111.033f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 392.967f, 8.0f, 256.0f)
                reflectiveCurveTo(119.033f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.033f, 248.0f, 248.0f)
                close()
                moveTo(456.0f, 256.0f)
                lineToRelative(-0.003f, -0.282f)
                lineToRelative(-26.064f, 22.741f)
                lineToRelative(-62.679f, -58.5f)
                lineToRelative(16.454f, -84.355f)
                lineToRelative(34.303f, 3.072f)
                curveToRelative(-24.889f, -34.216f, -60.004f, -60.089f, -100.709f, -73.141f)
                lineToRelative(13.651f, 31.939f)
                lineTo(256.0f, 139.0f)
                lineToRelative(-74.953f, -41.525f)
                lineToRelative(13.651f, -31.939f)
                curveToRelative(-40.631f, 13.028f, -75.78f, 38.87f, -100.709f, 73.141f)
                lineToRelative(34.565f, -3.073f)
                lineToRelative(16.192f, 84.355f)
                lineToRelative(-62.678f, 58.5f)
                lineToRelative(-26.064f, -22.741f)
                lineToRelative(-0.003f, 0.282f)
                curveToRelative(0.0f, 43.015f, 13.497f, 83.952f, 38.472f, 117.991f)
                lineToRelative(7.704f, -33.897f)
                lineToRelative(85.138f, 10.447f)
                lineToRelative(36.301f, 77.826f)
                lineToRelative(-29.902f, 17.786f)
                curveToRelative(40.202f, 13.122f, 84.29f, 13.148f, 124.572f, 0.0f)
                lineToRelative(-29.902f, -17.786f)
                lineToRelative(36.301f, -77.826f)
                lineToRelative(85.138f, -10.447f)
                lineToRelative(7.704f, 33.897f)
                curveTo(442.503f, 339.952f, 456.0f, 299.015f, 456.0f, 256.0f)
                close()
                moveTo(207.898f, 325.571f)
                lineToRelative(-29.894f, -91.312f)
                lineTo(256.0f, 177.732f)
                lineToRelative(77.996f, 56.527f)
                lineToRelative(-29.622f, 91.312f)
                horizontalLineToRelative(-96.476f)
                close()
            }
        }
        .build()
        return _futbol!!
    }

private var _futbol: ImageVector? = null
