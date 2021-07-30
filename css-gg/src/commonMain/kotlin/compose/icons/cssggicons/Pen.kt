package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.2635f, 2.2929f)
                curveTo(20.873f, 1.9024f, 20.2398f, 1.9024f, 19.8493f, 2.2929f)
                lineTo(18.9769f, 3.1653f)
                curveTo(17.8618f, 2.6325f, 16.4857f, 2.828f, 15.5621f, 3.7517f)
                lineTo(4.9555f, 14.3582f)
                lineTo(10.6123f, 20.0151f)
                lineTo(21.2189f, 9.4085f)
                curveTo(22.1426f, 8.4849f, 22.338f, 7.1088f, 21.8053f, 5.9937f)
                lineTo(22.6777f, 5.1213f)
                curveTo(23.0682f, 4.7308f, 23.0682f, 4.0976f, 22.6777f, 3.7071f)
                lineTo(21.2635f, 2.2929f)
                close()
                moveTo(16.9955f, 10.8035f)
                lineTo(10.6123f, 17.1867f)
                lineTo(7.7839f, 14.3582f)
                lineTo(14.1671f, 7.9751f)
                lineTo(16.9955f, 10.8035f)
                close()
                moveTo(18.8138f, 8.9853f)
                lineTo(19.8047f, 7.9943f)
                curveTo(20.1953f, 7.6038f, 20.1953f, 6.9706f, 19.8047f, 6.5801f)
                lineTo(18.3905f, 5.1659f)
                curveTo(18.0f, 4.7753f, 17.3668f, 4.7753f, 16.9763f, 5.1659f)
                lineTo(15.9853f, 6.1568f)
                lineTo(18.8138f, 8.9853f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.9502f)
                lineTo(4.1217f, 15.1717f)
                lineTo(9.7782f, 20.8289f)
                lineTo(2.0f, 22.9502f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
