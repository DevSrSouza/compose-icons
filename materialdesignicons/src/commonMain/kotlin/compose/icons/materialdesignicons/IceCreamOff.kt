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

public val MaterialDesignIcons.IceCreamOff: ImageVector
    get() {
        if (_iceCreamOff != null) {
            return _iceCreamOff!!
        }
        _iceCreamOff = Builder(name = "IceCreamOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.95f, 6.84f)
                curveTo(4.37f, 7.38f, 4.0f, 8.14f, 4.0f, 9.0f)
                curveTo(4.0f, 10.66f, 5.34f, 12.0f, 7.0f, 12.0f)
                lineTo(12.0f, 22.0f)
                lineTo(14.7f, 16.59f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12.0f, 17.53f)
                lineTo(8.89f, 11.31f)
                curveTo(8.95f, 11.26f, 9.0f, 11.21f, 9.08f, 11.16f)
                curveTo(9.21f, 11.24f, 9.35f, 11.3f, 9.5f, 11.37f)
                lineTo(13.21f, 15.1f)
                lineTo(12.0f, 17.53f)
                moveTo(7.15f, 3.95f)
                curveTo(8.07f, 2.2f, 9.89f, 1.0f, 12.0f, 1.0f)
                curveTo(14.89f, 1.0f, 17.25f, 3.22f, 17.5f, 6.05f)
                curveTo(18.91f, 6.28f, 20.0f, 7.5f, 20.0f, 9.0f)
                curveTo(20.0f, 10.66f, 18.66f, 12.0f, 17.0f, 12.0f)
                lineTo(16.4f, 13.2f)
                lineTo(7.15f, 3.95f)
                close()
            }
        }
        .build()
        return _iceCreamOff!!
    }

private var _iceCreamOff: ImageVector? = null
