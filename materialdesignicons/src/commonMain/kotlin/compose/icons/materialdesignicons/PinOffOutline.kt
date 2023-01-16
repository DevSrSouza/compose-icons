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

public val MaterialDesignIcons.PinOffOutline: ImageVector
    get() {
        if (_pinOffOutline != null) {
            return _pinOffOutline!!
        }
        _pinOffOutline = Builder(name = "PinOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.2f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                lineTo(18.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.8f)
                lineTo(14.0f, 12.2f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.2f)
                lineTo(8.0f, 6.2f)
                moveTo(20.0f, 20.7f)
                lineTo(18.7f, 22.0f)
                lineTo(12.8f, 16.1f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.2f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                lineTo(8.0f, 12.0f)
                verticalLineTo(11.3f)
                lineTo(2.0f, 5.3f)
                lineTo(3.3f, 4.0f)
                lineTo(20.0f, 20.7f)
                moveTo(8.8f, 14.0f)
                horizontalLineTo(10.6f)
                lineTo(9.7f, 13.1f)
                lineTo(8.8f, 14.0f)
                close()
            }
        }
        .build()
        return _pinOffOutline!!
    }

private var _pinOffOutline: ImageVector? = null
