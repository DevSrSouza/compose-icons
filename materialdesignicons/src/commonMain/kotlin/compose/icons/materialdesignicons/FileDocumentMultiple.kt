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

public val MaterialDesignIcons.FileDocumentMultiple: ImageVector
    get() {
        if (_fileDocumentMultiple != null) {
            return _fileDocumentMultiple!!
        }
        _fileDocumentMultiple = Builder(name = "FileDocumentMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 24.0f, 2.0f, 23.1f, 2.0f, 22.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                moveTo(15.0f, 7.0f)
                horizontalLineTo(20.5f)
                lineTo(15.0f, 1.5f)
                verticalLineTo(7.0f)
                moveTo(8.0f, 0.0f)
                horizontalLineTo(16.0f)
                lineTo(22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.11f, 21.11f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 20.0f, 6.0f, 19.1f, 6.0f, 18.0f)
                verticalLineTo(2.0f)
                curveTo(6.0f, 0.89f, 6.89f, 0.0f, 8.0f, 0.0f)
                moveTo(17.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                moveTo(20.0f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _fileDocumentMultiple!!
    }

private var _fileDocumentMultiple: ImageVector? = null
