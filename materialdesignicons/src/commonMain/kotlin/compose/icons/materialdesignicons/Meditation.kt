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

public val MaterialDesignIcons.Meditation: ImageVector
    get() {
        if (_meditation != null) {
            return _meditation!!
        }
        _meditation = Builder(name = "Meditation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(13.11f, 4.0f, 14.0f, 4.89f, 14.0f, 6.0f)
                reflectiveCurveTo(13.11f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(10.0f, 7.11f, 10.0f, 6.0f)
                reflectiveCurveTo(10.9f, 4.0f, 12.0f, 4.0f)
                moveTo(21.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(18.76f, 14.0f, 16.84f, 13.04f, 15.4f, 11.32f)
                lineTo(14.06f, 9.72f)
                curveTo(13.68f, 9.26f, 13.12f, 9.0f, 12.53f, 9.0f)
                horizontalLineTo(11.5f)
                curveTo(10.89f, 9.0f, 10.33f, 9.26f, 9.95f, 9.72f)
                lineTo(8.61f, 11.32f)
                curveTo(7.16f, 13.04f, 5.24f, 14.0f, 3.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(5.77f, 16.0f, 8.19f, 14.83f, 10.0f, 12.75f)
                verticalLineTo(15.0f)
                lineTo(6.12f, 16.55f)
                curveTo(5.45f, 16.82f, 5.0f, 17.5f, 5.0f, 18.21f)
                curveTo(5.0f, 19.2f, 5.8f, 20.0f, 6.79f, 20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.5f)
                curveTo(9.0f, 18.12f, 10.12f, 17.0f, 11.5f, 17.0f)
                horizontalLineTo(14.5f)
                curveTo(14.78f, 17.0f, 15.0f, 17.22f, 15.0f, 17.5f)
                reflectiveCurveTo(14.78f, 18.0f, 14.5f, 18.0f)
                horizontalLineTo(11.5f)
                curveTo(10.67f, 18.0f, 10.0f, 18.67f, 10.0f, 19.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.21f)
                curveTo(18.2f, 20.0f, 19.0f, 19.2f, 19.0f, 18.21f)
                curveTo(19.0f, 17.5f, 18.55f, 16.82f, 17.88f, 16.55f)
                lineTo(14.0f, 15.0f)
                verticalLineTo(12.75f)
                curveTo(15.81f, 14.83f, 18.23f, 16.0f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _meditation!!
    }

private var _meditation: ImageVector? = null
