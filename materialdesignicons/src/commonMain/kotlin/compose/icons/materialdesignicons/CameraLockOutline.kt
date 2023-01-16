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

public val MaterialDesignIcons.CameraLockOutline: ImageVector
    get() {
        if (_cameraLockOutline != null) {
            return _cameraLockOutline!!
        }
        _cameraLockOutline = Builder(name = "CameraLockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.3f)
                verticalLineTo(21.8f)
                curveTo(23.0f, 22.4f, 22.4f, 23.0f, 21.7f, 23.0f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 23.0f, 15.0f, 22.4f, 15.0f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(15.0f, 17.6f, 15.6f, 17.0f, 16.2f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(16.2f, 14.1f, 17.6f, 13.0f, 19.0f, 13.0f)
                curveTo(20.4f, 13.0f, 21.8f, 14.1f, 21.8f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(22.4f, 17.0f, 23.0f, 17.6f, 23.0f, 18.3f)
                moveTo(20.5f, 15.5f)
                curveTo(20.5f, 14.7f, 19.8f, 14.2f, 19.0f, 14.2f)
                curveTo(18.2f, 14.2f, 17.5f, 14.7f, 17.5f, 15.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(15.5f)
                moveTo(20.0f, 4.0f)
                curveTo(21.1f, 4.0f, 22.0f, 4.9f, 22.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(21.42f, 11.56f, 20.74f, 11.25f, 20.0f, 11.1f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.95f)
                lineTo(14.12f, 4.0f)
                horizontalLineTo(9.88f)
                lineTo(8.05f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.1f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.9f, 2.9f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(7.17f)
                lineTo(9.0f, 2.0f)
                horizontalLineTo(15.0f)
                lineTo(16.83f, 4.0f)
                horizontalLineTo(20.0f)
                moveTo(12.0f, 7.0f)
                curveTo(14.57f, 7.0f, 16.68f, 8.94f, 16.97f, 11.43f)
                curveTo(15.29f, 12.18f, 14.1f, 13.83f, 14.0f, 15.76f)
                curveTo(13.67f, 16.06f, 13.4f, 16.43f, 13.23f, 16.85f)
                curveTo(12.84f, 16.95f, 12.42f, 17.0f, 12.0f, 17.0f)
                curveTo(9.24f, 17.0f, 7.0f, 14.76f, 7.0f, 12.0f)
                curveTo(7.0f, 9.24f, 9.24f, 7.0f, 12.0f, 7.0f)
                moveTo(12.0f, 15.0f)
                curveTo(13.65f, 15.0f, 15.0f, 13.65f, 15.0f, 12.0f)
                curveTo(15.0f, 10.35f, 13.65f, 9.0f, 12.0f, 9.0f)
                curveTo(10.35f, 9.0f, 9.0f, 10.35f, 9.0f, 12.0f)
                curveTo(9.0f, 13.65f, 10.35f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _cameraLockOutline!!
    }

private var _cameraLockOutline: ImageVector? = null
