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

public val MaterialDesignIcons.PillOff: ImageVector
    get() {
        if (_pillOff != null) {
            return _pillOff!!
        }
        _pillOff = Builder(name = "PillOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(6.81f, 8.7f)
                lineTo(4.22f, 11.29f)
                curveTo(1.88f, 13.64f, 1.88f, 17.43f, 4.22f, 19.78f)
                curveTo(6.56f, 22.12f, 10.36f, 22.12f, 12.71f, 19.78f)
                lineTo(15.3f, 17.19f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(4.6f, 16.57f)
                curveTo(4.24f, 15.24f, 4.59f, 13.75f, 5.64f, 12.71f)
                lineTo(8.23f, 10.12f)
                lineTo(9.64f, 11.53f)
                lineTo(4.6f, 16.57f)
                moveTo(10.78f, 7.58f)
                lineTo(9.36f, 6.16f)
                lineTo(11.29f, 4.22f)
                curveTo(13.64f, 1.88f, 17.43f, 1.88f, 19.78f, 4.22f)
                curveTo(22.12f, 6.56f, 22.12f, 10.36f, 19.78f, 12.71f)
                lineTo(17.85f, 14.65f)
                lineTo(16.43f, 13.23f)
                lineTo(18.36f, 11.29f)
                curveTo(19.93f, 9.73f, 19.93f, 7.2f, 18.36f, 5.64f)
                curveTo(16.8f, 4.07f, 14.27f, 4.07f, 12.71f, 5.64f)
                lineTo(10.78f, 7.58f)
                close()
            }
        }
        .build()
        return _pillOff!!
    }

private var _pillOff: ImageVector? = null
