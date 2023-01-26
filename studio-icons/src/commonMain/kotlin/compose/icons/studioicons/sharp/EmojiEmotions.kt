package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.EmojiEmotions: ImageVector
    get() {
        if (_emojiEmotions != null) {
            return _emojiEmotions!!
        }
        _emojiEmotions = Builder(name = "EmojiEmotions", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 11.99f, 2.0f)
                close()
                moveTo(8.5f, 8.0f)
                curveTo(9.33f, 8.0f, 10.0f, 8.67f, 10.0f, 9.5f)
                reflectiveCurveTo(9.33f, 11.0f, 8.5f, 11.0f)
                reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f)
                reflectiveCurveTo(7.67f, 8.0f, 8.5f, 8.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-2.28f, 0.0f, -4.22f, -1.66f, -5.0f, -4.0f)
                horizontalLineToRelative(10.0f)
                curveTo(16.22f, 16.34f, 14.28f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(15.5f, 11.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(14.67f, 8.0f, 15.5f, 8.0f)
                reflectiveCurveTo(17.0f, 8.67f, 17.0f, 9.5f)
                reflectiveCurveTo(16.33f, 11.0f, 15.5f, 11.0f)
                close()
            }
        }
        .build()
        return _emojiEmotions!!
    }

private var _emojiEmotions: ImageVector? = null
