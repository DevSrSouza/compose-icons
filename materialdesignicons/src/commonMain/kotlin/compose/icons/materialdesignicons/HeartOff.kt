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

public val MaterialDesignIcons.HeartOff: ImageVector
    get() {
        if (_heartOff != null) {
            return _heartOff!!
        }
        _heartOff = Builder(name = "HeartOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(15.18f, 18.44f)
                lineTo(13.45f, 20.03f)
                lineTo(12.0f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2.0f, 12.27f, 2.0f, 8.5f)
                curveTo(2.0f, 7.55f, 2.23f, 6.67f, 2.63f, 5.9f)
                lineTo(1.0f, 4.27f)
                moveTo(7.5f, 3.0f)
                curveTo(9.24f, 3.0f, 10.91f, 3.81f, 12.0f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f)
                curveTo(19.58f, 3.0f, 22.0f, 5.41f, 22.0f, 8.5f)
                curveTo(22.0f, 11.07f, 20.42f, 13.32f, 17.79f, 15.97f)
                lineTo(5.27f, 3.45f)
                curveTo(5.95f, 3.16f, 6.7f, 3.0f, 7.5f, 3.0f)
                close()
            }
        }
        .build()
        return _heartOff!!
    }

private var _heartOff: ImageVector? = null
