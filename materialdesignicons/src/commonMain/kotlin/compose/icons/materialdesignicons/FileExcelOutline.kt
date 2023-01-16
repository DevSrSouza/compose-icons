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

public val MaterialDesignIcons.FileExcelOutline: ImageVector
    get() {
        if (_fileExcelOutline != null) {
            return _fileExcelOutline!!
        }
        _fileExcelOutline = Builder(name = "FileExcelOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.9f, 14.5f)
                lineTo(15.8f, 19.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 15.6f)
                lineTo(10.0f, 19.0f)
                horizontalLineTo(8.2f)
                lineTo(11.1f, 14.5f)
                lineTo(8.2f, 10.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 13.4f)
                lineTo(14.0f, 10.0f)
                horizontalLineTo(15.8f)
                lineTo(12.9f, 14.5f)
                close()
            }
        }
        .build()
        return _fileExcelOutline!!
    }

private var _fileExcelOutline: ImageVector? = null
