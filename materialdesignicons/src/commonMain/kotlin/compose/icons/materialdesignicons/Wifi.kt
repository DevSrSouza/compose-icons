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

public val MaterialDesignIcons.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                lineTo(15.6f, 16.2f)
                curveTo(14.6f, 15.45f, 13.35f, 15.0f, 12.0f, 15.0f)
                curveTo(10.65f, 15.0f, 9.4f, 15.45f, 8.4f, 16.2f)
                lineTo(12.0f, 21.0f)
                moveTo(12.0f, 3.0f)
                curveTo(7.95f, 3.0f, 4.21f, 4.34f, 1.2f, 6.6f)
                lineTo(3.0f, 9.0f)
                curveTo(5.5f, 7.12f, 8.62f, 6.0f, 12.0f, 6.0f)
                curveTo(15.38f, 6.0f, 18.5f, 7.12f, 21.0f, 9.0f)
                lineTo(22.8f, 6.6f)
                curveTo(19.79f, 4.34f, 16.05f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 9.0f)
                curveTo(9.3f, 9.0f, 6.81f, 9.89f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12.0f, 12.0f, 12.0f)
                curveTo(14.03f, 12.0f, 15.9f, 12.67f, 17.4f, 13.8f)
                lineTo(19.2f, 11.4f)
                curveTo(17.19f, 9.89f, 14.7f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
