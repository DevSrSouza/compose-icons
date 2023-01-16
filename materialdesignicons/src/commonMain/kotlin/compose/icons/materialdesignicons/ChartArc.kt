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

public val MaterialDesignIcons.ChartArc: ImageVector
    get() {
        if (_chartArc != null) {
            return _chartArc!!
        }
        _chartArc = Builder(name = "ChartArc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.18f, 19.6f)
                lineTo(14.17f, 16.12f)
                curveTo(15.15f, 15.4f, 15.83f, 14.28f, 15.97f, 13.0f)
                horizontalLineTo(20.0f)
                curveTo(19.83f, 15.76f, 18.35f, 18.16f, 16.18f, 19.6f)
                moveTo(13.0f, 7.03f)
                verticalLineTo(3.0f)
                curveTo(17.3f, 3.26f, 20.74f, 6.7f, 21.0f, 11.0f)
                horizontalLineTo(16.97f)
                curveTo(16.74f, 8.91f, 15.09f, 7.26f, 13.0f, 7.03f)
                moveTo(7.0f, 12.5f)
                curveTo(7.0f, 13.14f, 7.13f, 13.75f, 7.38f, 14.3f)
                lineTo(3.9f, 16.31f)
                curveTo(3.32f, 15.16f, 3.0f, 13.87f, 3.0f, 12.5f)
                curveTo(3.0f, 7.97f, 6.54f, 4.27f, 11.0f, 4.0f)
                verticalLineTo(8.03f)
                curveTo(8.75f, 8.28f, 7.0f, 10.18f, 7.0f, 12.5f)
                moveTo(11.5f, 21.0f)
                curveTo(8.53f, 21.0f, 5.92f, 19.5f, 4.4f, 17.18f)
                lineTo(7.88f, 15.17f)
                curveTo(8.7f, 16.28f, 10.0f, 17.0f, 11.5f, 17.0f)
                curveTo(12.14f, 17.0f, 12.75f, 16.87f, 13.3f, 16.62f)
                lineTo(15.31f, 20.1f)
                curveTo(14.16f, 20.68f, 12.87f, 21.0f, 11.5f, 21.0f)
                close()
            }
        }
        .build()
        return _chartArc!!
    }

private var _chartArc: ImageVector? = null
