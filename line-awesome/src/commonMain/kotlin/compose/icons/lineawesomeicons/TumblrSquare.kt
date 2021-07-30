package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.TumblrSquare: ImageVector
    get() {
        if (_tumblrSquare != null) {
            return _tumblrSquare!!
        }
        _tumblrSquare = Builder(name = "TumblrSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(15.0f, 10.0f)
                curveTo(15.0f, 11.657f, 14.105f, 13.0f, 13.0f, 13.0f)
                lineTo(13.0f, 15.0f)
                lineTo(14.0f, 15.0f)
                lineTo(14.0f, 18.3652f)
                curveTo(14.0f, 20.3722f, 15.6278f, 22.0f, 17.6348f, 22.0f)
                curveTo(17.9128f, 22.013f, 18.4059f, 22.0003f, 18.9629f, 21.7773f)
                curveTo(19.4679f, 21.5753f, 19.8119f, 21.2876f, 20.0039f, 21.0996f)
                lineTo(19.2871f, 18.9863f)
                lineTo(18.4336f, 19.3652f)
                curveTo(17.7596f, 19.6642f, 17.0f, 19.1706f, 17.0f, 18.4336f)
                lineTo(17.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                lineTo(17.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                close()
            }
        }
        .build()
        return _tumblrSquare!!
    }

private var _tumblrSquare: ImageVector? = null
