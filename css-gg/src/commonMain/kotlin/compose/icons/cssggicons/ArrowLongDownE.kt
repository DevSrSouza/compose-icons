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
                moveTo(14.998f, 1.0201f)
                horizontalLineTo(8.998f)
                verticalLineTo(7.0201f)
                horizontalLineTo(10.9991f)
                lineTo(11.012f, 19.1652f)
                lineTo(9.1675f, 17.3309f)
                lineTo(7.7573f, 18.7491f)
                lineTo(12.0118f, 22.9799f)
                lineTo(16.2427f, 18.7253f)
                lineTo(14.8246f, 17.315f)
                lineTo(13.012f, 19.1378f)
                lineTo(12.9991f, 7.0201f)
                horizontalLineTo(14.998f)
                verticalLineTo(1.0201f)
                close()
                moveTo(10.998f, 3.0201f)
                horizontalLineTo(12.998f)
                verticalLineTo(5.0201f)
                horizontalLineTo(10.998f)
                verticalLineTo(3.0201f)
                close()
            }
        }
        .build()
        return _arrowLongDownE!!
    }

private var _arrowLongDownE: ImageVector? = null
