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
                curveTo(10.2091f, 11.0f, 12.0f, 9.2091f, 12.0f, 7.0f)
                curveTo(12.0f, 4.7909f, 10.2091f, 3.0f, 8.0f, 3.0f)
                curveTo(5.7909f, 3.0f, 4.0f, 4.7909f, 4.0f, 7.0f)
                curveTo(4.0f, 9.2091f, 5.7909f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveTo(9.1046f, 9.0f, 10.0f, 8.1046f, 10.0f, 7.0f)
                curveTo(10.0f, 5.8954f, 9.1046f, 5.0f, 8.0f, 5.0f)
                curveTo(6.8954f, 5.0f, 6.0f, 5.8954f, 6.0f, 7.0f)
                curveTo(6.0f, 8.1046f, 6.8954f, 9.0f, 8.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                curveTo(11.5523f, 14.0f, 12.0f, 14.4477f, 12.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                curveTo(14.0f, 13.3431f, 12.6569f, 12.0f, 11.0f, 12.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 12.0f, 2.0f, 13.3431f, 2.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 14.4477f, 4.4477f, 14.0f, 5.0f, 14.0f)
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
