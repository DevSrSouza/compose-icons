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

public val MaterialDesignIcons.CameraDocumentOff: ImageVector
    get() {
        if (_cameraDocumentOff != null) {
            return _cameraDocumentOff!!
        }
        _cameraDocumentOff = Builder(name = "CameraDocumentOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(20.11f, 22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.11f)
                lineTo(12.89f, 14.78f)
                lineTo(13.0f, 15.0f)
                horizontalLineTo(6.0f)
                lineTo(8.0f, 11.0f)
                horizontalLineTo(9.11f)
                lineTo(8.11f, 10.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 10.0f, 6.0f, 9.1f, 6.0f, 8.0f)
                verticalLineTo(7.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(13.0f, 8.0f)
                curveTo(13.74f, 8.0f, 14.38f, 7.6f, 14.72f, 7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.8f)
                lineTo(21.0f, 17.8f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 5.89f, 20.11f, 5.0f, 19.0f, 5.0f)
                horizontalLineTo(14.72f)
                curveTo(14.38f, 4.41f, 13.74f, 4.0f, 13.0f, 4.0f)
                curveTo(13.0f, 2.9f, 12.1f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(7.24f, 2.0f, 6.59f, 2.43f, 6.25f, 3.05f)
                lineTo(12.5f, 9.3f)
                curveTo(12.81f, 8.95f, 13.0f, 8.5f, 13.0f, 8.0f)
                close()
            }
        }
        .build()
        return _cameraDocumentOff!!
    }

private var _cameraDocumentOff: ImageVector? = null
