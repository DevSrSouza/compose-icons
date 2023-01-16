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

public val MaterialDesignIcons.EyedropperOff: ImageVector
    get() {
        if (_eyedropperOff != null) {
            return _eyedropperOff!!
        }
        _eyedropperOff = Builder(name = "EyedropperOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.24f)
                lineTo(19.08f, 9.16f)
                lineTo(14.84f, 4.92f)
                lineTo(16.76f, 3.0f)
                curveTo(17.93f, 1.83f, 19.83f, 1.83f, 21.0f, 3.0f)
                reflectiveCurveTo(22.17f, 6.07f, 21.0f, 7.24f)
                moveTo(10.94f, 8.82f)
                lineTo(12.36f, 10.24f)
                lineTo(13.0f, 9.6f)
                lineTo(14.4f, 11.0f)
                lineTo(13.76f, 11.64f)
                lineTo(15.18f, 13.06f)
                lineTo(15.81f, 12.43f)
                lineTo(17.22f, 13.85f)
                lineTo(19.35f, 11.72f)
                lineTo(12.28f, 4.65f)
                lineTo(10.15f, 6.78f)
                lineTo(11.57f, 8.19f)
                lineTo(10.94f, 8.82f)
                moveTo(19.86f, 20.29f)
                lineTo(18.58f, 21.57f)
                lineTo(12.63f, 15.61f)
                lineTo(8.1f, 20.14f)
                lineTo(3.5f, 22.0f)
                lineTo(2.0f, 20.5f)
                lineTo(3.86f, 15.9f)
                lineTo(8.39f, 11.37f)
                lineTo(1.86f, 4.85f)
                lineTo(3.14f, 3.57f)
                lineTo(19.86f, 20.29f)
                moveTo(11.21f, 14.2f)
                lineTo(9.81f, 12.79f)
                lineTo(5.56f, 17.03f)
                lineTo(4.5f, 19.5f)
                lineTo(6.97f, 18.44f)
                lineTo(11.21f, 14.2f)
                close()
            }
        }
        .build()
        return _eyedropperOff!!
    }

private var _eyedropperOff: ImageVector? = null
