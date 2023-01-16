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

public val MaterialDesignIcons.CameraRetake: ImageVector
    get() {
        if (_cameraRetake != null) {
            return _cameraRetake!!
        }
        _cameraRetake = Builder(name = "CameraRetake", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineTo(17.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 19.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 5.0f)
                moveTo(12.0f, 18.0f)
                curveTo(10.92f, 18.0f, 9.86f, 17.65f, 9.0f, 17.0f)
                lineTo(10.44f, 15.56f)
                curveTo(10.91f, 15.85f, 11.45f, 16.0f, 12.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 10.0f)
                curveTo(10.74f, 10.0f, 9.6f, 10.8f, 9.18f, 12.0f)
                horizontalLineTo(11.0f)
                lineTo(8.0f, 15.0f)
                lineTo(5.0f, 12.0f)
                horizontalLineTo(7.1f)
                curveTo(7.65f, 9.29f, 10.29f, 7.55f, 13.0f, 8.1f)
                curveTo(15.7f, 8.65f, 17.45f, 11.29f, 16.9f, 14.0f)
                curveTo(16.42f, 16.33f, 14.38f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _cameraRetake!!
    }

private var _cameraRetake: ImageVector? = null
