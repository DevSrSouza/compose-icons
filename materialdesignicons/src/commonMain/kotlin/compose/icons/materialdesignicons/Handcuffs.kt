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

public val MaterialDesignIcons.Handcuffs: ImageVector
    get() {
        if (_handcuffs != null) {
            return _handcuffs!!
        }
        _handcuffs = Builder(name = "Handcuffs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.24f, 6.76f)
                curveTo(18.4f, 4.91f, 15.65f, 4.53f, 13.42f, 5.59f)
                lineTo(12.46f, 4.63f)
                curveTo(12.07f, 4.24f, 11.44f, 4.24f, 11.05f, 4.63f)
                lineTo(10.97f, 4.72f)
                curveTo(10.83f, 3.75f, 10.0f, 3.0f, 9.0f, 3.0f)
                curveTo(7.9f, 3.0f, 7.0f, 3.9f, 7.0f, 5.0f)
                curveTo(7.0f, 5.09f, 7.0f, 5.18f, 7.03f, 5.26f)
                curveTo(6.42f, 5.61f, 6.0f, 6.25f, 6.0f, 7.0f)
                curveTo(6.0f, 7.46f, 6.16f, 7.87f, 6.42f, 8.21f)
                curveTo(6.17f, 8.39f, 6.0f, 8.67f, 6.0f, 9.0f)
                verticalLineTo(10.35f)
                curveTo(3.67f, 11.17f, 2.0f, 13.39f, 2.0f, 16.0f)
                curveTo(2.0f, 19.31f, 4.69f, 22.0f, 8.0f, 22.0f)
                reflectiveCurveTo(14.0f, 19.31f, 14.0f, 16.0f)
                curveTo(14.0f, 13.39f, 12.33f, 11.17f, 10.0f, 10.35f)
                verticalLineTo(9.0f)
                curveTo(10.0f, 8.67f, 9.83f, 8.39f, 9.58f, 8.21f)
                curveTo(9.84f, 7.87f, 10.0f, 7.46f, 10.0f, 7.0f)
                curveTo(10.0f, 6.91f, 10.0f, 6.82f, 9.97f, 6.74f)
                curveTo(10.15f, 6.64f, 10.3f, 6.5f, 10.43f, 6.38f)
                curveTo(11.36f, 6.88f, 12.0f, 7.86f, 12.0f, 9.0f)
                verticalLineTo(9.08f)
                curveTo(12.13f, 9.15f, 12.25f, 9.25f, 12.38f, 9.33f)
                curveTo(12.57f, 8.91f, 12.83f, 8.5f, 13.17f, 8.17f)
                curveTo(14.73f, 6.61f, 17.27f, 6.61f, 18.83f, 8.17f)
                curveTo(20.39f, 9.73f, 20.39f, 12.27f, 18.83f, 13.83f)
                curveTo(18.03f, 14.63f, 17.0f, 15.0f, 15.93f, 15.0f)
                curveTo(16.0f, 15.32f, 16.0f, 15.66f, 16.0f, 16.0f)
                curveTo(16.0f, 16.34f, 15.97f, 16.67f, 15.93f, 17.0f)
                curveTo(17.5f, 17.0f, 19.05f, 16.43f, 20.24f, 15.24f)
                curveTo(22.59f, 12.9f, 22.59f, 9.1f, 20.24f, 6.76f)
                moveTo(9.0f, 4.0f)
                curveTo(9.55f, 4.0f, 10.0f, 4.45f, 10.0f, 5.0f)
                curveTo(10.0f, 5.33f, 9.83f, 5.61f, 9.58f, 5.79f)
                curveTo(9.22f, 5.31f, 8.65f, 5.0f, 8.0f, 5.0f)
                curveTo(8.0f, 4.45f, 8.45f, 4.0f, 9.0f, 4.0f)
                moveTo(7.42f, 6.21f)
                curveTo(7.78f, 6.69f, 8.35f, 7.0f, 9.0f, 7.0f)
                curveTo(9.0f, 7.55f, 8.55f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveTo(7.0f, 7.55f, 7.0f, 7.0f)
                curveTo(7.0f, 6.67f, 7.17f, 6.39f, 7.42f, 6.21f)
                moveTo(12.0f, 16.0f)
                curveTo(12.0f, 18.21f, 10.21f, 20.0f, 8.0f, 20.0f)
                reflectiveCurveTo(4.0f, 18.21f, 4.0f, 16.0f)
                curveTo(4.0f, 13.79f, 5.79f, 12.0f, 8.0f, 12.0f)
                reflectiveCurveTo(12.0f, 13.79f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _handcuffs!!
    }

private var _handcuffs: ImageVector? = null
