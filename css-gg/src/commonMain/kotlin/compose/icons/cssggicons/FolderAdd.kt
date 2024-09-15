package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.FolderAdd: ImageVector
    get() {
        if (_folderAdd != null) {
            return _folderAdd!!
        }
        _folderAdd = Builder(name = "FolderAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 1.5f)
                curveTo(2.895f, 1.5f, 2.0f, 2.395f, 2.0f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(2.0f, 4.557f, 2.002f, 4.613f, 2.007f, 4.668f)
                curveTo(0.838f, 5.078f, 0.0f, 6.191f, 0.0f, 7.5f)
                verticalLineTo(19.5f)
                curveTo(0.0f, 21.157f, 1.343f, 22.5f, 3.0f, 22.5f)
                horizontalLineTo(21.0f)
                curveTo(22.657f, 22.5f, 24.0f, 21.157f, 24.0f, 19.5f)
                verticalLineTo(7.5f)
                curveTo(24.0f, 5.843f, 22.657f, 4.5f, 21.0f, 4.5f)
                horizontalLineTo(11.874f)
                curveTo(11.43f, 2.775f, 9.864f, 1.5f, 8.0f, 1.5f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.732f, 4.5f)
                curveTo(9.387f, 3.902f, 8.74f, 3.5f, 8.0f, 3.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(9.732f)
                close()
                moveTo(3.0f, 6.5f)
                curveTo(2.448f, 6.5f, 2.0f, 6.948f, 2.0f, 7.5f)
                verticalLineTo(19.5f)
                curveTo(2.0f, 20.052f, 2.448f, 20.5f, 3.0f, 20.5f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 20.5f, 22.0f, 20.052f, 22.0f, 19.5f)
                verticalLineTo(7.5f)
                curveTo(22.0f, 6.948f, 21.552f, 6.5f, 21.0f, 6.5f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _folderAdd!!
    }

private var _folderAdd: ImageVector? = null
