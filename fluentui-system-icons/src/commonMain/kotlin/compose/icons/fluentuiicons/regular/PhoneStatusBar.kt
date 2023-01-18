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

public val RegularGroup.PhoneStatusBar: ImageVector
    get() {
        if (_phoneStatusBar != null) {
            return _phoneStatusBar!!
        }
        _phoneStatusBar = Builder(name = "PhoneStatusBar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 2.0f)
                curveTo(16.9926f, 2.0f, 18.0f, 3.0074f, 18.0f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.0f, 20.9926f, 16.9926f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.0074f, 7.0074f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(15.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 3.5f, 7.5f, 3.8358f, 7.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.1642f, 7.8358f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 20.5f, 16.5f, 20.1642f, 16.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(16.5f, 3.8358f, 16.1642f, 3.5f, 15.75f, 3.5f)
                close()
                moveTo(14.75f, 4.5f)
                curveTo(15.1642f, 4.5f, 15.5f, 4.8358f, 15.5f, 5.25f)
                curveTo(15.5f, 5.6642f, 15.1642f, 6.0f, 14.75f, 6.0f)
                horizontalLineTo(9.25f)
                curveTo(8.8358f, 6.0f, 8.5f, 5.6642f, 8.5f, 5.25f)
                curveTo(8.5f, 4.8358f, 8.8358f, 4.5f, 9.25f, 4.5f)
                horizontalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _phoneStatusBar!!
    }

private var _phoneStatusBar: ImageVector? = null
