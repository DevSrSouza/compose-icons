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

public val LineAwesomeIcons.TwitterSquare: ImageVector
    get() {
        if (_twitterSquare != null) {
            return _twitterSquare!!
        }
        _twitterSquare = Builder(name = "TwitterSquare", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(18.689f, 10.629f)
                curveTo(16.939f, 10.629f, 15.482f, 12.207f, 15.889f, 14.154f)
                curveTo(13.509f, 14.032f, 11.388f, 12.895f, 9.975f, 11.154f)
                curveTo(9.726f, 11.578f, 9.586f, 12.068f, 9.586f, 12.602f)
                curveTo(9.585f, 13.562f, 10.064f, 14.458f, 10.863f, 14.99f)
                curveTo(10.395f, 14.973f, 9.949f, 14.843f, 9.568f, 14.629f)
                lineTo(9.568f, 14.662f)
                curveTo(9.568f, 16.057f, 10.552f, 17.213f, 11.865f, 17.48f)
                curveTo(11.41f, 17.599f, 11.012f, 17.599f, 10.57f, 17.533f)
                curveTo(10.933f, 18.671f, 11.992f, 19.497f, 13.252f, 19.523f)
                curveTo(12.268f, 20.293f, 11.034f, 20.748f, 9.691f, 20.748f)
                curveTo(9.455f, 20.748f, 9.232f, 20.741f, 9.0f, 20.715f)
                curveTo(10.269f, 21.529f, 11.778f, 22.0f, 13.406f, 22.0f)
                curveTo(18.682f, 22.0f, 21.57f, 17.629f, 21.57f, 13.836f)
                curveTo(21.57f, 13.713f, 21.57f, 13.588f, 21.561f, 13.465f)
                curveTo(22.121f, 13.058f, 22.61f, 12.55f, 22.998f, 11.977f)
                curveTo(22.482f, 12.2f, 21.924f, 12.363f, 21.346f, 12.424f)
                curveTo(21.941f, 12.07f, 22.391f, 11.509f, 22.605f, 10.844f)
                curveTo(22.054f, 11.172f, 21.432f, 11.412f, 20.785f, 11.535f)
                curveTo(20.26f, 10.975f, 19.516f, 10.629f, 18.689f, 10.629f)
                close()
            }
        }
        .build()
        return _twitterSquare!!
    }

private var _twitterSquare: ImageVector? = null
