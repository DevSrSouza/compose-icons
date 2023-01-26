package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.EmojiObjects: ImageVector
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
                curveToRelative(-0.46f, 0.0f, -0.93f, 0.04f, -1.4f, 0.14f)
                curveTo(7.84f, 3.67f, 5.64f, 5.9f, 5.12f, 8.66f)
                curveToRelative(-0.48f, 2.61f, 0.48f, 5.01f, 2.22f, 6.56f)
                curveTo(7.77f, 15.6f, 8.0f, 16.13f, 8.0f, 16.69f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(0.28f)
                curveToRelative(0.35f, 0.6f, 0.98f, 1.0f, 1.72f, 1.0f)
                reflectiveCurveToRelative(1.38f, -0.4f, 1.72f, -1.0f)
                horizontalLineTo(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-2.31f)
                curveToRelative(0.0f, -0.55f, 0.22f, -1.09f, 0.64f, -1.46f)
                curveTo(18.09f, 13.95f, 19.0f, 12.08f, 19.0f, 10.0f)
                curveTo(19.0f, 6.13f, 15.87f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(14.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(10.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(15.31f, 13.74f)
                curveToRelative(-0.09f, 0.08f, -0.16f, 0.18f, -0.24f, 0.26f)
                horizontalLineTo(8.92f)
                curveToRelative(-0.08f, -0.09f, -0.15f, -0.19f, -0.24f, -0.27f)
                curveToRelative(-1.32f, -1.18f, -1.91f, -2.94f, -1.59f, -4.7f)
                curveToRelative(0.36f, -1.94f, 1.96f, -3.55f, 3.89f, -3.93f)
                curveTo(11.32f, 5.03f, 11.66f, 5.0f, 12.0f, 5.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                curveTo(17.0f, 11.43f, 16.39f, 12.79f, 15.31f, 13.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.6724f, 9.5808f)
                lineToRelative(0.7071f, -0.7071f)
                lineToRelative(2.1213f, 2.1213f)
                lineToRelative(-0.7071f, 0.7071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2081f, 11.7123f)
                lineToRelative(-0.7071f, -0.7071f)
                lineToRelative(2.1213f, -2.1213f)
                lineToRelative(0.7071f, 0.7071f)
                close()
            }
        }
        .build()
        return _emojiObjects!!
    }

private var _emojiObjects: ImageVector? = null
