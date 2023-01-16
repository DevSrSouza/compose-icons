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

public val MaterialDesignIcons.DatabaseOutline: ImageVector
    get() {
        if (_databaseOutline != null) {
            return _databaseOutline!!
        }
        _databaseOutline = Builder(name = "DatabaseOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.58f, 3.0f, 4.0f, 4.79f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.59f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveTo(20.0f, 19.21f, 20.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                moveTo(18.0f, 17.0f)
                curveTo(18.0f, 17.5f, 15.87f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveTo(6.0f, 17.5f, 6.0f, 17.0f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(16.39f, 15.55f, 18.0f, 14.77f)
                verticalLineTo(17.0f)
                moveTo(18.0f, 12.45f)
                curveTo(16.7f, 13.4f, 14.42f, 14.0f, 12.0f, 14.0f)
                curveTo(9.58f, 14.0f, 7.3f, 13.4f, 6.0f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11.0f, 12.0f, 11.0f)
                curveTo(14.39f, 11.0f, 16.53f, 10.47f, 18.0f, 9.64f)
                verticalLineTo(12.45f)
                moveTo(12.0f, 9.0f)
                curveTo(8.13f, 9.0f, 6.0f, 7.5f, 6.0f, 7.0f)
                reflectiveCurveTo(8.13f, 5.0f, 12.0f, 5.0f)
                curveTo(15.87f, 5.0f, 18.0f, 6.5f, 18.0f, 7.0f)
                reflectiveCurveTo(15.87f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _databaseOutline!!
    }

private var _databaseOutline: ImageVector? = null
