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

public val MaterialDesignIcons.HandWave: ImageVector
    get() {
        if (_handWave != null) {
            return _handWave!!
        }
        _handWave = Builder(name = "HandWave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 17.0f)
                curveTo(23.0f, 20.31f, 20.31f, 23.0f, 17.0f, 23.0f)
                verticalLineTo(21.5f)
                curveTo(19.5f, 21.5f, 21.5f, 19.5f, 21.5f, 17.0f)
                horizontalLineTo(23.0f)
                moveTo(1.0f, 7.0f)
                curveTo(1.0f, 3.69f, 3.69f, 1.0f, 7.0f, 1.0f)
                verticalLineTo(2.5f)
                curveTo(4.5f, 2.5f, 2.5f, 4.5f, 2.5f, 7.0f)
                horizontalLineTo(1.0f)
                moveTo(8.0f, 4.32f)
                lineTo(3.41f, 8.92f)
                curveTo(0.19f, 12.14f, 0.19f, 17.37f, 3.41f, 20.59f)
                reflectiveCurveTo(11.86f, 23.81f, 15.08f, 20.59f)
                lineTo(22.15f, 13.5f)
                curveTo(22.64f, 13.03f, 22.64f, 12.24f, 22.15f, 11.75f)
                curveTo(21.66f, 11.26f, 20.87f, 11.26f, 20.38f, 11.75f)
                lineTo(15.96f, 16.17f)
                lineTo(15.25f, 15.46f)
                lineTo(21.79f, 8.92f)
                curveTo(22.28f, 8.43f, 22.28f, 7.64f, 21.79f, 7.15f)
                reflectiveCurveTo(20.5f, 6.66f, 20.0f, 7.15f)
                lineTo(14.19f, 13.0f)
                lineTo(13.5f, 12.27f)
                lineTo(20.37f, 5.38f)
                curveTo(20.86f, 4.89f, 20.86f, 4.1f, 20.37f, 3.61f)
                reflectiveCurveTo(19.09f, 3.12f, 18.6f, 3.61f)
                lineTo(11.71f, 10.5f)
                lineTo(11.0f, 9.8f)
                lineTo(16.5f, 4.32f)
                curveTo(17.0f, 3.83f, 17.0f, 3.04f, 16.5f, 2.55f)
                reflectiveCurveTo(15.22f, 2.06f, 14.73f, 2.55f)
                lineTo(7.11f, 10.17f)
                curveTo(8.33f, 11.74f, 8.22f, 14.0f, 6.78f, 15.45f)
                lineTo(6.07f, 14.74f)
                curveTo(7.24f, 13.57f, 7.24f, 11.67f, 6.07f, 10.5f)
                lineTo(5.72f, 10.15f)
                lineTo(9.79f, 6.08f)
                curveTo(10.28f, 5.59f, 10.28f, 4.8f, 9.79f, 4.31f)
                curveTo(9.29f, 3.83f, 8.5f, 3.83f, 8.0f, 4.32f)
                close()
            }
        }
        .build()
        return _handWave!!
    }

private var _handWave: ImageVector? = null
