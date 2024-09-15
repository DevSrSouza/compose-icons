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

public val CssGgIcons.ArrowsMergeAltH: ImageVector
    get() {
        if (_arrowsMergeAltH != null) {
            return _arrowsMergeAltH!!
        }
        _arrowsMergeAltH = Builder(name = "ArrowsMergeAltH", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.503f, 6.0f)
                horizontalLineTo(3.503f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.675f)
                lineTo(5.846f, 9.172f)
                lineTo(7.261f, 7.757f)
                lineTo(11.503f, 12.0f)
                lineTo(7.261f, 16.243f)
                lineTo(5.846f, 14.828f)
                lineTo(7.675f, 13.0f)
                horizontalLineTo(3.503f)
                verticalLineTo(18.0f)
                horizontalLineTo(1.503f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.497f, 6.0f)
                horizontalLineTo(22.497f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.497f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.325f)
                lineTo(18.154f, 14.828f)
                lineTo(16.739f, 16.243f)
                lineTo(12.497f, 12.0f)
                lineTo(16.739f, 7.757f)
                lineTo(18.154f, 9.172f)
                lineTo(16.325f, 11.0f)
                horizontalLineTo(20.497f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _arrowsMergeAltH!!
    }

private var _arrowsMergeAltH: ImageVector? = null
