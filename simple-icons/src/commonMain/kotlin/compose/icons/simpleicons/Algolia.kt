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

public val SimpleIcons.Algolia: ImageVector
    get() {
        if (_algolia != null) {
            return _algolia!!
        }
        _algolia = Builder(name = "Algolia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.445f, 0.0f, 0.103f, 5.285f, 0.01f, 11.817f)
                curveToRelative(-0.097f, 6.634f, 5.285f, 12.131f, 11.92f, 12.17f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, 5.775f, -1.443f)
                arcToRelative(0.281f, 0.281f, 0.0f, false, false, 0.052f, -0.457f)
                lineToRelative(-1.122f, -0.994f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, false, -0.833f, -0.14f)
                arcToRelative(9.693f, 9.693f, 0.0f, false, true, -3.923f, 0.77f)
                curveToRelative(-5.36f, -0.067f, -9.692f, -4.527f, -9.607f, -9.888f)
                curveToRelative(0.084f, -5.293f, 4.417f, -9.573f, 9.73f, -9.573f)
                horizontalLineToRelative(9.73f)
                verticalLineToRelative(17.296f)
                lineToRelative(-5.522f, -4.907f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, false, -0.596f, 0.063f)
                arcToRelative(4.52f, 4.52f, 0.0f, false, true, -3.934f, 1.793f)
                arcToRelative(4.538f, 4.538f, 0.0f, false, true, -4.192f, -4.168f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, true, 4.512f, -4.872f)
                arcToRelative(4.532f, 4.532f, 0.0f, false, true, 4.509f, 4.126f)
                curveToRelative(0.018f, 0.205f, 0.11f, 0.397f, 0.265f, 0.533f)
                lineToRelative(1.438f, 1.275f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, 0.462f, -0.158f)
                arcToRelative(6.82f, 6.82f, 0.0f, false, false, 0.099f, -1.725f)
                curveToRelative(-0.232f, -3.376f, -2.966f, -6.092f, -6.345f, -6.3f)
                curveToRelative(-3.873f, -0.24f, -7.11f, 2.79f, -7.214f, 6.588f)
                curveToRelative(-0.1f, 3.7f, 2.933f, 6.892f, 6.634f, 6.974f)
                arcToRelative(6.75f, 6.75f, 0.0f, false, false, 4.136f, -1.294f)
                lineToRelative(7.212f, 6.394f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, 0.797f, -0.36f)
                verticalLineTo(0.456f)
                arcTo(0.456f, 0.456f, 0.0f, false, false, 23.54f, 0.0f)
                close()
            }
        }
        .build()
        return _algolia!!
    }

private var _algolia: ImageVector? = null
