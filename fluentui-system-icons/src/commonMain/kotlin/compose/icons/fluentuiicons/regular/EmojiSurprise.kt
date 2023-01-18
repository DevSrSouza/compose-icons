package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.EmojiSurprise: ImageVector
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
                moveTo(12.0f, 3.5039f)
                curveTo(7.3056f, 3.5039f, 3.5f, 7.3095f, 3.5f, 12.0039f)
                curveTo(3.5f, 16.6983f, 7.3056f, 20.5039f, 12.0f, 20.5039f)
                curveTo(16.6944f, 20.5039f, 20.5f, 16.6983f, 20.5f, 12.0039f)
                curveTo(20.5f, 7.3095f, 16.6944f, 3.5039f, 12.0f, 3.5039f)
                close()
                moveTo(12.0f, 12.9993f)
                curveTo(13.2426f, 12.9993f, 14.25f, 14.0066f, 14.25f, 15.2493f)
                curveTo(14.25f, 16.4919f, 13.2426f, 17.4993f, 12.0f, 17.4993f)
                curveTo(10.7574f, 17.4993f, 9.75f, 16.4919f, 9.75f, 15.2493f)
                curveTo(9.75f, 14.0066f, 10.7574f, 12.9993f, 12.0f, 12.9993f)
                close()
                moveTo(9.0005f, 8.7504f)
                curveTo(9.6904f, 8.7504f, 10.2497f, 9.3098f, 10.2497f, 9.9997f)
                curveTo(10.2497f, 10.6897f, 9.6904f, 11.249f, 9.0005f, 11.249f)
                curveTo(8.3105f, 11.249f, 7.7512f, 10.6897f, 7.7512f, 9.9997f)
                curveTo(7.7512f, 9.3098f, 8.3105f, 8.7504f, 9.0005f, 8.7504f)
                close()
                moveTo(15.0004f, 8.7504f)
                curveTo(15.6904f, 8.7504f, 16.2497f, 9.3098f, 16.2497f, 9.9997f)
                curveTo(16.2497f, 10.6897f, 15.6904f, 11.249f, 15.0004f, 11.249f)
                curveTo(14.3105f, 11.249f, 13.7512f, 10.6897f, 13.7512f, 9.9997f)
                curveTo(13.7512f, 9.3098f, 14.3105f, 8.7504f, 15.0004f, 8.7504f)
                close()
            }
        }
        .build()
        return _emojiSurprise!!
    }

private var _emojiSurprise: ImageVector? = null
