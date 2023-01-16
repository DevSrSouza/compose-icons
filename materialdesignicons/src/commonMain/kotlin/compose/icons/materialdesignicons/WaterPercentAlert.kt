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

public val MaterialDesignIcons.WaterPercentAlert: ImageVector
    get() {
        if (_waterPercentAlert != null) {
            return _waterPercentAlert!!
        }
        _waterPercentAlert = Builder(name = "WaterPercentAlert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                moveTo(18.0f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                moveTo(10.0f, 3.25f)
                curveTo(10.0f, 3.25f, 4.0f, 10.0f, 4.0f, 14.0f)
                curveTo(4.0f, 17.32f, 6.69f, 20.0f, 10.0f, 20.0f)
                reflectiveCurveTo(16.0f, 17.31f, 16.0f, 14.0f)
                curveTo(16.0f, 10.0f, 10.0f, 3.25f, 10.0f, 3.25f)
                moveTo(7.75f, 10.0f)
                curveTo(8.44f, 10.0f, 9.0f, 10.56f, 9.0f, 11.25f)
                reflectiveCurveTo(8.44f, 12.5f, 7.75f, 12.5f)
                reflectiveCurveTo(6.5f, 11.94f, 6.5f, 11.25f)
                reflectiveCurveTo(7.06f, 10.0f, 7.75f, 10.0f)
                moveTo(12.25f, 17.0f)
                curveTo(11.56f, 17.0f, 11.0f, 16.44f, 11.0f, 15.75f)
                reflectiveCurveTo(11.56f, 14.5f, 12.25f, 14.5f)
                reflectiveCurveTo(13.5f, 15.06f, 13.5f, 15.75f)
                reflectiveCurveTo(12.94f, 17.0f, 12.25f, 17.0f)
                moveTo(7.53f, 17.03f)
                lineTo(6.47f, 15.97f)
                lineTo(12.47f, 9.97f)
                lineTo(13.53f, 11.03f)
                lineTo(7.53f, 17.03f)
                close()
            }
        }
        .build()
        return _waterPercentAlert!!
    }

private var _waterPercentAlert: ImageVector? = null
