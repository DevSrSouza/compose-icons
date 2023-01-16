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

public val MaterialDesignIcons.CarCruiseControl: ImageVector
    get() {
        if (_carCruiseControl != null) {
            return _carCruiseControl!!
        }
        _carCruiseControl = Builder(name = "CarCruiseControl", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                curveTo(22.0f, 17.6f, 20.8f, 19.9f, 18.9f, 21.3f)
                lineTo(18.4f, 20.8f)
                lineTo(16.3f, 18.7f)
                lineTo(17.7f, 17.3f)
                lineTo(18.9f, 18.5f)
                curveTo(19.4f, 17.8f, 19.8f, 16.9f, 19.9f, 16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.9f)
                curveTo(19.7f, 13.1f, 19.4f, 12.3f, 18.9f, 11.5f)
                lineTo(17.7f, 12.7f)
                lineTo(16.3f, 11.3f)
                lineTo(17.5f, 10.1f)
                curveTo(16.8f, 9.6f, 15.9f, 9.2f, 15.0f, 9.1f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.1f)
                curveTo(12.1f, 9.3f, 11.3f, 9.6f, 10.5f, 10.1f)
                lineTo(13.5f, 13.1f)
                curveTo(13.7f, 13.1f, 13.8f, 13.0f, 14.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.0f)
                curveTo(12.0f, 14.8f, 12.0f, 14.7f, 12.1f, 14.5f)
                lineTo(9.1f, 11.5f)
                curveTo(8.6f, 12.2f, 8.2f, 13.1f, 8.1f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.1f)
                curveTo(8.3f, 16.9f, 8.6f, 17.7f, 9.1f, 18.5f)
                lineTo(10.3f, 17.3f)
                lineTo(11.7f, 18.7f)
                lineTo(9.1f, 21.3f)
                curveTo(7.2f, 19.9f, 6.0f, 17.6f, 6.0f, 15.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 14.0f, 7.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 22.0f, 15.0f)
                moveTo(6.7f, 5.3f)
                lineTo(3.4f, 2.0f)
                lineTo(2.0f, 3.4f)
                lineTo(5.3f, 6.7f)
                lineTo(4.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                lineTo(6.7f, 5.3f)
                close()
            }
        }
        .build()
        return _carCruiseControl!!
    }

private var _carCruiseControl: ImageVector? = null
