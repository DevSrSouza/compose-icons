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

public val RegularGroup.FullScreenMaximize: ImageVector
    get() {
        if (_fullScreenMaximize != null) {
            return _fullScreenMaximize!!
        }
        _fullScreenMaximize = Builder(name = "FullScreenMaximize", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 5.75f)
                curveTo(4.5f, 5.0596f, 5.0596f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(7.75f)
                curveTo(8.1642f, 4.5f, 8.5f, 4.1642f, 8.5f, 3.75f)
                curveTo(8.5f, 3.3358f, 8.1642f, 3.0f, 7.75f, 3.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 3.0f, 3.0f, 4.2312f, 3.0f, 5.75f)
                verticalLineTo(7.75f)
                curveTo(3.0f, 8.1642f, 3.3358f, 8.5f, 3.75f, 8.5f)
                curveTo(4.1642f, 8.5f, 4.5f, 8.1642f, 4.5f, 7.75f)
                verticalLineTo(5.75f)
                close()
                moveTo(4.5f, 18.25f)
                curveTo(4.5f, 18.9404f, 5.0596f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(7.75f)
                curveTo(8.1642f, 19.5f, 8.5f, 19.8358f, 8.5f, 20.25f)
                curveTo(8.5f, 20.6642f, 8.1642f, 21.0f, 7.75f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 21.0f, 3.0f, 19.7688f, 3.0f, 18.25f)
                verticalLineTo(16.25f)
                curveTo(3.0f, 15.8358f, 3.3358f, 15.5f, 3.75f, 15.5f)
                curveTo(4.1642f, 15.5f, 4.5f, 15.8358f, 4.5f, 16.25f)
                verticalLineTo(18.25f)
                close()
                moveTo(18.25f, 4.5f)
                curveTo(18.9404f, 4.5f, 19.5f, 5.0596f, 19.5f, 5.75f)
                verticalLineTo(7.75f)
                curveTo(19.5f, 8.1642f, 19.8358f, 8.5f, 20.25f, 8.5f)
                curveTo(20.6642f, 8.5f, 21.0f, 8.1642f, 21.0f, 7.75f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 4.2312f, 19.7688f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 3.0f, 15.5f, 3.3358f, 15.5f, 3.75f)
                curveTo(15.5f, 4.1642f, 15.8358f, 4.5f, 16.25f, 4.5f)
                horizontalLineTo(18.25f)
                close()
                moveTo(19.5f, 18.25f)
                curveTo(19.5f, 18.9404f, 18.9404f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 19.5f, 15.5f, 19.8358f, 15.5f, 20.25f)
                curveTo(15.5f, 20.6642f, 15.8358f, 21.0f, 16.25f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 21.0f, 21.0f, 19.7688f, 21.0f, 18.25f)
                verticalLineTo(16.25f)
                curveTo(21.0f, 15.8358f, 20.6642f, 15.5f, 20.25f, 15.5f)
                curveTo(19.8358f, 15.5f, 19.5f, 15.8358f, 19.5f, 16.25f)
                verticalLineTo(18.25f)
                close()
            }
        }
        .build()
        return _fullScreenMaximize!!
    }

private var _fullScreenMaximize: ImageVector? = null
