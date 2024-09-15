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
                curveTo(16.0f, 9.209f, 14.209f, 11.0f, 12.0f, 11.0f)
                curveTo(9.791f, 11.0f, 8.0f, 9.209f, 8.0f, 7.0f)
                curveTo(8.0f, 4.791f, 9.791f, 3.0f, 12.0f, 3.0f)
                curveTo(14.209f, 3.0f, 16.0f, 4.791f, 16.0f, 7.0f)
                close()
                moveTo(14.0f, 7.0f)
                curveTo(14.0f, 8.105f, 13.105f, 9.0f, 12.0f, 9.0f)
                curveTo(10.895f, 9.0f, 10.0f, 8.105f, 10.0f, 7.0f)
                curveTo(10.0f, 5.895f, 10.895f, 5.0f, 12.0f, 5.0f)
                curveTo(13.105f, 5.0f, 14.0f, 5.895f, 14.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.0f)
                curveTo(16.0f, 14.448f, 15.552f, 14.0f, 15.0f, 14.0f)
                horizontalLineTo(9.0f)
                curveTo(8.448f, 14.0f, 8.0f, 14.448f, 8.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 13.343f, 7.343f, 12.0f, 9.0f, 12.0f)
                horizontalLineTo(15.0f)
                curveTo(16.657f, 12.0f, 18.0f, 13.343f, 18.0f, 15.0f)
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
