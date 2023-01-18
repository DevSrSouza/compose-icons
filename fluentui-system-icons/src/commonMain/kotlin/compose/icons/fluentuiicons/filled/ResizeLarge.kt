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

public val FilledGroup.ResizeLarge: ImageVector
    get() {
        if (_resizeLarge != null) {
            return _resizeLarge!!
        }
        _resizeLarge = Builder(name = "ResizeLarge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(7.75f)
                curveTo(8.1642f, 4.5f, 8.5f, 4.1642f, 8.5f, 3.75f)
                curveTo(8.5f, 3.3358f, 8.1642f, 3.0f, 7.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(7.75f)
                curveTo(3.0f, 8.1642f, 3.3358f, 8.5f, 3.75f, 8.5f)
                curveTo(4.1642f, 8.5f, 4.5f, 8.1642f, 4.5f, 7.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(17.75f, 4.5f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(7.75f)
                curveTo(19.5f, 8.1642f, 19.8358f, 8.5f, 20.25f, 8.5f)
                curveTo(20.6642f, 8.5f, 21.0f, 8.1642f, 21.0f, 7.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 3.0f, 15.5f, 3.3358f, 15.5f, 3.75f)
                curveTo(15.5f, 4.1642f, 15.8358f, 4.5f, 16.25f, 4.5f)
                lineTo(17.75f, 4.5f)
                close()
                moveTo(17.75f, 19.5f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(19.5f, 15.8358f, 19.8358f, 15.5f, 20.25f, 15.5f)
                curveTo(20.6642f, 15.5f, 21.0f, 15.8358f, 21.0f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 21.0f, 15.5f, 20.6642f, 15.5f, 20.25f)
                curveTo(15.5f, 19.8358f, 15.8358f, 19.5f, 16.25f, 19.5f)
                horizontalLineTo(17.75f)
                close()
                moveTo(6.25f, 19.5f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                lineTo(4.5f, 16.25f)
                curveTo(4.5f, 15.8358f, 4.1642f, 15.5f, 3.75f, 15.5f)
                curveTo(3.3358f, 15.5f, 3.0f, 15.8358f, 3.0f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(7.75f)
                curveTo(8.1642f, 21.0f, 8.5f, 20.6642f, 8.5f, 20.25f)
                curveTo(8.5f, 19.8358f, 8.1642f, 19.5f, 7.75f, 19.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(8.2501f, 6.0f)
                curveTo(7.0075f, 6.0f, 6.0001f, 7.0074f, 6.0001f, 8.25f)
                verticalLineTo(15.7498f)
                curveTo(6.0001f, 16.9925f, 7.0075f, 17.9998f, 8.2501f, 17.9998f)
                horizontalLineTo(15.7499f)
                curveTo(16.9926f, 17.9998f, 17.9999f, 16.9925f, 17.9999f, 15.7498f)
                verticalLineTo(8.25f)
                curveTo(17.9999f, 7.0074f, 16.9926f, 6.0f, 15.7499f, 6.0f)
                horizontalLineTo(8.2501f)
                close()
            }
        }
        .build()
        return _resizeLarge!!
    }

private var _resizeLarge: ImageVector? = null
