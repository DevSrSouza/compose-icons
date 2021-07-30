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

public val SimpleIcons.Ring: ImageVector
    get() {
        if (_ring != null) {
            return _ring!!
        }
        _ring = Builder(name = "Ring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.375f)
                arcToRelative(3.05f, 3.05f, 0.0f, false, true, -0.246f, 1.231f)
                arcToRelative(3.114f, 3.114f, 0.0f, false, true, -1.672f, 1.66f)
                arcToRelative(3.068f, 3.068f, 0.0f, false, true, -1.225f, 0.247f)
                arcToRelative(3.695f, 3.695f, 0.0f, false, true, -0.71f, -0.073f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, -0.739f, -0.218f)
                arcToRelative(3.184f, 3.184f, 0.0f, false, true, -0.676f, -0.37f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, true, -0.507f, -0.515f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, -0.08f, -0.275f)
                arcToRelative(0.442f, 0.442f, 0.0f, false, true, 0.152f, -0.346f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, true, 0.346f, -0.138f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, true, 0.201f, 0.04f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, true, 0.186f, 0.17f)
                arcToRelative(0.046f, 0.046f, 0.0f, false, false, 0.016f, 0.032f)
                lineToRelative(0.064f, 0.065f)
                arcToRelative(1.806f, 1.806f, 0.0f, false, false, 0.798f, 0.507f)
                arcToRelative(3.052f, 3.052f, 0.0f, false, false, 0.943f, 0.154f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, false, 0.846f, -0.17f)
                arcToRelative(2.189f, 2.189f, 0.0f, false, false, 1.16f, -1.16f)
                arcToRelative(2.115f, 2.115f, 0.0f, false, false, 0.176f, -0.841f)
                verticalLineToRelative(-1.109f)
                arcToRelative(3.132f, 3.132f, 0.0f, false, true, -0.985f, 0.637f)
                arcToRelative(3.089f, 3.089f, 0.0f, false, true, -1.193f, 0.234f)
                arcToRelative(3.046f, 3.046f, 0.0f, false, true, -1.231f, -0.246f)
                arcToRelative(3.137f, 3.137f, 0.0f, false, true, -1.66f, -1.66f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, -0.247f, -1.232f)
                verticalLineToRelative(-2.544f)
                arcToRelative(3.058f, 3.058f, 0.0f, false, true, 0.247f, -1.225f)
                arcToRelative(3.154f, 3.154f, 0.0f, false, true, 0.668f, -1.0f)
                arcToRelative(3.202f, 3.202f, 0.0f, false, true, 0.986f, -0.669f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, 2.463f, 0.0f)
                arcToRelative(3.09f, 3.09f, 0.0f, false, true, 1.668f, 1.668f)
                arcToRelative(3.066f, 3.066f, 0.0f, false, true, 0.246f, 1.225f)
                verticalLineToRelative(5.92f)
                close()
                moveTo(23.033f, 10.455f)
                arcToRelative(2.118f, 2.118f, 0.0f, false, false, -0.17f, -0.846f)
                arcToRelative(2.189f, 2.189f, 0.0f, false, false, -1.16f, -1.16f)
                arcToRelative(2.201f, 2.201f, 0.0f, false, false, -1.692f, 0.0f)
                arcToRelative(2.191f, 2.191f, 0.0f, false, false, -1.166f, 1.16f)
                arcToRelative(2.134f, 2.134f, 0.0f, false, false, -0.168f, 0.845f)
                verticalLineToRelative(2.531f)
                arcToRelative(2.133f, 2.133f, 0.0f, false, false, 0.168f, 0.853f)
                arcToRelative(2.194f, 2.194f, 0.0f, false, false, 0.468f, 0.693f)
                arcToRelative(2.171f, 2.171f, 0.0f, false, false, 0.694f, 0.467f)
                arcToRelative(2.201f, 2.201f, 0.0f, false, false, 1.692f, 0.0f)
                arcToRelative(2.189f, 2.189f, 0.0f, false, false, 1.16f, -1.16f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, false, 0.174f, -0.853f)
                close()
                moveTo(15.781f, 15.811f)
                arcToRelative(0.435f, 0.435f, 0.0f, false, true, -0.154f, 0.363f)
                arcToRelative(0.511f, 0.511f, 0.0f, false, true, -0.66f, 0.0f)
                arcToRelative(0.434f, 0.434f, 0.0f, false, true, -0.153f, -0.363f)
                verticalLineToRelative(-5.356f)
                arcToRelative(2.118f, 2.118f, 0.0f, false, false, -0.17f, -0.846f)
                arcToRelative(2.189f, 2.189f, 0.0f, false, false, -1.16f, -1.16f)
                arcToRelative(2.201f, 2.201f, 0.0f, false, false, -1.692f, 0.0f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, false, -1.16f, 1.16f)
                arcToRelative(2.127f, 2.127f, 0.0f, false, false, -0.17f, 0.846f)
                verticalLineToRelative(5.356f)
                arcToRelative(0.434f, 0.434f, 0.0f, false, true, -0.152f, 0.363f)
                arcToRelative(0.511f, 0.511f, 0.0f, false, true, -0.661f, 0.0f)
                arcToRelative(0.434f, 0.434f, 0.0f, false, true, -0.153f, -0.363f)
                verticalLineToRelative(-5.356f)
                arcToRelative(3.058f, 3.058f, 0.0f, false, true, 0.246f, -1.225f)
                arcToRelative(3.163f, 3.163f, 0.0f, false, true, 0.67f, -1.0f)
                arcToRelative(3.202f, 3.202f, 0.0f, false, true, 0.984f, -0.669f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, 2.464f, 0.0f)
                arcToRelative(3.091f, 3.091f, 0.0f, false, true, 1.667f, 1.668f)
                arcToRelative(3.066f, 3.066f, 0.0f, false, true, 0.247f, 1.225f)
                close()
                moveTo(7.398f, 15.811f)
                arcToRelative(0.435f, 0.435f, 0.0f, false, true, -0.152f, 0.363f)
                arcToRelative(0.511f, 0.511f, 0.0f, false, true, -0.662f, 0.0f)
                arcToRelative(0.434f, 0.434f, 0.0f, false, true, -0.152f, -0.363f)
                lineTo(6.432f, 7.956f)
                arcToRelative(0.435f, 0.435f, 0.0f, false, true, 0.152f, -0.363f)
                arcToRelative(0.512f, 0.512f, 0.0f, false, true, 0.662f, 0.0f)
                arcToRelative(0.436f, 0.436f, 0.0f, false, true, 0.152f, 0.363f)
                close()
                moveTo(4.982f, 8.44f)
                arcToRelative(0.463f, 0.463f, 0.0f, false, true, -0.145f, 0.338f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, -0.355f, 0.142f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, -0.339f, -0.145f)
                lineToRelative(-0.016f, -0.017f)
                arcToRelative(0.149f, 0.149f, 0.0f, false, false, -0.032f, -0.024f)
                arcToRelative(0.123f, 0.123f, 0.0f, false, true, -0.033f, -0.025f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.24f, -0.43f)
                quadToRelative(-0.871f, 0.0f, -1.363f, 0.595f)
                quadToRelative(-0.491f, 0.596f, -0.492f, 1.693f)
                verticalLineToRelative(5.243f)
                arcToRelative(0.435f, 0.435f, 0.0f, false, true, -0.153f, 0.363f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, -0.33f, 0.123f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, -0.33f, -0.123f)
                arcToRelative(0.434f, 0.434f, 0.0f, false, true, -0.153f, -0.363f)
                verticalLineToRelative(-5.243f)
                arcTo(4.362f, 4.362f, 0.0f, false, true, 0.18f, 9.303f)
                arcToRelative(3.034f, 3.034f, 0.0f, false, true, 0.53f, -1.031f)
                arcToRelative(2.546f, 2.546f, 0.0f, false, true, 0.878f, -0.706f)
                arcToRelative(2.763f, 2.763f, 0.0f, false, true, 1.231f, -0.257f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, true, 1.065f, 0.209f)
                arcToRelative(2.573f, 2.573f, 0.0f, false, true, 0.934f, 0.58f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, 0.163f, 0.343f)
                close()
                moveTo(7.742f, 5.312f)
                arcToRelative(0.826f, 0.826f, 0.0f, false, true, -0.826f, 0.827f)
                arcToRelative(0.826f, 0.826f, 0.0f, false, true, -0.827f, -0.827f)
                arcToRelative(0.826f, 0.826f, 0.0f, false, true, 0.827f, -0.826f)
                arcToRelative(0.826f, 0.826f, 0.0f, false, true, 0.826f, 0.826f)
                close()
            }
        }
        .build()
        return _ring!!
    }

private var _ring: ImageVector? = null
