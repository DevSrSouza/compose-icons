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

public val SimpleIcons.Gamedeveloper: ImageVector
    get() {
        if (_gamedeveloper != null) {
            return _gamedeveloper!!
        }
        _gamedeveloper = Builder(name = "Gamedeveloper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.955f, 11.956f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.837f, -0.796f)
                lineTo(17.37f, 11.16f)
                lineTo(17.37f, 1.9f)
                curveToRelative(0.0f, -0.019f, 0.0f, -0.037f, -0.002f, -0.055f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.494f, -0.806f)
                arcTo(11.89f, 11.89f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, -8.454f, 3.515f)
                arcTo(11.983f, 11.983f, 0.0f, false, false, 0.043f, 12.0f)
                curveToRelative(0.0f, 1.62f, 0.316f, 3.192f, 0.94f, 4.672f)
                arcToRelative(11.928f, 11.928f, 0.0f, false, false, 2.563f, 3.813f)
                arcToRelative(11.96f, 11.96f, 0.0f, false, false, 3.799f, 2.572f)
                curveTo(8.82f, 23.683f, 10.386f, 24.0f, 12.0f, 24.0f)
                curveToRelative(1.614f, 0.0f, 3.18f, -0.317f, 4.655f, -0.943f)
                arcToRelative(11.905f, 11.905f, 0.0f, false, false, 3.799f, -2.572f)
                arcTo(11.983f, 11.983f, 0.0f, false, false, 23.957f, 12.0f)
                curveToRelative(0.0f, -0.014f, 0.0f, -0.03f, -0.002f, -0.044f)
                close()
                moveTo(19.27f, 19.299f)
                arcToRelative(10.24f, 10.24f, 0.0f, false, true, -7.272f, 3.022f)
                arcToRelative(10.228f, 10.228f, 0.0f, false, true, -7.273f, -3.022f)
                arcTo(10.305f, 10.305f, 0.0f, false, true, 1.714f, 12.0f)
                arcToRelative(10.312f, 10.312f, 0.0f, false, true, 6.281f, -9.511f)
                arcToRelative(10.212f, 10.212f, 0.0f, false, true, 4.003f, -0.809f)
                arcToRelative(10.197f, 10.197f, 0.0f, false, true, 3.694f, 0.688f)
                verticalLineToRelative(8.792f)
                horizontalLineToRelative(-3.765f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, 0.0f, 1.68f)
                horizontalLineToRelative(3.729f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, true, -1.205f, 2.012f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -2.458f, 0.92f)
                arcTo(3.77f, 3.77f, 0.0f, false, true, 8.235f, 12.0f)
                arcToRelative(3.768f, 3.768f, 0.0f, false, true, 3.758f, -3.772f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, 0.0f, -1.68f)
                arcToRelative(5.385f, 5.385f, 0.0f, false, false, -3.841f, 1.597f)
                arcTo(5.429f, 5.429f, 0.0f, false, false, 6.559f, 12.0f)
                curveToRelative(0.0f, 1.457f, 0.564f, 2.825f, 1.591f, 3.855f)
                arcToRelative(5.384f, 5.384f, 0.0f, false, false, 3.841f, 1.597f)
                arcToRelative(5.431f, 5.431f, 0.0f, false, false, 3.555f, -1.329f)
                arcToRelative(5.46f, 5.46f, 0.0f, false, false, 1.813f, -3.281f)
                horizontalLineToRelative(4.89f)
                arcToRelative(10.292f, 10.292f, 0.0f, false, true, -2.979f, 6.457f)
                close()
            }
        }
        .build()
        return _gamedeveloper!!
    }

private var _gamedeveloper: ImageVector? = null
