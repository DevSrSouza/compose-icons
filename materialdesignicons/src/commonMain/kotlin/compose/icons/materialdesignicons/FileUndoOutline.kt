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

public val MaterialDesignIcons.FileUndoOutline: ImageVector
    get() {
        if (_fileUndoOutline != null) {
            return _fileUndoOutline!!
        }
        _fileUndoOutline = Builder(name = "FileUndoOutline", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(17.0f, 17.61f)
                lineTo(15.84f, 18.0f)
                curveTo(15.33f, 16.44f, 13.86f, 15.31f, 12.13f, 15.31f)
                curveTo(11.17f, 15.31f, 10.31f, 15.66f, 9.63f, 16.23f)
                lineTo(11.4f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.6f)
                lineTo(8.76f, 15.36f)
                curveTo(9.66f, 14.57f, 10.83f, 14.09f, 12.13f, 14.09f)
                curveTo(14.4f, 14.09f, 16.33f, 15.57f, 17.0f, 17.61f)
                close()
            }
        }
        .build()
        return _fileUndoOutline!!
    }

private var _fileUndoOutline: ImageVector? = null
