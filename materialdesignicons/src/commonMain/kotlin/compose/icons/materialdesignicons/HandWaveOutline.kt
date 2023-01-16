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

public val MaterialDesignIcons.HandWaveOutline: ImageVector
    get() {
        if (_handWaveOutline != null) {
            return _handWaveOutline!!
        }
        _handWaveOutline = Builder(name = "HandWaveOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.03f, 4.95f)
                lineTo(3.5f, 8.5f)
                curveTo(0.17f, 11.81f, 0.17f, 17.19f, 3.5f, 20.5f)
                reflectiveCurveTo(12.19f, 23.83f, 15.5f, 20.5f)
                lineTo(21.5f, 14.5f)
                curveTo(22.5f, 13.53f, 22.5f, 11.94f, 21.5f, 10.96f)
                curveTo(21.4f, 10.84f, 21.27f, 10.73f, 21.13f, 10.64f)
                lineTo(21.5f, 10.25f)
                curveTo(22.5f, 9.28f, 22.5f, 7.69f, 21.5f, 6.71f)
                curveTo(21.36f, 6.55f, 21.17f, 6.41f, 21.0f, 6.3f)
                curveTo(21.38f, 5.38f, 21.21f, 4.28f, 20.46f, 3.53f)
                curveTo(19.59f, 2.66f, 18.24f, 2.57f, 17.26f, 3.25f)
                curveTo(17.16f, 3.1f, 17.05f, 2.96f, 16.92f, 2.83f)
                curveTo(15.95f, 1.86f, 14.36f, 1.86f, 13.38f, 2.83f)
                lineTo(10.87f, 5.34f)
                curveTo(10.78f, 5.2f, 10.67f, 5.07f, 10.55f, 4.95f)
                curveTo(9.58f, 4.0f, 8.0f, 4.0f, 7.03f, 4.95f)
                moveTo(8.44f, 6.37f)
                curveTo(8.64f, 6.17f, 8.95f, 6.17f, 9.15f, 6.37f)
                reflectiveCurveTo(9.35f, 6.88f, 9.15f, 7.08f)
                lineTo(5.97f, 10.26f)
                curveTo(7.14f, 11.43f, 7.14f, 13.33f, 5.97f, 14.5f)
                lineTo(7.38f, 15.91f)
                curveTo(8.83f, 14.46f, 9.2f, 12.34f, 8.5f, 10.55f)
                lineTo(14.8f, 4.25f)
                curveTo(15.0f, 4.05f, 15.31f, 4.05f, 15.5f, 4.25f)
                reflectiveCurveTo(15.71f, 4.76f, 15.5f, 4.96f)
                lineTo(10.91f, 9.56f)
                lineTo(12.32f, 10.97f)
                lineTo(18.33f, 4.96f)
                curveTo(18.53f, 4.76f, 18.84f, 4.76f, 19.04f, 4.96f)
                curveTo(19.24f, 5.16f, 19.24f, 5.47f, 19.04f, 5.67f)
                lineTo(13.03f, 11.68f)
                lineTo(14.44f, 13.09f)
                lineTo(19.39f, 8.14f)
                curveTo(19.59f, 7.94f, 19.9f, 7.94f, 20.1f, 8.14f)
                curveTo(20.3f, 8.34f, 20.3f, 8.65f, 20.1f, 8.85f)
                lineTo(14.44f, 14.5f)
                lineTo(15.85f, 15.92f)
                lineTo(19.39f, 12.38f)
                curveTo(19.59f, 12.18f, 19.9f, 12.18f, 20.1f, 12.38f)
                curveTo(20.3f, 12.58f, 20.3f, 12.89f, 20.1f, 13.09f)
                lineTo(14.1f, 19.1f)
                curveTo(11.56f, 21.64f, 7.45f, 21.64f, 4.91f, 19.1f)
                reflectiveCurveTo(2.37f, 12.45f, 4.91f, 9.91f)
                lineTo(8.44f, 6.37f)
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
                close()
            }
        }
        .build()
        return _handWaveOutline!!
    }

private var _handWaveOutline: ImageVector? = null
