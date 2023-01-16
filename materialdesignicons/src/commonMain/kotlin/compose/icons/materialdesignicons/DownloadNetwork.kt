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

public val MaterialDesignIcons.DownloadNetwork: ImageVector
    get() {
        if (_downloadNetwork != null) {
            return _downloadNetwork!!
        }
        _downloadNetwork = Builder(name = "DownloadNetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 5.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 17.0f, 5.0f, 16.1f, 5.0f, 15.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                moveTo(12.0f, 14.5f)
                lineTo(16.5f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.5f)
                lineTo(12.0f, 14.5f)
                close()
            }
        }
        .build()
        return _downloadNetwork!!
    }

private var _downloadNetwork: ImageVector? = null
