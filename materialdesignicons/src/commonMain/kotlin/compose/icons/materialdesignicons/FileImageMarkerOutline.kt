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

public val MaterialDesignIcons.FileImageMarkerOutline: ImageVector
    get() {
        if (_fileImageMarkerOutline != null) {
            return _fileImageMarkerOutline!!
        }
        _fileImageMarkerOutline = Builder(name = "FileImageMarkerOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 12.0f)
                curveTo(7.67f, 12.0f, 7.0f, 11.33f, 7.0f, 10.5f)
                reflectiveCurveTo(7.67f, 9.0f, 8.5f, 9.0f)
                reflectiveCurveTo(10.0f, 9.67f, 10.0f, 10.5f)
                reflectiveCurveTo(9.33f, 12.0f, 8.5f, 12.0f)
                moveTo(14.0f, 19.0f)
                curveTo(13.43f, 17.86f, 13.0f, 16.64f, 13.0f, 15.5f)
                curveTo(13.0f, 15.34f, 13.0f, 15.18f, 13.03f, 15.03f)
                lineTo(12.0f, 14.0f)
                lineTo(7.0f, 19.0f)
                horizontalLineTo(14.0f)
                moveTo(6.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.03f)
                curveTo(18.17f, 10.0f, 18.33f, 10.0f, 18.5f, 10.0f)
                curveTo(19.0f, 10.0f, 19.5f, 10.08f, 20.0f, 10.22f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(15.91f)
                curveTo(15.5f, 21.44f, 15.0f, 20.76f, 14.55f, 20.0f)
                horizontalLineTo(6.0f)
                moveTo(22.0f, 15.5f)
                curveTo(22.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                reflectiveCurveTo(15.0f, 18.1f, 15.0f, 15.5f)
                curveTo(15.0f, 13.6f, 16.6f, 12.0f, 18.5f, 12.0f)
                reflectiveCurveTo(22.0f, 13.6f, 22.0f, 15.5f)
                moveTo(19.7f, 15.6f)
                curveTo(19.7f, 15.0f, 19.1f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                reflectiveCurveTo(19.8f, 16.2f, 19.7f, 15.6f)
                close()
            }
        }
        .build()
        return _fileImageMarkerOutline!!
    }

private var _fileImageMarkerOutline: ImageVector? = null
