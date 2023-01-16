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

public val MaterialDesignIcons.Tire: ImageVector
    get() {
        if (_tire != null) {
            return _tire!!
        }
        _tire = Builder(name = "Tire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.66f, 9.64f)
                lineTo(19.3f, 8.7f)
                lineTo(21.16f, 8.0f)
                curveTo(20.24f, 5.88f, 18.6f, 4.18f, 16.54f, 3.14f)
                lineTo(15.74f, 4.92f)
                lineTo(14.82f, 4.5f)
                lineTo(15.62f, 2.7f)
                curveTo(14.5f, 2.26f, 13.28f, 2.0f, 12.0f, 2.0f)
                curveTo(10.94f, 2.0f, 9.92f, 2.22f, 8.96f, 2.5f)
                lineTo(9.64f, 4.34f)
                lineTo(8.7f, 4.7f)
                lineTo(8.0f, 2.84f)
                curveTo(5.88f, 3.76f, 4.18f, 5.4f, 3.14f, 7.46f)
                lineTo(4.92f, 8.26f)
                lineTo(4.5f, 9.18f)
                lineTo(2.7f, 8.38f)
                curveTo(2.26f, 9.5f, 2.0f, 10.72f, 2.0f, 12.0f)
                curveTo(2.0f, 13.06f, 2.22f, 14.08f, 2.5f, 15.04f)
                lineTo(4.34f, 14.36f)
                lineTo(4.7f, 15.3f)
                lineTo(2.84f, 16.0f)
                curveTo(3.76f, 18.12f, 5.4f, 19.82f, 7.46f, 20.86f)
                lineTo(8.26f, 19.08f)
                lineTo(9.18f, 19.5f)
                lineTo(8.38f, 21.3f)
                curveTo(9.5f, 21.74f, 10.72f, 22.0f, 12.0f, 22.0f)
                curveTo(13.06f, 22.0f, 14.08f, 21.78f, 15.04f, 21.5f)
                lineTo(14.36f, 19.66f)
                lineTo(15.3f, 19.3f)
                lineTo(16.0f, 21.16f)
                curveTo(18.12f, 20.24f, 19.82f, 18.6f, 20.86f, 16.54f)
                lineTo(19.08f, 15.74f)
                lineTo(19.5f, 14.82f)
                lineTo(21.3f, 15.62f)
                curveTo(21.74f, 14.5f, 22.0f, 13.28f, 22.0f, 12.0f)
                curveTo(22.0f, 10.94f, 21.78f, 9.92f, 21.5f, 8.96f)
                lineTo(19.66f, 9.64f)
                moveTo(14.3f, 17.54f)
                curveTo(11.24f, 18.8f, 7.72f, 17.36f, 6.46f, 14.3f)
                reflectiveCurveTo(6.64f, 7.72f, 9.7f, 6.46f)
                reflectiveCurveTo(16.28f, 6.64f, 17.54f, 9.7f)
                curveTo(18.82f, 12.76f, 17.36f, 16.28f, 14.3f, 17.54f)
                close()
            }
        }
        .build()
        return _tire!!
    }

private var _tire: ImageVector? = null
