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

public val RegularGroup.TabDesktopMultipleBottom: ImageVector
    get() {
        if (_tabDesktopMultipleBottom != null) {
            return _tabDesktopMultipleBottom!!
        }
        _tabDesktopMultipleBottom = Builder(name = "TabDesktopMultipleBottom", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0093f, 5.0f)
                horizontalLineTo(7.5176f)
                curveTo(7.6389f, 4.1519f, 8.3682f, 3.5f, 9.2499f, 3.5f)
                horizontalLineTo(17.25f)
                curveTo(19.0449f, 3.5f, 20.5f, 4.9551f, 20.5f, 6.75f)
                verticalLineTo(14.75f)
                curveTo(20.5f, 15.6316f, 19.8481f, 16.361f, 19.0f, 16.4823f)
                verticalLineTo(17.9905f)
                curveTo(20.6781f, 17.8629f, 22.0f, 16.4608f, 22.0f, 14.75f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 4.1266f, 19.8733f, 2.0f, 17.25f, 2.0f)
                horizontalLineTo(9.2499f)
                curveTo(7.5391f, 2.0f, 6.137f, 3.3219f, 6.0093f, 5.0f)
                close()
                moveTo(2.0f, 9.25f)
                curveTo(2.0f, 7.4551f, 3.4551f, 6.0f, 5.25f, 6.0f)
                horizontalLineTo(14.7501f)
                curveTo(16.5451f, 6.0f, 18.0002f, 7.4551f, 18.0002f, 9.25f)
                verticalLineTo(18.75f)
                curveTo(18.0002f, 20.5449f, 16.5451f, 22.0f, 14.7501f, 22.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 22.0f, 2.0f, 20.5449f, 2.0f, 18.75f)
                verticalLineTo(9.25f)
                close()
                moveTo(5.25f, 7.5f)
                curveTo(4.2835f, 7.5f, 3.5f, 8.2835f, 3.5f, 9.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(9.25f)
                curveTo(10.4926f, 16.5f, 11.5f, 17.5074f, 11.5f, 18.75f)
                verticalLineTo(20.5f)
                horizontalLineTo(14.7501f)
                curveTo(15.7166f, 20.5f, 16.5001f, 19.7165f, 16.5001f, 18.75f)
                verticalLineTo(9.25f)
                curveTo(16.5001f, 8.2835f, 15.7166f, 7.5f, 14.7501f, 7.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(10.0f, 20.5f)
                verticalLineTo(18.75f)
                curveTo(10.0f, 18.3358f, 9.6642f, 18.0f, 9.25f, 18.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(18.75f)
                curveTo(3.5f, 19.7165f, 4.2835f, 20.5f, 5.25f, 20.5f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _tabDesktopMultipleBottom!!
    }

private var _tabDesktopMultipleBottom: ImageVector? = null
