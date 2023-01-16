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

public val MaterialDesignIcons.FileEditOutline: ImageVector
    get() {
        if (_fileEditOutline != null) {
            return _fileEditOutline!!
        }
        _fileEditOutline = Builder(name = "FileEditOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.1f)
                lineTo(20.0f, 10.1f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                moveTo(20.2f, 13.0f)
                curveTo(20.3f, 13.0f, 20.5f, 13.1f, 20.6f, 13.2f)
                lineTo(21.9f, 14.5f)
                curveTo(22.1f, 14.7f, 22.1f, 15.1f, 21.9f, 15.3f)
                lineTo(20.9f, 16.3f)
                lineTo(18.8f, 14.2f)
                lineTo(19.8f, 13.2f)
                curveTo(19.9f, 13.1f, 20.0f, 13.0f, 20.2f, 13.0f)
                moveTo(20.2f, 16.9f)
                lineTo(14.1f, 23.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(20.9f)
                lineTo(18.1f, 14.8f)
                lineTo(20.2f, 16.9f)
                close()
            }
        }
        .build()
        return _fileEditOutline!!
    }

private var _fileEditOutline: ImageVector? = null
