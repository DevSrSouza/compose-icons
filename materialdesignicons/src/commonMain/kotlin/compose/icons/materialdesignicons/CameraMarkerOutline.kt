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

public val MaterialDesignIcons.CameraMarkerOutline: ImageVector
    get() {
        if (_cameraMarkerOutline != null) {
            return _cameraMarkerOutline!!
        }
        _cameraMarkerOutline = Builder(name = "CameraMarkerOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(19.7f, 15.0f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                moveTo(18.5f, 12.0f)
                curveTo(16.6f, 12.0f, 15.0f, 13.6f, 15.0f, 15.5f)
                curveTo(15.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                reflectiveCurveTo(22.0f, 18.1f, 22.0f, 15.5f)
                curveTo(22.0f, 13.6f, 20.4f, 12.0f, 18.5f, 12.0f)
                moveTo(9.0f, 2.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(14.5f)
                curveTo(14.1f, 19.4f, 13.7f, 18.7f, 13.5f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.1f)
                lineTo(9.9f, 4.0f)
                horizontalLineTo(14.1f)
                lineTo(15.9f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.2f)
                curveTo(20.7f, 10.4f, 21.4f, 10.8f, 22.0f, 11.3f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(16.8f)
                lineTo(15.0f, 2.0f)
                horizontalLineTo(9.0f)
                moveTo(12.0f, 7.0f)
                curveTo(9.2f, 7.0f, 7.0f, 9.2f, 7.0f, 12.0f)
                reflectiveCurveTo(9.2f, 17.0f, 12.0f, 17.0f)
                curveTo(12.4f, 17.0f, 12.8f, 17.0f, 13.2f, 16.9f)
                curveTo(13.1f, 16.4f, 13.0f, 16.0f, 13.0f, 15.5f)
                verticalLineTo(14.8f)
                curveTo(12.7f, 14.9f, 12.3f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3f, 15.0f, 9.0f, 13.7f, 9.0f, 12.0f)
                reflectiveCurveTo(10.3f, 9.0f, 12.0f, 9.0f)
                curveTo(13.4f, 9.0f, 14.6f, 10.0f, 14.9f, 11.3f)
                curveTo(15.4f, 10.9f, 16.0f, 10.5f, 16.7f, 10.3f)
                curveTo(16.0f, 8.3f, 14.1f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _cameraMarkerOutline!!
    }

private var _cameraMarkerOutline: ImageVector? = null
