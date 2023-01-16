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

public val MaterialDesignIcons.WateringCanOutline: ImageVector
    get() {
        if (_wateringCanOutline != null) {
            return _wateringCanOutline!!
        }
        _wateringCanOutline = Builder(name = "WateringCanOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 7.47f)
                curveTo(17.76f, 8.2f, 17.57f, 9.25f, 17.92f, 10.15f)
                lineTo(15.0f, 13.07f)
                verticalLineTo(11.0f)
                curveTo(15.0f, 10.45f, 14.55f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(12.97f)
                curveTo(13.0f, 9.83f, 13.0f, 9.67f, 13.0f, 9.5f)
                curveTo(13.0f, 6.46f, 10.54f, 4.0f, 7.5f, 4.0f)
                reflectiveCurveTo(2.0f, 6.46f, 2.0f, 9.5f)
                curveTo(2.0f, 11.21f, 2.78f, 12.73f, 4.0f, 13.74f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 20.55f, 4.45f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(14.55f, 21.0f, 15.0f, 20.55f, 15.0f, 20.0f)
                verticalLineTo(15.89f)
                lineTo(19.33f, 11.56f)
                curveTo(20.23f, 11.91f, 21.28f, 11.73f, 22.0f, 11.0f)
                lineTo(18.5f, 7.47f)
                moveTo(4.05f, 10.0f)
                curveTo(4.03f, 9.83f, 4.0f, 9.67f, 4.0f, 9.5f)
                curveTo(4.0f, 7.57f, 5.57f, 6.0f, 7.5f, 6.0f)
                reflectiveCurveTo(11.0f, 7.57f, 11.0f, 9.5f)
                curveTo(11.0f, 9.67f, 10.97f, 9.83f, 10.95f, 10.0f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _wateringCanOutline!!
    }

private var _wateringCanOutline: ImageVector? = null
