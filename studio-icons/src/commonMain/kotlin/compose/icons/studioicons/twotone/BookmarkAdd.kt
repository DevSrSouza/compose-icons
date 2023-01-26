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

public val TwotoneGroup.BookmarkAdd: ImageVector
    get() {
        if (_bookmarkAdd != null) {
            return _bookmarkAdd!!
        }
        _bookmarkAdd = Builder(name = "BookmarkAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 17.97f)
                lineToRelative(0.0f, -7.07f)
                curveToRelative(-2.28f, -0.46f, -4.0f, -2.48f, -4.0f, -4.9f)
                curveToRelative(0.0f, -0.34f, 0.03f, -0.68f, 0.1f, -1.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(12.97f)
                lineToRelative(5.0f, -2.14f)
                lineTo(17.0f, 17.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(17.0f, 17.97f)
                lineToRelative(-5.0f, -2.14f)
                lineToRelative(-5.0f, 2.14f)
                verticalLineTo(5.0f)
                lineToRelative(6.1f, 0.0f)
                curveToRelative(0.15f, -0.74f, 0.46f, -1.42f, 0.9f, -2.0f)
                lineTo(7.0f, 3.0f)
                curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f)
                verticalLineToRelative(16.0f)
                lineToRelative(7.0f, -3.0f)
                lineToRelative(7.0f, 3.0f)
                lineToRelative(0.0f, -10.1f)
                curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1.0f, 0.1f)
                curveToRelative(-0.34f, 0.0f, -0.68f, -0.03f, -1.0f, -0.1f)
                lineTo(17.0f, 17.97f)
                close()
            }
        }
        .build()
        return _bookmarkAdd!!
    }

private var _bookmarkAdd: ImageVector? = null
