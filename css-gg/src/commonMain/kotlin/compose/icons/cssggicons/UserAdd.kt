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

public val CssGgIcons.UserAdd: ImageVector
    get() {
        if (_userAdd != null) {
            return _userAdd!!
        }
        _userAdd = Builder(name = "UserAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 11.0f)
                curveTo(10.209f, 11.0f, 12.0f, 9.209f, 12.0f, 7.0f)
                curveTo(12.0f, 4.791f, 10.209f, 3.0f, 8.0f, 3.0f)
                curveTo(5.791f, 3.0f, 4.0f, 4.791f, 4.0f, 7.0f)
                curveTo(4.0f, 9.209f, 5.791f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveTo(9.105f, 9.0f, 10.0f, 8.105f, 10.0f, 7.0f)
                curveTo(10.0f, 5.895f, 9.105f, 5.0f, 8.0f, 5.0f)
                curveTo(6.895f, 5.0f, 6.0f, 5.895f, 6.0f, 7.0f)
                curveTo(6.0f, 8.105f, 6.895f, 9.0f, 8.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                curveTo(11.552f, 14.0f, 12.0f, 14.448f, 12.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                curveTo(14.0f, 13.343f, 12.657f, 12.0f, 11.0f, 12.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 12.0f, 2.0f, 13.343f, 2.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 14.448f, 4.448f, 14.0f, 5.0f, 14.0f)
                horizontalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _userAdd!!
    }

private var _userAdd: ImageVector? = null
