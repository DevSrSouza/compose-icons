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

public val SimpleIcons.Broadcom: ImageVector
    get() {
        if (_broadcom != null) {
            return _broadcom!!
        }
        _broadcom = Builder(name = "Broadcom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, 5.372f, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.56f, 3.63f)
                arcToRelative(13.641f, 13.641f, 0.0f, false, false, -0.867f, -0.388f)
                curveToRelative(-1.372f, -0.546f, -2.629f, -0.363f, -3.888f, 0.4f)
                curveToRelative(0.0f, 0.0f, -0.459f, 0.28f, -0.597f, 0.366f)
                curveToRelative(-0.586f, 0.37f, -1.14f, 0.717f, -1.672f, 0.717f)
                curveToRelative(-0.508f, 0.0f, -1.007f, -0.135f, -1.218f, -1.117f)
                curveToRelative(-0.33f, -1.533f, -1.135f, -5.298f, -1.486f, -7.162f)
                curveToRelative(-0.206f, -1.097f, -0.319f, -1.688f, -0.436f, -2.088f)
                curveToRelative(-0.208f, -0.706f, -0.586f, -1.09f, -1.124f, -1.15f)
                curveToRelative(0.0f, 0.0f, -0.084f, -0.013f, -0.152f, -0.013f)
                curveToRelative(-0.068f, 0.0f, -0.162f, 0.014f, -0.162f, 0.014f)
                curveToRelative(-0.531f, 0.064f, -0.907f, 0.447f, -1.114f, 1.15f)
                curveToRelative(-0.117f, 0.4f, -0.23f, 0.99f, -0.436f, 2.087f)
                curveToRelative(-0.351f, 1.864f, -1.156f, 5.63f, -1.486f, 7.162f)
                curveToRelative(-0.21f, 0.982f, -0.71f, 1.117f, -1.218f, 1.117f)
                curveToRelative(-0.531f, 0.0f, -1.086f, -0.348f, -1.672f, -0.717f)
                curveToRelative(-0.138f, -0.086f, -0.597f, -0.366f, -0.597f, -0.366f)
                curveToRelative(-1.259f, -0.763f, -2.516f, -0.946f, -3.888f, -0.4f)
                curveToRelative(-0.301f, 0.12f, -0.586f, 0.251f, -0.867f, 0.387f)
                arcTo(11.995f, 11.995f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(0.0f, 5.372f, 5.372f, 0.0f, 12.0f, 0.0f)
                moveToRelative(8.375f, 16.976f)
                curveToRelative(-0.453f, 0.152f, -0.855f, 0.42f, -1.256f, 0.672f)
                curveToRelative(-0.756f, 0.475f, -1.613f, 1.014f, -2.704f, 1.014f)
                curveToRelative(-1.614f, 0.0f, -2.749f, -0.964f, -3.112f, -2.647f)
                curveTo(13.023f, 14.712f, 12.0f, 9.793f, 12.0f, 9.793f)
                arcToRelative(496.28f, 496.28f, 0.0f, false, true, -1.303f, 6.222f)
                curveToRelative(-0.362f, 1.683f, -1.497f, 2.647f, -3.112f, 2.647f)
                curveToRelative(-1.09f, 0.0f, -1.946f, -0.539f, -2.703f, -1.014f)
                curveToRelative(-0.401f, -0.252f, -0.804f, -0.52f, -1.256f, -0.672f)
                arcToRelative(2.319f, 2.319f, 0.0f, false, false, -1.414f, -0.01f)
                curveToRelative(-0.33f, 0.097f, -0.644f, 0.234f, -0.951f, 0.386f)
                curveTo(3.227f, 21.292f, 7.207f, 24.0f, 11.91f, 24.0f)
                reflectiveCurveToRelative(8.863f, -2.708f, 10.83f, -6.648f)
                arcToRelative(5.958f, 5.958f, 0.0f, false, false, -0.95f, -0.386f)
                arcToRelative(2.322f, 2.322f, 0.0f, false, false, -1.415f, 0.01f)
            }
        }
        .build()
        return _broadcom!!
    }

private var _broadcom: ImageVector? = null
