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

public val MaterialDesignIcons.CameraGopro: ImageVector
    get() {
        if (_cameraGopro != null) {
            return _cameraGopro!!
        }
        _cameraGopro = Builder(name = "CameraGopro", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 7.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 14.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 12.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 5.0f)
                moveTo(17.5f, 12.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.5f, 9.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.5f, 6.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.5f, 9.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.5f, 12.5f)
                moveTo(17.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 11.0f)
                moveTo(12.0f, 15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 19.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                moveTo(10.0f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _cameraGopro!!
    }

private var _cameraGopro: ImageVector? = null
