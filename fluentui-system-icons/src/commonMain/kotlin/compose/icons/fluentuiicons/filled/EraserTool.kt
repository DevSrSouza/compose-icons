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

public val FilledGroup.EraserTool: ImageVector
    get() {
        if (_eraserTool != null) {
            return _eraserTool!!
        }
        _eraserTool = Builder(name = "EraserTool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 2.75f)
                curveTo(4.5f, 2.3358f, 4.1642f, 2.0f, 3.75f, 2.0f)
                curveTo(3.3358f, 2.0f, 3.0f, 2.3358f, 3.0f, 2.75f)
                verticalLineTo(17.25f)
                curveTo(3.0f, 19.8734f, 5.1266f, 22.0f, 7.75f, 22.0f)
                horizontalLineTo(16.25f)
                curveTo(18.8734f, 22.0f, 21.0f, 19.8734f, 21.0f, 17.25f)
                verticalLineTo(2.75f)
                curveTo(21.0f, 2.3358f, 20.6642f, 2.0f, 20.25f, 2.0f)
                curveTo(19.8358f, 2.0f, 19.5f, 2.3358f, 19.5f, 2.75f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(2.75f)
                close()
                moveTo(4.5f, 8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _eraserTool!!
    }

private var _eraserTool: ImageVector? = null
