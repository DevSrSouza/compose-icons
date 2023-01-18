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

public val RegularGroup.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = Builder(name = "Print", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7525f, 3.0f)
                curveTo(16.9951f, 3.0f, 18.0025f, 4.0074f, 18.0025f, 5.25f)
                lineTo(18.002f, 6.003f)
                lineTo(18.7525f, 6.0036f)
                curveTo(20.5469f, 6.0053f, 22.0011f, 7.4588f, 22.0038f, 9.2524f)
                lineTo(22.0071f, 15.2497f)
                curveTo(22.009f, 16.4918f, 21.0021f, 17.5002f, 19.7591f, 17.5009f)
                lineTo(18.0f, 17.5f)
                verticalLineTo(18.75f)
                curveTo(18.0f, 19.9926f, 16.9926f, 21.0f, 15.75f, 21.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 21.0f, 6.0f, 19.9926f, 6.0f, 18.75f)
                lineTo(6.0009f, 17.5f)
                lineTo(4.25f, 17.5001f)
                curveTo(3.0074f, 17.5001f, 2.0f, 16.4927f, 2.0f, 15.2501f)
                verticalLineTo(9.2536f)
                curveTo(2.0f, 7.4587f, 3.4551f, 6.0036f, 5.25f, 6.0036f)
                lineTo(5.999f, 6.003f)
                lineTo(6.0f, 5.25f)
                curveTo(6.0f, 4.0074f, 7.0074f, 3.0f, 8.25f, 3.0f)
                horizontalLineTo(15.7525f)
                close()
                moveTo(15.75f, 13.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 13.5f, 7.5f, 13.8358f, 7.5f, 14.25f)
                verticalLineTo(18.75f)
                curveTo(7.5f, 19.1642f, 7.8358f, 19.5f, 8.25f, 19.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 19.5f, 16.5f, 19.1642f, 16.5f, 18.75f)
                verticalLineTo(14.25f)
                curveTo(16.5f, 13.8358f, 16.1642f, 13.5f, 15.75f, 13.5f)
                close()
                moveTo(18.7518f, 7.5036f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 7.5036f, 3.5f, 8.2871f, 3.5f, 9.2536f)
                verticalLineTo(15.2501f)
                curveTo(3.5f, 15.6643f, 3.8358f, 16.0001f, 4.25f, 16.0001f)
                lineTo(6.0f, 16.0f)
                verticalLineTo(14.25f)
                curveTo(6.0f, 13.0074f, 7.0074f, 12.0f, 8.25f, 12.0f)
                horizontalLineTo(15.75f)
                curveTo(16.9926f, 12.0f, 18.0f, 13.0074f, 18.0f, 14.25f)
                lineTo(18.0009f, 16.0001f)
                lineTo(19.7827f, 16.0005f)
                curveTo(20.1855f, 15.9874f, 20.5077f, 15.6567f, 20.5071f, 15.2512f)
                lineTo(20.5038f, 9.254f)
                curveTo(20.5024f, 8.288f, 19.7185f, 7.5045f, 18.7518f, 7.5036f)
                close()
                moveTo(15.7525f, 4.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 4.5f, 7.5f, 4.8358f, 7.5f, 5.25f)
                lineTo(7.499f, 6.003f)
                horizontalLineTo(16.502f)
                lineTo(16.5025f, 5.25f)
                curveTo(16.5025f, 4.8358f, 16.1667f, 4.5f, 15.7525f, 4.5f)
                close()
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null
