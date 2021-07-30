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

public val CssGgIcons.ArrowLongUpR: ImageVector
    get() {
        if (_arrowLongUpR != null) {
            return _arrowLongUpR!!
        }
        _arrowLongUpR = Builder(name = "ArrowLongUpR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.7934f, 4.6094f)
                lineTo(12.0679f, 0.399f)
                lineTo(16.2785f, 4.6736f)
                lineTo(14.8536f, 6.0771f)
                lineTo(13.0499f, 4.246f)
                lineTo(12.9809f, 16.1324f)
                lineTo(16.2068f, 19.3584f)
                lineTo(11.9642f, 23.601f)
                lineTo(7.7216f, 19.3584f)
                lineTo(10.981f, 16.0989f)
                lineTo(11.0501f, 4.2088f)
                lineTo(9.1969f, 6.0343f)
                lineTo(7.7934f, 4.6094f)
                close()
                moveTo(11.9642f, 20.7726f)
                lineTo(13.3784f, 19.3584f)
                lineTo(11.9642f, 17.9442f)
                lineTo(10.55f, 19.3584f)
                lineTo(11.9642f, 20.7726f)
                close()
            }
        }
        .build()
        return _arrowLongUpR!!
    }

private var _arrowLongUpR: ImageVector? = null
