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

public val MaterialDesignIcons.DownloadMultiple: ImageVector
    get() {
        if (_downloadMultiple != null) {
            return _downloadMultiple!!
        }
        _downloadMultiple = Builder(name = "DownloadMultiple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 1.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                lineTo(12.0f, 14.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(9.0f)
                moveTo(5.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _downloadMultiple!!
    }

private var _downloadMultiple: ImageVector? = null
