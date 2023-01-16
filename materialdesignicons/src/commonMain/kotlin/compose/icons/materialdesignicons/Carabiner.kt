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

public val MaterialDesignIcons.Carabiner: ImageVector
    get() {
        if (_carabiner != null) {
            return _carabiner!!
        }
        _carabiner = Builder(name = "Carabiner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.5f)
                curveTo(8.0f, 18.33f, 7.33f, 19.0f, 6.5f, 19.0f)
                reflectiveCurveTo(5.0f, 18.33f, 5.0f, 17.5f)
                reflectiveCurveTo(5.67f, 16.0f, 6.5f, 16.0f)
                reflectiveCurveTo(8.0f, 16.67f, 8.0f, 17.5f)
                moveTo(18.0f, 5.59f)
                curveTo(17.79f, 3.54f, 16.18f, 2.0f, 14.24f, 2.0f)
                horizontalLineTo(8.88f)
                curveTo(6.95f, 2.0f, 5.36f, 3.5f, 5.15f, 5.53f)
                lineTo(5.0f, 6.59f)
                curveTo(4.92f, 7.34f, 5.5f, 8.0f, 6.24f, 8.0f)
                curveTo(6.87f, 8.0f, 7.39f, 7.53f, 7.47f, 6.91f)
                lineTo(7.61f, 5.82f)
                curveTo(7.68f, 5.07f, 8.23f, 4.5f, 8.88f, 4.5f)
                horizontalLineTo(14.24f)
                curveTo(14.89f, 4.5f, 15.44f, 5.07f, 15.5f, 5.82f)
                lineTo(16.5f, 16.88f)
                curveTo(16.59f, 17.74f, 16.0f, 18.5f, 15.25f, 18.5f)
                lineTo(10.04f, 17.82f)
                curveTo(9.95f, 18.77f, 9.5f, 19.6f, 8.8f, 20.18f)
                lineTo(14.93f, 21.0f)
                lineTo(15.09f, 21.0f)
                horizontalLineTo(15.25f)
                curveTo(16.27f, 21.0f, 17.26f, 20.56f, 17.96f, 19.78f)
                curveTo(18.71f, 18.94f, 19.09f, 17.8f, 19.0f, 16.65f)
                lineTo(18.0f, 5.59f)
                moveTo(11.66f, 7.94f)
                curveTo(11.08f, 7.57f, 10.31f, 7.75f, 9.94f, 8.34f)
                lineTo(6.39f, 14.0f)
                curveTo(6.43f, 14.0f, 6.46f, 14.0f, 6.5f, 14.0f)
                curveTo(7.38f, 14.0f, 8.18f, 14.34f, 8.8f, 14.88f)
                lineTo(12.06f, 9.66f)
                curveTo(12.43f, 9.08f, 12.25f, 8.31f, 11.66f, 7.94f)
                close()
            }
        }
        .build()
        return _carabiner!!
    }

private var _carabiner: ImageVector? = null
