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

public val MaterialDesignIcons.GaugeEmpty: ImageVector
    get() {
        if (_gaugeEmpty != null) {
            return _gaugeEmpty!!
        }
        _gaugeEmpty = Builder(name = "GaugeEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                curveTo(4.0f, 14.4f, 5.0f, 16.5f, 6.7f, 18.0f)
                curveTo(8.1f, 16.7f, 10.0f, 16.0f, 12.0f, 16.0f)
                curveTo(14.0f, 16.0f, 15.8f, 16.7f, 17.3f, 18.0f)
                curveTo(19.0f, 16.5f, 20.0f, 14.4f, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(14.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 6.0f)
                moveTo(10.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 6.0f)
                moveTo(6.91f, 8.94f)
                curveTo(7.04f, 8.94f, 7.16f, 8.97f, 7.3f, 9.0f)
                lineTo(10.5f, 10.32f)
                lineTo(10.77f, 10.43f)
                curveTo(11.33f, 10.0f, 12.09f, 9.88f, 12.75f, 10.15f)
                curveTo(13.77f, 10.56f, 14.27f, 11.73f, 13.85f, 12.75f)
                curveTo(13.44f, 13.77f, 12.27f, 14.27f, 11.25f, 13.85f)
                curveTo(10.59f, 13.59f, 10.12f, 13.0f, 10.0f, 12.28f)
                lineTo(9.77f, 12.18f)
                lineTo(6.55f, 10.88f)
                lineTo(6.53f, 10.87f)
                curveTo(6.0f, 10.66f, 5.77f, 10.08f, 5.97f, 9.56f)
                curveTo(6.13f, 9.18f, 6.5f, 8.93f, 6.91f, 8.94f)
                verticalLineTo(8.94f)
                moveTo(17.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 9.0f)
                close()
            }
        }
        .build()
        return _gaugeEmpty!!
    }

private var _gaugeEmpty: ImageVector? = null
