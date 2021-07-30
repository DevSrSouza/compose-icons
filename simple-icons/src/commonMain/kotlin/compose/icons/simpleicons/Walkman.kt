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

public val SimpleIcons.Walkman: ImageVector
    get() {
        if (_walkman != null) {
            return _walkman!!
        }
        _walkman = Builder(name = "Walkman", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.838f, 6.377f)
                arcToRelative(3.624f, 3.624f, 0.0f, false, false, -0.833f, 0.086f)
                curveToRelative(-1.696f, 0.375f, -2.56f, 1.674f, -2.535f, 3.027f)
                curveToRelative(0.022f, 1.328f, -0.592f, 2.51f, -1.911f, 2.663f)
                curveToRelative(-1.28f, 0.154f, -1.861f, -0.835f, -1.946f, -2.009f)
                curveToRelative(-0.083f, -1.159f, -0.875f, -2.076f, -2.099f, -1.802f)
                curveToRelative(-1.044f, 0.227f, -1.785f, 1.163f, -1.846f, 2.339f)
                curveToRelative(-0.065f, 1.22f, -0.547f, 2.24f, -1.425f, 2.343f)
                curveToRelative(-0.841f, 0.097f, -1.261f, -0.933f, -1.317f, -1.75f)
                curveToRelative(-0.054f, -0.803f, -0.453f, -1.822f, -1.497f, -1.59f)
                curveTo(0.446f, 9.9f, 0.017f, 11.128f, 0.001f, 11.94f)
                curveToRelative(-0.017f, 0.82f, 0.333f, 1.914f, 1.27f, 1.853f)
                curveToRelative(0.726f, -0.048f, 1.275f, 0.636f, 1.291f, 1.67f)
                curveToRelative(0.014f, 1.008f, 0.568f, 2.16f, 1.665f, 2.162f)
                curveToRelative(1.16f, 0.0f, 1.799f, -0.982f, 1.828f, -2.366f)
                curveToRelative(0.027f, -1.2f, 0.757f, -2.06f, 1.555f, -2.147f)
                curveToRelative(0.827f, -0.087f, 1.588f, 0.635f, 1.674f, 1.957f)
                curveToRelative(0.091f, 1.344f, 0.77f, 2.517f, 2.568f, 2.517f)
                curveToRelative(1.947f, 0.0f, 2.457f, -1.477f, 2.421f, -2.889f)
                curveToRelative(-0.036f, -1.397f, 1.03f, -2.367f, 2.318f, -2.544f)
                curveToRelative(1.404f, -0.192f, 2.862f, -1.246f, 2.687f, -3.382f)
                curveToRelative(-0.138f, -1.701f, -1.242f, -2.374f, -2.44f, -2.393f)
                close()
                moveTo(20.837f, 12.015f)
                arcToRelative(3.909f, 3.909f, 0.0f, false, false, -0.318f, 0.02f)
                curveToRelative(-1.6f, 0.16f, -2.762f, 1.27f, -2.644f, 2.893f)
                curveToRelative(0.12f, 1.65f, 1.47f, 2.679f, 3.133f, 2.679f)
                curveToRelative(1.769f, 0.0f, 3.165f, -1.154f, 2.975f, -2.992f)
                curveToRelative(-0.178f, -1.69f, -1.571f, -2.632f, -3.146f, -2.6f)
                close()
            }
        }
        .build()
        return _walkman!!
    }

private var _walkman: ImageVector? = null
