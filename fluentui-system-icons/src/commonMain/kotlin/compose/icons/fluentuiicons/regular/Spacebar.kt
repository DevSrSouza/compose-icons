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

public val RegularGroup.Spacebar: ImageVector
    get() {
        if (_spacebar != null) {
            return _spacebar!!
        }
        _spacebar = Builder(name = "Spacebar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(20.5f, 13.1381f, 20.3881f, 13.25f, 20.25f, 13.25f)
                horizontalLineTo(3.75f)
                curveTo(3.6119f, 13.25f, 3.5f, 13.1381f, 3.5f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(3.5f, 10.5858f, 3.1642f, 10.25f, 2.75f, 10.25f)
                curveTo(2.3358f, 10.25f, 2.0f, 10.5858f, 2.0f, 11.0f)
                curveTo(2.0f, 11.4444f, 2.0f, 12.1111f, 2.0f, 13.0f)
                curveTo(2.0f, 13.9665f, 2.7835f, 14.75f, 3.75f, 14.75f)
                horizontalLineTo(20.25f)
                curveTo(21.2165f, 14.75f, 22.0f, 13.9665f, 22.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 10.5858f, 21.6642f, 10.25f, 21.25f, 10.25f)
                curveTo(20.8358f, 10.25f, 20.5f, 10.5858f, 20.5f, 11.0f)
                close()
            }
        }
        .build()
        return _spacebar!!
    }

private var _spacebar: ImageVector? = null
