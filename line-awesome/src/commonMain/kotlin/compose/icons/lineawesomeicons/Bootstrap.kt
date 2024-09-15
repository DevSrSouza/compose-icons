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

public val LineAwesomeIcons.Bootstrap: ImageVector
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = Builder(name = "Bootstrap", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(11.0f, 10.0f)
                lineTo(11.0f, 15.51f)
                lineTo(11.0f, 21.99f)
                curveTo(16.93f, 21.99f, 18.117f, 22.07f, 19.227f, 21.74f)
                curveTo(19.877f, 21.54f, 21.656f, 20.9f, 21.656f, 18.65f)
                curveTo(21.656f, 17.65f, 21.356f, 15.959f, 19.396f, 15.539f)
                lineTo(19.396f, 15.51f)
                lineTo(19.027f, 15.51f)
                curveTo(20.027f, 15.06f, 20.656f, 14.211f, 20.656f, 12.961f)
                curveTo(20.656f, 12.641f, 20.746f, 10.0f, 17.246f, 10.0f)
                lineTo(11.0f, 10.0f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                curveTo(18.509f, 12.0f, 18.656f, 12.853f, 18.656f, 13.49f)
                curveTo(18.656f, 15.044f, 17.03f, 15.0f, 17.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(13.0f, 17.0f)
                lineTo(17.76f, 17.0f)
                curveTo(19.621f, 17.0f, 19.656f, 18.176f, 19.656f, 18.48f)
                curveTo(19.656f, 20.04f, 18.045f, 20.0f, 17.85f, 20.0f)
                lineTo(13.0f, 20.0f)
                lineTo(13.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bootstrap!!
    }

private var _bootstrap: ImageVector? = null
