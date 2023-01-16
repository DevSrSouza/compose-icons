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

public val MaterialDesignIcons.HeartRemove: ImageVector
    get() {
        if (_heartRemove != null) {
            return _heartRemove!!
        }
        _heartRemove = Builder(name = "HeartRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(12.0f, 19.0f, 12.25f, 19.92f, 12.67f, 20.74f)
                lineTo(12.0f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2.0f, 12.27f, 2.0f, 8.5f)
                curveTo(2.0f, 5.41f, 4.42f, 3.0f, 7.5f, 3.0f)
                curveTo(9.24f, 3.0f, 10.91f, 3.81f, 12.0f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f)
                curveTo(19.58f, 3.0f, 22.0f, 5.41f, 22.0f, 8.5f)
                curveTo(22.0f, 9.93f, 21.5f, 11.26f, 20.62f, 12.61f)
                curveTo(19.83f, 12.23f, 18.94f, 12.0f, 18.0f, 12.0f)
                curveTo(14.69f, 12.0f, 12.0f, 14.69f, 12.0f, 18.0f)
                moveTo(21.54f, 15.88f)
                lineTo(20.12f, 14.47f)
                lineTo(18.0f, 16.59f)
                lineTo(15.88f, 14.47f)
                lineTo(14.47f, 15.88f)
                lineTo(16.59f, 18.0f)
                lineTo(14.47f, 20.12f)
                lineTo(15.88f, 21.54f)
                lineTo(18.0f, 19.41f)
                lineTo(20.12f, 21.54f)
                lineTo(21.54f, 20.12f)
                lineTo(19.41f, 18.0f)
                lineTo(21.54f, 15.88f)
                close()
            }
        }
        .build()
        return _heartRemove!!
    }

private var _heartRemove: ImageVector? = null
