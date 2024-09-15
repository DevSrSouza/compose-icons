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

public val CssGgIcons.ArrowLongDownE: ImageVector
    get() {
        if (_arrowLongDownE != null) {
            return _arrowLongDownE!!
        }
        _arrowLongDownE = Builder(name = "ArrowLongDownE", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.998f, 1.02f)
                horizontalLineTo(8.998f)
                verticalLineTo(7.02f)
                horizontalLineTo(10.999f)
                lineTo(11.012f, 19.165f)
                lineTo(9.168f, 17.331f)
                lineTo(7.757f, 18.749f)
                lineTo(12.012f, 22.98f)
                lineTo(16.243f, 18.725f)
                lineTo(14.825f, 17.315f)
                lineTo(13.012f, 19.138f)
                lineTo(12.999f, 7.02f)
                horizontalLineTo(14.998f)
                verticalLineTo(1.02f)
                close()
                moveTo(10.998f, 3.02f)
                horizontalLineTo(12.998f)
                verticalLineTo(5.02f)
                horizontalLineTo(10.998f)
                verticalLineTo(3.02f)
                close()
            }
        }
        .build()
        return _arrowLongDownE!!
    }

private var _arrowLongDownE: ImageVector? = null
