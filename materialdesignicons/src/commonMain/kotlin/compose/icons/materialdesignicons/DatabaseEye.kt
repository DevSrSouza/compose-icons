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

public val MaterialDesignIcons.DatabaseEye: ImageVector
    get() {
        if (_databaseEye != null) {
            return _databaseEye!!
        }
        _databaseEye = Builder(name = "DatabaseEye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 11.2f, 7.6f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(20.0f, 11.2f, 20.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 12.5f, 19.8f, 12.9f, 19.5f, 13.4f)
                curveTo(18.7f, 13.1f, 17.9f, 13.0f, 17.0f, 13.0f)
                curveTo(14.5f, 13.0f, 12.1f, 14.1f, 10.6f, 15.9f)
                curveTo(6.8f, 15.6f, 4.0f, 14.0f, 4.0f, 12.0f)
                moveTo(12.0f, 11.0f)
                curveTo(16.4f, 11.0f, 20.0f, 9.2f, 20.0f, 7.0f)
                reflectiveCurveTo(16.4f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.0f, 4.8f, 4.0f, 7.0f)
                reflectiveCurveTo(7.6f, 11.0f, 12.0f, 11.0f)
                moveTo(9.1f, 19.7f)
                lineTo(8.8f, 19.0f)
                lineTo(9.1f, 18.3f)
                curveTo(9.2f, 18.1f, 9.3f, 18.0f, 9.3f, 17.8f)
                curveTo(6.2f, 17.2f, 4.0f, 15.8f, 4.0f, 14.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 18.8f, 6.4f, 20.3f, 9.7f, 20.8f)
                curveTo(9.5f, 20.5f, 9.3f, 20.1f, 9.1f, 19.7f)
                moveTo(17.0f, 18.0f)
                curveTo(16.4f, 18.0f, 16.0f, 18.4f, 16.0f, 19.0f)
                reflectiveCurveTo(16.4f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveTo(18.0f, 19.6f, 18.0f, 19.0f)
                reflectiveCurveTo(17.6f, 18.0f, 17.0f, 18.0f)
                moveTo(23.0f, 19.0f)
                curveTo(22.1f, 21.3f, 19.7f, 23.0f, 17.0f, 23.0f)
                reflectiveCurveTo(11.9f, 21.3f, 11.0f, 19.0f)
                curveTo(11.9f, 16.7f, 14.3f, 15.0f, 17.0f, 15.0f)
                reflectiveCurveTo(22.1f, 16.7f, 23.0f, 19.0f)
                moveTo(19.5f, 19.0f)
                curveTo(19.5f, 17.6f, 18.4f, 16.5f, 17.0f, 16.5f)
                reflectiveCurveTo(14.5f, 17.6f, 14.5f, 19.0f)
                reflectiveCurveTo(15.6f, 21.5f, 17.0f, 21.5f)
                reflectiveCurveTo(19.5f, 20.4f, 19.5f, 19.0f)
                close()
            }
        }
        .build()
        return _databaseEye!!
    }

private var _databaseEye: ImageVector? = null
