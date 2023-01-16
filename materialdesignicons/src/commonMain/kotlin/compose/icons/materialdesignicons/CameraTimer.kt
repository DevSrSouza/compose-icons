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

public val MaterialDesignIcons.CameraTimer: ImageVector
    get() {
        if (_cameraTimer != null) {
            return _cameraTimer!!
        }
        _cameraTimer = Builder(name = "CameraTimer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.94f, 6.35f)
                curveTo(4.55f, 5.96f, 4.55f, 5.32f, 4.94f, 4.93f)
                curveTo(5.33f, 4.54f, 5.96f, 4.54f, 6.35f, 4.93f)
                lineTo(13.07f, 10.31f)
                lineTo(13.42f, 10.59f)
                curveTo(14.2f, 11.37f, 14.2f, 12.64f, 13.42f, 13.42f)
                curveTo(12.64f, 14.2f, 11.37f, 14.2f, 10.59f, 13.42f)
                lineTo(10.31f, 13.07f)
                lineTo(4.94f, 6.35f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                curveTo(20.0f, 9.79f, 19.1f, 7.79f, 17.66f, 6.34f)
                lineTo(19.07f, 4.93f)
                curveTo(20.88f, 6.74f, 22.0f, 9.24f, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                horizontalLineTo(4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                moveTo(12.0f, 1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _cameraTimer!!
    }

private var _cameraTimer: ImageVector? = null
