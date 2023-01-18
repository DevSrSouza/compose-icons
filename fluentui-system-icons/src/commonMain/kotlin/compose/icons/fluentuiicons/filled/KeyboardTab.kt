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

public val FilledGroup.KeyboardTab: ImageVector
    get() {
        if (_keyboardTab != null) {
            return _keyboardTab!!
        }
        _keyboardTab = Builder(name = "KeyboardTab", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2071f, 11.2929f)
                lineTo(11.7071f, 4.7929f)
                curveTo(11.3166f, 4.4024f, 10.6834f, 4.4024f, 10.2929f, 4.7929f)
                curveTo(9.9324f, 5.1534f, 9.9047f, 5.7206f, 10.2097f, 6.1129f)
                lineTo(10.2929f, 6.2071f)
                lineTo(15.086f, 11.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4872f, 11.0f, 3.0645f, 11.386f, 3.0067f, 11.8834f)
                lineTo(3.0f, 12.0f)
                curveTo(3.0f, 12.5128f, 3.386f, 12.9355f, 3.8834f, 12.9933f)
                lineTo(4.0f, 13.0f)
                horizontalLineTo(15.086f)
                lineTo(10.2929f, 17.7929f)
                curveTo(9.9324f, 18.1534f, 9.9047f, 18.7206f, 10.2097f, 19.1129f)
                lineTo(10.2929f, 19.2071f)
                curveTo(10.6534f, 19.5676f, 11.2206f, 19.5953f, 11.6129f, 19.2903f)
                lineTo(11.7071f, 19.2071f)
                lineTo(18.2071f, 12.7071f)
                curveTo(18.5676f, 12.3466f, 18.5953f, 11.7794f, 18.2903f, 11.3871f)
                lineTo(18.2071f, 11.2929f)
                lineTo(11.7071f, 4.7929f)
                lineTo(18.2071f, 11.2929f)
                close()
                moveTo(21.0f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(21.0f, 4.9477f, 20.5523f, 4.5f, 20.0f, 4.5f)
                curveTo(19.4477f, 4.5f, 19.0f, 4.9477f, 19.0f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(19.0f, 19.0523f, 19.4477f, 19.5f, 20.0f, 19.5f)
                curveTo(20.5523f, 19.5f, 21.0f, 19.0523f, 21.0f, 18.5f)
                close()
            }
        }
        .build()
        return _keyboardTab!!
    }

private var _keyboardTab: ImageVector? = null
