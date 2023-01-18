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

public val RegularGroup.AddSubtractCircle: ImageVector
    get() {
        if (_addSubtractCircle != null) {
            return _addSubtractCircle!!
        }
        _addSubtractCircle = Builder(name = "AddSubtractCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.25f)
                curveTo(13.0f, 14.8358f, 13.3358f, 14.5f, 13.75f, 14.5f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 14.5f, 18.0f, 14.8358f, 18.0f, 15.25f)
                curveTo(18.0f, 15.6642f, 17.6642f, 16.0f, 17.25f, 16.0f)
                horizontalLineTo(13.75f)
                curveTo(13.3358f, 16.0f, 13.0f, 15.6642f, 13.0f, 15.25f)
                close()
                moveTo(9.5f, 6.75f)
                curveTo(9.5f, 6.3358f, 9.1642f, 6.0f, 8.75f, 6.0f)
                curveTo(8.3358f, 6.0f, 8.0f, 6.3358f, 8.0f, 6.75f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 8.0f, 6.0f, 8.3358f, 6.0f, 8.75f)
                curveTo(6.0f, 9.1642f, 6.3358f, 9.5f, 6.75f, 9.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.75f)
                curveTo(8.0f, 11.1642f, 8.3358f, 11.5f, 8.75f, 11.5f)
                curveTo(9.1642f, 11.5f, 9.5f, 11.1642f, 9.5f, 10.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(10.75f)
                curveTo(11.1642f, 9.5f, 11.5f, 9.1642f, 11.5f, 8.75f)
                curveTo(11.5f, 8.3358f, 11.1642f, 8.0f, 10.75f, 8.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(6.75f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.5f)
                curveTo(16.6944f, 20.5f, 20.5f, 16.6944f, 20.5f, 12.0f)
                curveTo(20.5f, 9.9228f, 19.7549f, 8.0197f, 18.5174f, 6.5432f)
                lineTo(6.5432f, 18.5174f)
                curveTo(8.0197f, 19.7549f, 9.9228f, 20.5f, 12.0f, 20.5f)
                close()
                moveTo(5.4825f, 17.4567f)
                lineTo(17.4567f, 5.4825f)
                curveTo(15.9803f, 4.2451f, 14.0772f, 3.5f, 12.0f, 3.5f)
                curveTo(7.3056f, 3.5f, 3.5f, 7.3056f, 3.5f, 12.0f)
                curveTo(3.5f, 14.0772f, 4.2451f, 15.9803f, 5.4825f, 17.4567f)
                close()
            }
        }
        .build()
        return _addSubtractCircle!!
    }

private var _addSubtractCircle: ImageVector? = null
