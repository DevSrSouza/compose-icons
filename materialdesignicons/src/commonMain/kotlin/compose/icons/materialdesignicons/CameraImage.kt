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

public val MaterialDesignIcons.CameraImage: ImageVector
    get() {
        if (_cameraImage != null) {
            return _cameraImage!!
        }
        _cameraImage = Builder(name = "CameraImage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 7.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 19.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 5.0f)
                moveTo(13.09f, 9.45f)
                lineTo(11.05f, 12.18f)
                lineTo(12.6f, 14.25f)
                lineTo(11.73f, 14.91f)
                lineTo(9.27f, 11.64f)
                lineTo(6.0f, 16.0f)
                horizontalLineTo(18.0f)
                lineTo(13.09f, 9.45f)
                close()
            }
        }
        .build()
        return _cameraImage!!
    }

private var _cameraImage: ImageVector? = null
