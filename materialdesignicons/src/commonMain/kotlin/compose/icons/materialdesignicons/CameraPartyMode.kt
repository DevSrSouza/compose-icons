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

public val MaterialDesignIcons.CameraPartyMode: ImageVector
    get() {
        if (_cameraPartyMode != null) {
            return _cameraPartyMode!!
        }
        _cameraPartyMode = Builder(name = "CameraPartyMode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(10.37f, 17.0f, 8.94f, 16.21f, 8.0f, 15.0f)
                horizontalLineTo(12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 12.0f)
                curveTo(15.0f, 11.65f, 14.93f, 11.31f, 14.82f, 11.0f)
                horizontalLineTo(16.9f)
                curveTo(16.96f, 11.32f, 17.0f, 11.66f, 17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 17.0f)
                moveTo(12.0f, 7.0f)
                curveTo(13.63f, 7.0f, 15.06f, 7.79f, 16.0f, 9.0f)
                horizontalLineTo(12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 12.0f)
                curveTo(9.0f, 12.35f, 9.07f, 12.68f, 9.18f, 13.0f)
                horizontalLineTo(7.1f)
                curveTo(7.03f, 12.68f, 7.0f, 12.34f, 7.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 7.0f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(16.83f)
                lineTo(15.0f, 2.0f)
                horizontalLineTo(9.0f)
                lineTo(7.17f, 4.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _cameraPartyMode!!
    }

private var _cameraPartyMode: ImageVector? = null
