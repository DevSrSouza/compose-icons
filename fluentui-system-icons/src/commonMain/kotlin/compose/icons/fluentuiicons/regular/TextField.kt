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

public val RegularGroup.TextField: ImageVector
    get() {
        if (_textField != null) {
            return _textField!!
        }
        _textField = Builder(name = "TextField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 15.5f, 14.0f, 15.8358f, 14.0f, 16.25f)
                curveTo(14.0f, 16.6642f, 13.6642f, 17.0f, 13.25f, 17.0f)
                horizontalLineTo(10.75f)
                curveTo(10.3358f, 17.0f, 10.0f, 16.6642f, 10.0f, 16.25f)
                curveTo(10.0f, 15.8358f, 10.3358f, 15.5f, 10.75f, 15.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.2501f)
                curveTo(9.0f, 9.6643f, 8.6642f, 10.0001f, 8.25f, 10.0001f)
                curveTo(7.8358f, 10.0001f, 7.5f, 9.6643f, 7.5f, 9.2501f)
                verticalLineTo(7.75f)
                curveTo(7.5f, 7.3358f, 7.8358f, 7.0f, 8.25f, 7.0f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 7.0f, 16.5f, 7.3358f, 16.5f, 7.75f)
                verticalLineTo(9.2501f)
                curveTo(16.5f, 9.6643f, 16.1642f, 10.0001f, 15.75f, 10.0001f)
                curveTo(15.3358f, 10.0001f, 15.0f, 9.6643f, 15.0f, 9.2501f)
                verticalLineTo(8.5f)
                close()
                moveTo(5.75f, 4.0f)
                curveTo(3.6789f, 4.0f, 2.0f, 5.6789f, 2.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(2.0f, 18.3211f, 3.6789f, 20.0f, 5.75f, 20.0f)
                horizontalLineTo(18.25f)
                curveTo(20.3211f, 20.0f, 22.0f, 18.3211f, 22.0f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(22.0f, 5.6789f, 20.3211f, 4.0f, 18.25f, 4.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(3.5f, 7.75f)
                curveTo(3.5f, 6.5074f, 4.5074f, 5.5f, 5.75f, 5.5f)
                horizontalLineTo(18.25f)
                curveTo(19.4926f, 5.5f, 20.5f, 6.5074f, 20.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(20.5f, 17.4926f, 19.4926f, 18.5f, 18.25f, 18.5f)
                horizontalLineTo(5.75f)
                curveTo(4.5074f, 18.5f, 3.5f, 17.4926f, 3.5f, 16.25f)
                verticalLineTo(7.75f)
                close()
            }
        }
        .build()
        return _textField!!
    }

private var _textField: ImageVector? = null
