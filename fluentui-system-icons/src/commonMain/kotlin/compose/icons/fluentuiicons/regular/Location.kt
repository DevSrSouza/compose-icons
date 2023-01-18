package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.843f, 4.5679f)
                curveTo(9.2434f, 1.1675f, 14.7566f, 1.1675f, 18.157f, 4.5679f)
                curveTo(21.5574f, 7.9683f, 21.5574f, 13.4815f, 18.157f, 16.8819f)
                lineTo(16.97f, 18.0558f)
                curveTo(16.0952f, 18.9144f, 14.96f, 20.0184f, 13.5642f, 21.3679f)
                curveTo(12.6919f, 22.2113f, 11.3081f, 22.2112f, 10.436f, 21.3677f)
                lineTo(6.9449f, 17.9718f)
                curveTo(6.5061f, 17.541f, 6.1389f, 17.1777f, 5.843f, 16.8819f)
                curveTo(2.4426f, 13.4815f, 2.4426f, 7.9683f, 5.843f, 4.5679f)
                close()
                moveTo(17.0963f, 5.6286f)
                curveTo(14.2817f, 2.8139f, 9.7183f, 2.8139f, 6.9037f, 5.6286f)
                curveTo(4.0891f, 8.4432f, 4.0891f, 13.0066f, 6.9037f, 15.8212f)
                lineTo(8.3908f, 17.2887f)
                curveTo(9.2097f, 18.0901f, 10.2391f, 19.0905f, 11.4788f, 20.2895f)
                curveTo(11.7695f, 20.5706f, 12.2308f, 20.5707f, 12.5215f, 20.2896f)
                lineTo(15.9164f, 16.9881f)
                curveTo(16.3854f, 16.5278f, 16.7787f, 16.1388f, 17.0963f, 15.8212f)
                curveTo(19.911f, 13.0066f, 19.911f, 8.4432f, 17.0963f, 5.6286f)
                close()
                moveTo(12.0f, 7.9985f)
                curveTo(13.6577f, 7.9985f, 15.0016f, 9.3424f, 15.0016f, 11.0001f)
                curveTo(15.0016f, 12.6578f, 13.6577f, 14.0016f, 12.0f, 14.0016f)
                curveTo(10.3423f, 14.0016f, 8.9985f, 12.6578f, 8.9985f, 11.0001f)
                curveTo(8.9985f, 9.3424f, 10.3423f, 7.9985f, 12.0f, 7.9985f)
                close()
                moveTo(12.0f, 9.4985f)
                curveTo(11.1707f, 9.4985f, 10.4985f, 10.1708f, 10.4985f, 11.0001f)
                curveTo(10.4985f, 11.8294f, 11.1707f, 12.5016f, 12.0f, 12.5016f)
                curveTo(12.8293f, 12.5016f, 13.5016f, 11.8294f, 13.5016f, 11.0001f)
                curveTo(13.5016f, 10.1708f, 12.8293f, 9.4985f, 12.0f, 9.4985f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
