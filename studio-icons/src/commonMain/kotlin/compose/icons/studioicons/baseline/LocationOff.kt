package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.LocationOff: ImageVector
    get() {
        if (_locationOff != null) {
            return _locationOff!!
        }
        _locationOff = Builder(name = "LocationOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.74f, -0.33f, 1.39f, -0.83f, 1.85f)
                lineToRelative(3.63f, 3.63f)
                curveToRelative(0.98f, -1.86f, 1.7f, -3.8f, 1.7f, -5.48f)
                curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f)
                curveToRelative(-1.98f, 0.0f, -3.76f, 0.83f, -5.04f, 2.15f)
                lineToRelative(3.19f, 3.19f)
                curveToRelative(0.46f, -0.52f, 1.11f, -0.84f, 1.85f, -0.84f)
                close()
                moveTo(16.37f, 16.1f)
                lineToRelative(-4.63f, -4.63f)
                lineToRelative(-0.11f, -0.11f)
                lineTo(3.27f, 3.0f)
                lineTo(2.0f, 4.27f)
                lineToRelative(3.18f, 3.18f)
                curveTo(5.07f, 7.95f, 5.0f, 8.47f, 5.0f, 9.0f)
                curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f)
                reflectiveCurveToRelative(1.67f, -1.85f, 3.38f, -4.35f)
                lineTo(18.73f, 21.0f)
                lineTo(20.0f, 19.73f)
                lineToRelative(-3.63f, -3.63f)
                close()
            }
        }
        .build()
        return _locationOff!!
    }

private var _locationOff: ImageVector? = null
