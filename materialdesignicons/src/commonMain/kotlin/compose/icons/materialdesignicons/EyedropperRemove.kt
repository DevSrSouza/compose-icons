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

public val MaterialDesignIcons.EyedropperRemove: ImageVector
    get() {
        if (_eyedropperRemove != null) {
            return _eyedropperRemove!!
        }
        _eyedropperRemove = Builder(name = "EyedropperRemove", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.35f, 11.72f)
                lineTo(17.22f, 13.85f)
                lineTo(15.81f, 12.43f)
                lineTo(8.1f, 20.14f)
                lineTo(3.5f, 22.0f)
                lineTo(2.0f, 20.5f)
                lineTo(3.86f, 15.9f)
                lineTo(11.57f, 8.19f)
                lineTo(10.15f, 6.78f)
                lineTo(12.28f, 4.65f)
                lineTo(19.35f, 11.72f)
                moveTo(16.76f, 3.0f)
                curveTo(17.93f, 1.83f, 19.83f, 1.83f, 21.0f, 3.0f)
                reflectiveCurveTo(22.17f, 6.07f, 21.0f, 7.24f)
                lineTo(19.08f, 9.16f)
                lineTo(14.84f, 4.92f)
                lineTo(16.76f, 3.0f)
                moveTo(5.56f, 17.03f)
                lineTo(4.5f, 19.5f)
                lineTo(6.97f, 18.44f)
                lineTo(14.4f, 11.0f)
                lineTo(13.0f, 9.6f)
                lineTo(5.56f, 17.03f)
                moveTo(8.54f, 2.88f)
                lineTo(6.41f, 5.0f)
                lineTo(8.54f, 7.12f)
                lineTo(7.12f, 8.54f)
                lineTo(5.0f, 6.41f)
                lineTo(2.88f, 8.54f)
                lineTo(1.46f, 7.12f)
                lineTo(3.59f, 5.0f)
                lineTo(1.46f, 2.88f)
                lineTo(2.88f, 1.47f)
                lineTo(5.0f, 3.59f)
                lineTo(7.12f, 1.47f)
                lineTo(8.54f, 2.88f)
                close()
            }
        }
        .build()
        return _eyedropperRemove!!
    }

private var _eyedropperRemove: ImageVector? = null
