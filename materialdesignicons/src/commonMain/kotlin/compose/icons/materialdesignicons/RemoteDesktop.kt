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

public val MaterialDesignIcons.RemoteDesktop: ImageVector
    get() {
        if (_remoteDesktop != null) {
            return _remoteDesktop!!
        }
        _remoteDesktop = Builder(name = "RemoteDesktop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(1.0f, 17.11f, 1.9f, 18.0f, 3.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 16.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 2.0f)
                moveTo(3.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                moveTo(15.0f, 5.0f)
                lineTo(11.5f, 8.5f)
                lineTo(15.0f, 12.0f)
                lineTo(16.4f, 10.6f)
                lineTo(14.3f, 8.5f)
                lineTo(16.4f, 6.4f)
                moveTo(9.0f, 8.0f)
                lineTo(7.6f, 9.4f)
                lineTo(9.7f, 11.5f)
                lineTo(7.6f, 13.6f)
                lineTo(9.0f, 15.0f)
                lineTo(12.5f, 11.5f)
            }
        }
        .build()
        return _remoteDesktop!!
    }

private var _remoteDesktop: ImageVector? = null
