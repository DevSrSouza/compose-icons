package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.TabDesktopImage: ImageVector
    get() {
        if (_tabDesktopImage != null) {
            return _tabDesktopImage!!
        }
        _tabDesktopImage = Builder(name = "TabDesktopImage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 3.0f, 3.0f, 4.3432f, 3.0f, 6.0f)
                verticalLineTo(10.5351f)
                curveTo(3.5884f, 10.1948f, 4.2714f, 10.0f, 5.0f, 10.0f)
                horizontalLineTo(10.0f)
                curveTo(12.2091f, 10.0f, 14.0f, 11.7909f, 14.0f, 14.0f)
                verticalLineTo(19.0f)
                curveTo(14.0f, 19.7286f, 13.8052f, 20.4117f, 13.4649f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 21.0f, 21.0f, 19.6569f, 21.0f, 18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.25f)
                curveTo(12.0074f, 8.0f, 11.0f, 6.9926f, 11.0f, 5.75f)
                verticalLineTo(3.0f)
                close()
                moveTo(21.0f, 6.5f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.3432f, 19.6569f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(5.75f)
                curveTo(12.5f, 6.1642f, 12.8358f, 6.5f, 13.25f, 6.5f)
                horizontalLineTo(21.0f)
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
