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

public val MaterialDesignIcons.FanRemove: ImageVector
    get() {
        if (_fanRemove != null) {
            return _fanRemove!!
        }
        _fanRemove = Builder(name = "FanRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 17.59f, 13.5f, 16.3f, 14.3f, 15.28f)
                curveTo(14.17f, 14.97f, 14.03f, 14.65f, 13.86f, 14.34f)
                curveTo(14.26f, 14.0f, 14.57f, 13.59f, 14.77f, 13.11f)
                curveTo(15.26f, 13.21f, 15.78f, 13.39f, 16.25f, 13.67f)
                curveTo(17.07f, 13.25f, 18.0f, 13.0f, 19.0f, 13.0f)
                curveTo(20.05f, 13.0f, 21.03f, 13.27f, 21.89f, 13.74f)
                curveTo(21.95f, 13.37f, 22.0f, 12.96f, 22.0f, 12.5f)
                curveTo(22.0f, 8.92f, 18.03f, 8.13f, 14.33f, 10.13f)
                curveTo(14.0f, 9.73f, 13.59f, 9.42f, 13.11f, 9.22f)
                curveTo(13.3f, 8.29f, 13.74f, 7.24f, 14.73f, 6.75f)
                curveTo(17.09f, 5.57f, 17.0f, 2.0f, 12.5f, 2.0f)
                curveTo(8.93f, 2.0f, 8.14f, 5.96f, 10.13f, 9.65f)
                curveTo(9.72f, 9.97f, 9.4f, 10.39f, 9.21f, 10.87f)
                curveTo(8.28f, 10.68f, 7.23f, 10.25f, 6.73f, 9.26f)
                curveTo(5.56f, 6.89f, 2.0f, 7.0f, 2.0f, 11.5f)
                curveTo(2.0f, 15.07f, 5.95f, 15.85f, 9.64f, 13.87f)
                curveTo(9.96f, 14.27f, 10.39f, 14.59f, 10.88f, 14.79f)
                curveTo(10.68f, 15.71f, 10.24f, 16.75f, 9.26f, 17.24f)
                curveTo(6.9f, 18.42f, 7.0f, 22.0f, 11.5f, 22.0f)
                curveTo(12.31f, 22.0f, 13.0f, 21.78f, 13.5f, 21.41f)
                curveTo(13.19f, 20.67f, 13.0f, 19.86f, 13.0f, 19.0f)
                moveTo(12.0f, 13.0f)
                curveTo(11.43f, 13.0f, 11.0f, 12.55f, 11.0f, 12.0f)
                reflectiveCurveTo(11.43f, 11.0f, 12.0f, 11.0f)
                curveTo(12.54f, 11.0f, 13.0f, 11.45f, 13.0f, 12.0f)
                reflectiveCurveTo(12.54f, 13.0f, 12.0f, 13.0f)
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.47f, 21.12f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 16.88f)
                lineTo(16.88f, 15.47f)
                lineTo(19.0f, 17.59f)
                lineTo(21.12f, 15.47f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }
        .build()
        return _fanRemove!!
    }

private var _fanRemove: ImageVector? = null
