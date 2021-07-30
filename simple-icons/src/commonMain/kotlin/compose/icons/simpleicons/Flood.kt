package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Flood: ImageVector
    get() {
        if (_flood != null) {
            return _flood!!
        }
        _flood = Builder(name = "Flood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.683f, 16.283f)
                curveToRelative(-1.233f, -0.066f, -1.85f, -1.533f, -2.15f, -2.433f)
                curveToRelative(-0.266f, -0.767f, -0.666f, -2.117f, -0.966f, -2.933f)
                curveToRelative(-0.35f, -0.95f, -0.45f, -1.017f, -0.65f, -1.017f)
                curveToRelative(-0.417f, 0.0f, -0.734f, 1.183f, -1.05f, 2.067f)
                curveToRelative(-0.667f, 1.833f, -1.167f, 3.85f, -2.934f, 3.85f)
                curveToRelative(-1.533f, 0.0f, -2.216f, -1.184f, -2.7f, -1.884f)
                curveToRelative(-0.45f, -0.666f, -0.716f, -0.816f, -1.133f, -0.816f)
                curveToRelative(-0.533f, 0.0f, -0.783f, 0.466f, -1.267f, 1.283f)
                curveToRelative(-0.283f, 0.467f, -0.6f, 0.95f, -0.966f, 1.267f)
                curveToRelative(-0.1f, 0.083f, -0.934f, 0.733f, -1.717f, 0.633f)
                curveToRelative(-0.45f, -0.067f, -0.767f, -0.333f, -0.767f, -0.783f)
                curveToRelative(0.0f, -0.617f, 0.684f, -0.734f, 1.067f, -0.884f)
                curveToRelative(0.333f, -0.116f, 0.733f, -0.716f, 0.933f, -1.05f)
                curveToRelative(0.534f, -0.916f, 1.217f, -2.116f, 2.75f, -2.116f)
                curveToRelative(1.35f, 0.0f, 2.0f, 0.866f, 2.5f, 1.55f)
                curveToRelative(0.45f, 0.616f, 0.717f, 1.116f, 1.234f, 1.133f)
                curveToRelative(0.433f, 0.017f, 1.033f, -1.617f, 1.383f, -2.75f)
                curveToRelative(0.533f, -1.733f, 1.233f, -3.333f, 2.633f, -3.333f)
                curveToRelative(1.884f, 0.0f, 2.434f, 2.633f, 3.017f, 4.65f)
                curveToRelative(0.083f, 0.3f, 0.283f, 0.933f, 0.333f, 1.016f)
                curveToRelative(0.267f, 0.567f, 0.484f, 0.934f, 0.717f, 1.05f)
                curveToRelative(0.267f, 0.15f, 0.7f, 0.434f, 0.567f, 0.934f)
                curveToRelative(-0.084f, 0.383f, -0.434f, 0.583f, -0.834f, 0.566f)
                close()
                moveTo(4.317f, 14.683f)
                curveToRelative(0.016f, 0.0f, 0.016f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.016f, 0.0f, 0.016f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.367f, 0.0f, 0.0f, 5.367f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.367f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.367f, 12.0f, -12.0f)
                reflectiveCurveTo(18.633f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.017f)
                arcTo(10.015f, 10.015f, 0.0f, false, true, 1.983f, 12.0f)
                arcTo(10.015f, 10.015f, 0.0f, false, true, 12.0f, 1.983f)
                arcTo(10.015f, 10.015f, 0.0f, false, true, 22.017f, 12.0f)
                arcTo(10.015f, 10.015f, 0.0f, false, true, 12.0f, 22.017f)
                close()
            }
        }
        .build()
        return _flood!!
    }

private var _flood: ImageVector? = null
