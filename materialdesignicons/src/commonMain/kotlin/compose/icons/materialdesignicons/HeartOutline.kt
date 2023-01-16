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

public val MaterialDesignIcons.HeartOutline: ImageVector
    get() {
        if (_heartOutline != null) {
            return _heartOutline!!
        }
        _heartOutline = Builder(name = "HeartOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1f, 18.55f)
                lineTo(12.0f, 18.65f)
                lineTo(11.89f, 18.55f)
                curveTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f)
                curveTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f)
                curveTo(9.04f, 5.0f, 10.54f, 6.0f, 11.07f, 7.36f)
                horizontalLineTo(12.93f)
                curveTo(13.46f, 6.0f, 14.96f, 5.0f, 16.5f, 5.0f)
                curveTo(18.5f, 5.0f, 20.0f, 6.5f, 20.0f, 8.5f)
                curveTo(20.0f, 11.39f, 16.86f, 14.24f, 12.1f, 18.55f)
                moveTo(16.5f, 3.0f)
                curveTo(14.76f, 3.0f, 13.09f, 3.81f, 12.0f, 5.08f)
                curveTo(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f)
                curveTo(4.42f, 3.0f, 2.0f, 5.41f, 2.0f, 8.5f)
                curveTo(2.0f, 12.27f, 5.4f, 15.36f, 10.55f, 20.03f)
                lineTo(12.0f, 21.35f)
                lineTo(13.45f, 20.03f)
                curveTo(18.6f, 15.36f, 22.0f, 12.27f, 22.0f, 8.5f)
                curveTo(22.0f, 5.41f, 19.58f, 3.0f, 16.5f, 3.0f)
                close()
            }
        }
        .build()
        return _heartOutline!!
    }

private var _heartOutline: ImageVector? = null
