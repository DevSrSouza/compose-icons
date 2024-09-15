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

public val CssGgIcons.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 11.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 11.0f, 19.0f, 11.448f, 19.0f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 19.657f, 17.657f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(6.343f, 21.0f, 5.0f, 19.657f, 5.0f, 18.0f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 11.448f, 5.448f, 11.0f, 6.0f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                curveTo(9.0f, 4.343f, 10.343f, 3.0f, 12.0f, 3.0f)
                curveTo(13.657f, 3.0f, 15.0f, 4.343f, 15.0f, 6.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(13.0f, 6.0f)
                curveTo(13.0f, 5.448f, 12.552f, 5.0f, 12.0f, 5.0f)
                curveTo(11.448f, 5.0f, 11.0f, 5.448f, 11.0f, 6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                curveTo(7.0f, 18.552f, 7.448f, 19.0f, 8.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 19.0f, 17.0f, 18.552f, 17.0f, 18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
