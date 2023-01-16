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

public val MaterialDesignIcons.HandClap: ImageVector
    get() {
        if (_handClap != null) {
            return _handClap!!
        }
        _handClap = Builder(name = "HandClap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9f, 21.47f)
                curveTo(6.0f, 19.81f, 5.35f, 17.17f, 6.18f, 14.84f)
                lineTo(8.31f, 8.91f)
                curveTo(8.53f, 8.3f, 9.36f, 8.22f, 9.69f, 8.78f)
                lineTo(10.0f, 9.33f)
                curveTo(10.24f, 9.72f, 10.29f, 10.2f, 10.14f, 10.63f)
                lineTo(9.16f, 13.37f)
                lineTo(9.59f, 13.75f)
                lineTo(15.55f, 7.0f)
                curveTo(15.9f, 6.6f, 16.5f, 6.56f, 16.91f, 6.91f)
                curveTo(17.3f, 7.26f, 17.34f, 7.87f, 17.0f, 8.26f)
                lineTo(12.55f, 13.29f)
                lineTo(13.13f, 13.8f)
                lineTo(18.58f, 7.62f)
                curveTo(18.93f, 7.22f, 19.54f, 7.18f, 19.93f, 7.53f)
                curveTo(20.33f, 7.88f, 20.37f, 8.5f, 20.0f, 8.89f)
                lineTo(14.56f, 15.07f)
                lineTo(15.14f, 15.58f)
                lineTo(19.83f, 10.26f)
                curveTo(20.18f, 9.86f, 20.79f, 9.82f, 21.18f, 10.17f)
                reflectiveCurveTo(21.62f, 11.13f, 21.27f, 11.5f)
                lineTo(16.58f, 16.84f)
                lineTo(17.15f, 17.35f)
                lineTo(20.32f, 13.76f)
                curveTo(20.67f, 13.36f, 21.28f, 13.32f, 21.68f, 13.67f)
                reflectiveCurveTo(22.11f, 14.63f, 21.76f, 15.0f)
                lineTo(16.56f, 20.92f)
                curveTo(14.32f, 23.47f, 10.44f, 23.71f, 7.9f, 21.47f)
                moveTo(11.59f, 9.22f)
                lineTo(14.43f, 6.0f)
                curveTo(14.67f, 5.73f, 14.97f, 5.5f, 15.3f, 5.37f)
                lineTo(15.68f, 4.59f)
                curveTo(15.92f, 4.12f, 15.72f, 3.54f, 15.24f, 3.31f)
                curveTo(14.77f, 3.08f, 14.19f, 3.28f, 13.96f, 3.75f)
                lineTo(11.45f, 8.89f)
                curveTo(11.5f, 9.0f, 11.56f, 9.11f, 11.59f, 9.22f)
                moveTo(11.0f, 8.0f)
                lineTo(11.0f, 8.05f)
                lineTo(13.78f, 2.38f)
                curveTo(14.0f, 1.9f, 13.81f, 1.33f, 13.33f, 1.1f)
                curveTo(12.86f, 0.865f, 12.28f, 1.06f, 12.05f, 1.54f)
                lineTo(9.41f, 6.95f)
                curveTo(10.06f, 7.06f, 10.63f, 7.43f, 11.0f, 8.0f)
                moveTo(4.77f, 14.33f)
                lineTo(6.9f, 8.4f)
                curveTo(7.17f, 7.65f, 7.8f, 7.14f, 8.55f, 6.97f)
                lineTo(10.69f, 2.58f)
                curveTo(10.92f, 2.1f, 10.72f, 1.53f, 10.25f, 1.3f)
                curveTo(9.77f, 1.07f, 9.2f, 1.26f, 8.97f, 1.74f)
                lineTo(5.0f, 9.84f)
                lineTo(4.5f, 9.59f)
                lineTo(4.71f, 6.68f)
                curveTo(4.75f, 6.23f, 4.57f, 5.78f, 4.25f, 5.46f)
                lineTo(3.79f, 5.0f)
                curveTo(3.32f, 4.57f, 2.55f, 4.86f, 2.5f, 5.5f)
                lineTo(2.0f, 11.79f)
                curveTo(1.87f, 13.83f, 2.77f, 15.78f, 4.35f, 17.0f)
                curveTo(4.33f, 16.12f, 4.46f, 15.21f, 4.77f, 14.33f)
                close()
            }
        }
        .build()
        return _handClap!!
    }

private var _handClap: ImageVector? = null
