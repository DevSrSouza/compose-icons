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

public val CssGgIcons.ShapeZigzag: ImageVector
    get() {
        if (_shapeZigzag != null) {
            return _shapeZigzag!!
        }
        _shapeZigzag = Builder(name = "ShapeZigzag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.3121f, 9.0f)
                lineTo(1.0f, 10.5094f)
                lineTo(4.7736f, 13.7897f)
                lineTo(6.283f, 15.1018f)
                lineTo(7.5951f, 13.5924f)
                lineTo(9.1346f, 11.8214f)
                lineTo(11.3988f, 13.7897f)
                lineTo(12.9082f, 15.1018f)
                lineTo(14.2203f, 13.5924f)
                lineTo(15.7584f, 11.823f)
                lineTo(18.0209f, 13.7897f)
                lineTo(19.5303f, 15.1018f)
                lineTo(20.8424f, 13.5924f)
                lineTo(22.8106f, 11.3283f)
                lineTo(21.3012f, 10.0162f)
                lineTo(19.333f, 12.2803f)
                lineTo(15.5594f, 9.0f)
                lineTo(14.2473f, 10.5094f)
                lineTo(14.249f, 10.5109f)
                lineTo(12.7109f, 12.2803f)
                lineTo(8.9374f, 9.0f)
                lineTo(8.054f, 10.0163f)
                lineTo(6.0857f, 12.2803f)
                lineTo(2.3121f, 9.0f)
                close()
            }
        }
        .build()
        return _shapeZigzag!!
    }

private var _shapeZigzag: ImageVector? = null
