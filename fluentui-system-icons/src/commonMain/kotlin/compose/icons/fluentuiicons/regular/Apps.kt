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

public val RegularGroup.Apps: ImageVector
    get() {
        if (_apps != null) {
            return _apps!!
        }
        _apps = Builder(name = "Apps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4923f, 2.3309f)
                lineTo(21.671f, 5.5097f)
                curveTo(22.5497f, 6.3883f, 22.5497f, 7.813f, 21.671f, 8.6916f)
                lineTo(19.0866f, 11.2756f)
                curveTo(20.1696f, 11.438f, 21.0f, 12.3723f, 21.0f, 13.5006f)
                verticalLineTo(18.7506f)
                curveTo(21.0f, 19.9932f, 19.9926f, 21.0006f, 18.75f, 21.0006f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 21.0006f, 3.0f, 19.9932f, 3.0f, 18.7506f)
                verticalLineTo(5.2505f)
                curveTo(3.0f, 4.0079f, 4.0074f, 3.0006f, 5.25f, 3.0006f)
                horizontalLineTo(10.5f)
                curveTo(11.6289f, 3.0006f, 12.5637f, 3.832f, 12.7253f, 4.916f)
                lineTo(15.3103f, 2.3309f)
                curveTo(16.189f, 1.4522f, 17.6136f, 1.4522f, 18.4923f, 2.3309f)
                close()
                moveTo(4.5f, 18.7506f)
                curveTo(4.5f, 19.1648f, 4.8358f, 19.5006f, 5.25f, 19.5006f)
                lineTo(11.249f, 19.4999f)
                lineTo(11.25f, 12.7506f)
                lineTo(4.5f, 12.7499f)
                verticalLineTo(18.7506f)
                close()
                moveTo(12.749f, 19.4999f)
                lineTo(18.75f, 19.5006f)
                curveTo(19.1642f, 19.5006f, 19.5f, 19.1648f, 19.5f, 18.7506f)
                verticalLineTo(13.5006f)
                curveTo(19.5f, 13.0863f, 19.1642f, 12.7506f, 18.75f, 12.7506f)
                lineTo(12.749f, 12.7499f)
                verticalLineTo(19.4999f)
                close()
                moveTo(10.5f, 4.5005f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 4.5005f, 4.5f, 4.8363f, 4.5f, 5.2505f)
                verticalLineTo(11.2499f)
                horizontalLineTo(11.25f)
                verticalLineTo(5.2505f)
                curveTo(11.25f, 4.8363f, 10.9142f, 4.5005f, 10.5f, 4.5005f)
                close()
                moveTo(12.75f, 9.3099f)
                verticalLineTo(11.2506f)
                lineTo(14.69f, 11.2499f)
                lineTo(12.75f, 9.3099f)
                close()
                moveTo(16.3709f, 3.3915f)
                lineTo(13.1922f, 6.5703f)
                curveTo(12.8993f, 6.8632f, 12.8993f, 7.3381f, 13.1922f, 7.631f)
                lineTo(16.3709f, 10.8097f)
                curveTo(16.6638f, 11.1026f, 17.1387f, 11.1026f, 17.4316f, 10.8097f)
                lineTo(20.6104f, 7.631f)
                curveTo(20.9033f, 7.3381f, 20.9033f, 6.8632f, 20.6104f, 6.5703f)
                lineTo(17.4316f, 3.3915f)
                curveTo(17.1387f, 3.0986f, 16.6638f, 3.0986f, 16.3709f, 3.3915f)
                close()
            }
        }
        .build()
        return _apps!!
    }

private var _apps: ImageVector? = null
