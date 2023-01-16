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

public val MaterialDesignIcons.Jquery: ImageVector
    get() {
        if (_jquery != null) {
            return _jquery!!
        }
        _jquery = Builder(name = "Jquery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.88f, 10.41f)
                curveTo(20.77f, 12.18f, 17.61f, 11.9f, 15.84f, 9.79f)
                curveTo(14.06f, 7.67f, 14.34f, 4.5f, 16.45f, 2.75f)
                lineTo(16.96f, 2.37f)
                curveTo(15.27f, 4.19f, 15.16f, 7.03f, 16.8f, 9.0f)
                curveTo(18.43f, 10.94f, 21.25f, 11.32f, 23.34f, 9.97f)
                lineTo(22.88f, 10.41f)
                moveTo(21.1f, 14.5f)
                curveTo(17.93f, 17.17f, 13.2f, 16.76f, 10.54f, 13.58f)
                curveTo(7.87f, 10.41f, 8.29f, 5.68f, 11.46f, 3.0f)
                lineTo(12.38f, 2.36f)
                curveTo(9.96f, 5.09f, 9.84f, 9.26f, 12.26f, 12.14f)
                curveTo(14.68f, 15.0f, 18.8f, 15.63f, 21.91f, 13.72f)
                lineTo(21.1f, 14.5f)
                moveTo(19.97f, 19.38f)
                curveTo(15.53f, 23.11f, 8.9f, 22.53f, 5.17f, 18.08f)
                curveTo(1.45f, 13.64f, 2.03f, 7.0f, 6.47f, 3.29f)
                lineTo(7.58f, 2.5f)
                curveTo(4.07f, 6.3f, 3.85f, 12.23f, 7.28f, 16.32f)
                curveTo(10.71f, 20.4f, 16.59f, 21.22f, 20.96f, 18.43f)
                lineTo(19.97f, 19.38f)
                close()
            }
        }
        .build()
        return _jquery!!
    }

private var _jquery: ImageVector? = null
