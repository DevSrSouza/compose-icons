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

public val OutlineGroup.EmojiSymbols: ImageVector
    get() {
        if (_emojiSymbols != null) {
            return _emojiSymbols!!
        }
        _emojiSymbols = Builder(name = "EmojiSymbols", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(3.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4036f, 20.1819f)
                lineToRelative(7.7781f, -7.7781f)
                lineToRelative(1.4142f, 1.4142f)
                lineToRelative(-7.7781f, 7.7781f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 14.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 19.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 11.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.51f)
                curveTo(16.58f, 6.19f, 16.07f, 6.0f, 15.5f, 6.0f)
                curveTo(14.12f, 6.0f, 13.0f, 7.12f, 13.0f, 8.5f)
                curveTo(13.0f, 9.88f, 14.12f, 11.0f, 15.5f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.74f, 15.96f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(0.35f, -0.35f)
                curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0.0f, -3.54f)
                curveToRelative(-0.49f, -0.49f, -1.13f, -0.73f, -1.77f, -0.73f)
                curveToRelative(-0.64f, 0.0f, -1.28f, 0.24f, -1.77f, 0.73f)
                curveToRelative(-0.98f, 0.98f, -0.98f, 2.56f, 0.0f, 3.54f)
                lineToRelative(0.35f, 0.35f)
                lineToRelative(-1.06f, 1.06f)
                curveToRelative(-0.98f, 0.98f, -0.98f, 2.56f, 0.0f, 3.54f)
                curveTo(4.22f, 21.76f, 4.86f, 22.0f, 5.5f, 22.0f)
                reflectiveCurveToRelative(1.28f, -0.24f, 1.77f, -0.73f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.41f, -1.41f)
                lineTo(9.74f, 15.96f)
                close()
                moveTo(5.85f, 14.2f)
                curveToRelative(0.12f, -0.12f, 0.26f, -0.15f, 0.35f, -0.15f)
                reflectiveCurveToRelative(0.23f, 0.03f, 0.35f, 0.15f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, 0.0f, 0.71f)
                lineToRelative(-0.35f, 0.35f)
                lineTo(5.85f, 14.9f)
                curveTo(5.66f, 14.71f, 5.66f, 14.39f, 5.85f, 14.2f)
                close()
                moveTo(5.85f, 19.85f)
                curveTo(5.73f, 19.97f, 5.59f, 20.0f, 5.5f, 20.0f)
                reflectiveCurveToRelative(-0.23f, -0.03f, -0.35f, -0.15f)
                curveToRelative(-0.19f, -0.19f, -0.19f, -0.51f, 0.0f, -0.71f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(0.71f, 0.71f)
                lineTo(5.85f, 19.85f)
                close()
            }
        }
        .build()
        return _emojiSymbols!!
    }

private var _emojiSymbols: ImageVector? = null
