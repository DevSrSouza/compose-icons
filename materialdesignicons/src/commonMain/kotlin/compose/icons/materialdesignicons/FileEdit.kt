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

public val MaterialDesignIcons.FileEdit: ImageVector
    get() {
        if (_fileEdit != null) {
            return _fileEdit!!
        }
        _fileEdit = Builder(name = "FileEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.1f)
                lineTo(20.0f, 10.1f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                moveTo(20.1f, 13.0f)
                curveTo(20.0f, 13.0f, 19.8f, 13.1f, 19.7f, 13.2f)
                lineTo(18.7f, 14.2f)
                lineTo(20.8f, 16.3f)
                lineTo(21.8f, 15.3f)
                curveTo(22.0f, 15.1f, 22.0f, 14.7f, 21.8f, 14.5f)
                lineTo(20.5f, 13.2f)
                curveTo(20.4f, 13.1f, 20.3f, 13.0f, 20.1f, 13.0f)
                moveTo(18.1f, 14.8f)
                lineTo(12.0f, 20.9f)
                verticalLineTo(23.0f)
                horizontalLineTo(14.1f)
                lineTo(20.2f, 16.9f)
                lineTo(18.1f, 14.8f)
                close()
            }
        }
        .build()
        return _fileEdit!!
    }

private var _fileEdit: ImageVector? = null
