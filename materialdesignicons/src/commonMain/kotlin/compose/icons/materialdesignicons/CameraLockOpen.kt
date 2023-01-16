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

public val MaterialDesignIcons.CameraLockOpen: ImageVector
    get() {
        if (_cameraLockOpen != null) {
            return _cameraLockOpen!!
        }
        _cameraLockOpen = Builder(name = "CameraLockOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                curveTo(14.6f, 12.6f, 14.4f, 13.3f, 14.3f, 14.0f)
                curveTo(13.7f, 14.6f, 12.9f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3f, 15.0f, 9.0f, 13.7f, 9.0f, 12.0f)
                reflectiveCurveTo(10.3f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(15.0f, 10.3f, 15.0f, 12.0f)
                moveTo(13.0f, 18.2f)
                curveTo(13.0f, 17.7f, 13.1f, 17.2f, 13.4f, 16.8f)
                curveTo(12.9f, 16.9f, 12.5f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2f, 17.0f, 7.0f, 14.8f, 7.0f, 12.0f)
                reflectiveCurveTo(9.2f, 7.0f, 12.0f, 7.0f)
                curveTo(14.3f, 7.0f, 16.1f, 8.5f, 16.8f, 10.6f)
                curveTo(17.5f, 10.3f, 18.2f, 10.0f, 19.0f, 10.0f)
                curveTo(20.1f, 10.0f, 21.2f, 10.4f, 22.0f, 11.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(17.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineTo(9.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.2f)
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
        return _cameraLockOpen!!
    }

private var _cameraLockOpen: ImageVector? = null
