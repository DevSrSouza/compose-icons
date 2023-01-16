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

public val MaterialDesignIcons.CarTractionControl: ImageVector
    get() {
        if (_carTractionControl != null) {
            return _carTractionControl!!
        }
        _carTractionControl = Builder(name = "CarTractionControl", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 11.0f)
                horizontalLineTo(10.5f)
                curveTo(10.8f, 11.0f, 11.0f, 10.8f, 11.0f, 10.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.5f)
                curveTo(19.0f, 10.8f, 19.2f, 11.0f, 19.5f, 11.0f)
                horizontalLineTo(20.5f)
                curveTo(20.8f, 11.0f, 21.0f, 10.8f, 21.0f, 10.5f)
                verticalLineTo(9.0f)
                lineTo(21.0f, 8.5f)
                verticalLineTo(6.0f)
                lineTo(19.6f, 1.7f)
                curveTo(19.5f, 1.3f, 19.1f, 1.0f, 18.7f, 1.0f)
                horizontalLineTo(11.4f)
                curveTo(11.0f, 1.0f, 10.6f, 1.3f, 10.5f, 1.7f)
                lineTo(9.0f, 6.0f)
                verticalLineTo(8.5f)
                lineTo(9.0f, 9.0f)
                verticalLineTo(10.5f)
                curveTo(9.0f, 10.8f, 9.2f, 11.0f, 9.5f, 11.0f)
                moveTo(11.3f, 2.0f)
                horizontalLineTo(18.6f)
                lineTo(19.5f, 5.0f)
                horizontalLineTo(10.4f)
                lineTo(11.3f, 2.0f)
                moveTo(12.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 22.2f, 8.1f, 21.5f, 6.6f, 20.9f)
                curveTo(4.5f, 20.1f, 2.0f, 19.2f, 2.0f, 17.0f)
                curveTo(2.0f, 14.7f, 4.3f, 14.1f, 6.2f, 13.5f)
                curveTo(7.9f, 13.1f, 9.0f, 12.7f, 9.0f, 12.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 14.3f, 8.7f, 14.9f, 6.8f, 15.5f)
                curveTo(5.1f, 15.9f, 4.0f, 16.3f, 4.0f, 17.0f)
                curveTo(4.0f, 17.8f, 5.9f, 18.5f, 7.4f, 19.1f)
                curveTo(9.5f, 19.9f, 12.0f, 20.8f, 12.0f, 23.0f)
                moveTo(22.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 22.2f, 18.1f, 21.5f, 16.6f, 20.9f)
                curveTo(14.5f, 20.1f, 12.0f, 19.2f, 12.0f, 17.0f)
                curveTo(12.0f, 14.7f, 14.3f, 14.1f, 16.2f, 13.5f)
                curveTo(17.8f, 13.0f, 19.0f, 12.7f, 19.0f, 12.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 14.3f, 18.7f, 14.9f, 16.8f, 15.5f)
                curveTo(15.2f, 15.9f, 14.0f, 16.3f, 14.0f, 17.0f)
                curveTo(14.0f, 17.8f, 15.9f, 18.5f, 17.4f, 19.1f)
                curveTo(19.5f, 19.9f, 22.0f, 20.8f, 22.0f, 23.0f)
                close()
            }
        }
        .build()
        return _carTractionControl!!
    }

private var _carTractionControl: ImageVector? = null
