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

public val MaterialDesignIcons.AxisXRotateClockwise: ImageVector
    get() {
        if (_axisXRotateClockwise != null) {
            return _axisXRotateClockwise!!
        }
        _axisXRotateClockwise = Builder(name = "AxisXRotateClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                horizontalLineTo(14.91f)
                curveTo(14.57f, 6.55f, 13.4f, 4.0f, 12.0f, 4.0f)
                curveTo(10.42f, 4.0f, 9.12f, 7.27f, 9.0f, 11.42f)
                lineTo(7.0f, 12.57f)
                verticalLineTo(12.0f)
                curveTo(7.0f, 6.5f, 9.24f, 2.0f, 12.0f, 2.0f)
                curveTo(14.42f, 2.0f, 16.44f, 5.44f, 16.9f, 10.0f)
                horizontalLineTo(20.0f)
                lineTo(16.0f, 14.0f)
                lineTo(12.0f, 10.0f)
                moveTo(12.0f, 22.0f)
                curveTo(10.12f, 22.0f, 8.47f, 19.92f, 7.62f, 16.84f)
                lineTo(9.37f, 15.83f)
                curveTo(9.87f, 18.31f, 10.86f, 20.0f, 12.0f, 20.0f)
                curveTo(13.27f, 20.0f, 14.36f, 17.89f, 14.79f, 14.92f)
                lineTo(16.0f, 16.12f)
                lineTo(16.7f, 15.42f)
                curveTo(16.0f, 19.26f, 14.16f, 22.0f, 12.0f, 22.0f)
                moveTo(2.11f, 18.87f)
                lineTo(1.11f, 17.13f)
                lineTo(1.06f, 17.06f)
                lineTo(11.12f, 11.25f)
                lineTo(12.72f, 12.84f)
                lineTo(2.15f, 18.94f)
                lineTo(2.11f, 18.87f)
                moveTo(21.89f, 5.13f)
                lineTo(22.89f, 6.87f)
                lineTo(19.2f, 9.0f)
                horizontalLineTo(17.77f)
                lineTo(17.5f, 7.66f)
                lineTo(21.89f, 5.13f)
                close()
            }
        }
        .build()
        return _axisXRotateClockwise!!
    }

private var _axisXRotateClockwise: ImageVector? = null
