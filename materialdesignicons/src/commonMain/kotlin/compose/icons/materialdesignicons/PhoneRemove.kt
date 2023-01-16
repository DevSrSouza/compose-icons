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

public val MaterialDesignIcons.PhoneRemove: ImageVector
    get() {
        if (_phoneRemove != null) {
            return _phoneRemove!!
        }
        _phoneRemove = Builder(name = "PhoneRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                curveTo(3.4f, 3.0f, 3.0f, 3.4f, 3.0f, 4.0f)
                curveTo(3.0f, 13.4f, 10.6f, 21.0f, 20.0f, 21.0f)
                curveTo(20.6f, 21.0f, 21.0f, 20.6f, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 15.9f, 20.6f, 15.5f, 20.0f, 15.5f)
                curveTo(18.8f, 15.5f, 17.5f, 15.3f, 16.4f, 14.9f)
                curveTo(16.0f, 14.8f, 15.7f, 14.9f, 15.4f, 15.1f)
                lineTo(13.2f, 17.3f)
                curveTo(10.4f, 15.9f, 8.1f, 13.5f, 6.6f, 10.7f)
                lineTo(8.8f, 8.5f)
                curveTo(9.1f, 8.2f, 9.2f, 7.8f, 9.0f, 7.5f)
                curveTo(8.7f, 6.4f, 8.5f, 5.2f, 8.5f, 4.0f)
                curveTo(8.5f, 3.4f, 8.1f, 3.0f, 7.5f, 3.0f)
                moveTo(19.1f, 3.5f)
                lineTo(17.0f, 5.6f)
                lineTo(14.9f, 3.5f)
                lineTo(13.5f, 4.9f)
                lineTo(15.6f, 7.0f)
                lineTo(13.5f, 9.1f)
                lineTo(14.9f, 10.5f)
                lineTo(17.0f, 8.4f)
                lineTo(19.1f, 10.5f)
                lineTo(20.5f, 9.1f)
                lineTo(18.4f, 7.0f)
                lineTo(20.5f, 4.9f)
            }
        }
        .build()
        return _phoneRemove!!
    }

private var _phoneRemove: ImageVector? = null
