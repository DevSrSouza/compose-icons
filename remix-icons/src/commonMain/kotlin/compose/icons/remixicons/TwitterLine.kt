package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.TwitterLine: ImageVector
    get() {
        if (_twitterLine != null) {
            return _twitterLine!!
        }
        _twitterLine = Builder(name = "TwitterLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3f, 5.55f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -2.9f, 2.847f)
                lineToRelative(-0.028f, 1.575f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.68f, 0.583f)
                lineToRelative(-1.561f, -0.212f)
                curveToRelative(-2.054f, -0.28f, -4.022f, -1.226f, -5.91f, -2.799f)
                curveToRelative(-0.598f, 3.31f, 0.57f, 5.603f, 3.383f, 7.372f)
                lineToRelative(1.747f, 1.098f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.034f, 0.993f)
                lineTo(7.793f, 18.17f)
                curveToRelative(0.947f, 0.059f, 1.846f, 0.017f, 2.592f, -0.131f)
                curveToRelative(4.718f, -0.942f, 7.855f, -4.492f, 7.855f, -10.348f)
                curveToRelative(0.0f, -0.478f, -1.012f, -2.141f, -2.94f, -2.141f)
                close()
                moveTo(10.4f, 8.36f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, 8.385f, -3.355f)
                curveToRelative(0.711f, -0.005f, 1.316f, 0.175f, 2.669f, -0.645f)
                curveToRelative(-0.335f, 1.64f, -0.5f, 2.352f, -1.214f, 3.331f)
                curveToRelative(0.0f, 7.642f, -4.697f, 11.358f, -9.463f, 12.309f)
                curveToRelative(-3.268f, 0.652f, -8.02f, -0.419f, -9.382f, -1.841f)
                curveToRelative(0.694f, -0.054f, 3.514f, -0.357f, 5.144f, -1.55f)
                curveTo(5.16f, 15.7f, -0.329f, 12.47f, 3.278f, 3.786f)
                curveToRelative(1.693f, 1.977f, 3.41f, 3.323f, 5.15f, 4.037f)
                curveToRelative(1.158f, 0.475f, 1.442f, 0.465f, 1.973f, 0.538f)
                close()
            }
        }
        .build()
        return _twitterLine!!
    }

private var _twitterLine: ImageVector? = null
