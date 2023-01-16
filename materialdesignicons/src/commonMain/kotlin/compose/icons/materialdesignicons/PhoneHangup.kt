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

public val MaterialDesignIcons.PhoneHangup: ImageVector
    get() {
        if (_phoneHangup != null) {
            return _phoneHangup!!
        }
        _phoneHangup = Builder(name = "PhoneHangup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveTo(10.4f, 9.0f, 8.85f, 9.25f, 7.4f, 9.72f)
                verticalLineTo(12.82f)
                curveTo(7.4f, 13.22f, 7.17f, 13.56f, 6.84f, 13.72f)
                curveTo(5.86f, 14.21f, 4.97f, 14.84f, 4.17f, 15.57f)
                curveTo(4.0f, 15.75f, 3.75f, 15.86f, 3.5f, 15.86f)
                curveTo(3.2f, 15.86f, 2.95f, 15.74f, 2.77f, 15.56f)
                lineTo(0.29f, 13.08f)
                curveTo(0.11f, 12.9f, 0.0f, 12.65f, 0.0f, 12.38f)
                curveTo(0.0f, 12.1f, 0.11f, 11.85f, 0.29f, 11.67f)
                curveTo(3.34f, 8.77f, 7.46f, 7.0f, 12.0f, 7.0f)
                curveTo(16.54f, 7.0f, 20.66f, 8.77f, 23.71f, 11.67f)
                curveTo(23.89f, 11.85f, 24.0f, 12.1f, 24.0f, 12.38f)
                curveTo(24.0f, 12.65f, 23.89f, 12.9f, 23.71f, 13.08f)
                lineTo(21.23f, 15.56f)
                curveTo(21.05f, 15.74f, 20.8f, 15.86f, 20.5f, 15.86f)
                curveTo(20.25f, 15.86f, 20.0f, 15.75f, 19.82f, 15.57f)
                curveTo(19.03f, 14.84f, 18.14f, 14.21f, 17.16f, 13.72f)
                curveTo(16.83f, 13.56f, 16.6f, 13.22f, 16.6f, 12.82f)
                verticalLineTo(9.72f)
                curveTo(15.15f, 9.25f, 13.6f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _phoneHangup!!
    }

private var _phoneHangup: ImageVector? = null
