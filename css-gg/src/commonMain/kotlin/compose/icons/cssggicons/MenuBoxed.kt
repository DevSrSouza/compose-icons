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

public val CssGgIcons.MenuBoxed: ImageVector
    get() {
        if (_menuBoxed != null) {
            return _menuBoxed!!
        }
        _menuBoxed = Builder(name = "MenuBoxed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0156f, 6.9819f)
                curveTo(7.4633f, 6.9819f, 7.0156f, 7.4328f, 7.0156f, 7.9851f)
                curveTo(7.0156f, 8.5374f, 7.4633f, 8.9883f, 8.0156f, 8.9883f)
                horizontalLineTo(15.9659f)
                curveTo(16.5182f, 8.9883f, 16.9659f, 8.5374f, 16.9659f, 7.9851f)
                curveTo(16.9659f, 7.4328f, 16.5182f, 6.9819f, 15.9659f, 6.9819f)
                horizontalLineTo(8.0156f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0156f, 12.0f)
                curveTo(7.0156f, 11.4477f, 7.4633f, 10.9968f, 8.0156f, 10.9968f)
                horizontalLineTo(15.9659f)
                curveTo(16.5182f, 10.9968f, 16.9659f, 11.4477f, 16.9659f, 12.0f)
                curveTo(16.9659f, 12.5523f, 16.5182f, 13.0032f, 15.9659f, 13.0032f)
                horizontalLineTo(8.0156f)
                curveTo(7.4633f, 13.0032f, 7.0156f, 12.5523f, 7.0156f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0249f, 15.0122f)
                curveTo(7.4726f, 15.0122f, 7.0249f, 15.4631f, 7.0249f, 16.0154f)
                curveTo(7.0249f, 16.5677f, 7.4726f, 17.0186f, 8.0249f, 17.0186f)
                horizontalLineTo(15.9752f)
                curveTo(16.5275f, 17.0186f, 16.9752f, 16.5677f, 16.9752f, 16.0154f)
                curveTo(16.9752f, 15.4631f, 16.5275f, 15.0122f, 15.9752f, 15.0122f)
                horizontalLineTo(8.0249f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.3432f, 4.3432f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 3.0f, 21.0f, 4.3432f, 21.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.6569f, 19.6569f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 21.0f, 3.0f, 19.6569f, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 5.0f, 19.0f, 5.4477f, 19.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 18.5523f, 18.5523f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 19.0f, 5.0f, 18.5523f, 5.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 5.4477f, 5.4477f, 5.0f, 6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _menuBoxed!!
    }

private var _menuBoxed: ImageVector? = null
