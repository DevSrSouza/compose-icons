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

public val MaterialDesignIcons.FileImageOutline: ImageVector
    get() {
        if (_fileImageOutline != null) {
            return _fileImageOutline!!
        }
        _fileImageOutline = Builder(name = "FileImageOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 2.0f)
                horizontalLineTo(14.0f)
                moveTo(18.0f, 20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                moveTo(17.0f, 13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 14.0f)
                lineTo(14.0f, 16.0f)
                moveTo(10.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 10.5f)
                close()
            }
        }
        .build()
        return _fileImageOutline!!
    }

private var _fileImageOutline: ImageVector? = null
