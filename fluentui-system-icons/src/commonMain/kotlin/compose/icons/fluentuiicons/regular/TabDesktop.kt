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

public val RegularGroup.TabDesktop: ImageVector
    get() {
        if (_tabDesktop != null) {
            return _tabDesktop!!
        }
        _tabDesktop = Builder(name = "TabDesktop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 3.0f)
                curveTo(4.2312f, 3.0f, 3.0f, 4.2312f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.0f, 19.7688f, 4.2312f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 21.0f, 21.0f, 19.7688f, 21.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 4.2312f, 19.7688f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(11.0f, 4.5f)
                verticalLineTo(5.75f)
                curveTo(11.0f, 6.9926f, 12.0074f, 8.0f, 13.25f, 8.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(18.25f)
                curveTo(19.5f, 18.9404f, 18.9404f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(5.75f)
                curveTo(5.0596f, 19.5f, 4.5f, 18.9404f, 4.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(4.5f, 5.0596f, 5.0596f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(11.0f)
                close()
                moveTo(19.5f, 6.5f)
                horizontalLineTo(13.25f)
                curveTo(12.8358f, 6.5f, 12.5f, 6.1642f, 12.5f, 5.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(18.25f)
                curveTo(18.9404f, 4.5f, 19.5f, 5.0596f, 19.5f, 5.75f)
                verticalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _tabDesktop!!
    }

private var _tabDesktop: ImageVector? = null
