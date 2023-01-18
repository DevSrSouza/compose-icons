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

public val RegularGroup.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) {
            return _arrowCircleUpLeft!!
        }
        _arrowCircleUpLeft = Builder(name = "ArrowCircleUpLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5095f, 9.5f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 9.5f, 16.0f, 9.1642f, 16.0f, 8.75f)
                curveTo(16.0f, 8.3358f, 15.6642f, 8.0f, 15.25f, 8.0f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 8.0f, 8.0f, 8.3358f, 8.0f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(8.0f, 15.6642f, 8.3358f, 16.0f, 8.75f, 16.0f)
                curveTo(9.1642f, 16.0f, 9.5f, 15.6642f, 9.5f, 15.25f)
                verticalLineTo(10.6114f)
                lineTo(14.7222f, 15.783f)
                curveTo(15.0165f, 16.0744f, 15.4914f, 16.0721f, 15.7828f, 15.7778f)
                curveTo(16.0743f, 15.4835f, 16.072f, 15.0086f, 15.7777f, 14.7172f)
                lineTo(10.5095f, 9.5f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(12.0f, 20.5f)
                curveTo(16.6944f, 20.5f, 20.5f, 16.6944f, 20.5f, 12.0f)
                curveTo(20.5f, 7.3056f, 16.6944f, 3.5f, 12.0f, 3.5f)
                curveTo(7.3056f, 3.5f, 3.5f, 7.3056f, 3.5f, 12.0f)
                curveTo(3.5f, 16.6944f, 7.3056f, 20.5f, 12.0f, 20.5f)
                close()
            }
        }
        .build()
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
