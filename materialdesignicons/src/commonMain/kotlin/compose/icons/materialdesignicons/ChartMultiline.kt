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

public val MaterialDesignIcons.ChartMultiline: ImageVector
    get() {
        if (_chartMultiline != null) {
            return _chartMultiline!!
        }
        _chartMultiline = Builder(name = "ChartMultiline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.92f)
                lineTo(20.59f, 5.5f)
                lineTo(17.74f, 8.72f)
                curveTo(15.68f, 6.4f, 12.83f, 5.0f, 9.61f, 5.0f)
                curveTo(6.72f, 5.0f, 4.07f, 6.16f, 2.0f, 8.0f)
                lineTo(3.42f, 9.42f)
                curveTo(5.12f, 7.93f, 7.27f, 7.0f, 9.61f, 7.0f)
                curveTo(12.35f, 7.0f, 14.7f, 8.26f, 16.38f, 10.24f)
                lineTo(13.5f, 13.5f)
                lineTo(9.5f, 9.5f)
                lineTo(2.0f, 17.0f)
                lineTo(3.5f, 18.5f)
                lineTo(9.5f, 12.5f)
                lineTo(13.5f, 16.5f)
                lineTo(17.55f, 11.93f)
                curveTo(18.3f, 13.28f, 18.8f, 14.83f, 19.0f, 16.5f)
                horizontalLineTo(21.0f)
                curveTo(20.78f, 14.18f, 20.05f, 12.09f, 18.96f, 10.34f)
                lineTo(22.0f, 6.92f)
                close()
            }
        }
        .build()
        return _chartMultiline!!
    }

private var _chartMultiline: ImageVector? = null
