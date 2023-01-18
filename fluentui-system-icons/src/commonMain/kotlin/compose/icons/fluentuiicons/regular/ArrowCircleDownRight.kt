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

public val RegularGroup.ArrowCircleDownRight: ImageVector
    get() {
        if (_arrowCircleDownRight != null) {
            return _arrowCircleDownRight!!
        }
        _arrowCircleDownRight = Builder(name = "ArrowCircleDownRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4905f, 14.5f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 14.5f, 8.0f, 14.8358f, 8.0f, 15.25f)
                curveTo(8.0f, 15.6642f, 8.3358f, 16.0f, 8.75f, 16.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 16.0f, 16.0f, 15.6642f, 16.0f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(16.0f, 8.3358f, 15.6642f, 8.0f, 15.25f, 8.0f)
                curveTo(14.8358f, 8.0f, 14.5f, 8.3358f, 14.5f, 8.75f)
                verticalLineTo(13.3886f)
                lineTo(9.2778f, 8.217f)
                curveTo(8.9835f, 7.9256f, 8.5086f, 7.9279f, 8.2171f, 8.2222f)
                curveTo(7.9257f, 8.5165f, 7.928f, 8.9914f, 8.2223f, 9.2828f)
                lineTo(13.4905f, 14.5f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(7.3056f, 3.5f, 3.5f, 7.3056f, 3.5f, 12.0f)
                curveTo(3.5f, 16.6944f, 7.3056f, 20.5f, 12.0f, 20.5f)
                curveTo(16.6944f, 20.5f, 20.5f, 16.6944f, 20.5f, 12.0f)
                curveTo(20.5f, 7.3056f, 16.6944f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return _arrowCircleDownRight!!
    }

private var _arrowCircleDownRight: ImageVector? = null
