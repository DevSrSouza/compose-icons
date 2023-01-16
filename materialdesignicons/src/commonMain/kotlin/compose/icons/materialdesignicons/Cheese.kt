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

public val MaterialDesignIcons.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.5f)
                curveTo(11.0f, 16.67f, 11.67f, 16.0f, 12.5f, 16.0f)
                curveTo(12.79f, 16.0f, 13.06f, 16.09f, 13.29f, 16.23f)
                lineTo(20.75f, 11.93f)
                curveTo(20.35f, 11.22f, 19.9f, 10.55f, 19.41f, 9.9f)
                curveTo(19.29f, 9.96f, 19.15f, 10.0f, 19.0f, 10.0f)
                curveTo(18.45f, 10.0f, 18.0f, 9.55f, 18.0f, 9.0f)
                curveTo(18.0f, 8.8f, 18.08f, 8.62f, 18.18f, 8.46f)
                curveTo(16.45f, 6.64f, 14.34f, 5.2f, 12.0f, 4.25f)
                curveTo(11.85f, 5.24f, 11.0f, 6.0f, 10.0f, 6.0f)
                curveTo(8.9f, 6.0f, 8.0f, 5.11f, 8.0f, 4.0f)
                curveTo(8.0f, 3.72f, 8.06f, 3.45f, 8.16f, 3.21f)
                curveTo(7.3f, 3.08f, 6.41f, 3.0f, 5.5f, 3.0f)
                curveTo(5.33f, 3.0f, 5.17f, 3.0f, 5.0f, 3.03f)
                verticalLineTo(9.05f)
                curveTo(6.14f, 9.28f, 7.0f, 10.29f, 7.0f, 11.5f)
                reflectiveCurveTo(6.14f, 13.72f, 5.0f, 13.95f)
                verticalLineTo(21.0f)
                lineTo(11.0f, 17.54f)
                curveTo(11.0f, 17.53f, 11.0f, 17.5f, 11.0f, 17.5f)
                moveTo(14.0f, 9.0f)
                curveTo(15.11f, 9.0f, 16.0f, 9.9f, 16.0f, 11.0f)
                reflectiveCurveTo(15.11f, 13.0f, 14.0f, 13.0f)
                reflectiveCurveTo(12.0f, 12.11f, 12.0f, 11.0f)
                reflectiveCurveTo(12.9f, 9.0f, 14.0f, 9.0f)
                moveTo(9.0f, 16.0f)
                curveTo(8.45f, 16.0f, 8.0f, 15.55f, 8.0f, 15.0f)
                reflectiveCurveTo(8.45f, 14.0f, 9.0f, 14.0f)
                reflectiveCurveTo(10.0f, 14.45f, 10.0f, 15.0f)
                reflectiveCurveTo(9.55f, 16.0f, 9.0f, 16.0f)
                moveTo(9.0f, 10.0f)
                curveTo(8.45f, 10.0f, 8.0f, 9.55f, 8.0f, 9.0f)
                reflectiveCurveTo(8.45f, 8.0f, 9.0f, 8.0f)
                reflectiveCurveTo(10.0f, 8.45f, 10.0f, 9.0f)
                reflectiveCurveTo(9.55f, 10.0f, 9.0f, 10.0f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
