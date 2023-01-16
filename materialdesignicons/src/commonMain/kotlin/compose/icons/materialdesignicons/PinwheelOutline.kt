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

public val MaterialDesignIcons.PinwheelOutline: ImageVector
    get() {
        if (_pinwheelOutline != null) {
            return _pinwheelOutline!!
        }
        _pinwheelOutline = Builder(name = "PinwheelOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.43f)
                curveTo(9.93f, 17.4f, 8.5f, 18.0f, 7.0f, 18.0f)
                curveTo(3.75f, 18.0f, 1.0f, 15.25f, 1.0f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.57f)
                curveTo(6.6f, 9.93f, 6.0f, 8.5f, 6.0f, 7.0f)
                curveTo(6.0f, 3.75f, 8.75f, 1.0f, 12.0f, 1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.57f)
                curveTo(14.07f, 6.6f, 15.5f, 6.0f, 17.0f, 6.0f)
                curveTo(20.25f, 6.0f, 23.0f, 8.75f, 23.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.43f)
                curveTo(17.4f, 14.07f, 18.0f, 15.5f, 18.0f, 17.0f)
                curveTo(18.0f, 20.25f, 15.25f, 23.0f, 12.0f, 23.0f)
                moveTo(13.0f, 13.13f)
                verticalLineTo(20.87f)
                curveTo(14.7f, 20.41f, 16.0f, 18.83f, 16.0f, 17.0f)
                curveTo(16.0f, 15.17f, 14.7f, 13.59f, 13.0f, 13.13f)
                moveTo(3.13f, 13.0f)
                curveTo(3.59f, 14.7f, 5.17f, 16.0f, 7.0f, 16.0f)
                curveTo(8.83f, 16.0f, 10.41f, 14.7f, 10.87f, 13.0f)
                horizontalLineTo(3.13f)
                moveTo(13.13f, 11.0f)
                horizontalLineTo(20.87f)
                curveTo(20.41f, 9.3f, 18.82f, 8.0f, 17.0f, 8.0f)
                curveTo(15.18f, 8.0f, 13.59f, 9.3f, 13.13f, 11.0f)
                moveTo(11.0f, 3.13f)
                curveTo(9.3f, 3.59f, 8.0f, 5.18f, 8.0f, 7.0f)
                curveTo(8.0f, 8.82f, 9.3f, 10.41f, 11.0f, 10.87f)
                verticalLineTo(3.13f)
                close()
            }
        }
        .build()
        return _pinwheelOutline!!
    }

private var _pinwheelOutline: ImageVector? = null
