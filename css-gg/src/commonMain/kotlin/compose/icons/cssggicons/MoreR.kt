package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import compose.icons.CssGgIcons

public val CssGgIcons.MoreR: ImageVector
    get() {
        if (_moreR != null) {
            return _moreR!!
        }
        _moreR = Builder(name = "MoreR", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                curveTo(8.105f, 14.0f, 9.0f, 13.105f, 9.0f, 12.0f)
                curveTo(9.0f, 10.895f, 8.105f, 10.0f, 7.0f, 10.0f)
                curveTo(5.895f, 10.0f, 5.0f, 10.895f, 5.0f, 12.0f)
                curveTo(5.0f, 13.105f, 5.895f, 14.0f, 7.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                curveTo(18.105f, 14.0f, 19.0f, 13.105f, 19.0f, 12.0f)
                curveTo(19.0f, 10.895f, 18.105f, 10.0f, 17.0f, 10.0f)
                curveTo(15.895f, 10.0f, 15.0f, 10.895f, 15.0f, 12.0f)
                curveTo(15.0f, 13.105f, 15.895f, 14.0f, 17.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                curveTo(0.0f, 3.343f, 1.343f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(22.657f, 2.0f, 24.0f, 3.343f, 24.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(24.0f, 20.657f, 22.657f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(1.343f, 22.0f, 0.0f, 20.657f, 0.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(3.0f, 4.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 4.0f, 22.0f, 4.448f, 22.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 19.552f, 21.552f, 20.0f, 21.0f, 20.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 20.0f, 2.0f, 19.552f, 2.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 4.448f, 2.448f, 4.0f, 3.0f, 4.0f)
                close()
            }
        }
        .build()
        return _moreR!!
    }

private var _moreR: ImageVector? = null
