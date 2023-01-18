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

public val RegularGroup.FlowchartCircle: ImageVector
    get() {
        if (_flowchartCircle != null) {
            return _flowchartCircle!!
        }
        _flowchartCircle = Builder(name = "FlowchartCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 6.5f)
                curveTo(6.8358f, 6.5f, 6.5f, 6.8358f, 6.5f, 7.25f)
                verticalLineTo(9.75f)
                curveTo(6.5f, 10.1642f, 6.8358f, 10.5f, 7.25f, 10.5f)
                horizontalLineTo(7.75f)
                verticalLineTo(13.1893f)
                lineTo(5.9697f, 14.9697f)
                curveTo(5.6768f, 15.2626f, 5.6768f, 15.7374f, 5.9697f, 16.0303f)
                lineTo(7.9697f, 18.0303f)
                curveTo(8.2626f, 18.3232f, 8.7374f, 18.3232f, 9.0303f, 18.0303f)
                lineTo(10.8107f, 16.25f)
                horizontalLineTo(13.5f)
                verticalLineTo(16.75f)
                curveTo(13.5f, 17.1642f, 13.8358f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(16.75f)
                curveTo(17.1642f, 17.5f, 17.5f, 17.1642f, 17.5f, 16.75f)
                verticalLineTo(14.25f)
                curveTo(17.5f, 13.8358f, 17.1642f, 13.5f, 16.75f, 13.5f)
                horizontalLineTo(14.25f)
                curveTo(13.8358f, 13.5f, 13.5f, 13.8358f, 13.5f, 14.25f)
                verticalLineTo(14.75f)
                horizontalLineTo(10.8107f)
                lineTo(9.25f, 13.1893f)
                verticalLineTo(10.5f)
                horizontalLineTo(9.75f)
                curveTo(10.1642f, 10.5f, 10.5f, 10.1642f, 10.5f, 9.75f)
                verticalLineTo(7.25f)
                curveTo(10.5f, 6.8358f, 10.1642f, 6.5f, 9.75f, 6.5f)
                horizontalLineTo(7.25f)
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
        return _flowchartCircle!!
    }

private var _flowchartCircle: ImageVector? = null
