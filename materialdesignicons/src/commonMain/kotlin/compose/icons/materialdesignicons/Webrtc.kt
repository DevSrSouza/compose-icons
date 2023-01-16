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

public val MaterialDesignIcons.Webrtc: ImageVector
    get() {
        if (_webrtc != null) {
            return _webrtc!!
        }
        _webrtc = Builder(name = "Webrtc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(14.44f, 2.0f, 16.5f, 3.75f, 16.91f, 6.07f)
                lineTo(17.75f, 6.0f)
                curveTo(20.5f, 6.0f, 22.75f, 8.24f, 22.75f, 11.0f)
                curveTo(22.75f, 12.89f, 21.7f, 14.53f, 20.16f, 15.38f)
                curveTo(20.54f, 16.09f, 20.75f, 16.89f, 20.75f, 17.75f)
                curveTo(20.75f, 20.5f, 18.5f, 22.75f, 15.75f, 22.75f)
                curveTo(14.26f, 22.75f, 12.92f, 22.1f, 12.0f, 21.06f)
                curveTo(11.08f, 22.1f, 9.74f, 22.75f, 8.25f, 22.75f)
                curveTo(5.5f, 22.75f, 3.25f, 20.5f, 3.25f, 17.75f)
                curveTo(3.25f, 16.89f, 3.47f, 16.09f, 3.84f, 15.38f)
                curveTo(2.3f, 14.53f, 1.25f, 12.89f, 1.25f, 11.0f)
                curveTo(1.25f, 8.24f, 3.5f, 6.0f, 6.25f, 6.0f)
                lineTo(7.09f, 6.07f)
                curveTo(7.5f, 3.75f, 9.56f, 2.0f, 12.0f, 2.0f)
                moveTo(6.75f, 20.25f)
                lineTo(13.66f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(17.55f, 17.0f, 18.0f, 16.55f, 18.0f, 16.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 8.45f, 17.55f, 8.0f, 17.0f, 8.0f)
                horizontalLineTo(7.0f)
                curveTo(6.45f, 8.0f, 6.0f, 8.45f, 6.0f, 9.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 16.55f, 6.45f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(7.77f)
                lineTo(6.75f, 20.25f)
                close()
            }
        }
        .build()
        return _webrtc!!
    }

private var _webrtc: ImageVector? = null
