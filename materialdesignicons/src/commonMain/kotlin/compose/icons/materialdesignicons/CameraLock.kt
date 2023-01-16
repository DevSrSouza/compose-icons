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

public val MaterialDesignIcons.CameraLock: ImageVector
    get() {
        if (_cameraLock != null) {
            return _cameraLock!!
        }
        _cameraLock = Builder(name = "CameraLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 2.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 4.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 4.0f, 22.0f, 4.89f, 22.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(21.16f, 11.37f, 20.13f, 11.0f, 19.0f, 11.0f)
                curveTo(18.21f, 11.0f, 17.46f, 11.18f, 16.79f, 11.5f)
                curveTo(16.18f, 9.22f, 14.27f, 7.0f, 12.0f, 7.0f)
                curveTo(9.24f, 7.0f, 7.0f, 9.24f, 7.0f, 12.0f)
                curveTo(7.0f, 14.76f, 9.24f, 17.0f, 12.0f, 17.0f)
                curveTo(12.42f, 17.0f, 12.84f, 16.95f, 13.23f, 16.85f)
                curveTo(13.08f, 17.2f, 13.0f, 17.59f, 13.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.9f, 4.0f, 4.0f, 4.0f)
                moveTo(12.0f, 9.0f)
                curveTo(13.66f, 9.0f, 15.0f, 10.34f, 15.0f, 12.0f)
                curveTo(15.0f, 13.66f, 13.66f, 15.0f, 12.0f, 15.0f)
                curveTo(10.34f, 15.0f, 9.0f, 13.66f, 9.0f, 12.0f)
                curveTo(9.0f, 10.34f, 10.34f, 9.0f, 12.0f, 9.0f)
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
                close()
            }
        }
        .build()
        return _cameraLock!!
    }

private var _cameraLock: ImageVector? = null
