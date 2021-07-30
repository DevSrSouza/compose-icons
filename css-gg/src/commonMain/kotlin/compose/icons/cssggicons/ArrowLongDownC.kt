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

public val CssGgIcons.ArrowLongDownC: ImageVector
    get() {
        if (_arrowLongDownC != null) {
            return _arrowLongDownC!!
        }
        _arrowLongDownC = Builder(name = "ArrowLongDownC", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.9991f, 6.8498f)
                curveTo(9.8334f, 6.4382f, 8.9981f, 5.3267f, 8.9981f, 4.0201f)
                curveTo(8.9981f, 2.3633f, 10.3413f, 1.0201f, 11.9981f, 1.0201f)
                curveTo(13.655f, 1.0201f, 14.9981f, 2.3633f, 14.9981f, 4.0201f)
                curveTo(14.9981f, 5.326f, 14.1638f, 6.437f, 12.9991f, 6.8491f)
                lineTo(13.0121f, 19.1375f)
                lineTo(14.8244f, 17.315f)
                lineTo(16.2426f, 18.7253f)
                lineTo(12.0119f, 22.9799f)
                lineTo(7.7574f, 18.7491f)
                lineTo(9.1676f, 17.3309f)
                lineTo(11.0122f, 19.1652f)
                lineTo(10.9991f, 6.8498f)
                close()
                moveTo(11.9981f, 5.0201f)
                curveTo(11.4458f, 5.0201f, 10.9981f, 4.5724f, 10.9981f, 4.0201f)
                curveTo(10.9981f, 3.4679f, 11.4458f, 3.0201f, 11.9981f, 3.0201f)
                curveTo(12.5504f, 3.0201f, 12.9981f, 3.4679f, 12.9981f, 4.0201f)
                curveTo(12.9981f, 4.5724f, 12.5504f, 5.0201f, 11.9981f, 5.0201f)
                close()
            }
        }
        .build()
        return _arrowLongDownC!!
    }

private var _arrowLongDownC: ImageVector? = null
