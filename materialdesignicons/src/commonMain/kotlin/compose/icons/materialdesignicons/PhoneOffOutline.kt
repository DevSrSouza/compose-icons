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

public val MaterialDesignIcons.PhoneOffOutline: ImageVector
    get() {
        if (_phoneOffOutline != null) {
            return _phoneOffOutline!!
        }
        _phoneOffOutline = Builder(name = "PhoneOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4f, 17.0f)
                curveTo(17.2f, 17.2f, 18.1f, 17.4f, 19.0f, 17.5f)
                verticalLineTo(19.0f)
                curveTo(17.7f, 18.9f, 16.4f, 18.7f, 15.2f, 18.2f)
                lineTo(16.4f, 17.0f)
                moveTo(20.2f, 2.5f)
                lineTo(2.5f, 20.2f)
                lineTo(3.8f, 21.5f)
                lineTo(8.7f, 16.6f)
                curveTo(11.8f, 19.4f, 15.8f, 21.0f, 20.0f, 21.0f)
                curveTo(20.6f, 21.0f, 21.0f, 20.6f, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 15.9f, 20.6f, 15.5f, 20.0f, 15.5f)
                curveTo(18.8f, 15.5f, 17.5f, 15.3f, 16.4f, 14.9f)
                horizontalLineTo(16.1f)
                curveTo(15.8f, 14.9f, 15.6f, 15.0f, 15.4f, 15.2f)
                lineTo(13.2f, 17.4f)
                curveTo(12.1f, 16.8f, 11.0f, 16.1f, 10.1f, 15.2f)
                lineTo(21.5f, 3.8f)
                lineTo(20.2f, 2.5f)
                moveTo(6.5f, 5.0f)
                curveTo(6.6f, 5.9f, 6.8f, 6.8f, 7.0f, 7.6f)
                lineTo(5.8f, 8.8f)
                curveTo(5.4f, 7.6f, 5.1f, 6.3f, 5.0f, 5.0f)
                horizontalLineTo(6.5f)
                moveTo(7.5f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4f, 3.0f, 3.0f, 3.4f, 3.0f, 4.0f)
                curveTo(3.0f, 7.6f, 4.1f, 11.0f, 6.2f, 13.9f)
                lineTo(7.6f, 12.5f)
                curveTo(7.2f, 12.0f, 6.9f, 11.4f, 6.6f, 10.8f)
                lineTo(8.8f, 8.6f)
                curveTo(9.1f, 8.3f, 9.2f, 7.9f, 9.0f, 7.6f)
                curveTo(8.7f, 6.4f, 8.5f, 5.2f, 8.5f, 4.0f)
                curveTo(8.5f, 3.4f, 8.1f, 3.0f, 7.5f, 3.0f)
                close()
            }
        }
        .build()
        return _phoneOffOutline!!
    }

private var _phoneOffOutline: ImageVector? = null
