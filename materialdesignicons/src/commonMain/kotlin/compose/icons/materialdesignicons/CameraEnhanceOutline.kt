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

public val MaterialDesignIcons.CameraEnhanceOutline: ImageVector
    get() {
        if (_cameraEnhanceOutline != null) {
            return _cameraEnhanceOutline!!
        }
        _cameraEnhanceOutline = Builder(name = "CameraEnhanceOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                lineTo(11.06f, 12.06f)
                lineTo(9.0f, 13.0f)
                lineTo(11.06f, 13.94f)
                lineTo(12.0f, 16.0f)
                lineTo(12.94f, 13.94f)
                lineTo(15.0f, 13.0f)
                lineTo(12.94f, 12.06f)
                lineTo(12.0f, 10.0f)
                moveTo(20.0f, 5.0f)
                horizontalLineTo(16.83f)
                lineTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                lineTo(7.17f, 5.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 19.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 5.0f)
                moveTo(20.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.05f)
                lineTo(8.64f, 6.35f)
                lineTo(9.88f, 5.0f)
                horizontalLineTo(14.12f)
                lineTo(15.36f, 6.35f)
                lineTo(15.95f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 13.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 13.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 8.0f)
                moveTo(12.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cameraEnhanceOutline!!
    }

private var _cameraEnhanceOutline: ImageVector? = null
