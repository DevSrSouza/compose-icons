package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.DirectionsRun: ImageVector
    get() {
        if (_directionsRun != null) {
            return _directionsRun!!
        }
        _directionsRun = Builder(name = "DirectionsRun", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.49f, 5.48f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(10.32f, 17.48f)
                lineToRelative(0.57f, -2.5f)
                lineToRelative(2.1f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-5.64f)
                curveToRelative(0.0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f)
                lineToRelative(-1.48f, -1.41f)
                lineToRelative(0.6f, -3.0f)
                curveToRelative(1.07f, 1.24f, 2.62f, 2.13f, 4.36f, 2.41f)
                curveToRelative(0.6f, 0.09f, 1.14f, -0.39f, 1.14f, -1.0f)
                curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.85f, -0.98f)
                curveToRelative(-1.52f, -0.25f, -2.78f, -1.15f, -3.45f, -2.33f)
                lineToRelative(-1.0f, -1.6f)
                curveToRelative(-0.4f, -0.6f, -1.0f, -1.0f, -1.7f, -1.0f)
                curveToRelative(-0.3f, 0.0f, -0.5f, 0.1f, -0.8f, 0.1f)
                lineTo(7.21f, 7.76f)
                curveToRelative(-0.74f, 0.32f, -1.22f, 1.04f, -1.22f, 1.85f)
                verticalLineToRelative(2.37f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.4f)
                lineToRelative(1.8f, -0.7f)
                lineToRelative(-1.6f, 8.1f)
                lineToRelative(-3.92f, -0.8f)
                curveToRelative(-0.54f, -0.11f, -1.07f, 0.24f, -1.18f, 0.78f)
                lineTo(3.09f, 17.0f)
                curveToRelative(-0.11f, 0.54f, 0.24f, 1.07f, 0.78f, 1.18f)
                lineToRelative(4.11f, 0.82f)
                curveToRelative(1.06f, 0.21f, 2.1f, -0.46f, 2.34f, -1.52f)
                close()
            }
        }
        .build()
        return _directionsRun!!
    }

private var _directionsRun: ImageVector? = null
