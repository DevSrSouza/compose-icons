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

public val MaterialDesignIcons.Awning: ImageVector
    get() {
        if (_awning != null) {
            return _awning!!
        }
        _awning = Builder(name = "Awning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.06f, 7.0f)
                curveTo(4.63f, 7.0f, 4.22f, 7.14f, 3.84f, 7.42f)
                curveTo(3.46f, 7.7f, 3.24f, 8.06f, 3.14f, 8.5f)
                lineTo(2.11f, 12.91f)
                curveTo(1.86f, 14.0f, 2.06f, 14.92f, 2.69f, 15.73f)
                curveTo(2.81f, 15.85f, 2.93f, 15.97f, 3.04f, 16.07f)
                curveTo(3.63f, 16.64f, 4.28f, 17.0f, 5.22f, 17.0f)
                curveTo(6.16f, 17.0f, 6.91f, 16.59f, 7.47f, 16.05f)
                curveTo(8.1f, 16.67f, 8.86f, 17.0f, 9.8f, 17.0f)
                curveTo(10.64f, 17.0f, 11.44f, 16.63f, 12.0f, 16.07f)
                curveTo(12.68f, 16.7f, 13.45f, 17.0f, 14.3f, 17.0f)
                curveTo(15.17f, 17.0f, 15.91f, 16.67f, 16.54f, 16.05f)
                curveTo(17.11f, 16.62f, 17.86f, 17.0f, 18.81f, 17.0f)
                curveTo(19.76f, 17.0f, 20.43f, 16.65f, 21.0f, 16.06f)
                curveTo(21.09f, 15.97f, 21.18f, 15.87f, 21.28f, 15.77f)
                curveTo(21.94f, 14.95f, 22.14f, 14.0f, 21.89f, 12.91f)
                lineTo(20.86f, 8.5f)
                curveTo(20.73f, 8.06f, 20.5f, 7.7f, 20.13f, 7.42f)
                curveTo(19.77f, 7.14f, 19.38f, 7.0f, 18.94f, 7.0f)
                horizontalLineTo(5.06f)
                close()
            }
        }
        .build()
        return _awning!!
    }

private var _awning: ImageVector? = null
