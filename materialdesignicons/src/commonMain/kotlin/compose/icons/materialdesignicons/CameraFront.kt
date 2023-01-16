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

public val MaterialDesignIcons.CameraFront: ImageVector
    get() {
        if (_cameraFront != null) {
            return _cameraFront!!
        }
        _cameraFront = Builder(name = "CameraFront", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.5f)
                curveTo(17.0f, 10.83f, 13.67f, 10.0f, 12.0f, 10.0f)
                curveTo(10.33f, 10.0f, 7.0f, 10.83f, 7.0f, 12.5f)
                moveTo(17.0f, 0.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 2.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 18.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 16.0f)
                verticalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 0.0f)
                moveTo(12.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 8.0f)
                moveTo(14.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                moveTo(10.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(24.0f)
                lineTo(13.0f, 21.0f)
                lineTo(10.0f, 18.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _cameraFront!!
    }

private var _cameraFront: ImageVector? = null
