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

public val FilledGroup.TextField: ImageVector
    get() {
        if (_textField != null) {
            return _textField!!
        }
        _textField = Builder(name = "TextField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.75f)
                curveTo(2.0f, 5.6789f, 3.6789f, 4.0f, 5.75f, 4.0f)
                horizontalLineTo(18.25f)
                curveTo(20.3211f, 4.0f, 22.0f, 5.6789f, 22.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(22.0f, 18.3211f, 20.3211f, 20.0f, 18.25f, 20.0f)
                horizontalLineTo(5.75f)
                curveTo(3.6789f, 20.0f, 2.0f, 18.3211f, 2.0f, 16.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(8.25f, 7.0f)
                curveTo(7.8358f, 7.0f, 7.5f, 7.3358f, 7.5f, 7.75f)
                verticalLineTo(9.2501f)
                curveTo(7.5f, 9.6643f, 7.8358f, 10.0001f, 8.25f, 10.0001f)
                curveTo(8.6642f, 10.0001f, 9.0f, 9.6643f, 9.0f, 9.2501f)
                verticalLineTo(8.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(15.5f)
                horizontalLineTo(10.75f)
                curveTo(10.3358f, 15.5f, 10.0f, 15.8358f, 10.0f, 16.25f)
                curveTo(10.0f, 16.6642f, 10.3358f, 17.0f, 10.75f, 17.0f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 17.0f, 14.0f, 16.6642f, 14.0f, 16.25f)
                curveTo(14.0f, 15.8358f, 13.6642f, 15.5f, 13.25f, 15.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.2501f)
                curveTo(15.0f, 9.6643f, 15.3358f, 10.0001f, 15.75f, 10.0001f)
                curveTo(16.1642f, 10.0001f, 16.5f, 9.6643f, 16.5f, 9.2501f)
                verticalLineTo(7.75f)
                curveTo(16.5f, 7.3358f, 16.1642f, 7.0f, 15.75f, 7.0f)
                horizontalLineTo(8.25f)
                close()
            }
        }
        .build()
        return _textField!!
    }

private var _textField: ImageVector? = null
