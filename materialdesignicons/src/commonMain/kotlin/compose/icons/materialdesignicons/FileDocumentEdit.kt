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

public val MaterialDesignIcons.FileDocumentEdit: ImageVector
    get() {
        if (_fileDocumentEdit != null) {
            return _fileDocumentEdit!!
        }
        _fileDocumentEdit = Builder(name = "FileDocumentEdit", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.09f)
                lineTo(12.09f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.09f)
                lineTo(16.09f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.09f)
                lineTo(20.0f, 10.09f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                moveTo(20.15f, 13.0f)
                curveTo(20.0f, 13.0f, 19.86f, 13.05f, 19.75f, 13.16f)
                lineTo(18.73f, 14.18f)
                lineTo(20.82f, 16.26f)
                lineTo(21.84f, 15.25f)
                curveTo(22.05f, 15.03f, 22.05f, 14.67f, 21.84f, 14.46f)
                lineTo(20.54f, 13.16f)
                curveTo(20.43f, 13.05f, 20.29f, 13.0f, 20.15f, 13.0f)
                moveTo(18.14f, 14.77f)
                lineTo(12.0f, 20.92f)
                verticalLineTo(23.0f)
                horizontalLineTo(14.08f)
                lineTo(20.23f, 16.85f)
                lineTo(18.14f, 14.77f)
                close()
            }
        }
        .build()
        return _fileDocumentEdit!!
    }

private var _fileDocumentEdit: ImageVector? = null
