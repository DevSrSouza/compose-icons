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

public val SimpleIcons.Swiggy: ImageVector
    get() {
        if (_swiggy != null) {
            return _swiggy!!
        }
        _swiggy = Builder(name = "Swiggy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.034f, 24.0f)
                curveToRelative(-0.376f, -0.411f, -2.075f, -2.584f, -3.95f, -5.513f)
                curveToRelative(-0.547f, -0.916f, -0.901f, -1.63f, -0.833f, -1.814f)
                curveToRelative(0.178f, -0.48f, 3.355f, -0.743f, 4.333f, -0.308f)
                curveToRelative(0.298f, 0.132f, 0.29f, 0.307f, 0.29f, 0.409f)
                curveToRelative(0.0f, 0.44f, -0.022f, 1.619f, -0.022f, 1.619f)
                arcToRelative(0.441f, 0.441f, 0.0f, true, false, 0.883f, -0.002f)
                lineToRelative(-0.005f, -2.939f)
                curveToRelative(0.0f, -0.255f, -0.278f, -0.319f, -0.331f, -0.329f)
                curveToRelative(-0.511f, -0.002f, -1.548f, -0.006f, -2.661f, -0.006f)
                curveToRelative(-2.457f, 0.0f, -3.006f, 0.101f, -3.423f, -0.172f)
                curveToRelative(-0.904f, -0.591f, -2.383f, -4.577f, -2.417f, -6.819f)
                curveTo(3.849f, 4.964f, 5.723f, 2.225f, 8.362f, 0.868f)
                arcTo(8.13f, 8.13f, 0.0f, false, true, 12.026f, 0.0f)
                curveToRelative(4.177f, 0.0f, 7.617f, 3.153f, 8.075f, 7.209f)
                lineToRelative(0.001f, 0.011f)
                curveToRelative(0.084f, 0.981f, -5.321f, 1.189f, -6.39f, 0.904f)
                curveToRelative(-0.164f, -0.044f, -0.206f, -0.212f, -0.206f, -0.284f)
                lineTo(13.5f, 4.996f)
                arcToRelative(0.442f, 0.442f, 0.0f, false, false, -0.884f, 0.002f)
                lineToRelative(0.009f, 3.866f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, 0.268f, 0.32f)
                lineToRelative(3.354f, -0.001f)
                curveToRelative(1.79f, 0.0f, 2.542f, 0.207f, 3.042f, 0.588f)
                curveToRelative(0.333f, 0.254f, 0.461f, 0.739f, 0.349f, 1.37f)
                curveTo(18.633f, 16.755f, 12.273f, 23.71f, 12.034f, 24.0f)
                close()
            }
        }
        .build()
        return _swiggy!!
    }

private var _swiggy: ImageVector? = null
