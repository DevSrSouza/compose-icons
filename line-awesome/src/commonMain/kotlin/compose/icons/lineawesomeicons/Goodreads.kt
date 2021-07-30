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

public val LineAwesomeIcons.Goodreads: ImageVector
    get() {
        if (_goodreads != null) {
            return _goodreads!!
        }
        _goodreads = Builder(name = "Goodreads", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(15.5f, 9.0f)
                curveTo(13.019f, 9.0f, 11.0f, 11.243f, 11.0f, 14.0f)
                curveTo(11.0f, 16.757f, 13.019f, 19.0f, 15.5f, 19.0f)
                curveTo(16.921f, 19.0f, 18.175f, 18.2495f, 19.0f, 17.1035f)
                lineTo(19.0f, 18.5f)
                curveTo(19.0f, 20.43f, 17.43f, 22.0f, 15.5f, 22.0f)
                curveTo(14.109f, 22.0f, 12.9156f, 21.178f, 12.3516f, 20.0f)
                lineTo(11.2754f, 20.0f)
                curveTo(11.8964f, 21.742f, 13.547f, 23.0f, 15.5f, 23.0f)
                curveTo(17.981f, 23.0f, 20.0f, 20.981f, 20.0f, 18.5f)
                lineTo(20.0f, 10.0f)
                lineTo(19.0f, 10.0f)
                lineTo(19.0f, 10.8965f)
                curveTo(18.175f, 9.7505f, 16.921f, 9.0f, 15.5f, 9.0f)
                close()
                moveTo(15.5f, 10.0f)
                curveTo(17.43f, 10.0f, 19.0f, 11.794f, 19.0f, 14.0f)
                curveTo(19.0f, 16.206f, 17.43f, 18.0f, 15.5f, 18.0f)
                curveTo(13.57f, 18.0f, 12.0f, 16.206f, 12.0f, 14.0f)
                curveTo(12.0f, 11.794f, 13.57f, 10.0f, 15.5f, 10.0f)
                close()
            }
        }
        .build()
        return _goodreads!!
    }

private var _goodreads: ImageVector? = null
