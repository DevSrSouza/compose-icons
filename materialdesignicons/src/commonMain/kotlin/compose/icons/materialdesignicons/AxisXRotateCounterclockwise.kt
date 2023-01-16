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

public val MaterialDesignIcons.AxisXRotateCounterclockwise: ImageVector
    get() {
        if (_axisXRotateCounterclockwise != null) {
            return _axisXRotateCounterclockwise!!
        }
        _axisXRotateCounterclockwise = Builder(name = "AxisXRotateCounterclockwise", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                lineTo(16.0f, 10.0f)
                lineTo(20.0f, 14.0f)
                horizontalLineTo(16.9f)
                curveTo(16.44f, 18.56f, 14.42f, 22.0f, 12.0f, 22.0f)
                curveTo(10.12f, 22.0f, 8.47f, 19.92f, 7.62f, 16.84f)
                lineTo(9.37f, 15.83f)
                curveTo(9.87f, 18.31f, 10.86f, 20.0f, 12.0f, 20.0f)
                curveTo(13.4f, 20.0f, 14.57f, 17.45f, 14.91f, 14.0f)
                horizontalLineTo(12.0f)
                moveTo(1.11f, 17.13f)
                lineTo(13.89f, 9.75f)
                lineTo(13.96f, 10.54f)
                lineTo(10.5f, 14.0f)
                horizontalLineTo(10.54f)
                lineTo(2.11f, 18.87f)
                lineTo(1.11f, 17.13f)
                moveTo(21.89f, 5.13f)
                lineTo(22.89f, 6.87f)
                lineTo(17.88f, 9.76f)
                curveTo(17.79f, 9.03f, 17.67f, 8.33f, 17.5f, 7.66f)
                lineTo(21.89f, 5.13f)
                moveTo(12.0f, 2.0f)
                curveTo(14.3f, 2.0f, 16.23f, 5.1f, 16.82f, 9.32f)
                lineTo(16.0f, 8.5f)
                lineTo(14.87f, 9.63f)
                curveTo(14.5f, 6.37f, 13.35f, 4.0f, 12.0f, 4.0f)
                curveTo(10.42f, 4.0f, 9.12f, 7.27f, 9.0f, 11.42f)
                lineTo(7.0f, 12.57f)
                verticalLineTo(12.0f)
                curveTo(7.0f, 6.5f, 9.24f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _axisXRotateCounterclockwise!!
    }

private var _axisXRotateCounterclockwise: ImageVector? = null
