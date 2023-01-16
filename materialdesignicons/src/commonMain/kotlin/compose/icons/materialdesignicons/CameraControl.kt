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

public val MaterialDesignIcons.CameraControl: ImageVector
    get() {
        if (_cameraControl != null) {
            return _cameraControl!!
        }
        _cameraControl = Builder(name = "CameraControl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 11.19f, 9.3f, 10.5f, 9.89f, 9.89f)
                curveTo(10.5f, 9.3f, 11.19f, 9.0f, 12.0f, 9.0f)
                curveTo(12.81f, 9.0f, 13.5f, 9.3f, 14.11f, 9.89f)
                curveTo(14.7f, 10.5f, 15.0f, 11.19f, 15.0f, 12.0f)
                curveTo(15.0f, 12.81f, 14.7f, 13.5f, 14.11f, 14.11f)
                curveTo(13.5f, 14.7f, 12.81f, 15.0f, 12.0f, 15.0f)
                curveTo(11.19f, 15.0f, 10.5f, 14.7f, 9.89f, 14.11f)
                curveTo(9.3f, 13.5f, 9.0f, 12.81f, 9.0f, 12.0f)
                moveTo(5.53f, 8.44f)
                lineTo(7.31f, 10.22f)
                lineTo(5.53f, 12.0f)
                lineTo(7.31f, 13.78f)
                lineTo(5.53f, 15.56f)
                lineTo(2.0f, 12.0f)
                lineTo(5.53f, 8.44f)
                moveTo(8.44f, 18.47f)
                lineTo(10.22f, 16.69f)
                lineTo(12.0f, 18.47f)
                lineTo(13.78f, 16.69f)
                lineTo(15.56f, 18.47f)
                lineTo(12.0f, 22.0f)
                lineTo(8.44f, 18.47f)
                moveTo(18.47f, 15.56f)
                lineTo(16.69f, 13.78f)
                lineTo(18.47f, 12.0f)
                lineTo(16.69f, 10.22f)
                lineTo(18.47f, 8.44f)
                lineTo(22.0f, 12.0f)
                lineTo(18.47f, 15.56f)
                moveTo(15.56f, 5.53f)
                lineTo(13.78f, 7.31f)
                lineTo(12.0f, 5.53f)
                lineTo(10.22f, 7.31f)
                lineTo(8.44f, 5.53f)
                lineTo(12.0f, 2.0f)
                lineTo(15.56f, 5.53f)
                close()
            }
        }
        .build()
        return _cameraControl!!
    }

private var _cameraControl: ImageVector? = null
