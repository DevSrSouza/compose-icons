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
                curveTo(16.2091f, 19.0f, 18.0f, 17.2091f, 18.0f, 15.0f)
                curveTo(18.0f, 12.7909f, 16.2091f, 11.0f, 14.0f, 11.0f)
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
                curveTo(7.7909f, 5.0f, 6.0f, 6.7909f, 6.0f, 9.0f)
                curveTo(6.0f, 11.2091f, 7.7909f, 13.0f, 10.0f, 13.0f)
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
                curveTo(15.1046f, 17.0f, 16.0f, 16.1046f, 16.0f, 15.0f)
                curveTo(16.0f, 13.8954f, 15.1046f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                curveTo(8.8954f, 7.0f, 8.0f, 7.8954f, 8.0f, 9.0f)
                curveTo(8.0f, 10.1046f, 8.8954f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _dollar!!
    }

private var _dollar: ImageVector? = null
