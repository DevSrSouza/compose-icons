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

public val RegularGroup.FullScreenMinimize: ImageVector
    get() {
        if (_fullScreenMinimize != null) {
            return _fullScreenMinimize!!
        }
        _fullScreenMinimize = Builder(name = "FullScreenMinimize", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 3.75f)
                curveTo(8.5f, 3.3358f, 8.1642f, 3.0f, 7.75f, 3.0f)
                curveTo(7.3358f, 3.0f, 7.0f, 3.3358f, 7.0f, 3.75f)
                verticalLineTo(6.25f)
                curveTo(7.0f, 6.6642f, 6.6642f, 7.0f, 6.25f, 7.0f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 7.0f, 3.0f, 7.3358f, 3.0f, 7.75f)
                curveTo(3.0f, 8.1642f, 3.3358f, 8.5f, 3.75f, 8.5f)
                horizontalLineTo(6.25f)
                curveTo(7.4926f, 8.5f, 8.5f, 7.4926f, 8.5f, 6.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(8.5f, 20.25f)
                curveTo(8.5f, 20.6642f, 8.1642f, 21.0f, 7.75f, 21.0f)
                curveTo(7.3358f, 21.0f, 7.0f, 20.6642f, 7.0f, 20.25f)
                verticalLineTo(17.75f)
                curveTo(7.0f, 17.3358f, 6.6642f, 17.0f, 6.25f, 17.0f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 17.0f, 3.0f, 16.6642f, 3.0f, 16.25f)
                curveTo(3.0f, 15.8358f, 3.3358f, 15.5f, 3.75f, 15.5f)
                horizontalLineTo(6.25f)
                curveTo(7.4926f, 15.5f, 8.5f, 16.5074f, 8.5f, 17.75f)
                verticalLineTo(20.25f)
                close()
                moveTo(16.25f, 3.0f)
                curveTo(15.8358f, 3.0f, 15.5f, 3.3358f, 15.5f, 3.75f)
                verticalLineTo(6.25f)
                curveTo(15.5f, 7.4926f, 16.5074f, 8.5f, 17.75f, 8.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 8.5f, 21.0f, 8.1642f, 21.0f, 7.75f)
                curveTo(21.0f, 7.3358f, 20.6642f, 7.0f, 20.25f, 7.0f)
                horizontalLineTo(17.75f)
                curveTo(17.3358f, 7.0f, 17.0f, 6.6642f, 17.0f, 6.25f)
                verticalLineTo(3.75f)
                curveTo(17.0f, 3.3358f, 16.6642f, 3.0f, 16.25f, 3.0f)
                close()
                moveTo(15.5f, 20.25f)
                curveTo(15.5f, 20.6642f, 15.8358f, 21.0f, 16.25f, 21.0f)
                curveTo(16.6642f, 21.0f, 17.0f, 20.6642f, 17.0f, 20.25f)
                verticalLineTo(17.75f)
                curveTo(17.0f, 17.3358f, 17.3358f, 17.0f, 17.75f, 17.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 17.0f, 21.0f, 16.6642f, 21.0f, 16.25f)
                curveTo(21.0f, 15.8358f, 20.6642f, 15.5f, 20.25f, 15.5f)
                horizontalLineTo(17.75f)
                curveTo(16.5074f, 15.5f, 15.5f, 16.5074f, 15.5f, 17.75f)
                verticalLineTo(20.25f)
                close()
            }
        }
        .build()
        return _fullScreenMinimize!!
    }

private var _fullScreenMinimize: ImageVector? = null
