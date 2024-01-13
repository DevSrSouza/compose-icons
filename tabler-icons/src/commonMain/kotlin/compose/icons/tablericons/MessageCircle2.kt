package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.MessageCircle2: ImageVector
    get() {
        if (_messageCircle2 != null) {
            return _messageCircle2!!
        }
        _messageCircle2 = Builder(name = "MessageCircle2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 20.0f)
                lineToRelative(1.3f, -3.9f)
                arcToRelative(9.0f, 8.0f, 0.0f, true, true, 3.4f, 2.9f)
                lineToRelative(-4.7f, 1.0f)
            }
        }
        .build()
        return _messageCircle2!!
    }

private var _messageCircle2: ImageVector? = null
