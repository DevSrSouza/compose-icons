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

public val CssGgIcons.ArrowLongUpE: ImageVector
    get() {
        if (_arrowLongUpE != null) {
            return _arrowLongUpE!!
        }
        _arrowLongUpE = Builder(name = "ArrowLongUpE", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.032f, 1.013f)
                lineTo(16.243f, 5.288f)
                lineTo(14.818f, 6.691f)
                lineTo(13.014f, 4.86f)
                lineTo(12.944f, 16.977f)
                lineTo(14.943f, 16.987f)
                lineTo(14.914f, 22.987f)
                lineTo(8.914f, 22.958f)
                lineTo(8.943f, 16.958f)
                lineTo(10.944f, 16.968f)
                lineTo(11.014f, 4.823f)
                lineTo(9.161f, 6.649f)
                lineTo(7.758f, 5.224f)
                lineTo(12.032f, 1.013f)
                close()
                moveTo(10.924f, 20.968f)
                lineTo(12.924f, 20.977f)
                lineTo(12.933f, 18.977f)
                lineTo(10.933f, 18.968f)
                lineTo(10.924f, 20.968f)
                close()
            }
        }
        .build()
        return _arrowLongUpE!!
    }

private var _arrowLongUpE: ImageVector? = null
