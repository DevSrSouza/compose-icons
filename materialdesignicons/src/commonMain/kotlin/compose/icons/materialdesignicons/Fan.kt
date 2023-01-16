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

public val MaterialDesignIcons.Fan: ImageVector
    get() {
        if (_fan != null) {
            return _fan!!
        }
        _fan = Builder(name = "Fan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 11.0f)
                moveTo(12.5f, 2.0f)
                curveTo(17.0f, 2.0f, 17.11f, 5.57f, 14.75f, 6.75f)
                curveTo(13.76f, 7.24f, 13.32f, 8.29f, 13.13f, 9.22f)
                curveTo(13.61f, 9.42f, 14.03f, 9.73f, 14.35f, 10.13f)
                curveTo(18.05f, 8.13f, 22.03f, 8.92f, 22.03f, 12.5f)
                curveTo(22.03f, 17.0f, 18.46f, 17.1f, 17.28f, 14.73f)
                curveTo(16.78f, 13.74f, 15.72f, 13.3f, 14.79f, 13.11f)
                curveTo(14.59f, 13.59f, 14.28f, 14.0f, 13.88f, 14.34f)
                curveTo(15.87f, 18.03f, 15.08f, 22.0f, 11.5f, 22.0f)
                curveTo(7.0f, 22.0f, 6.91f, 18.42f, 9.27f, 17.24f)
                curveTo(10.25f, 16.75f, 10.69f, 15.71f, 10.89f, 14.79f)
                curveTo(10.4f, 14.59f, 9.97f, 14.27f, 9.65f, 13.87f)
                curveTo(5.96f, 15.85f, 2.0f, 15.07f, 2.0f, 11.5f)
                curveTo(2.0f, 7.0f, 5.56f, 6.89f, 6.74f, 9.26f)
                curveTo(7.24f, 10.25f, 8.29f, 10.68f, 9.22f, 10.87f)
                curveTo(9.41f, 10.39f, 9.73f, 9.97f, 10.14f, 9.65f)
                curveTo(8.15f, 5.96f, 8.94f, 2.0f, 12.5f, 2.0f)
                close()
            }
        }
        .build()
        return _fan!!
    }

private var _fan: ImageVector? = null
