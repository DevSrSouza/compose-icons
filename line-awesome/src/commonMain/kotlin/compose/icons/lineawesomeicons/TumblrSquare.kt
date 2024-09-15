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
                lineTo(14.0f, 18.365f)
                curveTo(14.0f, 20.372f, 15.628f, 22.0f, 17.635f, 22.0f)
                curveTo(17.913f, 22.013f, 18.406f, 22.0f, 18.963f, 21.777f)
                curveTo(19.468f, 21.575f, 19.812f, 21.288f, 20.004f, 21.1f)
                lineTo(19.287f, 18.986f)
                lineTo(18.434f, 19.365f)
                curveTo(17.76f, 19.664f, 17.0f, 19.171f, 17.0f, 18.434f)
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
