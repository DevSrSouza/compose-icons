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

public val CssGgIcons.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9526f, 16.9123f)
                lineTo(8.5932f, 18.3608f)
                lineTo(2.0308f, 12.2016f)
                lineTo(8.1899f, 5.6392f)
                lineTo(9.6483f, 7.0079f)
                lineTo(4.8578f, 12.112f)
                lineTo(9.9521f, 16.8932f)
                lineTo(9.9526f, 16.9123f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0474f, 16.9123f)
                lineTo(15.4068f, 18.3608f)
                lineTo(21.9692f, 12.2016f)
                lineTo(15.8101f, 5.6392f)
                lineTo(14.3517f, 7.0079f)
                lineTo(19.1422f, 12.112f)
                lineTo(14.0479f, 16.8932f)
                lineTo(14.0474f, 16.9123f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null
