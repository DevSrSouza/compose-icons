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

public val MaterialDesignIcons.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = Builder(name = "FileVideo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                horizontalLineTo(18.5f)
                lineTo(13.0f, 3.5f)
                verticalLineTo(9.0f)
                moveTo(6.0f, 2.0f)
                horizontalLineTo(14.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.89f, 4.89f, 2.0f, 6.0f, 2.0f)
                moveTo(17.0f, 19.0f)
                verticalLineTo(13.0f)
                lineTo(14.0f, 15.2f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.8f)
                lineTo(17.0f, 19.0f)
                close()
            }
        }
        .build()
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
