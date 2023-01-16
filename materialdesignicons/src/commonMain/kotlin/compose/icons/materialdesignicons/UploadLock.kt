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

public val MaterialDesignIcons.UploadLock: ImageVector
    get() {
        if (_uploadLock != null) {
            return _uploadLock!!
        }
        _uploadLock = Builder(name = "UploadLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(16.5f, 22.0f, 16.0f, 21.5f, 16.0f, 21.0f)
                verticalLineTo(17.0f)
                curveTo(16.0f, 16.5f, 16.5f, 16.0f, 17.0f, 16.0f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 13.1f, 18.1f, 12.0f, 19.5f, 12.0f)
                curveTo(20.9f, 12.0f, 22.0f, 13.1f, 22.0f, 14.5f)
                verticalLineTo(16.0f)
                curveTo(22.5f, 16.0f, 23.0f, 16.5f, 23.0f, 17.0f)
                verticalLineTo(21.0f)
                curveTo(23.0f, 21.5f, 22.5f, 22.0f, 22.0f, 22.0f)
                moveTo(14.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                moveTo(21.0f, 16.0f)
                verticalLineTo(14.5f)
                curveTo(21.0f, 13.7f, 20.3f, 13.0f, 19.5f, 13.0f)
                curveTo(18.7f, 13.0f, 18.0f, 13.7f, 18.0f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                moveTo(15.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                lineTo(12.0f, 3.0f)
                lineTo(19.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _uploadLock!!
    }

private var _uploadLock: ImageVector? = null
