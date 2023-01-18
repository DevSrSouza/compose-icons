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

public val RemixIcons.RocketLine: ImageVector
    get() {
        if (_rocketLine != null) {
            return _rocketLine!!
        }
        _rocketLine = Builder(name = "RocketLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                curveToRelative(0.0f, -5.088f, 2.903f, -9.436f, 7.0f, -11.182f)
                curveTo(16.097f, 3.564f, 19.0f, 7.912f, 19.0f, 13.0f)
                curveToRelative(0.0f, 0.823f, -0.076f, 1.626f, -0.22f, 2.403f)
                lineToRelative(1.94f, 1.832f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.095f, 0.603f)
                lineToRelative(-2.495f, 4.575f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.793f, 0.114f)
                lineToRelative(-2.234f, -2.234f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, -0.293f)
                lineTo(9.414f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, 0.293f)
                lineToRelative(-2.234f, 2.234f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.793f, -0.114f)
                lineToRelative(-2.495f, -4.575f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.095f, -0.603f)
                lineToRelative(1.94f, -1.832f)
                curveTo(5.077f, 14.626f, 5.0f, 13.823f, 5.0f, 13.0f)
                close()
                moveTo(6.476f, 19.696f)
                lineToRelative(0.817f, -0.817f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.414f, 18.0f)
                horizontalLineToRelative(5.172f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.121f, 0.879f)
                lineToRelative(0.817f, 0.817f)
                lineToRelative(0.982f, -1.8f)
                lineToRelative(-1.1f, -1.04f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.593f, -1.82f)
                curveToRelative(0.124f, -0.664f, 0.187f, -1.345f, 0.187f, -2.036f)
                curveToRelative(0.0f, -3.87f, -1.995f, -7.3f, -5.0f, -8.96f)
                curveTo(8.995f, 5.7f, 7.0f, 9.13f, 7.0f, 13.0f)
                curveToRelative(0.0f, 0.691f, 0.063f, 1.372f, 0.187f, 2.037f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.593f, 1.82f)
                lineToRelative(-1.1f, 1.039f)
                lineToRelative(0.982f, 1.8f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _rocketLine!!
    }

private var _rocketLine: ImageVector? = null
