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

public val MaterialDesignIcons.Speedometer: ImageVector
    get() {
        if (_speedometer != null) {
            return _speedometer!!
        }
        _speedometer = Builder(name = "Speedometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 13.0f)
                curveTo(9.0f, 11.88f, 9.61f, 10.9f, 10.5f, 10.39f)
                lineTo(20.21f, 4.77f)
                lineTo(14.68f, 14.35f)
                curveTo(14.18f, 15.33f, 13.17f, 16.0f, 12.0f, 16.0f)
                moveTo(12.0f, 3.0f)
                curveTo(13.81f, 3.0f, 15.5f, 3.5f, 16.97f, 4.32f)
                lineTo(14.87f, 5.53f)
                curveTo(14.0f, 5.19f, 13.0f, 5.0f, 12.0f, 5.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 13.0f)
                curveTo(4.0f, 15.21f, 4.89f, 17.21f, 6.34f, 18.65f)
                horizontalLineTo(6.35f)
                curveTo(6.74f, 19.04f, 6.74f, 19.67f, 6.35f, 20.06f)
                curveTo(5.96f, 20.45f, 5.32f, 20.45f, 4.93f, 20.07f)
                verticalLineTo(20.07f)
                curveTo(3.12f, 18.26f, 2.0f, 15.76f, 2.0f, 13.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 3.0f)
                moveTo(22.0f, 13.0f)
                curveTo(22.0f, 15.76f, 20.88f, 18.26f, 19.07f, 20.07f)
                verticalLineTo(20.07f)
                curveTo(18.68f, 20.45f, 18.05f, 20.45f, 17.66f, 20.06f)
                curveTo(17.27f, 19.67f, 17.27f, 19.04f, 17.66f, 18.65f)
                verticalLineTo(18.65f)
                curveTo(19.11f, 17.2f, 20.0f, 15.21f, 20.0f, 13.0f)
                curveTo(20.0f, 12.0f, 19.81f, 11.0f, 19.46f, 10.1f)
                lineTo(20.67f, 8.0f)
                curveTo(21.5f, 9.5f, 22.0f, 11.18f, 22.0f, 13.0f)
                close()
            }
        }
        .build()
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
