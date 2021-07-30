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

public val CssGgIcons.SearchFound: ImageVector
    get() {
        if (_searchFound != null) {
            return _searchFound!!
        }
        _searchFound = Builder(name = "SearchFound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6654f, 10.2366f)
                lineTo(9.1975f, 8.951f)
                lineTo(10.4831f, 10.4831f)
                lineTo(13.5473f, 7.9119f)
                lineTo(14.8328f, 9.444f)
                lineTo(10.2366f, 13.3007f)
                lineTo(7.6654f, 10.2366f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.2071f, 4.8934f)
                curveTo(19.0923f, 7.7786f, 19.3131f, 12.3193f, 16.8693f, 15.4578f)
                curveTo(16.8846f, 15.4713f, 16.8996f, 15.4854f, 16.9143f, 15.5f)
                lineTo(21.1569f, 19.7427f)
                curveTo(21.5474f, 20.1332f, 21.5474f, 20.7664f, 21.1569f, 21.1569f)
                curveTo(20.7664f, 21.5474f, 20.1332f, 21.5474f, 19.7427f, 21.1569f)
                lineTo(15.5f, 16.9143f)
                curveTo(15.4854f, 16.8996f, 15.4713f, 16.8846f, 15.4578f, 16.8693f)
                curveTo(12.3193f, 19.3131f, 7.7786f, 19.0923f, 4.8934f, 16.2071f)
                curveTo(1.7692f, 13.083f, 1.7692f, 8.0176f, 4.8934f, 4.8934f)
                curveTo(8.0176f, 1.7692f, 13.083f, 1.7692f, 16.2071f, 4.8934f)
                close()
                moveTo(14.7929f, 14.7929f)
                curveTo(17.1361f, 12.4498f, 17.1361f, 8.6508f, 14.7929f, 6.3077f)
                curveTo(12.4498f, 3.9645f, 8.6508f, 3.9645f, 6.3077f, 6.3077f)
                curveTo(3.9645f, 8.6508f, 3.9645f, 12.4498f, 6.3077f, 14.7929f)
                curveTo(8.6508f, 17.1361f, 12.4498f, 17.1361f, 14.7929f, 14.7929f)
                close()
            }
        }
        .build()
        return _searchFound!!
    }

private var _searchFound: ImageVector? = null
