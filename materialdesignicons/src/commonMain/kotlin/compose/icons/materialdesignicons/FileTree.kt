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

public val MaterialDesignIcons.FileTree: ImageVector
    get() {
        if (_fileTree != null) {
            return _fileTree!!
        }
        _fileTree = Builder(name = "FileTree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                moveTo(15.0f, 10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                moveTo(15.0f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                moveTo(13.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                lineTo(5.0f, 20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _fileTree!!
    }

private var _fileTree: ImageVector? = null
