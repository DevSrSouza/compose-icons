package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.EarHearingOff: ImageVector
    get() {
        if (_earHearingOff != null) {
            return _earHearingOff!!
        }
        _earHearingOff = Builder(name = "EarHearingOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(12.91f, 16.18f)
                curveTo(12.19f, 16.74f, 11.67f, 17.19f, 11.37f, 18.1f)
                curveTo(10.77f, 19.92f, 10.0f, 20.94f, 8.64f, 21.65f)
                curveTo(8.13f, 21.88f, 7.57f, 22.0f, 7.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 3.0f, 18.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 20.0f)
                curveTo(7.29f, 20.0f, 7.56f, 19.94f, 7.76f, 19.85f)
                curveTo(8.47f, 19.5f, 8.97f, 18.97f, 9.47f, 17.47f)
                curveTo(9.91f, 16.12f, 10.69f, 15.39f, 11.5f, 14.76f)
                lineTo(5.04f, 8.31f)
                curveTo(5.0f, 8.54f, 5.0f, 8.77f, 5.0f, 9.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 8.17f, 3.14f, 7.39f, 3.39f, 6.66f)
                lineTo(1.0f, 4.27f)
                moveTo(14.18f, 11.94f)
                curveTo(14.71f, 11.0f, 15.0f, 9.93f, 15.0f, 9.0f)
                curveTo(15.0f, 6.2f, 12.8f, 4.0f, 10.0f, 4.0f)
                curveTo(8.81f, 4.0f, 7.74f, 4.39f, 6.89f, 5.06f)
                lineTo(5.46f, 3.63f)
                curveTo(6.67f, 2.61f, 8.25f, 2.0f, 10.0f, 2.0f)
                curveTo(13.93f, 2.0f, 17.0f, 5.07f, 17.0f, 9.0f)
                curveTo(17.0f, 10.26f, 16.62f, 11.65f, 15.93f, 12.9f)
                lineTo(15.47f, 13.65f)
                lineTo(14.03f, 12.2f)
                lineTo(14.18f, 11.94f)
                moveTo(16.36f, 2.64f)
                lineTo(17.78f, 1.22f)
                curveTo(19.77f, 3.21f, 21.0f, 5.96f, 21.0f, 9.0f)
                curveTo(21.0f, 11.83f, 19.93f, 14.41f, 18.18f, 16.36f)
                lineTo(16.77f, 14.94f)
                curveTo(18.15f, 13.36f, 19.0f, 11.28f, 19.0f, 9.0f)
                curveTo(19.0f, 6.5f, 18.0f, 4.26f, 16.36f, 2.64f)
                moveTo(12.5f, 9.0f)
                curveTo(12.5f, 9.5f, 12.36f, 9.93f, 12.13f, 10.31f)
                lineTo(8.69f, 6.87f)
                curveTo(9.07f, 6.64f, 9.5f, 6.5f, 10.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.5f, 9.0f)
                close()
            }
        }
        .build()
        return _earHearingOff!!
    }

private var _earHearingOff: ImageVector? = null
