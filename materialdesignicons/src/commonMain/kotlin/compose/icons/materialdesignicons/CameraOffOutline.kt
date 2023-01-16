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

public val MaterialDesignIcons.CameraOffOutline: ImageVector
    get() {
        if (_cameraOffOutline != null) {
            return _cameraOffOutline!!
        }
        _cameraOffOutline = Builder(name = "CameraOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.54f, 16.9f, 13.05f, 16.74f, 13.54f)
                lineTo(15.0f, 11.78f)
                curveTo(14.87f, 10.3f, 13.7f, 9.13f, 12.22f, 9.0f)
                lineTo(10.46f, 7.26f)
                curveTo(10.95f, 7.1f, 11.46f, 7.0f, 12.0f, 7.0f)
                curveTo(14.76f, 7.0f, 17.0f, 9.24f, 17.0f, 12.0f)
                moveTo(9.88f, 4.0f)
                horizontalLineTo(14.12f)
                lineTo(15.95f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.8f)
                lineTo(21.88f, 18.68f)
                curveTo(21.96f, 18.47f, 22.0f, 18.24f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.11f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(16.83f)
                lineTo(15.0f, 2.0f)
                horizontalLineTo(9.0f)
                lineTo(7.18f, 4.0f)
                lineTo(8.6f, 5.4f)
                lineTo(9.88f, 4.0f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.11f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.42f, 2.25f, 4.9f, 2.65f, 4.54f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 13.66f, 10.34f, 15.0f, 12.0f, 15.0f)
                curveTo(12.33f, 15.0f, 12.65f, 14.93f, 12.94f, 14.83f)
                lineTo(9.17f, 11.06f)
                curveTo(9.07f, 11.36f, 9.0f, 11.67f, 9.0f, 12.0f)
                moveTo(16.11f, 18.0f)
                lineTo(14.45f, 16.34f)
                curveTo(13.72f, 16.75f, 12.89f, 17.0f, 12.0f, 17.0f)
                curveTo(9.24f, 17.0f, 7.0f, 14.76f, 7.0f, 12.0f)
                curveTo(7.0f, 11.11f, 7.25f, 10.28f, 7.66f, 9.55f)
                lineTo(4.11f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.11f)
                close()
            }
        }
        .build()
        return _cameraOffOutline!!
    }

private var _cameraOffOutline: ImageVector? = null
