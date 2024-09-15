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

public val CssGgIcons.Browse: ImageVector
    get() {
        if (_browse != null) {
            return _browse!!
        }
        _browse = Builder(name = "Browse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.364f, 13.121f)
                curveTo(15.288f, 14.045f, 15.483f, 15.421f, 14.95f, 16.536f)
                lineTo(16.485f, 18.071f)
                curveTo(16.876f, 18.462f, 16.876f, 19.095f, 16.485f, 19.485f)
                curveTo(16.095f, 19.876f, 15.462f, 19.876f, 15.071f, 19.485f)
                lineTo(13.536f, 17.95f)
                curveTo(12.421f, 18.483f, 11.045f, 18.288f, 10.121f, 17.364f)
                curveTo(8.95f, 16.192f, 8.95f, 14.293f, 10.121f, 13.121f)
                curveTo(11.293f, 11.95f, 13.192f, 11.95f, 14.364f, 13.121f)
                close()
                moveTo(12.95f, 15.95f)
                curveTo(13.34f, 15.559f, 13.34f, 14.926f, 12.95f, 14.536f)
                curveTo(12.559f, 14.145f, 11.926f, 14.145f, 11.535f, 14.536f)
                curveTo(11.145f, 14.926f, 11.145f, 15.559f, 11.535f, 15.95f)
                curveTo(11.926f, 16.34f, 12.559f, 16.34f, 12.95f, 15.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 4.0f)
                curveTo(4.0f, 2.343f, 5.343f, 1.0f, 7.0f, 1.0f)
                horizontalLineTo(17.0f)
                curveTo(18.657f, 1.0f, 20.0f, 2.343f, 20.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.657f, 18.657f, 23.0f, 17.0f, 23.0f)
                horizontalLineTo(7.0f)
                curveTo(5.343f, 23.0f, 4.0f, 21.657f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 3.0f, 18.0f, 3.448f, 18.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 20.552f, 17.552f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 21.0f, 6.0f, 20.552f, 6.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(6.0f, 3.448f, 6.448f, 3.0f, 7.0f, 3.0f)
                close()
            }
        }
        .build()
        return _browse!!
    }

private var _browse: ImageVector? = null
