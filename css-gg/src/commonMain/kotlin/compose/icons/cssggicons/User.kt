package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
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

public val CssGgIcons.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 7.0f)
                curveTo(16.0f, 9.2091f, 14.2091f, 11.0f, 12.0f, 11.0f)
                curveTo(9.7909f, 11.0f, 8.0f, 9.2091f, 8.0f, 7.0f)
                curveTo(8.0f, 4.7909f, 9.7909f, 3.0f, 12.0f, 3.0f)
                curveTo(14.2091f, 3.0f, 16.0f, 4.7909f, 16.0f, 7.0f)
                close()
                moveTo(14.0f, 7.0f)
                curveTo(14.0f, 8.1046f, 13.1046f, 9.0f, 12.0f, 9.0f)
                curveTo(10.8954f, 9.0f, 10.0f, 8.1046f, 10.0f, 7.0f)
                curveTo(10.0f, 5.8954f, 10.8954f, 5.0f, 12.0f, 5.0f)
                curveTo(13.1046f, 5.0f, 14.0f, 5.8954f, 14.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.0f)
                curveTo(16.0f, 14.4477f, 15.5523f, 14.0f, 15.0f, 14.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 14.0f, 8.0f, 14.4477f, 8.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 13.3431f, 7.3432f, 12.0f, 9.0f, 12.0f)
                horizontalLineTo(15.0f)
                curveTo(16.6569f, 12.0f, 18.0f, 13.3431f, 18.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
