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

public val MaterialDesignIcons.CameraOff: ImageVector
    get() {
        if (_cameraOff != null) {
            return _cameraOff!!
        }
        _cameraOff = Builder(name = "CameraOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2f, 4.47f)
                lineTo(2.5f, 3.2f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(16.73f, 20.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.78f, 2.04f, 5.57f, 2.1f, 5.37f)
                lineTo(1.2f, 4.47f)
                moveTo(7.0f, 4.0f)
                lineTo(9.0f, 2.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.6f, 21.74f, 19.13f, 21.32f, 19.5f)
                lineTo(16.33f, 14.5f)
                curveTo(16.76f, 13.77f, 17.0f, 12.91f, 17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 7.0f)
                curveTo(11.09f, 7.0f, 10.23f, 7.24f, 9.5f, 7.67f)
                lineTo(5.82f, 4.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 17.0f)
                curveTo(12.5f, 17.0f, 13.03f, 16.92f, 13.5f, 16.77f)
                lineTo(11.72f, 15.0f)
                curveTo(10.29f, 14.85f, 9.15f, 13.71f, 9.0f, 12.28f)
                lineTo(7.23f, 10.5f)
                curveTo(7.08f, 10.97f, 7.0f, 11.5f, 7.0f, 12.0f)
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                curveTo(15.0f, 12.35f, 14.94f, 12.69f, 14.83f, 13.0f)
                lineTo(11.0f, 9.17f)
                curveTo(11.31f, 9.06f, 11.65f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cameraOff!!
    }

private var _cameraOff: ImageVector? = null
