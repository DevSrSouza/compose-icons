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

public val MaterialDesignIcons.CameraAccount: ImageVector
    get() {
        if (_cameraAccount != null) {
            return _cameraAccount!!
        }
        _cameraAccount = Builder(name = "CameraAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 7.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 19.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 5.0f)
                moveTo(16.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(16.0f, 14.67f, 13.33f, 14.0f, 12.0f, 14.0f)
                curveTo(10.67f, 14.0f, 8.0f, 14.67f, 8.0f, 16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                moveTo(12.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cameraAccount!!
    }

private var _cameraAccount: ImageVector? = null
