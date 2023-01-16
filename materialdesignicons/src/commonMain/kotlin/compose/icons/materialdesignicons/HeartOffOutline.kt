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

public val MaterialDesignIcons.HeartOffOutline: ImageVector
    get() {
        if (_heartOffOutline != null) {
            return _heartOffOutline!!
        }
        _heartOffOutline = Builder(name = "HeartOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.19f, 5.08f)
                curveTo(2.45f, 6.0f, 2.0f, 7.19f, 2.0f, 8.5f)
                curveTo(2.0f, 12.27f, 5.4f, 15.36f, 10.55f, 20.03f)
                lineTo(12.0f, 21.35f)
                lineTo(13.45f, 20.03f)
                curveTo(14.32f, 19.24f, 15.14f, 18.5f, 15.9f, 17.79f)
                lineTo(20.0f, 22.0f)
                lineTo(21.27f, 20.73f)
                moveTo(12.1f, 18.55f)
                lineTo(12.0f, 18.65f)
                lineTo(11.89f, 18.55f)
                curveTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f)
                curveTo(4.0f, 7.74f, 4.22f, 7.06f, 4.61f, 6.5f)
                lineTo(14.5f, 16.37f)
                curveTo(13.74f, 17.06f, 12.95f, 17.78f, 12.1f, 18.55f)
                moveTo(8.3f, 5.1f)
                lineTo(6.33f, 3.13f)
                curveTo(6.7f, 3.05f, 7.1f, 3.0f, 7.5f, 3.0f)
                curveTo(9.24f, 3.0f, 10.91f, 3.81f, 12.0f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f)
                curveTo(19.58f, 3.0f, 22.0f, 5.41f, 22.0f, 8.5f)
                curveTo(22.0f, 10.84f, 20.69f, 12.92f, 18.47f, 15.27f)
                lineTo(17.06f, 13.86f)
                curveTo(18.91f, 11.88f, 20.0f, 10.2f, 20.0f, 8.5f)
                curveTo(20.0f, 6.5f, 18.5f, 5.0f, 16.5f, 5.0f)
                curveTo(15.1f, 5.0f, 13.74f, 5.83f, 13.11f, 7.0f)
                horizontalLineTo(10.89f)
                curveTo(10.38f, 6.06f, 9.39f, 5.34f, 8.3f, 5.1f)
                close()
            }
        }
        .build()
        return _heartOffOutline!!
    }

private var _heartOffOutline: ImageVector? = null
