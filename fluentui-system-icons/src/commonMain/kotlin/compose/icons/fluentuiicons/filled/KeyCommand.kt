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

public val FilledGroup.KeyCommand: ImageVector
    get() {
        if (_keyCommand != null) {
            return _keyCommand!!
        }
        _keyCommand = Builder(name = "KeyCommand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 5.0f)
                curveTo(7.3284f, 5.0f, 8.0f, 5.6716f, 8.0f, 6.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.5f)
                curveTo(5.6716f, 8.0f, 5.0f, 7.3284f, 5.0f, 6.5f)
                curveTo(5.0f, 5.6716f, 5.6716f, 5.0f, 6.5f, 5.0f)
                close()
                moveTo(10.0f, 8.0f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 4.567f, 8.433f, 3.0f, 6.5f, 3.0f)
                curveTo(4.567f, 3.0f, 3.0f, 4.567f, 3.0f, 6.5f)
                curveTo(3.0f, 8.433f, 4.567f, 10.0f, 6.5f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 14.0f, 3.0f, 15.567f, 3.0f, 17.5f)
                curveTo(3.0f, 19.433f, 4.567f, 21.0f, 6.5f, 21.0f)
                curveTo(8.433f, 21.0f, 10.0f, 19.433f, 10.0f, 17.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.5f)
                curveTo(14.0f, 19.433f, 15.567f, 21.0f, 17.5f, 21.0f)
                curveTo(19.433f, 21.0f, 21.0f, 19.433f, 21.0f, 17.5f)
                curveTo(21.0f, 15.567f, 19.433f, 14.0f, 17.5f, 14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 10.0f, 21.0f, 8.433f, 21.0f, 6.5f)
                curveTo(21.0f, 4.567f, 19.433f, 3.0f, 17.5f, 3.0f)
                curveTo(15.567f, 3.0f, 14.0f, 4.567f, 14.0f, 6.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineTo(6.5f)
                curveTo(16.0f, 5.6716f, 16.6716f, 5.0f, 17.5f, 5.0f)
                curveTo(18.3284f, 5.0f, 19.0f, 5.6716f, 19.0f, 6.5f)
                curveTo(19.0f, 7.3284f, 18.3284f, 8.0f, 17.5f, 8.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineTo(17.5f)
                curveTo(18.3284f, 16.0f, 19.0f, 16.6716f, 19.0f, 17.5f)
                curveTo(19.0f, 18.3284f, 18.3284f, 19.0f, 17.5f, 19.0f)
                curveTo(16.6716f, 19.0f, 16.0f, 18.3284f, 16.0f, 17.5f)
                verticalLineTo(16.0f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineTo(17.5f)
                curveTo(8.0f, 18.3284f, 7.3284f, 19.0f, 6.5f, 19.0f)
                curveTo(5.6716f, 19.0f, 5.0f, 18.3284f, 5.0f, 17.5f)
                curveTo(5.0f, 16.6716f, 5.6716f, 16.0f, 6.5f, 16.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _keyCommand!!
    }

private var _keyCommand: ImageVector? = null
