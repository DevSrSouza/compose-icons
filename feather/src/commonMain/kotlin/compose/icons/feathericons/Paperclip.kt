package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.44f, 11.05f)
                lineToRelative(-9.19f, 9.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.49f)
                lineToRelative(9.19f, -9.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineToRelative(-9.2f, 9.19f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, -2.83f)
                lineToRelative(8.49f, -8.48f)
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
