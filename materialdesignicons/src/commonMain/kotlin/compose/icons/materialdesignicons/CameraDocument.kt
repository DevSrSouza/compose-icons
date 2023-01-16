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

public val MaterialDesignIcons.CameraDocument: ImageVector
    get() {
        if (_cameraDocument != null) {
            return _cameraDocument!!
        }
        _cameraDocument = Builder(name = "CameraDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.72f)
                curveTo(14.38f, 7.6f, 13.74f, 8.0f, 13.0f, 8.0f)
                curveTo(13.0f, 9.11f, 12.1f, 10.0f, 11.0f, 10.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 10.0f, 6.0f, 9.1f, 6.0f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(6.0f, 2.9f, 6.9f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(12.1f, 2.0f, 13.0f, 2.9f, 13.0f, 4.0f)
                curveTo(13.74f, 4.0f, 14.38f, 4.41f, 14.72f, 5.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 5.0f, 21.0f, 5.89f, 21.0f, 7.0f)
                moveTo(6.0f, 15.0f)
                horizontalLineTo(13.0f)
                lineTo(11.0f, 11.0f)
                horizontalLineTo(8.0f)
                lineTo(6.0f, 15.0f)
                close()
            }
        }
        .build()
        return _cameraDocument!!
    }

private var _cameraDocument: ImageVector? = null
