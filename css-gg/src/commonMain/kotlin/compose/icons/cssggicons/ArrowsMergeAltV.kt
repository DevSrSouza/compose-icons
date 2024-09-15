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

public val CssGgIcons.ArrowsMergeAltV: ImageVector
    get() {
        if (_arrowsMergeAltV != null) {
            return _arrowsMergeAltV!!
        }
        _arrowsMergeAltV = Builder(name = "ArrowsMergeAltV", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.503f)
                verticalLineTo(3.503f)
                lineTo(13.0f, 3.503f)
                verticalLineTo(7.675f)
                lineTo(14.828f, 5.846f)
                lineTo(16.243f, 7.261f)
                lineTo(12.0f, 11.503f)
                lineTo(7.757f, 7.261f)
                lineTo(9.172f, 5.846f)
                lineTo(11.0f, 7.675f)
                verticalLineTo(3.503f)
                lineTo(6.0f, 3.503f)
                verticalLineTo(1.503f)
                lineTo(18.0f, 1.503f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.497f)
                verticalLineTo(22.497f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.497f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.325f)
                lineTo(9.172f, 18.154f)
                lineTo(7.757f, 16.739f)
                lineTo(12.0f, 12.497f)
                lineTo(16.243f, 16.739f)
                lineTo(14.828f, 18.154f)
                lineTo(13.0f, 16.325f)
                verticalLineTo(20.497f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _arrowsMergeAltV!!
    }

private var _arrowsMergeAltV: ImageVector? = null
