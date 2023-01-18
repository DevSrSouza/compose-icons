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

public val RegularGroup.SlideMultiple: ImageVector
    get() {
        if (_slideMultiple != null) {
            return _slideMultiple!!
        }
        _slideMultiple = Builder(name = "SlideMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 3.0f)
                curveTo(4.1266f, 3.0f, 2.0f, 5.1266f, 2.0f, 7.75f)
                verticalLineTo(14.75f)
                curveTo(2.0f, 15.9926f, 3.0074f, 17.0f, 4.25f, 17.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 15.5f, 3.5f, 15.1642f, 3.5f, 14.75f)
                verticalLineTo(7.75f)
                curveTo(3.5f, 5.9551f, 4.9551f, 4.5f, 6.75f, 4.5f)
                horizontalLineTo(16.75f)
                curveTo(17.1642f, 4.5f, 17.5f, 4.8358f, 17.5f, 5.25f)
                verticalLineTo(5.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.25f)
                curveTo(19.0f, 4.0074f, 17.9926f, 3.0f, 16.75f, 3.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(7.75f, 6.5f)
                curveTo(6.5074f, 6.5f, 5.5f, 7.5074f, 5.5f, 8.75f)
                verticalLineTo(18.25f)
                curveTo(5.5f, 19.4926f, 6.5074f, 20.5f, 7.75f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 20.5f, 22.0f, 19.4926f, 22.0f, 18.25f)
                verticalLineTo(8.75f)
                curveTo(22.0f, 7.5074f, 20.9926f, 6.5f, 19.75f, 6.5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(7.0f, 8.75f)
                curveTo(7.0f, 8.3358f, 7.3358f, 8.0f, 7.75f, 8.0f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 8.0f, 20.5f, 8.3358f, 20.5f, 8.75f)
                verticalLineTo(18.25f)
                curveTo(20.5f, 18.6642f, 20.1642f, 19.0f, 19.75f, 19.0f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 19.0f, 7.0f, 18.6642f, 7.0f, 18.25f)
                verticalLineTo(8.75f)
                close()
            }
        }
        .build()
        return _slideMultiple!!
    }

private var _slideMultiple: ImageVector? = null
