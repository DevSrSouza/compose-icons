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

public val MaterialDesignIcons.FileDocumentAlert: ImageVector
    get() {
        if (_fileDocumentAlert != null) {
            return _fileDocumentAlert!!
        }
        _fileDocumentAlert = Builder(name = "FileDocumentAlert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                moveTo(20.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                moveTo(11.0f, 9.0f)
                horizontalLineTo(16.5f)
                lineTo(11.0f, 3.5f)
                verticalLineTo(9.0f)
                moveTo(4.0f, 2.0f)
                horizontalLineTo(12.0f)
                lineTo(18.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 21.11f, 17.11f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 22.0f, 2.0f, 21.1f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.89f, 2.89f, 2.0f, 4.0f, 2.0f)
                moveTo(13.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                moveTo(16.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _fileDocumentAlert!!
    }

private var _fileDocumentAlert: ImageVector? = null
