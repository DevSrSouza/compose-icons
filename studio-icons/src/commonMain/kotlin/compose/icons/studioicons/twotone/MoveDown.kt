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

public val TwotoneGroup.MoveDown: ImageVector
    get() {
        if (_moveDown != null) {
            return _moveDown!!
        }
        _moveDown = Builder(name = "MoveDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                curveToRelative(0.0f, 2.45f, 1.76f, 4.47f, 4.08f, 4.91f)
                lineToRelative(-1.49f, -1.49f)
                lineTo(7.0f, 13.0f)
                lineToRelative(4.0f, 4.01f)
                lineTo(7.0f, 21.0f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.58f, -1.58f)
                lineToRelative(0.0f, -0.06f)
                curveTo(3.7f, 17.54f, 1.0f, 14.58f, 1.0f, 11.0f)
                curveToRelative(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                curveTo(5.24f, 6.0f, 3.0f, 8.24f, 3.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _moveDown!!
    }

private var _moveDown: ImageVector? = null
