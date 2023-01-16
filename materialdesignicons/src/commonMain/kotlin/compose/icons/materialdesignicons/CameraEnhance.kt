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

public val MaterialDesignIcons.CameraEnhance: ImageVector
    get() {
        if (_cameraEnhance != null) {
            return _cameraEnhance!!
        }
        _cameraEnhance = Builder(name = "CameraEnhance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                lineTo(7.17f, 5.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 19.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 5.0f)
                horizontalLineTo(16.83f)
                lineTo(15.0f, 3.0f)
                moveTo(12.0f, 18.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 13.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 13.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 18.0f)
                moveTo(12.0f, 17.0f)
                lineTo(13.25f, 14.25f)
                lineTo(16.0f, 13.0f)
                lineTo(13.25f, 11.75f)
                lineTo(12.0f, 9.0f)
                lineTo(10.75f, 11.75f)
                lineTo(8.0f, 13.0f)
                lineTo(10.75f, 14.25f)
            }
        }
        .build()
        return _cameraEnhance!!
    }

private var _cameraEnhance: ImageVector? = null
