package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.EmojiPeople: ImageVector
    get() {
        if (_emojiPeople != null) {
            return _emojiPeople!!
        }
        _emojiPeople = Builder(name = "EmojiPeople", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.89f, 8.11f)
                curveTo(15.5f, 7.72f, 14.83f, 7.0f, 13.53f, 7.0f)
                curveToRelative(-0.21f, 0.0f, -1.42f, 0.0f, -2.54f, 0.0f)
                curveTo(8.24f, 6.99f, 6.0f, 4.75f, 6.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(0.0f, 3.16f, 2.11f, 5.84f, 5.0f, 6.71f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.05f)
                lineTo(18.95f, 14.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(15.89f, 8.11f)
                close()
            }
        }
        .build()
        return _emojiPeople!!
    }

private var _emojiPeople: ImageVector? = null
