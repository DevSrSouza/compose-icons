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

public val MaterialDesignIcons.DownloadLock: ImageVector
    get() {
        if (_downloadLock != null) {
            return _downloadLock!!
        }
        _downloadLock = Builder(name = "DownloadLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                moveTo(19.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                lineTo(12.0f, 16.0f)
                moveTo(22.0f, 16.0f)
                arcTo(1.08f, 1.08f, 0.0f, false, true, 23.0f, 17.0f)
                verticalLineTo(21.0f)
                arcTo(1.08f, 1.08f, 0.0f, false, true, 22.0f, 22.0f)
                horizontalLineTo(17.0f)
                arcTo(1.08f, 1.08f, 0.0f, false, true, 16.0f, 21.0f)
                verticalLineTo(17.0f)
                arcTo(1.08f, 1.08f, 0.0f, false, true, 17.0f, 16.0f)
                verticalLineTo(14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 22.0f, 14.5f)
                verticalLineTo(16.0f)
                moveTo(21.0f, 16.0f)
                verticalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
            }
        }
        .build()
        return _downloadLock!!
    }

private var _downloadLock: ImageVector? = null
