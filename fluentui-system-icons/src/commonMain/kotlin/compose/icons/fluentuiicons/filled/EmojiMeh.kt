package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.EmojiMeh: ImageVector
    get() {
        if (_emojiMeh != null) {
            return _emojiMeh!!
        }
        _emojiMeh = Builder(name = "EmojiMeh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.2498f, 10.0004f)
                curveTo(10.2498f, 10.6904f, 9.6905f, 11.2497f, 9.0005f, 11.2497f)
                curveTo(8.3105f, 11.2497f, 7.7512f, 10.6904f, 7.7512f, 10.0004f)
                curveTo(7.7512f, 9.3105f, 8.3105f, 8.7512f, 9.0005f, 8.7512f)
                curveTo(9.6905f, 8.7512f, 10.2498f, 9.3105f, 10.2498f, 10.0004f)
                close()
                moveTo(16.2498f, 10.0004f)
                curveTo(16.2498f, 10.6904f, 15.6905f, 11.2497f, 15.0005f, 11.2497f)
                curveTo(14.3105f, 11.2497f, 13.7512f, 10.6904f, 13.7512f, 10.0004f)
                curveTo(13.7512f, 9.3105f, 14.3105f, 8.7512f, 15.0005f, 8.7512f)
                curveTo(15.6905f, 8.7512f, 16.2498f, 9.3105f, 16.2498f, 10.0004f)
                close()
                moveTo(7.5f, 15.75f)
                curveTo(7.5f, 15.3358f, 7.8358f, 15.0f, 8.25f, 15.0f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 15.0f, 16.5f, 15.3358f, 16.5f, 15.75f)
                curveTo(16.5f, 16.1642f, 16.1642f, 16.5f, 15.75f, 16.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 16.5f, 7.5f, 16.1642f, 7.5f, 15.75f)
                close()
            }
        }
        .build()
        return _emojiMeh!!
    }

private var _emojiMeh: ImageVector? = null
