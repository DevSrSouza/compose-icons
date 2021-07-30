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

public val LineAwesomeIcons.CommentDollarSolid: ImageVector
    get() {
        if (_commentDollarSolid != null) {
            return _commentDollarSolid!!
        }
        _commentDollarSolid = Builder(name = "CommentDollarSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineTo(3.0f, 26.0f)
                lineTo(12.5859f, 26.0f)
                lineTo(16.0f, 29.4141f)
                lineTo(19.4141f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                lineTo(27.0f, 24.0f)
                lineTo(18.5859f, 24.0f)
                lineTo(16.0f, 26.5859f)
                lineTo(13.4141f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(15.0f, 10.0f)
                lineTo(15.0f, 11.1875f)
                curveTo(13.844f, 11.6055f, 13.0f, 12.709f, 13.0f, 14.002f)
                curveTo(13.0f, 15.647f, 14.355f, 17.002f, 16.0f, 17.002f)
                curveTo(16.566f, 17.002f, 17.0f, 17.436f, 17.0f, 18.002f)
                curveTo(17.0f, 18.568f, 16.566f, 19.002f, 16.0f, 19.002f)
                curveTo(15.434f, 19.002f, 15.0f, 18.568f, 15.0f, 18.002f)
                lineTo(13.0f, 18.002f)
                curveTo(13.0f, 19.295f, 13.844f, 20.3965f, 15.0f, 20.8145f)
                lineTo(15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 20.8125f)
                curveTo(18.156f, 20.3945f, 19.0f, 19.291f, 19.0f, 17.998f)
                curveTo(19.0f, 16.353f, 17.645f, 14.998f, 16.0f, 14.998f)
                curveTo(15.434f, 14.998f, 15.0f, 14.564f, 15.0f, 13.998f)
                curveTo(15.0f, 13.432f, 15.434f, 12.998f, 16.0f, 12.998f)
                curveTo(16.566f, 12.998f, 17.0f, 13.432f, 17.0f, 13.998f)
                lineTo(19.0f, 13.998f)
                curveTo(19.0f, 12.705f, 18.156f, 11.6035f, 17.0f, 11.1855f)
                lineTo(17.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                close()
            }
        }
        .build()
        return _commentDollarSolid!!
    }

private var _commentDollarSolid: ImageVector? = null
