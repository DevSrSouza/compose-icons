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

public val MaterialDesignIcons.DatabaseLockOutline: ImageVector
    get() {
        if (_databaseLockOutline != null) {
            return _databaseLockOutline!!
        }
        _databaseLockOutline = Builder(name = "DatabaseLockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(16.53f, 10.47f, 18.0f, 9.64f)
                verticalLineTo(11.05f)
                curveTo(18.17f, 11.03f, 18.33f, 11.0f, 18.5f, 11.0f)
                curveTo(19.03f, 11.0f, 19.53f, 11.1f, 20.0f, 11.26f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.0f, 4.79f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.59f, 21.0f, 12.0f, 21.0f)
                curveTo(12.34f, 21.0f, 12.67f, 21.0f, 13.0f, 20.97f)
                verticalLineTo(18.95f)
                curveTo(12.68f, 19.0f, 12.35f, 19.0f, 12.0f, 19.0f)
                curveTo(8.13f, 19.0f, 6.0f, 17.5f, 6.0f, 17.0f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16.0f, 12.0f, 16.0f)
                curveTo(12.41f, 16.0f, 12.81f, 15.97f, 13.21f, 15.94f)
                curveTo(13.4f, 15.46f, 13.68f, 15.03f, 14.07f, 14.7f)
                curveTo(14.13f, 14.39f, 14.23f, 14.09f, 14.34f, 13.8f)
                curveTo(13.6f, 13.93f, 12.81f, 14.0f, 12.0f, 14.0f)
                curveTo(9.58f, 14.0f, 7.3f, 13.4f, 6.0f, 12.45f)
                moveTo(12.0f, 5.0f)
                curveTo(15.87f, 5.0f, 18.0f, 6.5f, 18.0f, 7.0f)
                reflectiveCurveTo(15.87f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(6.0f, 7.5f, 6.0f, 7.0f)
                reflectiveCurveTo(8.13f, 5.0f, 12.0f, 5.0f)
                moveTo(21.0f, 16.0f)
                verticalLineTo(15.5f)
                curveTo(21.0f, 14.12f, 19.88f, 13.0f, 18.5f, 13.0f)
                reflectiveCurveTo(16.0f, 14.12f, 16.0f, 15.5f)
                verticalLineTo(16.0f)
                curveTo(15.45f, 16.0f, 15.0f, 16.45f, 15.0f, 17.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 21.55f, 15.45f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 22.0f, 22.0f, 21.55f, 22.0f, 21.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 16.45f, 21.55f, 16.0f, 21.0f, 16.0f)
                moveTo(20.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.5f)
                curveTo(17.0f, 14.67f, 17.67f, 14.0f, 18.5f, 14.0f)
                reflectiveCurveTo(20.0f, 14.67f, 20.0f, 15.5f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _databaseLockOutline!!
    }

private var _databaseLockOutline: ImageVector? = null
