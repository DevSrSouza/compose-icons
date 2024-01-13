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

public val SimpleIcons.Bun: ImageVector
    get() {
        if (_bun != null) {
            return _bun!!
        }
        _bun = Builder(name = "Bun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.596f)
                curveToRelative(6.628f, 0.0f, 12.0f, -4.338f, 12.0f, -9.688f)
                curveToRelative(0.0f, -3.318f, -2.057f, -6.248f, -5.219f, -7.986f)
                curveToRelative(-1.286f, -0.715f, -2.297f, -1.357f, -3.139f, -1.89f)
                curveTo(14.058f, 2.025f, 13.08f, 1.404f, 12.0f, 1.404f)
                curveToRelative(-1.097f, 0.0f, -2.334f, 0.785f, -3.966f, 1.821f)
                arcToRelative(49.92f, 49.92f, 0.0f, false, true, -2.816f, 1.697f)
                curveTo(2.057f, 6.66f, 0.0f, 9.59f, 0.0f, 12.908f)
                curveToRelative(0.0f, 5.35f, 5.372f, 9.687f, 12.0f, 9.687f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(10.599f, 4.715f)
                curveToRelative(0.334f, -0.759f, 0.503f, -1.58f, 0.498f, -2.409f)
                curveToRelative(0.0f, -0.145f, 0.202f, -0.187f, 0.23f, -0.029f)
                curveToRelative(0.658f, 2.783f, -0.902f, 4.162f, -2.057f, 4.624f)
                curveToRelative(-0.124f, 0.048f, -0.199f, -0.121f, -0.103f, -0.209f)
                arcToRelative(5.763f, 5.763f, 0.0f, false, false, 1.432f, -1.977f)
                close()
                moveTo(12.657f, 4.613f)
                arcToRelative(5.82f, 5.82f, 0.0f, false, false, -0.782f, -2.306f)
                verticalLineToRelative(-0.016f)
                curveToRelative(-0.069f, -0.123f, 0.086f, -0.263f, 0.185f, -0.172f)
                curveToRelative(1.962f, 2.111f, 1.307f, 4.067f, 0.556f, 5.051f)
                curveToRelative(-0.082f, 0.103f, -0.23f, -0.003f, -0.189f, -0.126f)
                arcToRelative(5.85f, 5.85f, 0.0f, false, false, 0.23f, -2.431f)
                close()
                moveTo(14.433f, 4.052f)
                arcToRelative(5.727f, 5.727f, 0.0f, false, false, -1.612f, -1.806f)
                verticalLineToRelative(-0.014f)
                curveToRelative(-0.112f, -0.085f, -0.024f, -0.274f, 0.114f, -0.218f)
                curveToRelative(2.595f, 1.087f, 2.774f, 3.18f, 2.459f, 4.407f)
                arcToRelative(0.116f, 0.116f, 0.0f, false, true, -0.049f, 0.071f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.153f, -0.026f)
                arcToRelative(0.122f, 0.122f, 0.0f, false, true, -0.022f, -0.083f)
                arcToRelative(5.891f, 5.891f, 0.0f, false, false, -0.737f, -2.331f)
                close()
                moveTo(9.346f, 4.613f)
                curveToRelative(-0.617f, 0.546f, -1.282f, 0.76f, -2.063f, 1.0f)
                curveToRelative(-0.117f, 0.0f, -0.195f, -0.078f, -0.156f, -0.181f)
                curveToRelative(1.752f, -0.909f, 2.376f, -1.649f, 2.999f, -2.778f)
                curveToRelative(0.0f, 0.0f, 0.155f, -0.118f, 0.188f, 0.085f)
                curveToRelative(0.0f, 0.304f, -0.349f, 1.329f, -0.968f, 1.874f)
                close()
                moveTo(14.291f, 15.85f)
                arcToRelative(2.957f, 2.957f, 0.0f, false, true, -0.937f, 1.553f)
                curveToRelative(-0.346f, 0.346f, -0.8f, 0.565f, -1.286f, 0.62f)
                arcToRelative(2.178f, 2.178f, 0.0f, false, true, -1.327f, -0.62f)
                arcToRelative(2.955f, 2.955f, 0.0f, false, true, -0.925f, -1.553f)
                arcToRelative(0.244f, 0.244f, 0.0f, false, true, 0.064f, -0.198f)
                arcToRelative(0.234f, 0.234f, 0.0f, false, true, 0.193f, -0.069f)
                horizontalLineToRelative(3.965f)
                arcToRelative(0.226f, 0.226f, 0.0f, false, true, 0.19f, 0.07f)
                curveToRelative(0.05f, 0.053f, 0.073f, 0.125f, 0.063f, 0.197f)
                close()
                moveTo(8.833f, 13.674f)
                arcToRelative(1.862f, 1.862f, 0.0f, false, true, -2.384f, -0.245f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, true, -0.233f, -2.447f)
                curveToRelative(0.207f, -0.319f, 0.503f, -0.566f, 0.848f, -0.713f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, 1.092f, -0.11f)
                curveToRelative(0.366f, 0.075f, 0.703f, 0.261f, 0.967f, 0.531f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, true, 0.408f, 2.114f)
                arcToRelative(1.931f, 1.931f, 0.0f, false, true, -0.698f, 0.869f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(17.328f, 13.679f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, -2.381f, -0.253f)
                arcToRelative(1.964f, 1.964f, 0.0f, false, true, -0.547f, -1.366f)
                curveToRelative(0.0f, -0.384f, 0.11f, -0.76f, 0.32f, -1.079f)
                curveToRelative(0.207f, -0.319f, 0.503f, -0.567f, 0.849f, -0.713f)
                arcToRelative(1.844f, 1.844f, 0.0f, false, true, 1.093f, -0.108f)
                curveToRelative(0.367f, 0.076f, 0.704f, 0.262f, 0.968f, 0.534f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, true, 0.4f, 2.117f)
                arcToRelative(1.932f, 1.932f, 0.0f, false, true, -0.702f, 0.868f)
                close()
            }
        }
        .build()
        return _bun!!
    }

private var _bun: ImageVector? = null
