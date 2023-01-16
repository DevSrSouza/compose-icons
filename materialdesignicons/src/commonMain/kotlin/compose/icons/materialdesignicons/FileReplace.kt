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

public val MaterialDesignIcons.FileReplace: ImageVector
    get() {
        if (_fileReplace != null) {
            return _fileReplace!!
        }
        _fileReplace = Builder(name = "FileReplace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                horizontalLineTo(19.5f)
                lineTo(14.0f, 6.5f)
                verticalLineTo(12.0f)
                moveTo(8.0f, 5.0f)
                horizontalLineTo(15.0f)
                lineTo(21.0f, 11.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 23.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 23.0f, 6.0f, 22.1f, 6.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                lineTo(15.0f, 17.0f)
                lineTo(11.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 5.0f)
                moveTo(13.5f, 3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 16.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 1.0f)
                horizontalLineTo(11.5f)
                lineTo(13.5f, 3.0f)
                close()
            }
        }
        .build()
        return _fileReplace!!
    }

private var _fileReplace: ImageVector? = null
