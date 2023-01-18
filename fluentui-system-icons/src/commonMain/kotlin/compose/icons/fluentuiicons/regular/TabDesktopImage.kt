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

public val RegularGroup.TabDesktopImage: ImageVector
    get() {
        if (_tabDesktopImage != null) {
            return _tabDesktopImage!!
        }
        _tabDesktopImage = Builder(name = "TabDesktopImage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 3.0f)
                curveTo(4.2312f, 3.0f, 3.0f, 4.2312f, 3.0f, 5.75f)
                verticalLineTo(10.5351f)
                curveTo(3.4516f, 10.2739f, 3.959f, 10.0984f, 4.5f, 10.0309f)
                verticalLineTo(5.75f)
                curveTo(4.5f, 5.0596f, 5.0596f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.75f)
                curveTo(11.0f, 6.9926f, 12.0074f, 8.0f, 13.25f, 8.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(18.25f)
                curveTo(19.5f, 18.9404f, 18.9404f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(13.9691f)
                curveTo(13.9016f, 20.041f, 13.7261f, 20.5484f, 13.4649f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 21.0f, 21.0f, 19.7688f, 21.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 4.2312f, 19.7688f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(19.5f, 6.5f)
                horizontalLineTo(13.25f)
                curveTo(12.8358f, 6.5f, 12.5f, 6.1642f, 12.5f, 5.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(18.25f)
                curveTo(18.9404f, 4.5f, 19.5f, 5.0596f, 19.5f, 5.75f)
                verticalLineTo(6.5f)
                close()
                moveTo(5.0f, 11.0f)
                curveTo(3.3431f, 11.0f, 2.0f, 12.3431f, 2.0f, 14.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.5564f, 2.1514f, 20.0773f, 2.4154f, 20.524f)
                lineTo(5.909f, 17.0303f)
                curveTo(6.7877f, 16.1516f, 8.2123f, 16.1517f, 9.091f, 17.0303f)
                lineTo(12.5846f, 20.524f)
                curveTo(12.8486f, 20.0773f, 13.0f, 19.5564f, 13.0f, 19.0f)
                verticalLineTo(14.0f)
                curveTo(13.0f, 12.3431f, 11.6569f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(5.0f, 22.0f)
                curveTo(4.4436f, 22.0f, 3.9227f, 21.8486f, 3.476f, 21.5846f)
                lineTo(6.9697f, 18.091f)
                curveTo(7.2626f, 17.7981f, 7.7374f, 17.7981f, 8.0303f, 18.091f)
                lineTo(11.524f, 21.5846f)
                curveTo(11.0773f, 21.8486f, 10.5564f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(10.0f, 15.0f)
                curveTo(9.4477f, 15.0f, 9.0f, 14.5523f, 9.0f, 14.0f)
                curveTo(9.0f, 13.4477f, 9.4477f, 13.0f, 10.0f, 13.0f)
                curveTo(10.5523f, 13.0f, 11.0f, 13.4477f, 11.0f, 14.0f)
                curveTo(11.0f, 14.5523f, 10.5523f, 15.0f, 10.0f, 15.0f)
                close()
            }
        }
        .build()
        return _tabDesktopImage!!
    }

private var _tabDesktopImage: ImageVector? = null
