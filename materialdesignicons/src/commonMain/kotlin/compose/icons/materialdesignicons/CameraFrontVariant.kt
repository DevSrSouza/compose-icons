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

public val MaterialDesignIcons.CameraFrontVariant: ImageVector
    get() {
        if (_cameraFrontVariant != null) {
            return _cameraFrontVariant!!
        }
        _cameraFrontVariant = Builder(name = "CameraFrontVariant", defaultWidth = 24.0.dp,
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
                moveTo(12.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 6.0f)
                moveTo(11.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(11.0f)
                moveTo(6.0f, 4.0f)
                verticalLineTo(16.5f)
                curveTo(6.0f, 15.12f, 8.69f, 14.0f, 12.0f, 14.0f)
                curveTo(15.31f, 14.0f, 18.0f, 15.12f, 18.0f, 16.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
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
        return _cameraFrontVariant!!
    }

private var _cameraFrontVariant: ImageVector? = null
