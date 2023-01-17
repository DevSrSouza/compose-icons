package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Unverified24: ImageVector
    get() {
        if (_unverified24 != null) {
            return _unverified24!!
        }
        _unverified24 = Builder(name = "Unverified24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(10.483f, 8.835f)
                curveToRelative(0.112f, -0.223f, 0.268f, -0.424f, 0.488f, -0.57f)
                curveTo(11.186f, 8.12f, 11.506f, 8.0f, 12.0f, 8.0f)
                curveToRelative(0.384f, 0.0f, 0.766f, 0.118f, 1.034f, 0.319f)
                arcToRelative(0.953f, 0.953f, 0.0f, false, true, 0.403f, 0.806f)
                curveToRelative(0.0f, 0.48f, -0.218f, 0.81f, -0.62f, 1.186f)
                arcToRelative(9.293f, 9.293f, 0.0f, false, true, -0.409f, 0.354f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -0.294f, 0.249f)
                curveToRelative(-0.246f, 0.213f, -0.524f, 0.474f, -0.738f, 0.795f)
                lineToRelative(-0.126f, 0.19f)
                lineTo(11.25f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.12f)
                curveToRelative(0.09f, -0.1f, 0.203f, -0.208f, 0.347f, -0.333f)
                curveToRelative(0.063f, -0.055f, 0.14f, -0.119f, 0.222f, -0.187f)
                curveToRelative(0.166f, -0.14f, 0.358f, -0.3f, 0.52f, -0.452f)
                curveToRelative(0.536f, -0.5f, 1.098f, -1.2f, 1.098f, -2.283f)
                arcToRelative(2.45f, 2.45f, 0.0f, false, false, -1.003f, -2.006f)
                curveTo(13.37f, 6.695f, 12.658f, 6.5f, 12.0f, 6.5f)
                curveToRelative(-0.756f, 0.0f, -1.373f, 0.191f, -1.861f, 0.517f)
                arcToRelative(2.944f, 2.944f, 0.0f, false, false, -0.997f, 1.148f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.341f, 0.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.864f, 1.2f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 4.272f, 0.0f)
                lineToRelative(1.375f, 1.01f)
                curveToRelative(0.274f, 0.2f, 0.593f, 0.333f, 0.929f, 0.384f)
                lineToRelative(1.686f, 0.259f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 3.021f, 3.02f)
                lineToRelative(0.259f, 1.687f)
                curveToRelative(0.051f, 0.336f, 0.183f, 0.655f, 0.384f, 0.929f)
                lineToRelative(1.01f, 1.375f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 0.0f, 4.272f)
                lineToRelative(-1.01f, 1.375f)
                arcToRelative(2.106f, 2.106f, 0.0f, false, false, -0.384f, 0.929f)
                lineToRelative(-0.259f, 1.686f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, -3.02f, 3.021f)
                lineToRelative(-1.687f, 0.259f)
                arcToRelative(2.106f, 2.106f, 0.0f, false, false, -0.929f, 0.384f)
                lineToRelative(-1.375f, 1.01f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, -4.272f, 0.0f)
                lineToRelative(-1.375f, -1.01f)
                arcToRelative(2.106f, 2.106f, 0.0f, false, false, -0.929f, -0.384f)
                lineToRelative(-1.686f, -0.259f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, -3.021f, -3.02f)
                lineToRelative(-0.259f, -1.687f)
                arcToRelative(2.106f, 2.106f, 0.0f, false, false, -0.384f, -0.929f)
                lineTo(1.2f, 14.136f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 0.0f, -4.272f)
                lineToRelative(1.01f, -1.375f)
                curveToRelative(0.201f, -0.274f, 0.333f, -0.593f, 0.384f, -0.929f)
                lineToRelative(0.259f, -1.686f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 3.02f, -3.021f)
                lineToRelative(1.687f, -0.259f)
                curveToRelative(0.336f, -0.051f, 0.655f, -0.183f, 0.929f, -0.384f)
                close()
                moveTo(13.248f, 2.409f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, -2.496f, 0.0f)
                lineToRelative(-1.376f, 1.01f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, -1.589f, 0.658f)
                lineToRelative(-1.686f, 0.258f)
                arcToRelative(2.111f, 2.111f, 0.0f, false, false, -1.766f, 1.766f)
                lineToRelative(-0.258f, 1.686f)
                arcToRelative(3.614f, 3.614f, 0.0f, false, true, -0.658f, 1.59f)
                lineToRelative(-1.01f, 1.375f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, 0.0f, 2.496f)
                lineToRelative(1.01f, 1.376f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 0.658f, 1.589f)
                lineToRelative(0.258f, 1.686f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, 1.766f, 1.765f)
                lineToRelative(1.686f, 0.26f)
                arcToRelative(3.613f, 3.613f, 0.0f, false, true, 1.59f, 0.657f)
                lineToRelative(1.375f, 1.01f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, 2.496f, 0.0f)
                lineToRelative(1.376f, -1.01f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 1.589f, -0.658f)
                lineToRelative(1.686f, -0.258f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, 1.765f, -1.766f)
                lineToRelative(0.26f, -1.686f)
                arcToRelative(3.613f, 3.613f, 0.0f, false, true, 0.657f, -1.59f)
                lineToRelative(1.01f, -1.375f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, false, 0.0f, -2.496f)
                lineToRelative(-1.01f, -1.376f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, -0.658f, -1.589f)
                lineToRelative(-0.258f, -1.686f)
                arcToRelative(2.111f, 2.111f, 0.0f, false, false, -1.766f, -1.766f)
                lineToRelative(-1.686f, -0.258f)
                arcToRelative(3.614f, 3.614f, 0.0f, false, true, -1.59f, -0.658f)
                close()
            }
        }
        .build()
        return _unverified24!!
    }

private var _unverified24: ImageVector? = null
