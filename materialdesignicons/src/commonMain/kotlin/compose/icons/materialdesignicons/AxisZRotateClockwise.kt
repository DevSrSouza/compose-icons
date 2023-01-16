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

public val MaterialDesignIcons.AxisZRotateClockwise: ImageVector
    get() {
        if (_axisZRotateClockwise != null) {
            return _axisZRotateClockwise!!
        }
        _axisZRotateClockwise = Builder(name = "AxisZRotateClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                lineTo(10.0f, 16.0f)
                lineTo(14.0f, 20.0f)
                verticalLineTo(16.9f)
                curveTo(18.56f, 16.44f, 22.0f, 14.42f, 22.0f, 12.0f)
                curveTo(22.0f, 9.58f, 18.56f, 7.56f, 14.0f, 7.1f)
                verticalLineTo(9.09f)
                curveTo(17.45f, 9.43f, 20.0f, 10.6f, 20.0f, 12.0f)
                curveTo(20.0f, 13.4f, 17.45f, 14.57f, 14.0f, 14.91f)
                verticalLineTo(12.0f)
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 10.6f, 6.55f, 9.43f, 10.0f, 9.09f)
                verticalLineTo(7.1f)
                curveTo(5.44f, 7.56f, 2.0f, 9.58f, 2.0f, 12.0f)
                curveTo(2.0f, 14.16f, 4.74f, 16.0f, 8.58f, 16.7f)
                lineTo(7.88f, 16.0f)
                lineTo(9.08f, 14.79f)
                curveTo(6.11f, 14.36f, 4.0f, 13.27f, 4.0f, 12.0f)
                moveTo(13.0f, 2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                lineTo(13.0f, 11.0f)
                verticalLineTo(2.0f)
                moveTo(13.0f, 22.0f)
                verticalLineTo(21.0f)
                lineTo(11.0f, 19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _axisZRotateClockwise!!
    }

private var _axisZRotateClockwise: ImageVector? = null
