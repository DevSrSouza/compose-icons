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

public val SimpleIcons.Sparkfun: ImageVector
    get() {
        if (_sparkfun != null) {
            return _sparkfun!!
        }
        _sparkfun = Builder(name = "Sparkfun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.307f, 5.476f)
                curveToRelative(-0.756f, 0.134f, -1.975f, -0.615f, -2.59f, -1.362f)
                curveToRelative(-0.755f, -0.922f, -0.66f, -1.647f, -0.071f, -2.29f)
                curveToRelative(0.883f, -0.978f, 2.396f, -0.6f, 2.396f, -0.6f)
                reflectiveCurveToRelative(-2.772f, -2.432f, -5.658f, -0.44f)
                curveToRelative(-2.571f, 1.77f, -1.833f, 4.183f, 0.487f, 6.288f)
                curveToRelative(2.09f, 1.902f, 0.42f, 3.988f, -1.686f, 3.717f)
                curveToRelative(-1.443f, -0.184f, -2.034f, -1.343f, -1.687f, -2.054f)
                curveToRelative(0.298f, -0.608f, 1.335f, -0.982f, 1.335f, -0.982f)
                reflectiveCurveToRelative(-1.19f, -0.484f, -2.592f, 0.044f)
                curveToRelative(-1.259f, 0.474f, -2.297f, 1.515f, -2.214f, 4.12f)
                verticalLineTo(24.0f)
                reflectiveCurveToRelative(1.301f, -1.604f, 2.83f, -3.236f)
                curveToRelative(1.714f, -1.84f, 2.495f, -3.084f, 4.254f, -2.938f)
                curveToRelative(3.328f, 0.205f, 5.735f, -1.273f, 7.371f, -3.645f)
                curveToRelative(3.141f, -4.563f, 0.67f, -9.68f, -1.43f, -10.343f)
                curveToRelative(0.0f, 0.0f, 0.34f, 1.438f, -0.745f, 1.638f)
                close()
            }
        }
        .build()
        return _sparkfun!!
    }

private var _sparkfun: ImageVector? = null
