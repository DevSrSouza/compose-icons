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

public val CssGgIcons.SortZa: ImageVector
    get() {
        if (_sortZa != null) {
            return _sortZa!!
        }
        _sortZa = Builder(name = "SortZa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 16.0f)
                curveTo(6.0f, 16.552f, 6.448f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 17.0f, 18.0f, 16.552f, 18.0f, 16.0f)
                curveTo(18.0f, 15.448f, 17.552f, 15.0f, 17.0f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 15.0f, 6.0f, 15.448f, 6.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                curveTo(8.0f, 12.552f, 8.448f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 13.0f, 16.0f, 12.552f, 16.0f, 12.0f)
                curveTo(16.0f, 11.448f, 15.552f, 11.0f, 15.0f, 11.0f)
                horizontalLineTo(9.0f)
                curveTo(8.448f, 11.0f, 8.0f, 11.448f, 8.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                curveTo(10.448f, 9.0f, 10.0f, 8.552f, 10.0f, 8.0f)
                curveTo(10.0f, 7.448f, 10.448f, 7.0f, 11.0f, 7.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 7.0f, 14.0f, 7.448f, 14.0f, 8.0f)
                curveTo(14.0f, 8.552f, 13.552f, 9.0f, 13.0f, 9.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _sortZa!!
    }

private var _sortZa: ImageVector? = null
