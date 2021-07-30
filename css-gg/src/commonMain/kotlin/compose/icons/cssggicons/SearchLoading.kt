package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.SearchLoading: ImageVector
    get() {
        if (_searchLoading != null) {
            return _searchLoading!!
        }
        _searchLoading = Builder(name = "SearchLoading", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5502f, 10.5503f)
                curveTo(8.5502f, 11.1026f, 8.1025f, 11.5503f, 7.5502f, 11.5503f)
                curveTo(6.998f, 11.5503f, 6.5502f, 11.1026f, 6.5502f, 10.5503f)
                curveTo(6.5502f, 9.998f, 6.998f, 9.5503f, 7.5502f, 9.5503f)
                curveTo(8.1025f, 9.5503f, 8.5502f, 9.998f, 8.5502f, 10.5503f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5502f, 11.5503f)
                curveTo(11.1025f, 11.5503f, 11.5502f, 11.1026f, 11.5502f, 10.5503f)
                curveTo(11.5502f, 9.998f, 11.1025f, 9.5503f, 10.5502f, 9.5503f)
                curveTo(9.998f, 9.5503f, 9.5502f, 9.998f, 9.5502f, 10.5503f)
                curveTo(9.5502f, 11.1026f, 9.998f, 11.5503f, 10.5502f, 11.5503f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5502f, 11.5503f)
                curveTo(14.1025f, 11.5503f, 14.5502f, 11.1026f, 14.5502f, 10.5503f)
                curveTo(14.5502f, 9.998f, 14.1025f, 9.5503f, 13.5502f, 9.5503f)
                curveTo(12.998f, 9.5503f, 12.5502f, 9.998f, 12.5502f, 10.5503f)
                curveTo(12.5502f, 11.1026f, 12.998f, 11.5503f, 13.5502f, 11.5503f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.2071f, 4.8934f)
                curveTo(19.0922f, 7.7786f, 19.313f, 12.3192f, 16.8693f, 15.4577f)
                curveTo(16.8846f, 15.4712f, 16.8996f, 15.4853f, 16.9142f, 15.4999f)
                lineTo(21.1568f, 19.7426f)
                curveTo(21.5473f, 20.1331f, 21.5473f, 20.7663f, 21.1568f, 21.1568f)
                curveTo(20.7663f, 21.5473f, 20.1331f, 21.5473f, 19.7426f, 21.1568f)
                lineTo(15.5f, 16.9141f)
                curveTo(15.4853f, 16.8995f, 15.4713f, 16.8846f, 15.4578f, 16.8693f)
                curveTo(12.3193f, 19.3131f, 7.7786f, 19.0923f, 4.8934f, 16.2071f)
                curveTo(1.7692f, 13.083f, 1.7692f, 8.0176f, 4.8934f, 4.8934f)
                curveTo(8.0176f, 1.7692f, 13.0829f, 1.7692f, 16.2071f, 4.8934f)
                close()
                moveTo(6.3076f, 14.7929f)
                curveTo(8.6507f, 17.1361f, 12.4497f, 17.1361f, 14.7929f, 14.7929f)
                curveTo(17.136f, 12.4498f, 17.136f, 8.6508f, 14.7929f, 6.3077f)
                curveTo(12.4497f, 3.9645f, 8.6507f, 3.9645f, 6.3076f, 6.3077f)
                curveTo(3.9644f, 8.6508f, 3.9644f, 12.4498f, 6.3076f, 14.7929f)
                close()
            }
        }
        .build()
        return _searchLoading!!
    }

private var _searchLoading: ImageVector? = null
