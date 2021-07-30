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
                curveTo(22.9242f, 8.6546f, 23.0f, 9.3254f, 23.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(1.0f)
                curveTo(14.6746f, 1.0f, 15.3454f, 1.0758f, 16.0f, 1.225f)
                curveTo(16.4923f, 1.3372f, 16.9754f, 1.4909f, 17.4442f, 1.6851f)
                curveTo(18.5361f, 2.1374f, 19.5282f, 2.8003f, 20.364f, 3.636f)
                curveTo(21.1997f, 4.4718f, 21.8626f, 5.4639f, 22.3149f, 6.5559f)
                curveTo(22.5091f, 7.0245f, 22.6628f, 7.5077f, 22.775f, 8.0f)
                close()
                moveTo(20.7082f, 8.0f)
                curveTo(20.6397f, 7.7702f, 20.5593f, 7.5436f, 20.4672f, 7.3212f)
                curveTo(20.1154f, 6.4719f, 19.5998f, 5.7003f, 18.9497f, 5.0503f)
                curveTo(18.2997f, 4.4002f, 17.5281f, 3.8846f, 16.6788f, 3.5328f)
                curveTo(16.4564f, 3.4407f, 16.2298f, 3.3603f, 16.0f, 3.2918f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.7082f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 14.0f)
                curveTo(1.0f, 9.0294f, 5.0294f, 5.0f, 10.0f, 5.0f)
                curveTo(10.6746f, 5.0f, 11.3454f, 5.0758f, 12.0f, 5.225f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.775f)
                curveTo(18.9242f, 12.6546f, 19.0f, 13.3254f, 19.0f, 14.0f)
                curveTo(19.0f, 18.9706f, 14.9706f, 23.0f, 10.0f, 23.0f)
                curveTo(5.0294f, 23.0f, 1.0f, 18.9706f, 1.0f, 14.0f)
                close()
                moveTo(16.8035f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.1965f)
                curveTo(6.2425f, 7.1965f, 3.1965f, 10.2425f, 3.1965f, 14.0f)
                curveTo(3.1965f, 17.7575f, 6.2425f, 20.8035f, 10.0f, 20.8035f)
                curveTo(13.7575f, 20.8035f, 16.8035f, 17.7575f, 16.8035f, 14.0f)
                close()
            }
        }
        .build()
        return _chart!!
    }

private var _chart: ImageVector? = null
