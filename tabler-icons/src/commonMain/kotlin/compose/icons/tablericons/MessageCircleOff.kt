package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.MessageCircleOff: ImageVector
    get() {
        if (_messageCircleOff != null) {
            return _messageCircleOff!!
        }
        _messageCircleOff = Builder(name = "MessageCircleOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineTo(21.0f, 21.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.585f, 4.581f)
                curveToRelative(3.225f, -1.181f, 7.032f, -0.616f, 9.66f, 1.626f)
                curveToRelative(2.983f, 2.543f, 3.602f, 6.525f, 1.634f, 9.662f)
                moveToRelative(-1.908f, 2.108f)
                curveToRelative(-2.786f, 2.19f, -6.89f, 2.665f, -10.271f, 1.023f)
                lineToRelative(-4.7f, 1.0f)
                lineToRelative(1.3f, -3.9f)
                curveToRelative(-2.237f, -3.308f, -1.489f, -7.54f, 1.714f, -10.084f)
            }
        }
        .build()
        return _messageCircleOff!!
    }

private var _messageCircleOff: ImageVector? = null
