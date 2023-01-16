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

public val MaterialDesignIcons.FileExcelBoxOutline: ImageVector
    get() {
        if (_fileExcelBoxOutline != null) {
            return _fileExcelBoxOutline!!
        }
        _fileExcelBoxOutline = Builder(name = "FileExcelBoxOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.11f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                moveTo(13.0f, 12.0f)
                lineTo(16.2f, 17.0f)
                horizontalLineTo(14.2f)
                lineTo(12.0f, 13.2f)
                lineTo(9.8f, 17.0f)
                horizontalLineTo(7.8f)
                lineTo(11.0f, 12.0f)
                lineTo(7.8f, 7.0f)
                horizontalLineTo(9.8f)
                lineTo(12.0f, 10.8f)
                lineTo(14.2f, 7.0f)
                horizontalLineTo(16.2f)
                lineTo(13.0f, 12.0f)
                close()
            }
        }
        .build()
        return _fileExcelBoxOutline!!
    }

private var _fileExcelBoxOutline: ImageVector? = null
