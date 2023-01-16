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

public val MaterialDesignIcons.FilePercentOutline: ImageVector
    get() {
        if (_filePercentOutline != null) {
            return _filePercentOutline!!
        }
        _filePercentOutline = Builder(name = "FilePercentOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                moveTo(10.0f, 11.5f)
                curveTo(10.0f, 12.33f, 9.33f, 13.0f, 8.5f, 13.0f)
                reflectiveCurveTo(7.0f, 12.33f, 7.0f, 11.5f)
                reflectiveCurveTo(7.67f, 10.0f, 8.5f, 10.0f)
                reflectiveCurveTo(10.0f, 10.67f, 10.0f, 11.5f)
                moveTo(16.0f, 17.5f)
                curveTo(16.0f, 18.33f, 15.33f, 19.0f, 14.5f, 19.0f)
                reflectiveCurveTo(13.0f, 18.33f, 13.0f, 17.5f)
                reflectiveCurveTo(13.67f, 16.0f, 14.5f, 16.0f)
                reflectiveCurveTo(16.0f, 16.67f, 16.0f, 17.5f)
                moveTo(16.0f, 11.35f)
                lineTo(8.37f, 19.0f)
                lineTo(7.0f, 17.65f)
                lineTo(14.65f, 10.0f)
                lineTo(16.0f, 11.35f)
                close()
            }
        }
        .build()
        return _filePercentOutline!!
    }

private var _filePercentOutline: ImageVector? = null
