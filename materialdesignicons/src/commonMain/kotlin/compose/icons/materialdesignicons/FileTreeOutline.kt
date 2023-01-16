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

public val MaterialDesignIcons.FileTreeOutline: ImageVector
    get() {
        if (_fileTreeOutline != null) {
            return _fileTreeOutline!!
        }
        _fileTreeOutline = Builder(name = "FileTreeOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                moveTo(8.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                moveTo(10.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                moveTo(20.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                moveTo(22.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                moveTo(20.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                moveTo(22.0f, 16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _fileTreeOutline!!
    }

private var _fileTreeOutline: ImageVector? = null
