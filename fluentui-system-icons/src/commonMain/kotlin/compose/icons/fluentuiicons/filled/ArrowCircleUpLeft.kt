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

public val FilledGroup.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) {
            return _arrowCircleUpLeft!!
        }
        _arrowCircleUpLeft = Builder(name = "ArrowCircleUpLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(15.25f, 9.4999f)
                horizontalLineTo(10.5095f)
                lineTo(15.7777f, 14.7171f)
                curveTo(16.072f, 15.0086f, 16.0743f, 15.4834f, 15.7828f, 15.7777f)
                curveTo(15.4914f, 16.0721f, 15.0165f, 16.0744f, 14.7222f, 15.7829f)
                lineTo(9.5f, 10.6113f)
                verticalLineTo(15.2499f)
                curveTo(9.5f, 15.6641f, 9.1642f, 15.9999f, 8.75f, 15.9999f)
                curveTo(8.3358f, 15.9999f, 8.0f, 15.6641f, 8.0f, 15.2499f)
                verticalLineTo(8.7499f)
                curveTo(8.0f, 8.3357f, 8.3358f, 7.9999f, 8.75f, 7.9999f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 7.9999f, 16.0f, 8.3357f, 16.0f, 8.7499f)
                curveTo(16.0f, 9.1642f, 15.6642f, 9.4999f, 15.25f, 9.4999f)
                close()
            }
        }
        .build()
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
