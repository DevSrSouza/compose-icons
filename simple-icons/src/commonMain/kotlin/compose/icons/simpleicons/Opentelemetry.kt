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

public val SimpleIcons.Opentelemetry: ImageVector
    get() {
        if (_opentelemetry != null) {
            return _opentelemetry!!
        }
        _opentelemetry = Builder(name = "Opentelemetry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6974f, 13.1173f)
                curveToRelative(-1.0224f, 1.0224f, -1.0224f, 2.68f, 0.0f, 3.7024f)
                curveToRelative(1.0224f, 1.0224f, 2.68f, 1.0224f, 3.7024f, 0.0f)
                curveToRelative(1.0224f, -1.0223f, 1.0224f, -2.68f, 0.0f, -3.7024f)
                curveToRelative(-1.0223f, -1.0223f, -2.68f, -1.0223f, -3.7024f, 0.0f)
                close()
                moveTo(15.4651f, 15.8874f)
                curveToRelative(-0.5063f, 0.5063f, -1.3267f, 0.5063f, -1.833f, 0.0f)
                reflectiveCurveToRelative(-0.5063f, -1.3266f, 0.0f, -1.833f)
                curveToRelative(0.5063f, -0.5062f, 1.3267f, -0.5062f, 1.833f, 0.0f)
                curveToRelative(0.5063f, 0.504f, 0.5063f, 1.3267f, 0.0f, 1.833f)
                close()
                moveTo(16.356f, 0.2355f)
                lineToRelative(-1.6041f, 1.6042f)
                curveToRelative(-0.314f, 0.314f, -0.314f, 0.83f, 0.0f, 1.144f)
                lineTo(21.015f, 9.247f)
                curveToRelative(0.314f, 0.314f, 0.83f, 0.314f, 1.144f, 0.0f)
                lineToRelative(1.6042f, -1.6041f)
                curveToRelative(0.314f, -0.314f, 0.314f, -0.83f, 0.0f, -1.144f)
                lineTo(17.4976f, 0.2354f)
                curveToRelative(-0.314f, -0.314f, -0.8276f, -0.314f, -1.1416f, 0.0f)
                close()
                moveTo(5.1173f, 20.734f)
                curveToRelative(0.2848f, -0.2848f, 0.2848f, -0.7497f, 0.0f, -1.0345f)
                lineToRelative(-0.8155f, -0.8155f)
                curveToRelative(-0.2848f, -0.2848f, -0.7497f, -0.2848f, -1.0345f, 0.0f)
                lineToRelative(-1.6845f, 1.6845f)
                lineToRelative(-0.0024f, 0.0024f)
                lineToRelative(-0.4625f, -0.4625f)
                curveToRelative(-0.2556f, -0.2556f, -0.6718f, -0.2556f, -0.925f, 0.0f)
                curveToRelative(-0.2556f, 0.2556f, -0.2556f, 0.6718f, 0.0f, 0.925f)
                lineToRelative(2.775f, 2.775f)
                curveToRelative(0.2556f, 0.2556f, 0.6718f, 0.2556f, 0.925f, 0.0f)
                curveToRelative(0.2532f, -0.2556f, 0.2556f, -0.6718f, 0.0f, -0.925f)
                lineToRelative(-0.4625f, -0.4625f)
                lineToRelative(0.0024f, -0.0024f)
                close()
                moveTo(13.6029f, 4.841f)
                lineTo(10.0392f, 8.4047f)
                curveToRelative(-0.3164f, 0.3164f, -0.3164f, 0.8374f, 0.0f, 1.1538f)
                lineToRelative(2.2006f, 2.2005f)
                curveToRelative(1.5554f, -1.1197f, 3.7365f, -0.981f, 5.1361f, 0.4187f)
                lineToRelative(1.7819f, -1.7818f)
                curveToRelative(0.3164f, -0.3165f, 0.3164f, -0.8374f, 0.0f, -1.1538f)
                lineToRelative(-4.401f, -4.401f)
                curveToRelative(-0.3165f, -0.319f, -0.8374f, -0.319f, -1.1539f, 0.0f)
                close()
                moveTo(11.3148f, 12.6865f)
                lineTo(10.0149f, 11.3866f)
                curveToRelative(-0.3043f, -0.3043f, -0.8033f, -0.3043f, -1.1076f, 0.0f)
                lineToRelative(-4.5836f, 4.586f)
                curveToRelative(-0.3042f, 0.3043f, -0.3042f, 0.8033f, 0.0f, 1.1076f)
                lineToRelative(2.5973f, 2.5973f)
                curveToRelative(0.3043f, 0.3043f, 0.8033f, 0.3043f, 1.1076f, 0.0f)
                lineToRelative(2.9478f, -2.9527f)
                curveToRelative(-0.6231f, -1.2877f, -0.5112f, -2.8431f, 0.3384f, -4.0383f)
                close()
            }
        }
        .build()
        return _opentelemetry!!
    }

private var _opentelemetry: ImageVector? = null
