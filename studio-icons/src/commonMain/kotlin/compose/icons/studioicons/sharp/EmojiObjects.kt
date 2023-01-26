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

public val SharpGroup.EmojiObjects: ImageVector
    get() {
        if (_emojiObjects != null) {
            return _emojiObjects!!
        }
        _emojiObjects = Builder(name = "EmojiObjects", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(-0.42f, 0.0f, -0.85f, 0.04f, -1.28f, 0.11f)
                curveToRelative(-2.81f, 0.5f, -5.08f, 2.75f, -5.6f, 5.55f)
                curveToRelative(-0.48f, 2.61f, 0.48f, 5.01f, 2.22f, 6.56f)
                curveTo(7.77f, 15.6f, 8.0f, 16.13f, 8.0f, 16.69f)
                curveTo(8.0f, 18.21f, 8.0f, 21.0f, 8.0f, 21.0f)
                horizontalLineToRelative(2.28f)
                curveToRelative(0.35f, 0.6f, 0.98f, 1.0f, 1.72f, 1.0f)
                reflectiveCurveToRelative(1.38f, -0.4f, 1.72f, -1.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(-4.31f)
                curveToRelative(0.0f, -0.55f, 0.22f, -1.09f, 0.64f, -1.46f)
                curveTo(18.09f, 13.95f, 19.0f, 12.08f, 19.0f, 10.0f)
                curveTo(19.0f, 6.13f, 15.87f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(14.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(12.5f, 11.41f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.59f)
                lineTo(9.67f, 9.59f)
                lineToRelative(0.71f, -0.71f)
                lineTo(12.0f, 10.5f)
                lineToRelative(1.62f, -1.62f)
                lineToRelative(0.71f, 0.71f)
                lineTo(12.5f, 11.41f)
                close()
            }
        }
        .build()
        return _emojiObjects!!
    }

private var _emojiObjects: ImageVector? = null
