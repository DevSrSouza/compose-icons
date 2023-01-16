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

public val MaterialDesignIcons.AxisYRotateClockwise: ImageVector
    get() {
        if (_axisYRotateClockwise != null) {
            return _axisYRotateClockwise!!
        }
        _axisYRotateClockwise = Builder(name = "AxisYRotateClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                lineTo(16.0f, 14.0f)
                lineTo(20.0f, 10.0f)
                horizontalLineTo(16.9f)
                curveTo(16.44f, 5.44f, 14.42f, 2.0f, 12.0f, 2.0f)
                curveTo(10.12f, 2.0f, 8.47f, 4.08f, 7.62f, 7.16f)
                lineTo(9.37f, 8.17f)
                curveTo(9.87f, 5.69f, 10.86f, 4.0f, 12.0f, 4.0f)
                curveTo(13.4f, 4.0f, 14.57f, 6.55f, 14.91f, 10.0f)
                horizontalLineTo(12.0f)
                moveTo(1.11f, 6.87f)
                lineTo(13.89f, 14.25f)
                lineTo(13.96f, 13.46f)
                lineTo(10.5f, 10.0f)
                horizontalLineTo(10.54f)
                lineTo(2.11f, 5.13f)
                lineTo(1.11f, 6.87f)
                moveTo(21.89f, 18.87f)
                lineTo(22.89f, 17.13f)
                lineTo(17.88f, 14.24f)
                curveTo(17.79f, 14.97f, 17.67f, 15.67f, 17.5f, 16.34f)
                lineTo(21.89f, 18.87f)
                moveTo(12.0f, 22.0f)
                curveTo(14.3f, 22.0f, 16.23f, 18.9f, 16.82f, 14.68f)
                lineTo(16.0f, 15.5f)
                lineTo(14.87f, 14.37f)
                curveTo(14.5f, 17.63f, 13.35f, 20.0f, 12.0f, 20.0f)
                curveTo(10.42f, 20.0f, 9.12f, 16.73f, 9.0f, 12.58f)
                lineTo(7.0f, 11.43f)
                verticalLineTo(12.0f)
                curveTo(7.0f, 17.5f, 9.24f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _axisYRotateClockwise!!
    }

private var _axisYRotateClockwise: ImageVector? = null
