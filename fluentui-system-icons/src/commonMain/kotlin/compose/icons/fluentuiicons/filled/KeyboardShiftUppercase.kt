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

public val FilledGroup.KeyboardShiftUppercase: ImageVector
    get() {
        if (_keyboardShiftUppercase != null) {
            return _keyboardShiftUppercase!!
        }
        _keyboardShiftUppercase = Builder(name = "KeyboardShiftUppercase", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3207f, 2.6032f)
                curveTo(12.6229f, 1.7989f, 11.3747f, 1.7989f, 10.677f, 2.6032f)
                lineTo(2.4315f, 12.107f)
                curveTo(1.4485f, 13.24f, 2.2533f, 15.0038f, 3.7534f, 15.0038f)
                horizontalLineTo(6.9994f)
                verticalLineTo(17.2508f)
                curveTo(6.9994f, 18.2173f, 7.7829f, 19.0008f, 8.7494f, 19.0008f)
                horizontalLineTo(15.2494f)
                curveTo(16.2159f, 19.0008f, 16.9994f, 18.2173f, 16.9994f, 17.2508f)
                verticalLineTo(15.0038f)
                horizontalLineTo(20.2442f)
                curveTo(21.7443f, 15.0038f, 22.5491f, 13.24f, 21.5661f, 12.107f)
                lineTo(13.3207f, 2.6032f)
                close()
                moveTo(7.75f, 20.5f)
                curveTo(7.3358f, 20.5f, 7.0f, 20.8358f, 7.0f, 21.25f)
                curveTo(7.0f, 21.6642f, 7.3358f, 22.0f, 7.75f, 22.0f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 22.0f, 17.0f, 21.6642f, 17.0f, 21.25f)
                curveTo(17.0f, 20.8358f, 16.6642f, 20.5f, 16.25f, 20.5f)
                horizontalLineTo(7.75f)
                close()
            }
        }
        .build()
        return _keyboardShiftUppercase!!
    }

private var _keyboardShiftUppercase: ImageVector? = null
