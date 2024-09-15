package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.01f, 5.128f)
                horizontalLineTo(11.01f)
                curveTo(12.114f, 5.128f, 13.468f, 5.897f, 14.033f, 6.846f)
                lineTo(16.509f, 11.0f)
                horizontalLineTo(21.01f)
                curveTo(21.562f, 11.0f, 22.01f, 11.448f, 22.01f, 12.0f)
                curveTo(22.01f, 12.552f, 21.562f, 13.0f, 21.01f, 13.0f)
                horizontalLineTo(16.414f)
                lineTo(13.938f, 17.154f)
                curveTo(13.373f, 18.103f, 12.019f, 18.872f, 10.915f, 18.872f)
                horizontalLineTo(8.915f)
                lineTo(12.414f, 13.0f)
                horizontalLineTo(5.425f)
                lineTo(3.99f, 15.453f)
                horizontalLineTo(1.99f)
                lineTo(4.01f, 12.0f)
                lineTo(4.01f, 11.967f)
                lineTo(2.01f, 8.547f)
                horizontalLineTo(4.01f)
                lineTo(5.444f, 11.0f)
                horizontalLineTo(12.509f)
                lineTo(9.01f, 5.128f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
