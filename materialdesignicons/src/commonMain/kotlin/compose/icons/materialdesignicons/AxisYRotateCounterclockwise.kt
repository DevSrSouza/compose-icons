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

public val MaterialDesignIcons.AxisYRotateCounterclockwise: ImageVector
    get() {
        if (_axisYRotateCounterclockwise != null) {
            return _axisYRotateCounterclockwise!!
        }
        _axisYRotateCounterclockwise = Builder(name = "AxisYRotateCounterclockwise", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                horizontalLineTo(14.91f)
                curveTo(14.57f, 17.45f, 13.4f, 20.0f, 12.0f, 20.0f)
                curveTo(10.42f, 20.0f, 9.12f, 16.73f, 9.0f, 12.58f)
                lineTo(7.0f, 11.43f)
                verticalLineTo(12.0f)
                curveTo(7.0f, 17.5f, 9.24f, 22.0f, 12.0f, 22.0f)
                curveTo(14.42f, 22.0f, 16.44f, 18.56f, 16.9f, 14.0f)
                horizontalLineTo(20.0f)
                lineTo(16.0f, 10.0f)
                lineTo(12.0f, 14.0f)
                moveTo(12.0f, 2.0f)
                curveTo(10.12f, 2.0f, 8.47f, 4.08f, 7.62f, 7.16f)
                lineTo(9.37f, 8.17f)
                curveTo(9.87f, 5.69f, 10.86f, 4.0f, 12.0f, 4.0f)
                curveTo(13.27f, 4.0f, 14.36f, 6.11f, 14.79f, 9.08f)
                lineTo(16.0f, 7.88f)
                lineTo(16.7f, 8.58f)
                curveTo(16.0f, 4.74f, 14.16f, 2.0f, 12.0f, 2.0f)
                moveTo(2.11f, 5.13f)
                lineTo(1.11f, 6.87f)
                lineTo(1.06f, 6.94f)
                lineTo(11.12f, 12.75f)
                lineTo(12.72f, 11.16f)
                lineTo(2.15f, 5.06f)
                lineTo(2.11f, 5.13f)
                moveTo(21.89f, 18.87f)
                lineTo(22.89f, 17.13f)
                lineTo(19.2f, 15.0f)
                horizontalLineTo(17.77f)
                lineTo(17.5f, 16.34f)
                lineTo(21.89f, 18.87f)
                close()
            }
        }
        .build()
        return _axisYRotateCounterclockwise!!
    }

private var _axisYRotateCounterclockwise: ImageVector? = null
