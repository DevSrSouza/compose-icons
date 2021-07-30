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

public val LineAwesomeIcons.CommentAlt: ImageVector
    get() {
        if (_commentAlt != null) {
            return _commentAlt!!
        }
        _commentAlt = Builder(name = "CommentAlt", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                lineTo(3.0f, 23.0f)
                lineTo(8.0f, 23.0f)
                lineTo(8.0f, 28.0781f)
                lineTo(14.3516f, 23.0f)
                lineTo(29.0f, 23.0f)
                lineTo(29.0f, 5.0f)
                close()
                moveTo(5.0f, 7.0f)
                lineTo(27.0f, 7.0f)
                lineTo(27.0f, 21.0f)
                lineTo(13.6484f, 21.0f)
                lineTo(10.0f, 23.918f)
                lineTo(10.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                close()
            }
        }
        .build()
        return _commentAlt!!
    }

private var _commentAlt: ImageVector? = null
