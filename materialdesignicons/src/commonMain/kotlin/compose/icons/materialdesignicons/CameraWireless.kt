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

public val MaterialDesignIcons.CameraWireless: ImageVector
    get() {
        if (_cameraWireless != null) {
            return _cameraWireless!!
        }
        _cameraWireless = Builder(name = "CameraWireless", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.8f)
                arcTo(3.2f, 3.2f, 0.0f, false, true, 15.2f, 14.0f)
                arcTo(3.2f, 3.2f, 0.0f, false, true, 12.0f, 17.2f)
                arcTo(3.2f, 3.2f, 0.0f, false, true, 8.8f, 14.0f)
                arcTo(3.2f, 3.2f, 0.0f, false, true, 12.0f, 10.8f)
                moveTo(16.0f, 3.33f)
                verticalLineTo(2.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 22.0f, 8.0f)
                horizontalLineTo(20.67f)
                curveTo(20.67f, 5.42f, 18.58f, 3.33f, 16.0f, 3.33f)
                moveTo(16.0f, 6.0f)
                verticalLineTo(4.67f)
                curveTo(17.84f, 4.67f, 19.33f, 6.16f, 19.33f, 8.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 6.89f, 17.11f, 6.0f, 16.0f, 6.0f)
                moveTo(17.0f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 6.0f)
                horizontalLineTo(7.17f)
                lineTo(9.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                curveTo(16.11f, 7.0f, 17.0f, 7.89f, 17.0f, 9.0f)
                moveTo(12.0f, 19.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 14.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 14.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _cameraWireless!!
    }

private var _cameraWireless: ImageVector? = null
