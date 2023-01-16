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

public val MaterialDesignIcons.FileCodeOutline: ImageVector
    get() {
        if (_fileCodeOutline != null) {
            return _fileCodeOutline!!
        }
        _fileCodeOutline = Builder(name = "FileCodeOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                moveTo(9.54f, 15.65f)
                lineTo(11.63f, 17.74f)
                lineTo(10.35f, 19.0f)
                lineTo(7.0f, 15.65f)
                lineTo(10.35f, 12.3f)
                lineTo(11.63f, 13.56f)
                lineTo(9.54f, 15.65f)
                moveTo(17.0f, 15.65f)
                lineTo(13.65f, 19.0f)
                lineTo(12.38f, 17.74f)
                lineTo(14.47f, 15.65f)
                lineTo(12.38f, 13.56f)
                lineTo(13.65f, 12.3f)
                lineTo(17.0f, 15.65f)
                close()
            }
        }
        .build()
        return _fileCodeOutline!!
    }

private var _fileCodeOutline: ImageVector? = null
