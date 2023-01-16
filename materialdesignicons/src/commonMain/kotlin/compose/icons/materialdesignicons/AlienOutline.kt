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

public val MaterialDesignIcons.AlienOutline: ImageVector
    get() {
        if (_alienOutline != null) {
            return _alienOutline!!
        }
        _alienOutline = Builder(name = "AlienOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.31f, 10.93f)
                curveTo(11.33f, 12.57f, 11.18f, 14.5f, 9.96f, 15.28f)
                curveTo(8.74f, 16.04f, 6.92f, 15.33f, 5.89f, 13.69f)
                curveTo(4.87f, 12.05f, 5.03f, 10.1f, 6.25f, 9.34f)
                curveTo(7.47f, 8.58f, 9.29f, 9.29f, 10.31f, 10.93f)
                moveTo(12.0f, 17.75f)
                curveTo(14.0f, 17.75f, 14.5f, 17.0f, 14.5f, 17.0f)
                curveTo(14.5f, 17.0f, 14.0f, 19.0f, 12.0f, 19.0f)
                curveTo(10.0f, 19.0f, 9.5f, 17.03f, 9.5f, 17.0f)
                curveTo(9.5f, 17.0f, 10.0f, 17.75f, 12.0f, 17.75f)
                moveTo(17.75f, 9.34f)
                curveTo(18.97f, 10.1f, 19.13f, 12.05f, 18.11f, 13.69f)
                curveTo(17.08f, 15.33f, 15.26f, 16.04f, 14.04f, 15.28f)
                curveTo(12.82f, 14.5f, 12.67f, 12.57f, 13.69f, 10.93f)
                curveTo(14.71f, 9.29f, 16.53f, 8.58f, 17.75f, 9.34f)
                moveTo(12.0f, 20.0f)
                curveTo(14.5f, 20.0f, 20.0f, 14.86f, 20.0f, 11.0f)
                curveTo(20.0f, 7.14f, 16.41f, 4.0f, 12.0f, 4.0f)
                curveTo(7.59f, 4.0f, 4.0f, 7.14f, 4.0f, 11.0f)
                curveTo(4.0f, 14.86f, 9.5f, 20.0f, 12.0f, 20.0f)
                moveTo(12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.04f, 22.0f, 11.0f)
                curveTo(22.0f, 15.08f, 16.32f, 22.0f, 12.0f, 22.0f)
                curveTo(7.68f, 22.0f, 2.0f, 15.08f, 2.0f, 11.0f)
                curveTo(2.0f, 6.04f, 6.5f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _alienOutline!!
    }

private var _alienOutline: ImageVector? = null
