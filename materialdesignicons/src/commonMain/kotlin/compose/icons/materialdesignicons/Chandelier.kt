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

public val MaterialDesignIcons.Chandelier: ImageVector
    get() {
        if (_chandelier != null) {
            return _chandelier!!
        }
        _chandelier = Builder(name = "Chandelier", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.1f)
                curveTo(15.0f, 14.76f, 13.66f, 16.1f, 12.0f, 16.1f)
                reflectiveCurveTo(9.0f, 14.76f, 9.0f, 13.1f)
                reflectiveCurveTo(10.34f, 10.1f, 12.0f, 10.1f)
                reflectiveCurveTo(15.0f, 11.44f, 15.0f, 13.1f)
                moveTo(9.0f, 2.0f)
                verticalLineTo(3.0f)
                curveTo(9.0f, 4.11f, 9.9f, 5.0f, 11.0f, 5.0f)
                verticalLineTo(9.1f)
                curveTo(11.32f, 9.04f, 11.66f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(12.68f, 9.04f, 13.0f, 9.1f)
                verticalLineTo(5.0f)
                curveTo(14.11f, 5.0f, 15.0f, 4.11f, 15.0f, 3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                moveTo(4.0f, 11.1f)
                curveTo(2.34f, 11.1f, 1.0f, 12.44f, 1.0f, 14.1f)
                reflectiveCurveTo(2.34f, 17.1f, 4.0f, 17.1f)
                reflectiveCurveTo(7.0f, 15.76f, 7.0f, 14.1f)
                reflectiveCurveTo(5.66f, 11.1f, 4.0f, 11.1f)
                moveTo(20.0f, 11.1f)
                curveTo(18.34f, 11.1f, 17.0f, 12.44f, 17.0f, 14.1f)
                reflectiveCurveTo(18.34f, 17.1f, 20.0f, 17.1f)
                reflectiveCurveTo(23.0f, 15.76f, 23.0f, 14.1f)
                reflectiveCurveTo(21.66f, 11.1f, 20.0f, 11.1f)
                moveTo(20.0f, 18.1f)
                curveTo(19.32f, 18.1f, 18.67f, 17.96f, 18.08f, 17.71f)
                curveTo(17.6f, 17.95f, 17.07f, 18.1f, 16.5f, 18.1f)
                curveTo(15.39f, 18.1f, 14.41f, 17.57f, 13.77f, 16.77f)
                curveTo(13.22f, 17.0f, 12.63f, 17.1f, 12.0f, 17.1f)
                reflectiveCurveTo(10.78f, 17.0f, 10.23f, 16.77f)
                curveTo(9.59f, 17.57f, 8.61f, 18.1f, 7.5f, 18.1f)
                curveTo(6.93f, 18.1f, 6.4f, 17.95f, 5.92f, 17.71f)
                curveTo(5.33f, 17.96f, 4.68f, 18.1f, 4.0f, 18.1f)
                curveTo(3.73f, 18.1f, 3.46f, 18.06f, 3.2f, 18.0f)
                curveTo(4.21f, 19.29f, 5.76f, 20.1f, 7.5f, 20.1f)
                curveTo(8.83f, 20.1f, 10.05f, 19.63f, 11.0f, 18.84f)
                verticalLineTo(21.1f)
                curveTo(11.0f, 21.65f, 11.45f, 22.1f, 12.0f, 22.1f)
                curveTo(12.55f, 22.1f, 13.0f, 21.65f, 13.0f, 21.1f)
                verticalLineTo(18.84f)
                curveTo(13.95f, 19.63f, 15.17f, 20.1f, 16.5f, 20.1f)
                curveTo(18.24f, 20.1f, 19.79f, 19.29f, 20.8f, 18.0f)
                curveTo(20.54f, 18.06f, 20.27f, 18.1f, 20.0f, 18.1f)
                close()
            }
        }
        .build()
        return _chandelier!!
    }

private var _chandelier: ImageVector? = null
