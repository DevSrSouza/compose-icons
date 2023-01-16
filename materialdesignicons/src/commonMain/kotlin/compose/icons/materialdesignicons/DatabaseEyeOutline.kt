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

public val MaterialDesignIcons.DatabaseEyeOutline: ImageVector
    get() {
        if (_databaseEyeOutline != null) {
            return _databaseEyeOutline!!
        }
        _databaseEyeOutline = Builder(name = "DatabaseEyeOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1f, 19.7f)
                lineTo(8.8f, 19.0f)
                lineTo(9.0f, 18.6f)
                curveTo(7.1f, 18.1f, 6.0f, 17.3f, 6.0f, 17.0f)
                verticalLineTo(14.8f)
                curveTo(7.3f, 15.4f, 8.8f, 15.8f, 10.6f, 16.0f)
                curveTo(11.3f, 15.2f, 12.2f, 14.5f, 13.1f, 14.0f)
                horizontalLineTo(12.0f)
                curveTo(9.6f, 14.0f, 7.3f, 13.4f, 6.0f, 12.5f)
                verticalLineTo(9.6f)
                curveTo(7.5f, 10.4f, 9.6f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(16.5f, 10.5f, 18.0f, 9.6f)
                verticalLineTo(12.4f)
                curveTo(17.7f, 12.6f, 17.4f, 12.8f, 17.0f, 13.0f)
                curveTo(18.0f, 13.0f, 19.0f, 13.2f, 20.0f, 13.6f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.8f, 16.4f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.0f, 4.8f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 18.8f, 6.4f, 20.3f, 9.7f, 20.8f)
                curveTo(9.5f, 20.5f, 9.3f, 20.1f, 9.1f, 19.7f)
                moveTo(12.0f, 5.0f)
                curveTo(15.9f, 5.0f, 18.0f, 6.5f, 18.0f, 7.0f)
                reflectiveCurveTo(15.9f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(6.0f, 7.5f, 6.0f, 7.0f)
                reflectiveCurveTo(8.1f, 5.0f, 12.0f, 5.0f)
                moveTo(17.0f, 18.0f)
                curveTo(17.6f, 18.0f, 18.0f, 18.4f, 18.0f, 19.0f)
                reflectiveCurveTo(17.6f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveTo(16.0f, 19.6f, 16.0f, 19.0f)
                reflectiveCurveTo(16.4f, 18.0f, 17.0f, 18.0f)
                moveTo(17.0f, 15.0f)
                curveTo(14.3f, 15.0f, 11.9f, 16.7f, 11.0f, 19.0f)
                curveTo(11.9f, 21.3f, 14.3f, 23.0f, 17.0f, 23.0f)
                reflectiveCurveTo(22.1f, 21.3f, 23.0f, 19.0f)
                curveTo(22.1f, 16.7f, 19.7f, 15.0f, 17.0f, 15.0f)
                moveTo(17.0f, 21.5f)
                curveTo(15.6f, 21.5f, 14.5f, 20.4f, 14.5f, 19.0f)
                reflectiveCurveTo(15.6f, 16.5f, 17.0f, 16.5f)
                reflectiveCurveTo(19.5f, 17.6f, 19.5f, 19.0f)
                reflectiveCurveTo(18.4f, 21.5f, 17.0f, 21.5f)
                close()
            }
        }
        .build()
        return _databaseEyeOutline!!
    }

private var _databaseEyeOutline: ImageVector? = null
