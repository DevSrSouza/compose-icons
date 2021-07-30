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

public val CssGgIcons.DetailsLess: ImageVector
    get() {
        if (_detailsLess != null) {
            return _detailsLess!!
        }
        _detailsLess = Builder(name = "DetailsLess", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                curveTo(2.4477f, 9.0f, 2.0f, 9.4477f, 2.0f, 10.0f)
                curveTo(2.0f, 10.5523f, 2.4477f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 11.0f, 22.0f, 10.5523f, 22.0f, 10.0f)
                curveTo(22.0f, 9.4477f, 21.5523f, 9.0f, 21.0f, 9.0f)
                horizontalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                curveTo(2.4477f, 13.0f, 2.0f, 13.4477f, 2.0f, 14.0f)
                curveTo(2.0f, 14.5523f, 2.4477f, 15.0f, 3.0f, 15.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 15.0f, 16.0f, 14.5523f, 16.0f, 14.0f)
                curveTo(16.0f, 13.4477f, 15.5523f, 13.0f, 15.0f, 13.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _detailsLess!!
    }

private var _detailsLess: ImageVector? = null
