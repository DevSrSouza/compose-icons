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

public val FilledGroup.ProjectionScreen: ImageVector
    get() {
        if (_projectionScreen != null) {
            return _projectionScreen!!
        }
        _projectionScreen = Builder(name = "ProjectionScreen", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 3.0f)
                curveTo(2.6716f, 3.0f, 2.0f, 3.6716f, 2.0f, 4.5f)
                curveTo(2.0f, 5.1531f, 2.4174f, 5.7087f, 3.0f, 5.9146f)
                verticalLineTo(13.25f)
                curveTo(3.0f, 15.3211f, 4.6789f, 17.0f, 6.75f, 17.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 19.5f, 7.0f, 19.8358f, 7.0f, 20.25f)
                curveTo(7.0f, 20.6642f, 7.3358f, 21.0f, 7.75f, 21.0f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 21.0f, 17.0f, 20.6642f, 17.0f, 20.25f)
                curveTo(17.0f, 19.8358f, 16.6642f, 19.5f, 16.25f, 19.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.25f)
                curveTo(19.3211f, 17.0f, 21.0f, 15.3211f, 21.0f, 13.25f)
                verticalLineTo(5.9146f)
                curveTo(21.5826f, 5.7087f, 22.0f, 5.1531f, 22.0f, 4.5f)
                curveTo(22.0f, 3.6716f, 21.3284f, 3.0f, 20.5f, 3.0f)
                horizontalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _projectionScreen!!
    }

private var _projectionScreen: ImageVector? = null
