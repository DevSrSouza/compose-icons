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

public val MaterialDesignIcons.CameraRearVariant: ImageVector
    get() {
        if (_cameraRearVariant != null) {
            return _cameraRearVariant!!
        }
        _cameraRearVariant = Builder(name = "CameraRearVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 2.0f)
                verticalLineTo(22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 24.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 22.0f)
                verticalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 0.0f)
                moveTo(12.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(13.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                lineTo(16.0f, 19.0f)
                lineTo(13.0f, 16.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _cameraRearVariant!!
    }

private var _cameraRearVariant: ImageVector? = null
