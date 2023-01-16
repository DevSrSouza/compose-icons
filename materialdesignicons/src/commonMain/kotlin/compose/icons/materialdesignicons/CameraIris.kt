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

public val MaterialDesignIcons.CameraIris: ImageVector
    get() {
        if (_cameraIris != null) {
            return _cameraIris!!
        }
        _cameraIris = Builder(name = "CameraIris", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.73f, 15.0f)
                lineTo(9.83f, 21.76f)
                curveTo(10.53f, 21.91f, 11.25f, 22.0f, 12.0f, 22.0f)
                curveTo(14.4f, 22.0f, 16.6f, 21.15f, 18.32f, 19.75f)
                lineTo(14.66f, 13.4f)
                moveTo(2.46f, 15.0f)
                curveTo(3.38f, 17.92f, 5.61f, 20.26f, 8.45f, 21.34f)
                lineTo(12.12f, 15.0f)
                moveTo(8.54f, 12.0f)
                lineTo(4.64f, 5.25f)
                curveTo(3.0f, 7.0f, 2.0f, 9.39f, 2.0f, 12.0f)
                curveTo(2.0f, 12.68f, 2.07f, 13.35f, 2.2f, 14.0f)
                horizontalLineTo(9.69f)
                moveTo(21.8f, 10.0f)
                horizontalLineTo(14.31f)
                lineTo(14.6f, 10.5f)
                lineTo(19.36f, 18.75f)
                curveTo(21.0f, 16.97f, 22.0f, 14.6f, 22.0f, 12.0f)
                curveTo(22.0f, 11.31f, 21.93f, 10.64f, 21.8f, 10.0f)
                moveTo(21.54f, 9.0f)
                curveTo(20.62f, 6.07f, 18.39f, 3.74f, 15.55f, 2.66f)
                lineTo(11.88f, 9.0f)
                moveTo(9.4f, 10.5f)
                lineTo(14.17f, 2.24f)
                curveTo(13.47f, 2.09f, 12.75f, 2.0f, 12.0f, 2.0f)
                curveTo(9.6f, 2.0f, 7.4f, 2.84f, 5.68f, 4.25f)
                lineTo(9.34f, 10.6f)
                lineTo(9.4f, 10.5f)
                close()
            }
        }
        .build()
        return _cameraIris!!
    }

private var _cameraIris: ImageVector? = null
