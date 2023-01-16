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

public val MaterialDesignIcons.DatabaseAlertOutline: ImageVector
    get() {
        if (_databaseAlertOutline != null) {
            return _databaseAlertOutline!!
        }
        _databaseAlertOutline = Builder(name = "DatabaseAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                curveTo(5.58f, 3.0f, 2.0f, 4.79f, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 19.21f, 5.59f, 21.0f, 10.0f, 21.0f)
                reflectiveCurveTo(18.0f, 19.21f, 18.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 4.79f, 14.42f, 3.0f, 10.0f, 3.0f)
                moveTo(16.0f, 17.0f)
                curveTo(16.0f, 17.5f, 13.87f, 19.0f, 10.0f, 19.0f)
                reflectiveCurveTo(4.0f, 17.5f, 4.0f, 17.0f)
                verticalLineTo(14.77f)
                curveTo(5.61f, 15.55f, 7.72f, 16.0f, 10.0f, 16.0f)
                reflectiveCurveTo(14.39f, 15.55f, 16.0f, 14.77f)
                verticalLineTo(17.0f)
                moveTo(16.0f, 12.45f)
                curveTo(14.7f, 13.4f, 12.42f, 14.0f, 10.0f, 14.0f)
                reflectiveCurveTo(5.3f, 13.4f, 4.0f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(5.47f, 10.47f, 7.61f, 11.0f, 10.0f, 11.0f)
                reflectiveCurveTo(14.53f, 10.47f, 16.0f, 9.64f)
                verticalLineTo(12.45f)
                moveTo(10.0f, 9.0f)
                curveTo(6.13f, 9.0f, 4.0f, 7.5f, 4.0f, 7.0f)
                reflectiveCurveTo(6.13f, 5.0f, 10.0f, 5.0f)
                reflectiveCurveTo(16.0f, 6.5f, 16.0f, 7.0f)
                reflectiveCurveTo(13.87f, 9.0f, 10.0f, 9.0f)
                moveTo(22.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(22.0f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _databaseAlertOutline!!
    }

private var _databaseAlertOutline: ImageVector? = null
