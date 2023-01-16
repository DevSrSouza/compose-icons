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

public val MaterialDesignIcons.CameraRear: ImageVector
    get() {
        if (_cameraRear != null) {
            return _cameraRear!!
        }
        _cameraRear = Builder(name = "CameraRear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(10.89f, 6.0f, 10.0f, 5.1f, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                curveTo(13.09f, 2.0f, 14.0f, 2.9f, 14.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 6.0f)
                moveTo(17.0f, 0.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 2.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 18.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 16.0f)
                verticalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 0.0f)
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
        return _cameraRear!!
    }

private var _cameraRear: ImageVector? = null
