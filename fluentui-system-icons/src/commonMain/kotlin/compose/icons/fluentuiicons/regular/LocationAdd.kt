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

public val RegularGroup.LocationAdd: ImageVector
    get() {
        if (_locationAdd != null) {
            return _locationAdd!!
        }
        _locationAdd = Builder(name = "LocationAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.75f)
                curveTo(8.0f, 10.3358f, 8.3358f, 10.0f, 8.75f, 10.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.7491f)
                curveTo(11.25f, 7.3349f, 11.5858f, 6.9991f, 12.0f, 6.9991f)
                curveTo(12.4142f, 6.9991f, 12.75f, 7.3349f, 12.75f, 7.7491f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 10.0f, 16.0f, 10.3358f, 16.0f, 10.75f)
                curveTo(16.0f, 11.1642f, 15.6642f, 11.5f, 15.25f, 11.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(13.7491f)
                curveTo(12.75f, 14.1633f, 12.4142f, 14.4991f, 12.0f, 14.4991f)
                curveTo(11.5858f, 14.4991f, 11.25f, 14.1633f, 11.25f, 13.7491f)
                verticalLineTo(11.5f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 11.5f, 8.0f, 11.1642f, 8.0f, 10.75f)
                close()
                moveTo(5.8433f, 4.5679f)
                curveTo(9.2437f, 1.1675f, 14.7568f, 1.1675f, 18.1573f, 4.5679f)
                curveTo(21.5577f, 7.9683f, 21.5577f, 13.4815f, 18.1573f, 16.8819f)
                lineTo(16.9703f, 18.0558f)
                curveTo(16.0954f, 18.9144f, 14.9603f, 20.0184f, 13.5644f, 21.3679f)
                curveTo(12.6922f, 22.2113f, 11.3084f, 22.2112f, 10.4362f, 21.3677f)
                lineTo(6.9451f, 17.9718f)
                curveTo(6.5064f, 17.541f, 6.1391f, 17.1777f, 5.8433f, 16.8819f)
                curveTo(2.4429f, 13.4815f, 2.4429f, 7.9683f, 5.8433f, 4.5679f)
                close()
                moveTo(17.0966f, 5.6286f)
                curveTo(14.282f, 2.8139f, 9.7186f, 2.8139f, 6.9039f, 5.6286f)
                curveTo(4.0893f, 8.4432f, 4.0893f, 13.0066f, 6.9039f, 15.8212f)
                lineTo(8.391f, 17.2887f)
                curveTo(9.2099f, 18.0901f, 10.2394f, 19.0905f, 11.4791f, 20.2895f)
                curveTo(11.7698f, 20.5706f, 12.231f, 20.5707f, 12.5218f, 20.2896f)
                lineTo(15.9167f, 16.9881f)
                curveTo(16.3856f, 16.5278f, 16.779f, 16.1388f, 17.0966f, 15.8212f)
                curveTo(19.9112f, 13.0066f, 19.9112f, 8.4432f, 17.0966f, 5.6286f)
                close()
            }
        }
        .build()
        return _locationAdd!!
    }

private var _locationAdd: ImageVector? = null
