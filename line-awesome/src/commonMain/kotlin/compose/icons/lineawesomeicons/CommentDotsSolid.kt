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

public val LineAwesomeIcons.CommentDotsSolid: ImageVector
    get() {
        if (_commentDotsSolid != null) {
            return _commentDotsSolid!!
        }
        _commentDotsSolid = Builder(name = "CommentDotsSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                lineTo(3.0f, 23.0f)
                lineTo(8.0f, 23.0f)
                lineTo(8.0f, 28.078f)
                lineTo(14.352f, 23.0f)
                lineTo(29.0f, 23.0f)
                lineTo(29.0f, 5.0f)
                close()
                moveTo(5.0f, 7.0f)
                lineTo(27.0f, 7.0f)
                lineTo(27.0f, 21.0f)
                lineTo(13.648f, 21.0f)
                lineTo(10.0f, 23.918f)
                lineTo(10.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(10.0f, 12.0f)
                curveTo(8.895f, 12.0f, 8.0f, 12.895f, 8.0f, 14.0f)
                curveTo(8.0f, 15.105f, 8.895f, 16.0f, 10.0f, 16.0f)
                curveTo(11.105f, 16.0f, 12.0f, 15.105f, 12.0f, 14.0f)
                curveTo(12.0f, 12.895f, 11.105f, 12.0f, 10.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(14.895f, 12.0f, 14.0f, 12.895f, 14.0f, 14.0f)
                curveTo(14.0f, 15.105f, 14.895f, 16.0f, 16.0f, 16.0f)
                curveTo(17.105f, 16.0f, 18.0f, 15.105f, 18.0f, 14.0f)
                curveTo(18.0f, 12.895f, 17.105f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(20.895f, 12.0f, 20.0f, 12.895f, 20.0f, 14.0f)
                curveTo(20.0f, 15.105f, 20.895f, 16.0f, 22.0f, 16.0f)
                curveTo(23.105f, 16.0f, 24.0f, 15.105f, 24.0f, 14.0f)
                curveTo(24.0f, 12.895f, 23.105f, 12.0f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _commentDotsSolid!!
    }

private var _commentDotsSolid: ImageVector? = null
