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

public val MaterialDesignIcons.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) {
            return _cameraPlus!!
        }
        _cameraPlus = Builder(name = "CameraPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.0f)
                moveTo(6.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                lineTo(17.8f, 6.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 6.0f, 23.0f, 6.9f, 23.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(23.0f, 21.1f, 22.1f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 22.0f, 3.0f, 21.1f, 3.0f, 20.0f)
                verticalLineTo(10.0f)
                moveTo(13.0f, 19.0f)
                curveTo(17.45f, 19.0f, 19.69f, 13.62f, 16.54f, 10.46f)
                curveTo(13.39f, 7.31f, 8.0f, 9.55f, 8.0f, 14.0f)
                curveTo(8.0f, 16.76f, 10.24f, 19.0f, 13.0f, 19.0f)
                moveTo(9.8f, 14.0f)
                curveTo(9.8f, 16.85f, 13.25f, 18.28f, 15.26f, 16.26f)
                curveTo(17.28f, 14.25f, 15.85f, 10.8f, 13.0f, 10.8f)
                curveTo(11.24f, 10.8f, 9.8f, 12.24f, 9.8f, 14.0f)
                close()
            }
        }
        .build()
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
