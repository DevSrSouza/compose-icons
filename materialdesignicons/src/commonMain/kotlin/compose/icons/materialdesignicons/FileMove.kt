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

public val MaterialDesignIcons.FileMove: ImageVector
    get() {
        if (_fileMove != null) {
            return _fileMove!!
        }
        _fileMove = Builder(name = "FileMove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                lineTo(23.0f, 18.5f)
                lineTo(18.0f, 23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(18.5f)
                lineTo(13.0f, 3.5f)
                verticalLineTo(9.0f)
                moveTo(6.0f, 2.0f)
                horizontalLineTo(14.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(12.34f)
                curveTo(19.37f, 12.12f, 18.7f, 12.0f, 18.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 18.0f)
                curveTo(12.0f, 19.54f, 12.58f, 20.94f, 13.53f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 2.0f)
                close()
            }
        }
        .build()
        return _fileMove!!
    }

private var _fileMove: ImageVector? = null
