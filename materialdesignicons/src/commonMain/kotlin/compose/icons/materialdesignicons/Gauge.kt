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

public val MaterialDesignIcons.Gauge: ImageVector
    get() {
        if (_gauge != null) {
            return _gauge!!
        }
        _gauge = Builder(name = "Gauge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                curveTo(20.0f, 14.4f, 19.0f, 16.5f, 17.3f, 18.0f)
                curveTo(15.9f, 16.7f, 14.0f, 16.0f, 12.0f, 16.0f)
                curveTo(10.0f, 16.0f, 8.2f, 16.7f, 6.7f, 18.0f)
                curveTo(5.0f, 16.5f, 4.0f, 14.4f, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                moveTo(14.0f, 5.89f)
                curveTo(13.62f, 5.9f, 13.26f, 6.15f, 13.1f, 6.54f)
                lineTo(11.81f, 9.77f)
                lineTo(11.71f, 10.0f)
                curveTo(11.0f, 10.13f, 10.41f, 10.6f, 10.14f, 11.26f)
                curveTo(9.73f, 12.29f, 10.23f, 13.45f, 11.26f, 13.86f)
                curveTo(12.29f, 14.27f, 13.45f, 13.77f, 13.86f, 12.74f)
                curveTo(14.12f, 12.08f, 14.0f, 11.32f, 13.57f, 10.76f)
                lineTo(13.67f, 10.5f)
                lineTo(14.96f, 7.29f)
                lineTo(14.97f, 7.26f)
                curveTo(15.17f, 6.75f, 14.92f, 6.17f, 14.41f, 5.96f)
                curveTo(14.28f, 5.91f, 14.15f, 5.89f, 14.0f, 5.89f)
                moveTo(10.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 6.0f)
                moveTo(7.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 9.0f)
                moveTo(17.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 9.0f)
                close()
            }
        }
        .build()
        return _gauge!!
    }

private var _gauge: ImageVector? = null
