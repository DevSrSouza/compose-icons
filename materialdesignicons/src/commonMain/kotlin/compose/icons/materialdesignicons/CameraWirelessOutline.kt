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

public val MaterialDesignIcons.CameraWirelessOutline: ImageVector
    get() {
        if (_cameraWirelessOutline != null) {
            return _cameraWirelessOutline!!
        }
        _cameraWirelessOutline = Builder(name = "CameraWirelessOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.05f)
                lineTo(9.88f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                lineTo(7.17f, 6.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                moveTo(20.67f, 8.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 4.68f, 19.31f, 2.0f, 16.0f, 2.0f)
                verticalLineTo(3.33f)
                curveTo(18.58f, 3.33f, 20.66f, 5.41f, 20.67f, 8.0f)
                moveTo(18.0f, 8.0f)
                horizontalLineTo(19.33f)
                curveTo(19.32f, 6.15f, 17.84f, 4.67f, 16.0f, 4.67f)
                verticalLineTo(6.0f)
                curveTo(17.11f, 6.0f, 18.0f, 6.89f, 18.0f, 8.0f)
                moveTo(7.0f, 14.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 14.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 14.0f)
                moveTo(15.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 14.0f)
                close()
            }
        }
        .build()
        return _cameraWirelessOutline!!
    }

private var _cameraWirelessOutline: ImageVector? = null
