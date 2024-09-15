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
                moveTo(2.312f, 9.0f)
                lineTo(1.0f, 10.509f)
                lineTo(4.774f, 13.79f)
                lineTo(6.283f, 15.102f)
                lineTo(7.595f, 13.592f)
                lineTo(9.135f, 11.821f)
                lineTo(11.399f, 13.79f)
                lineTo(12.908f, 15.102f)
                lineTo(14.22f, 13.592f)
                lineTo(15.758f, 11.823f)
                lineTo(18.021f, 13.79f)
                lineTo(19.53f, 15.102f)
                lineTo(20.842f, 13.592f)
                lineTo(22.811f, 11.328f)
                lineTo(21.301f, 10.016f)
                lineTo(19.333f, 12.28f)
                lineTo(15.559f, 9.0f)
                lineTo(14.247f, 10.509f)
                lineTo(14.249f, 10.511f)
                lineTo(12.711f, 12.28f)
                lineTo(8.937f, 9.0f)
                lineTo(8.054f, 10.016f)
                lineTo(6.086f, 12.28f)
                lineTo(2.312f, 9.0f)
                close()
            }
        }
        .build()
        return _shapeZigzag!!
    }

private var _shapeZigzag: ImageVector? = null
