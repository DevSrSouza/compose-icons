package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Infinity24: ImageVector
    get() {
        if (_infinity24 != null) {
            return _infinity24!!
        }
        _infinity24 = Builder(name = "Infinity24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.16f)
                curveToRelative(0.887f, -0.933f, 1.813f, -1.865f, 2.78f, -2.6f)
                curveTo(15.952f, 7.668f, 17.267f, 7.0f, 18.75f, 7.0f)
                curveTo(21.657f, 7.0f, 24.0f, 9.615f, 24.0f, 12.25f)
                reflectiveCurveToRelative(-2.343f, 5.25f, -5.25f, 5.25f)
                curveToRelative(-1.483f, 0.0f, -2.798f, -0.668f, -3.97f, -1.56f)
                curveToRelative(-0.967f, -0.735f, -1.893f, -1.667f, -2.78f, -2.6f)
                curveToRelative(-0.887f, 0.933f, -1.813f, 1.865f, -2.78f, 2.6f)
                curveToRelative(-1.172f, 0.892f, -2.487f, 1.56f, -3.97f, 1.56f)
                curveTo(2.343f, 17.5f, 0.0f, 14.885f, 0.0f, 12.25f)
                reflectiveCurveTo(2.343f, 7.0f, 5.25f, 7.0f)
                curveToRelative(1.483f, 0.0f, 2.798f, 0.667f, 3.97f, 1.56f)
                curveToRelative(0.967f, 0.735f, 1.893f, 1.667f, 2.78f, 2.6f)
                close()
                moveTo(5.25f, 8.5f)
                curveToRelative(-2.032f, 0.0f, -3.75f, 1.895f, -3.75f, 3.75f)
                reflectiveCurveTo(3.218f, 16.0f, 5.25f, 16.0f)
                curveToRelative(1.017f, 0.0f, 2.014f, -0.457f, 3.062f, -1.253f)
                curveToRelative(0.89f, -0.678f, 1.758f, -1.554f, 2.655f, -2.497f)
                curveToRelative(-0.897f, -0.943f, -1.765f, -1.82f, -2.655f, -2.497f)
                curveTo(7.264f, 8.957f, 6.267f, 8.5f, 5.25f, 8.5f)
                close()
                moveTo(13.033f, 12.25f)
                curveToRelative(0.897f, 0.943f, 1.765f, 1.82f, 2.655f, 2.497f)
                curveTo(16.736f, 15.543f, 17.733f, 16.0f, 18.75f, 16.0f)
                curveToRelative(2.032f, 0.0f, 3.75f, -1.895f, 3.75f, -3.75f)
                reflectiveCurveTo(20.782f, 8.5f, 18.75f, 8.5f)
                curveToRelative(-1.017f, 0.0f, -2.014f, 0.457f, -3.062f, 1.253f)
                curveToRelative(-0.89f, 0.678f, -1.758f, 1.554f, -2.655f, 2.497f)
                close()
            }
        }
        .build()
        return _infinity24!!
    }

private var _infinity24: ImageVector? = null
