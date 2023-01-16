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

public val MaterialDesignIcons.HeartCog: ImageVector
    get() {
        if (_heartCog != null) {
            return _heartCog!!
        }
        _heartCog = Builder(name = "HeartCog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(12.0f, 19.71f, 12.12f, 20.4f, 12.32f, 21.06f)
                lineTo(12.0f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2.0f, 12.27f, 2.0f, 8.5f)
                curveTo(2.0f, 5.41f, 4.42f, 3.0f, 7.5f, 3.0f)
                curveTo(9.24f, 3.0f, 10.91f, 3.81f, 12.0f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f)
                curveTo(19.58f, 3.0f, 22.0f, 5.41f, 22.0f, 8.5f)
                curveTo(22.0f, 9.8f, 21.59f, 11.0f, 20.84f, 12.25f)
                curveTo(20.25f, 12.09f, 19.63f, 12.0f, 19.0f, 12.0f)
                curveTo(15.14f, 12.0f, 12.0f, 15.14f, 12.0f, 19.0f)
                moveTo(23.83f, 20.64f)
                lineTo(22.83f, 22.37f)
                curveTo(22.76f, 22.5f, 22.63f, 22.5f, 22.5f, 22.5f)
                lineTo(21.27f, 22.0f)
                curveTo(21.0f, 22.18f, 20.73f, 22.34f, 20.43f, 22.47f)
                lineTo(20.24f, 23.79f)
                curveTo(20.22f, 23.91f, 20.11f, 24.0f, 20.0f, 24.0f)
                horizontalLineTo(18.0f)
                curveTo(17.86f, 24.0f, 17.76f, 23.91f, 17.74f, 23.79f)
                lineTo(17.55f, 22.47f)
                curveTo(17.24f, 22.35f, 16.96f, 22.18f, 16.7f, 22.0f)
                lineTo(15.46f, 22.5f)
                curveTo(15.34f, 22.5f, 15.21f, 22.5f, 15.15f, 22.37f)
                lineTo(14.15f, 20.64f)
                curveTo(14.09f, 20.53f, 14.12f, 20.4f, 14.21f, 20.32f)
                lineTo(15.27f, 19.5f)
                curveTo(15.25f, 19.33f, 15.24f, 19.17f, 15.24f, 19.0f)
                reflectiveCurveTo(15.25f, 18.67f, 15.27f, 18.5f)
                lineTo(14.21f, 17.68f)
                curveTo(14.11f, 17.6f, 14.09f, 17.47f, 14.15f, 17.36f)
                lineTo(15.15f, 15.63f)
                curveTo(15.22f, 15.5f, 15.35f, 15.5f, 15.46f, 15.5f)
                lineTo(16.7f, 16.0f)
                curveTo(16.96f, 15.82f, 17.25f, 15.66f, 17.55f, 15.53f)
                lineTo(17.74f, 14.21f)
                curveTo(17.76f, 14.09f, 17.87f, 14.0f, 18.0f, 14.0f)
                horizontalLineTo(20.0f)
                curveTo(20.11f, 14.0f, 20.22f, 14.09f, 20.23f, 14.21f)
                lineTo(20.42f, 15.53f)
                curveTo(20.73f, 15.65f, 21.0f, 15.82f, 21.27f, 16.0f)
                lineTo(22.5f, 15.5f)
                curveTo(22.63f, 15.5f, 22.76f, 15.5f, 22.82f, 15.63f)
                lineTo(23.82f, 17.36f)
                curveTo(23.88f, 17.47f, 23.85f, 17.6f, 23.76f, 17.68f)
                lineTo(22.7f, 18.5f)
                curveTo(22.73f, 18.67f, 22.74f, 18.83f, 22.74f, 19.0f)
                reflectiveCurveTo(22.72f, 19.33f, 22.7f, 19.5f)
                lineTo(23.77f, 20.32f)
                curveTo(23.86f, 20.4f, 23.89f, 20.53f, 23.83f, 20.64f)
                moveTo(20.5f, 19.0f)
                curveTo(20.5f, 18.17f, 19.83f, 17.5f, 19.0f, 17.5f)
                reflectiveCurveTo(17.5f, 18.17f, 17.5f, 19.0f)
                reflectiveCurveTo(18.16f, 20.5f, 19.0f, 20.5f)
                curveTo(19.83f, 20.5f, 20.5f, 19.83f, 20.5f, 19.0f)
                close()
            }
        }
        .build()
        return _heartCog!!
    }

private var _heartCog: ImageVector? = null