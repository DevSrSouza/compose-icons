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

public val SimpleIcons.Arlo: ImageVector
    get() {
        if (_arlo != null) {
            return _arlo!!
        }
        _arlo = Builder(name = "Arlo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.21f, 11.172f)
                lineToRelative(4.963f, -5.792f)
                curveToRelative(0.943f, -1.293f, 1.494f, -1.828f, 1.07f, -3.94f)
                lineToRelative(-7.367f, 8.6f)
                arcToRelative(7.907f, 7.907f, 0.0f, false, false, -1.896f, 5.487f)
                lineTo(9.763f, 11.87f)
                arcToRelative(5.775f, 5.775f, 0.0f, false, false, -0.947f, -0.829f)
                arcTo(9.979f, 9.979f, 0.0f, false, false, 7.0f, 10.051f)
                curveToRelative(0.213f, -0.076f, 0.43f, -0.14f, 0.649f, -0.194f)
                curveToRelative(0.385f, -0.094f, 0.78f, -0.144f, 1.176f, -0.147f)
                curveToRelative(0.444f, 0.0f, 0.881f, 0.07f, 1.3f, 0.237f)
                curveToRelative(0.416f, 0.168f, 0.82f, 0.432f, 1.212f, 0.858f)
                lineToRelative(0.216f, 0.252f)
                lineToRelative(1.336f, -1.129f)
                curveToRelative(-0.01f, -0.011f, -0.241f, -0.283f, -0.251f, -0.292f)
                arcToRelative(5.09f, 5.09f, 0.0f, false, false, -1.86f, -1.308f)
                arcToRelative(5.233f, 5.233f, 0.0f, false, false, -1.953f, -0.364f)
                curveToRelative(-0.151f, 0.0f, -0.299f, 0.007f, -0.446f, 0.017f)
                curveToRelative(-1.461f, 0.24f, -2.364f, 1.104f, -3.714f, 1.244f)
                curveToRelative(0.001f, 0.006f, -4.58f, 0.0f, -4.581f, 0.002f)
                curveToRelative(-0.101f, 0.0f, -0.115f, 0.144f, -0.017f, 0.163f)
                curveToRelative(1.202f, 0.24f, 3.341f, 0.699f, 4.844f, 1.214f)
                curveToRelative(1.142f, 0.529f, 2.24f, 1.205f, 3.106f, 2.022f)
                curveToRelative(0.17f, 0.135f, 0.317f, 0.271f, 0.439f, 0.405f)
                lineToRelative(4.283f, 4.87f)
                curveToRelative(0.61f, 0.501f, 1.395f, 0.755f, 3.066f, 0.767f)
                arcToRelative(6.197f, 6.197f, 0.0f, false, true, -0.695f, -1.337f)
                arcToRelative(6.173f, 6.173f, 0.0f, false, true, -0.014f, -4.256f)
                arcToRelative(6.139f, 6.139f, 0.0f, false, true, 1.114f, -1.903f)
                close()
                moveTo(24.0f, 22.56f)
                curveToRelative(-1.734f, -0.022f, -2.489f, -0.317f, -3.11f, -0.888f)
                lineToRelative(-0.962f, -1.093f)
                curveToRelative(-0.065f, -0.079f, -0.13f, -0.157f, -0.197f, -0.234f)
                lineToRelative(0.011f, 0.023f)
                lineToRelative(-1.704f, -1.937f)
                arcToRelative(4.794f, 4.794f, 0.0f, false, true, -0.905f, -4.806f)
                arcToRelative(4.755f, 4.755f, 0.0f, false, true, 0.871f, -1.482f)
                lineToRelative(4.208f, -4.892f)
                curveToRelative(0.43f, 2.179f, -0.192f, 2.666f, -1.21f, 4.09f)
                lineToRelative(-1.668f, 1.937f)
                arcToRelative(3.038f, 3.038f, 0.0f, false, false, -0.739f, 1.989f)
                curveToRelative(0.001f, 0.741f, 0.272f, 1.458f, 0.761f, 2.014f)
                lineTo(24.0f, 22.56f)
                close()
            }
        }
        .build()
        return _arlo!!
    }

private var _arlo: ImageVector? = null
