package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.2721f, 10.2721f)
                curveTo(16.2721f, 12.4813f, 14.4813f, 14.2721f, 12.2721f, 14.2721f)
                curveTo(10.063f, 14.2721f, 8.2721f, 12.4813f, 8.2721f, 10.2721f)
                curveTo(8.2721f, 8.063f, 10.063f, 6.2721f, 12.2721f, 6.2721f)
                curveTo(14.4813f, 6.2721f, 16.2721f, 8.063f, 16.2721f, 10.2721f)
                close()
                moveTo(14.2721f, 10.2721f)
                curveTo(14.2721f, 11.3767f, 13.3767f, 12.2721f, 12.2721f, 12.2721f)
                curveTo(11.1676f, 12.2721f, 10.2721f, 11.3767f, 10.2721f, 10.2721f)
                curveTo(10.2721f, 9.1676f, 11.1676f, 8.2721f, 12.2721f, 8.2721f)
                curveTo(13.3767f, 8.2721f, 14.2721f, 9.1676f, 14.2721f, 10.2721f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.7942f, 16.5183f)
                curveTo(2.1942f, 13.0909f, 2.0544f, 7.3941f, 5.4818f, 3.7942f)
                curveTo(8.9092f, 0.1942f, 14.6059f, 0.0544f, 18.2059f, 3.4818f)
                curveTo(21.8058f, 6.9092f, 21.9457f, 12.6059f, 18.5183f, 16.2059f)
                lineTo(12.3124f, 22.7241f)
                lineTo(5.7942f, 16.5183f)
                close()
                moveTo(17.0698f, 14.8268f)
                lineTo(12.243f, 19.8965f)
                lineTo(7.1732f, 15.0698f)
                curveTo(4.3733f, 12.404f, 4.2645f, 7.9732f, 6.9303f, 5.1732f)
                curveTo(9.596f, 2.3733f, 14.0268f, 2.2645f, 16.8268f, 4.9303f)
                curveTo(19.6267f, 7.596f, 19.7355f, 12.0268f, 17.0698f, 14.8268f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
