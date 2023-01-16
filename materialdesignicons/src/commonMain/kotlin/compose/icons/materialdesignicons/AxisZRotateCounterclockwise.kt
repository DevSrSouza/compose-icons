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

public val MaterialDesignIcons.AxisZRotateCounterclockwise: ImageVector
    get() {
        if (_axisZRotateCounterclockwise != null) {
            return _axisZRotateCounterclockwise!!
        }
        _axisZRotateCounterclockwise = Builder(name = "AxisZRotateCounterclockwise", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                lineTo(14.0f, 16.0f)
                lineTo(10.0f, 20.0f)
                verticalLineTo(16.9f)
                curveTo(5.44f, 16.44f, 2.0f, 14.42f, 2.0f, 12.0f)
                curveTo(2.0f, 9.58f, 5.44f, 7.56f, 10.0f, 7.1f)
                verticalLineTo(9.09f)
                curveTo(6.55f, 9.43f, 4.0f, 10.6f, 4.0f, 12.0f)
                curveTo(4.0f, 13.4f, 6.55f, 14.57f, 10.0f, 14.91f)
                verticalLineTo(12.0f)
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 10.6f, 17.45f, 9.43f, 14.0f, 9.09f)
                verticalLineTo(7.1f)
                curveTo(18.56f, 7.56f, 22.0f, 9.58f, 22.0f, 12.0f)
                curveTo(22.0f, 14.16f, 19.26f, 16.0f, 15.42f, 16.7f)
                lineTo(16.12f, 16.0f)
                lineTo(14.92f, 14.79f)
                curveTo(17.89f, 14.36f, 20.0f, 13.27f, 20.0f, 12.0f)
                moveTo(11.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                lineTo(11.0f, 11.0f)
                verticalLineTo(2.0f)
                moveTo(11.0f, 22.0f)
                verticalLineTo(21.0f)
                lineTo(13.0f, 19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _axisZRotateCounterclockwise!!
    }

private var _axisZRotateCounterclockwise: ImageVector? = null
