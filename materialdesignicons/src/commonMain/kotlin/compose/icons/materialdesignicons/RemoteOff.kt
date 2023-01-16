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

public val MaterialDesignIcons.RemoteOff: ImageVector
    get() {
        if (_remoteOff != null) {
            return _remoteOff!!
        }
        _remoteOff = Builder(name = "RemoteOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(21.0f, 21.72f)
                lineTo(19.73f, 23.0f)
                lineTo(16.0f, 19.27f)
                verticalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 23.0f)
                horizontalLineTo(9.0f)
                curveTo(8.46f, 23.0f, 8.0f, 22.55f, 8.0f, 22.0f)
                verticalLineTo(11.27f)
                lineTo(2.0f, 5.27f)
                moveTo(12.0f, 0.0f)
                curveTo(15.05f, 0.0f, 17.8f, 1.23f, 19.77f, 3.23f)
                lineTo(18.36f, 4.64f)
                curveTo(16.75f, 3.0f, 14.5f, 2.0f, 12.0f, 2.0f)
                curveTo(9.72f, 2.0f, 7.64f, 2.85f, 6.06f, 4.24f)
                lineTo(4.64f, 2.82f)
                curveTo(6.59f, 1.07f, 9.17f, 0.0f, 12.0f, 0.0f)
                moveTo(12.0f, 4.0f)
                curveTo(13.94f, 4.0f, 15.69f, 4.78f, 16.95f, 6.05f)
                lineTo(15.55f, 7.46f)
                curveTo(14.64f, 6.56f, 13.39f, 6.0f, 12.0f, 6.0f)
                curveTo(10.83f, 6.0f, 9.76f, 6.4f, 8.9f, 7.08f)
                lineTo(7.5f, 5.66f)
                curveTo(8.7f, 4.62f, 10.28f, 4.0f, 12.0f, 4.0f)
                moveTo(15.0f, 9.0f)
                curveTo(15.56f, 9.0f, 16.0f, 9.45f, 16.0f, 10.0f)
                verticalLineTo(14.18f)
                lineTo(13.5f, 11.69f)
                lineTo(13.31f, 11.5f)
                lineTo(10.82f, 9.0f)
                horizontalLineTo(15.0f)
                moveTo(10.03f, 13.3f)
                curveTo(10.16f, 14.16f, 10.84f, 14.85f, 11.71f, 15.0f)
                lineTo(10.03f, 13.3f)
                close()
            }
        }
        .build()
        return _remoteOff!!
    }

private var _remoteOff: ImageVector? = null
