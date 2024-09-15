package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Dollar: ImageVector
    get() {
        if (_dollar != null) {
            return _dollar!!
        }
        _dollar = Builder(name = "Dollar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                curveTo(16.209f, 19.0f, 18.0f, 17.209f, 18.0f, 15.0f)
                curveTo(18.0f, 12.791f, 16.209f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                curveTo(7.791f, 5.0f, 6.0f, 6.791f, 6.0f, 9.0f)
                curveTo(6.0f, 11.209f, 7.791f, 13.0f, 10.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 17.0f, 16.0f, 16.105f, 16.0f, 15.0f)
                curveTo(16.0f, 13.895f, 15.105f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                curveTo(8.895f, 7.0f, 8.0f, 7.895f, 8.0f, 9.0f)
                curveTo(8.0f, 10.105f, 8.895f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _dollar!!
    }

private var _dollar: ImageVector? = null
