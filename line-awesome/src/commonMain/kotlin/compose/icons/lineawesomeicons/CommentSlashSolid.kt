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

public val LineAwesomeIcons.CommentSlashSolid: ImageVector
    get() {
        if (_commentSlashSolid != null) {
            return _commentSlashSolid!!
        }
        _commentSlashSolid = Builder(name = "CommentSlashSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineTo(28.293f, 29.707f)
                lineTo(29.707f, 28.293f)
                lineTo(27.414f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 6.0f)
                lineTo(7.414f, 6.0f)
                lineTo(3.707f, 2.293f)
                close()
                moveTo(3.0f, 7.242f)
                lineTo(3.0f, 26.0f)
                lineTo(12.586f, 26.0f)
                lineTo(16.0f, 29.414f)
                lineTo(19.414f, 26.0f)
                lineTo(21.758f, 26.0f)
                lineTo(19.758f, 24.0f)
                lineTo(18.586f, 24.0f)
                lineTo(16.0f, 26.586f)
                lineTo(13.414f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 9.242f)
                lineTo(3.0f, 7.242f)
                close()
                moveTo(9.414f, 8.0f)
                lineTo(27.0f, 8.0f)
                lineTo(27.0f, 24.0f)
                lineTo(25.414f, 24.0f)
                lineTo(9.414f, 8.0f)
                close()
            }
        }
        .build()
        return _commentSlashSolid!!
    }

private var _commentSlashSolid: ImageVector? = null
