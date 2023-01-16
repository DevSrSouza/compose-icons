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

public val MaterialDesignIcons.FileDocumentRemove: ImageVector
    get() {
        if (_fileDocumentRemove != null) {
            return _fileDocumentRemove!!
        }
        _fileDocumentRemove = Builder(name = "FileDocumentRemove", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.12f, 15.46f)
                lineTo(19.0f, 17.59f)
                lineTo(16.88f, 15.46f)
                lineTo(15.46f, 16.88f)
                lineTo(17.59f, 19.0f)
                lineTo(15.46f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 16.88f)
                moveTo(6.0f, 2.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(13.81f)
                curveTo(13.28f, 21.09f, 13.0f, 20.05f, 13.0f, 19.0f)
                curveTo(13.0f, 18.67f, 13.03f, 18.33f, 13.08f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.81f)
                curveTo(14.27f, 15.2f, 14.91f, 14.5f, 15.68f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.08f)
                curveTo(18.33f, 13.03f, 18.67f, 13.0f, 19.0f, 13.0f)
                curveTo(19.34f, 13.0f, 19.67f, 13.03f, 20.0f, 13.08f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _fileDocumentRemove!!
    }

private var _fileDocumentRemove: ImageVector? = null
