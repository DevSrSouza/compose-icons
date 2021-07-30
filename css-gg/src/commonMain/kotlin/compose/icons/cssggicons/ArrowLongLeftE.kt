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

public val CssGgIcons.ArrowLongLeftE: ImageVector
    get() {
        if (_arrowLongLeftE != null) {
            return _arrowLongLeftE!!
        }
        _arrowLongLeftE = Builder(name = "ArrowLongLeftE", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.2632f, 7.7574f)
                lineTo(1.0134f, 11.9928f)
                lineTo(5.2489f, 16.2426f)
                lineTo(6.6655f, 14.8308f)
                lineTo(4.8512f, 13.0104f)
                lineTo(16.9685f, 13.0519f)
                lineTo(16.9596f, 15.0507f)
                lineTo(22.9595f, 15.0777f)
                lineTo(22.9865f, 9.0777f)
                lineTo(16.9865f, 9.0508f)
                lineTo(16.9775f, 11.0519f)
                lineTo(4.8325f, 11.0103f)
                lineTo(6.675f, 9.174f)
                lineTo(5.2632f, 7.7574f)
                close()
                moveTo(20.9775f, 11.0687f)
                lineTo(20.9685f, 13.0687f)
                lineTo(18.9685f, 13.0597f)
                lineTo(18.9775f, 11.0597f)
                lineTo(20.9775f, 11.0687f)
                close()
            }
        }
        .build()
        return _arrowLongLeftE!!
    }

private var _arrowLongLeftE: ImageVector? = null
