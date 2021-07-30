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

public val LineAwesomeIcons.CommentDots: ImageVector
    get() {
        if (_commentDots != null) {
            return _commentDots!!
        }
        _commentDots = Builder(name = "CommentDots", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(10.0f, 12.0f)
                curveTo(8.8945f, 12.0f, 8.0f, 12.8945f, 8.0f, 14.0f)
                curveTo(8.0f, 15.1055f, 8.8945f, 16.0f, 10.0f, 16.0f)
                curveTo(11.1055f, 16.0f, 12.0f, 15.1055f, 12.0f, 14.0f)
                curveTo(12.0f, 12.8945f, 11.1055f, 12.0f, 10.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(14.8945f, 12.0f, 14.0f, 12.8945f, 14.0f, 14.0f)
                curveTo(14.0f, 15.1055f, 14.8945f, 16.0f, 16.0f, 16.0f)
                curveTo(17.1055f, 16.0f, 18.0f, 15.1055f, 18.0f, 14.0f)
                curveTo(18.0f, 12.8945f, 17.1055f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(20.8945f, 12.0f, 20.0f, 12.8945f, 20.0f, 14.0f)
                curveTo(20.0f, 15.1055f, 20.8945f, 16.0f, 22.0f, 16.0f)
                curveTo(23.1055f, 16.0f, 24.0f, 15.1055f, 24.0f, 14.0f)
                curveTo(24.0f, 12.8945f, 23.1055f, 12.0f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _commentDots!!
    }

private var _commentDots: ImageVector? = null
