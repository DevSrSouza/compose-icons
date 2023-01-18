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

public val FilledGroup.DesktopMac: ImageVector
    get() {
        if (_desktopMac != null) {
            return _desktopMac!!
        }
        _desktopMac = Builder(name = "DesktopMac", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.25f, 3.0f)
                curveTo(3.0074f, 3.0f, 2.0f, 4.0074f, 2.0f, 5.25f)
                verticalLineTo(15.75f)
                curveTo(2.0f, 16.9926f, 3.0074f, 18.0f, 4.25f, 18.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.25f)
                curveTo(9.5f, 19.9404f, 8.9404f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 20.5f, 7.0f, 20.8358f, 7.0f, 21.25f)
                curveTo(7.0f, 21.6642f, 7.3358f, 22.0f, 7.75f, 22.0f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 22.0f, 17.0f, 21.6642f, 17.0f, 21.25f)
                curveTo(17.0f, 20.8358f, 16.6642f, 20.5f, 16.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(15.0596f, 20.5f, 14.5f, 19.9404f, 14.5f, 19.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 18.0f, 22.0f, 16.9926f, 22.0f, 15.75f)
                verticalLineTo(5.25f)
                curveTo(22.0f, 4.0074f, 20.9926f, 3.0f, 19.75f, 3.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(13.0f, 18.0f)
                verticalLineTo(19.25f)
                curveTo(13.0f, 19.7001f, 13.1081f, 20.125f, 13.2999f, 20.5f)
                horizontalLineTo(10.7001f)
                curveTo(10.8919f, 20.125f, 11.0f, 19.7001f, 11.0f, 19.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(3.5f, 14.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(15.75f)
                curveTo(20.5f, 16.1642f, 20.1642f, 16.5f, 19.75f, 16.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 16.5f, 3.5f, 16.1642f, 3.5f, 15.75f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _desktopMac!!
    }

private var _desktopMac: ImageVector? = null
