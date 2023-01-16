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

public val MaterialDesignIcons.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) {
            return _chartDonut!!
        }
        _chartDonut = Builder(name = "ChartDonut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.05f)
                verticalLineTo(5.08f)
                curveTo(16.39f, 5.57f, 19.0f, 8.47f, 19.0f, 12.0f)
                curveTo(19.0f, 12.9f, 18.82f, 13.75f, 18.5f, 14.54f)
                lineTo(21.12f, 16.07f)
                curveTo(21.68f, 14.83f, 22.0f, 13.45f, 22.0f, 12.0f)
                curveTo(22.0f, 6.82f, 18.05f, 2.55f, 13.0f, 2.05f)
                moveTo(12.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 12.0f)
                curveTo(5.0f, 8.47f, 7.61f, 5.57f, 11.0f, 5.08f)
                verticalLineTo(2.05f)
                curveTo(5.94f, 2.55f, 2.0f, 6.81f, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                curveTo(15.3f, 22.0f, 18.23f, 20.39f, 20.05f, 17.91f)
                lineTo(17.45f, 16.38f)
                curveTo(16.17f, 18.0f, 14.21f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
