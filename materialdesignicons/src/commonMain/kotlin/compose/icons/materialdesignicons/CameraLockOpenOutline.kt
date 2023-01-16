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

public val MaterialDesignIcons.CameraLockOpenOutline: ImageVector
    get() {
        if (_cameraLockOpenOutline != null) {
            return _cameraLockOpenOutline!!
        }
        _cameraLockOpenOutline = Builder(name = "CameraLockOpenOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.1f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.9f, 2.9f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(7.2f)
                lineTo(9.0f, 2.0f)
                horizontalLineTo(15.0f)
                lineTo(16.8f, 4.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 4.0f, 22.0f, 4.9f, 22.0f, 6.0f)
                verticalLineTo(11.0f)
                curveTo(21.4f, 10.6f, 20.7f, 10.2f, 20.0f, 10.1f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                lineTo(14.2f, 4.0f)
                horizontalLineTo(9.9f)
                lineTo(8.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 7.0f)
                curveTo(9.2f, 7.0f, 7.0f, 9.2f, 7.0f, 12.0f)
                reflectiveCurveTo(9.2f, 17.0f, 12.0f, 17.0f)
                curveTo(12.5f, 17.0f, 12.9f, 16.9f, 13.4f, 16.8f)
                curveTo(13.6f, 16.4f, 13.9f, 16.0f, 14.2f, 15.8f)
                verticalLineTo(14.6f)
                curveTo(14.2f, 14.4f, 14.2f, 14.2f, 14.3f, 14.1f)
                curveTo(13.7f, 14.7f, 12.9f, 15.1f, 12.0f, 15.1f)
                curveTo(10.3f, 15.1f, 9.0f, 13.8f, 9.0f, 12.1f)
                reflectiveCurveTo(10.3f, 9.1f, 12.0f, 9.1f)
                reflectiveCurveTo(15.0f, 10.4f, 15.0f, 12.1f)
                verticalLineTo(12.2f)
                curveTo(15.4f, 11.6f, 16.1f, 11.1f, 16.8f, 10.7f)
                curveTo(16.1f, 8.5f, 14.3f, 7.0f, 12.0f, 7.0f)
                moveTo(21.8f, 17.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.5f)
                curveTo(17.5f, 13.7f, 18.2f, 13.2f, 19.0f, 13.2f)
                reflectiveCurveTo(20.5f, 13.7f, 20.5f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.8f)
                verticalLineTo(14.5f)
                curveTo(21.8f, 13.1f, 20.4f, 12.0f, 19.0f, 12.0f)
                reflectiveCurveTo(16.2f, 13.1f, 16.2f, 14.5f)
                verticalLineTo(17.0f)
                curveTo(15.6f, 17.0f, 15.0f, 17.6f, 15.0f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(15.0f, 22.4f, 15.6f, 23.0f, 16.2f, 23.0f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 23.0f, 23.0f, 22.4f, 23.0f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(23.0f, 17.6f, 22.4f, 17.0f, 21.8f, 17.0f)
                close()
            }
        }
        .build()
        return _cameraLockOpenOutline!!
    }

private var _cameraLockOpenOutline: ImageVector? = null
