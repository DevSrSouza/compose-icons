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

public val MaterialDesignIcons.DownloadLockOutline: ImageVector
    get() {
        if (_downloadLockOutline != null) {
            return _downloadLockOutline!!
        }
        _downloadLockOutline = Builder(name = "DownloadLockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(13.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.17f)
                lineTo(12.0f, 13.17f)
                lineTo(9.83f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                moveTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                lineTo(12.0f, 16.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                moveTo(14.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _downloadLockOutline!!
    }

private var _downloadLockOutline: ImageVector? = null
