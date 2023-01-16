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

public val MaterialDesignIcons.ChartDonutVariant: ImageVector
    get() {
        if (_chartDonutVariant != null) {
            return _chartDonutVariant!!
        }
        _chartDonutVariant = Builder(name = "ChartDonutVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.05f)
                curveTo(18.05f, 2.55f, 22.0f, 6.82f, 22.0f, 12.0f)
                curveTo(22.0f, 13.45f, 21.68f, 14.83f, 21.12f, 16.07f)
                lineTo(18.5f, 14.54f)
                curveTo(18.82f, 13.75f, 19.0f, 12.9f, 19.0f, 12.0f)
                curveTo(19.0f, 8.47f, 16.39f, 5.57f, 13.0f, 5.08f)
                verticalLineTo(2.05f)
                moveTo(12.0f, 19.0f)
                curveTo(14.21f, 19.0f, 16.17f, 18.0f, 17.45f, 16.38f)
                lineTo(20.05f, 17.91f)
                curveTo(18.23f, 20.39f, 15.3f, 22.0f, 12.0f, 22.0f)
                curveTo(6.47f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.81f, 5.94f, 2.55f, 11.0f, 2.05f)
                verticalLineTo(5.08f)
                curveTo(7.61f, 5.57f, 5.0f, 8.47f, 5.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 19.0f)
                moveTo(12.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 12.0f)
                curveTo(18.0f, 14.97f, 15.84f, 17.44f, 13.0f, 17.92f)
                verticalLineTo(14.83f)
                curveTo(14.17f, 14.42f, 15.0f, 13.31f, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 9.0f)
                lineTo(11.45f, 9.05f)
                lineTo(9.91f, 6.38f)
                curveTo(10.56f, 6.13f, 11.26f, 6.0f, 12.0f, 6.0f)
                moveTo(6.0f, 12.0f)
                curveTo(6.0f, 10.14f, 6.85f, 8.5f, 8.18f, 7.38f)
                lineTo(9.72f, 10.05f)
                curveTo(9.27f, 10.57f, 9.0f, 11.26f, 9.0f, 12.0f)
                curveTo(9.0f, 13.31f, 9.83f, 14.42f, 11.0f, 14.83f)
                verticalLineTo(17.92f)
                curveTo(8.16f, 17.44f, 6.0f, 14.97f, 6.0f, 12.0f)
                close()
            }
        }
        .build()
        return _chartDonutVariant!!
    }

private var _chartDonutVariant: ImageVector? = null
