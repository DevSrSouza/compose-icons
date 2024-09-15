package compose.icons.cssggicons

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
import compose.icons.CssGgIcons

public val CssGgIcons.Cast: ImageVector
    get() {
        if (_cast != null) {
            return _cast!!
        }
        _cast = Builder(name = "Cast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.895f, 2.895f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(20.0f)
                curveTo(21.105f, 4.0f, 22.0f, 4.895f, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.105f, 21.105f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 13.0f)
                curveTo(5.866f, 13.0f, 9.0f, 16.134f, 9.0f, 20.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 17.239f, 4.761f, 15.0f, 2.0f, 15.0f)
                verticalLineTo(13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 17.0f)
                curveTo(3.657f, 17.0f, 5.0f, 18.343f, 5.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                curveTo(8.075f, 9.0f, 13.0f, 13.925f, 13.0f, 20.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 15.029f, 6.971f, 11.0f, 2.0f, 11.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _cast!!
    }

private var _cast: ImageVector? = null
