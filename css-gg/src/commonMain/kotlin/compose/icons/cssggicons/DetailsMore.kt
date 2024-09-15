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

public val CssGgIcons.DetailsMore: ImageVector
    get() {
        if (_detailsMore != null) {
            return _detailsMore!!
        }
        _detailsMore = Builder(name = "DetailsMore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.0f)
                curveTo(2.0f, 7.448f, 2.448f, 7.0f, 3.0f, 7.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 7.0f, 22.0f, 7.448f, 22.0f, 8.0f)
                curveTo(22.0f, 8.552f, 21.552f, 9.0f, 21.0f, 9.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 9.0f, 2.0f, 8.552f, 2.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 11.448f, 2.448f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 11.0f, 22.0f, 11.448f, 22.0f, 12.0f)
                curveTo(22.0f, 12.552f, 21.552f, 13.0f, 21.0f, 13.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 13.0f, 2.0f, 12.552f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 15.0f)
                curveTo(2.448f, 15.0f, 2.0f, 15.448f, 2.0f, 16.0f)
                curveTo(2.0f, 16.552f, 2.448f, 17.0f, 3.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 17.0f, 16.0f, 16.552f, 16.0f, 16.0f)
                curveTo(16.0f, 15.448f, 15.552f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _detailsMore!!
    }

private var _detailsMore: ImageVector? = null
