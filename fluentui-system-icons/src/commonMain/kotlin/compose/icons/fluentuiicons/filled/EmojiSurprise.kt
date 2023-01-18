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

public val FilledGroup.EmojiSurprise: ImageVector
    get() {
        if (_emojiSurprise != null) {
            return _emojiSurprise!!
        }
        _emojiSurprise = Builder(name = "EmojiSurprise", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0039f)
                curveTo(17.5228f, 2.0039f, 22.0f, 6.4811f, 22.0f, 12.0039f)
                curveTo(22.0f, 17.5268f, 17.5228f, 22.0039f, 12.0f, 22.0039f)
                curveTo(6.4771f, 22.0039f, 2.0f, 17.5268f, 2.0f, 12.0039f)
                curveTo(2.0f, 6.4811f, 6.4771f, 2.0039f, 12.0f, 2.0039f)
                close()
                moveTo(12.0f, 12.9993f)
                curveTo(10.7574f, 12.9993f, 9.75f, 14.0066f, 9.75f, 15.2493f)
                curveTo(9.75f, 16.4919f, 10.7574f, 17.4993f, 12.0f, 17.4993f)
                curveTo(13.2426f, 17.4993f, 14.25f, 16.4919f, 14.25f, 15.2493f)
                curveTo(14.25f, 14.0066f, 13.2426f, 12.9993f, 12.0f, 12.9993f)
                close()
                moveTo(9.0005f, 8.7504f)
                curveTo(8.3105f, 8.7504f, 7.7512f, 9.3098f, 7.7512f, 9.9997f)
                curveTo(7.7512f, 10.6897f, 8.3105f, 11.249f, 9.0005f, 11.249f)
                curveTo(9.6904f, 11.249f, 10.2497f, 10.6897f, 10.2497f, 9.9997f)
                curveTo(10.2497f, 9.3098f, 9.6904f, 8.7504f, 9.0005f, 8.7504f)
                close()
                moveTo(15.0004f, 8.7504f)
                curveTo(14.3105f, 8.7504f, 13.7512f, 9.3098f, 13.7512f, 9.9997f)
                curveTo(13.7512f, 10.6897f, 14.3105f, 11.249f, 15.0004f, 11.249f)
                curveTo(15.6904f, 11.249f, 16.2497f, 10.6897f, 16.2497f, 9.9997f)
                curveTo(16.2497f, 9.3098f, 15.6904f, 8.7504f, 15.0004f, 8.7504f)
                close()
            }
        }
        .build()
        return _emojiSurprise!!
    }

private var _emojiSurprise: ImageVector? = null
