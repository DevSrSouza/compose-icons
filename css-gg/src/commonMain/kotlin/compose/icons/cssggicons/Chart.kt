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

public val CssGgIcons.Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart = Builder(name = "Chart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.775f, 8.0f)
                curveTo(22.924f, 8.655f, 23.0f, 9.325f, 23.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(1.0f)
                curveTo(14.675f, 1.0f, 15.345f, 1.076f, 16.0f, 1.225f)
                curveTo(16.492f, 1.337f, 16.975f, 1.491f, 17.444f, 1.685f)
                curveTo(18.536f, 2.137f, 19.528f, 2.8f, 20.364f, 3.636f)
                curveTo(21.2f, 4.472f, 21.863f, 5.464f, 22.315f, 6.556f)
                curveTo(22.509f, 7.025f, 22.663f, 7.508f, 22.775f, 8.0f)
                close()
                moveTo(20.708f, 8.0f)
                curveTo(20.64f, 7.77f, 20.559f, 7.544f, 20.467f, 7.321f)
                curveTo(20.115f, 6.472f, 19.6f, 5.7f, 18.95f, 5.05f)
                curveTo(18.3f, 4.4f, 17.528f, 3.885f, 16.679f, 3.533f)
                curveTo(16.456f, 3.441f, 16.23f, 3.36f, 16.0f, 3.292f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.708f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 14.0f)
                curveTo(1.0f, 9.029f, 5.029f, 5.0f, 10.0f, 5.0f)
                curveTo(10.675f, 5.0f, 11.345f, 5.076f, 12.0f, 5.225f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.775f)
                curveTo(18.924f, 12.655f, 19.0f, 13.325f, 19.0f, 14.0f)
                curveTo(19.0f, 18.971f, 14.971f, 23.0f, 10.0f, 23.0f)
                curveTo(5.029f, 23.0f, 1.0f, 18.971f, 1.0f, 14.0f)
                close()
                moveTo(16.803f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.196f)
                curveTo(6.243f, 7.196f, 3.196f, 10.243f, 3.196f, 14.0f)
                curveTo(3.196f, 17.757f, 6.243f, 20.803f, 10.0f, 20.803f)
                curveTo(13.757f, 20.803f, 16.803f, 17.757f, 16.803f, 14.0f)
                close()
            }
        }
        .build()
        return _chart!!
    }

private var _chart: ImageVector? = null
