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

public val CssGgIcons.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.7083f, 15.4397f)
                curveTo(5.9266f, 16.2928f, 7.3222f, 16.7038f, 8.7046f, 16.7063f)
                curveTo(9.1798f, 18.0045f, 10.0433f, 19.1753f, 11.2616f, 20.0284f)
                curveTo(14.4284f, 22.2458f, 18.7932f, 21.4762f, 21.0107f, 18.3093f)
                curveTo(23.2281f, 15.1425f, 22.4585f, 10.7777f, 19.2916f, 8.5602f)
                curveTo(18.0734f, 7.7072f, 16.6778f, 7.2962f, 15.2954f, 7.2937f)
                curveTo(14.8202f, 5.9955f, 13.9567f, 4.8247f, 12.7384f, 3.9716f)
                curveTo(9.5716f, 1.7542f, 5.2068f, 2.5238f, 2.9893f, 5.6906f)
                curveTo(0.7719f, 8.8575f, 1.5415f, 13.2223f, 4.7083f, 15.4397f)
                close()
                moveTo(5.8555f, 13.8014f)
                curveTo(6.6016f, 14.3239f, 7.4408f, 14.6142f, 8.2874f, 14.6875f)
                curveTo(8.2011f, 13.1725f, 8.6046f, 11.6187f, 9.5425f, 10.2793f)
                curveTo(10.4804f, 8.9398f, 11.8025f, 8.0292f, 13.2556f, 7.5921f)
                curveTo(12.8972f, 6.8217f, 12.3374f, 6.1323f, 11.5913f, 5.6099f)
                curveTo(9.3292f, 4.026f, 6.2115f, 4.5758f, 4.6276f, 6.8378f)
                curveTo(3.0437f, 9.0998f, 3.5935f, 12.2176f, 5.8555f, 13.8014f)
                close()
                moveTo(18.1445f, 10.1985f)
                curveTo(17.3984f, 9.6761f, 16.5592f, 9.3858f, 15.7126f, 9.3125f)
                curveTo(15.7989f, 10.8275f, 15.3953f, 12.3813f, 14.4574f, 13.7207f)
                curveTo(13.5195f, 15.0602f, 12.1975f, 15.9708f, 10.7444f, 16.4079f)
                curveTo(11.1028f, 17.1783f, 11.6626f, 17.8676f, 12.4087f, 18.3901f)
                curveTo(14.6707f, 19.9739f, 17.7885f, 19.4242f, 19.3724f, 17.1622f)
                curveTo(20.9562f, 14.9002f, 20.4065f, 11.7824f, 18.1445f, 10.1985f)
                close()
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
