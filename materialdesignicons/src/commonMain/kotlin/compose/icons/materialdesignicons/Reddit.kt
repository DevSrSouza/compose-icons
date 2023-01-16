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

public val MaterialDesignIcons.Reddit: ImageVector
    get() {
        if (_reddit != null) {
            return _reddit!!
        }
        _reddit = Builder(name = "Reddit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 15.41f)
                curveTo(14.58f, 15.5f, 14.58f, 15.69f, 14.5f, 15.8f)
                curveTo(13.77f, 16.5f, 12.41f, 16.56f, 12.0f, 16.56f)
                curveTo(11.61f, 16.56f, 10.25f, 16.5f, 9.54f, 15.8f)
                curveTo(9.44f, 15.69f, 9.44f, 15.5f, 9.54f, 15.41f)
                curveTo(9.65f, 15.31f, 9.82f, 15.31f, 9.92f, 15.41f)
                curveTo(10.38f, 15.87f, 11.33f, 16.0f, 12.0f, 16.0f)
                curveTo(12.69f, 16.0f, 13.66f, 15.87f, 14.1f, 15.41f)
                curveTo(14.21f, 15.31f, 14.38f, 15.31f, 14.5f, 15.41f)
                moveTo(10.75f, 13.04f)
                curveTo(10.75f, 12.47f, 10.28f, 12.0f, 9.71f, 12.0f)
                curveTo(9.14f, 12.0f, 8.67f, 12.47f, 8.67f, 13.04f)
                curveTo(8.67f, 13.61f, 9.14f, 14.09f, 9.71f, 14.08f)
                curveTo(10.28f, 14.08f, 10.75f, 13.61f, 10.75f, 13.04f)
                moveTo(14.29f, 12.0f)
                curveTo(13.72f, 12.0f, 13.25f, 12.5f, 13.25f, 13.05f)
                reflectiveCurveTo(13.72f, 14.09f, 14.29f, 14.09f)
                curveTo(14.86f, 14.09f, 15.33f, 13.61f, 15.33f, 13.05f)
                curveTo(15.33f, 12.5f, 14.86f, 12.0f, 14.29f, 12.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5f, 17.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(22.0f, 6.5f, 22.0f, 12.0f)
                moveTo(18.67f, 12.0f)
                curveTo(18.67f, 11.19f, 18.0f, 10.54f, 17.22f, 10.54f)
                curveTo(16.82f, 10.54f, 16.46f, 10.7f, 16.2f, 10.95f)
                curveTo(15.2f, 10.23f, 13.83f, 9.77f, 12.3f, 9.71f)
                lineTo(12.97f, 6.58f)
                lineTo(15.14f, 7.05f)
                curveTo(15.16f, 7.6f, 15.62f, 8.04f, 16.18f, 8.04f)
                curveTo(16.75f, 8.04f, 17.22f, 7.57f, 17.22f, 7.0f)
                curveTo(17.22f, 6.43f, 16.75f, 5.96f, 16.18f, 5.96f)
                curveTo(15.77f, 5.96f, 15.41f, 6.2f, 15.25f, 6.55f)
                lineTo(12.82f, 6.03f)
                curveTo(12.75f, 6.0f, 12.68f, 6.03f, 12.63f, 6.07f)
                curveTo(12.57f, 6.11f, 12.54f, 6.17f, 12.53f, 6.24f)
                lineTo(11.79f, 9.72f)
                curveTo(10.24f, 9.77f, 8.84f, 10.23f, 7.82f, 10.96f)
                curveTo(7.56f, 10.71f, 7.2f, 10.56f, 6.81f, 10.56f)
                curveTo(6.0f, 10.56f, 5.35f, 11.21f, 5.35f, 12.0f)
                curveTo(5.35f, 12.61f, 5.71f, 13.11f, 6.21f, 13.34f)
                curveTo(6.19f, 13.5f, 6.18f, 13.62f, 6.18f, 13.78f)
                curveTo(6.18f, 16.0f, 8.79f, 17.85f, 12.0f, 17.85f)
                curveTo(15.23f, 17.85f, 17.85f, 16.03f, 17.85f, 13.78f)
                curveTo(17.85f, 13.64f, 17.84f, 13.5f, 17.81f, 13.34f)
                curveTo(18.31f, 13.11f, 18.67f, 12.6f, 18.67f, 12.0f)
                close()
            }
        }
        .build()
        return _reddit!!
    }

private var _reddit: ImageVector? = null
