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

public val MaterialDesignIcons.FileDocumentMinusOutline: ImageVector
    get() {
        if (_fileDocumentMinusOutline != null) {
            return _fileDocumentMinusOutline!!
        }
        _fileDocumentMinusOutline = Builder(name = "FileDocumentMinusOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                moveTo(6.0f, 2.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(13.81f)
                curveTo(13.45f, 21.38f, 13.2f, 20.7f, 13.08f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.08f)
                curveTo(18.33f, 13.03f, 18.67f, 13.0f, 19.0f, 13.0f)
                curveTo(19.34f, 13.0f, 19.67f, 13.03f, 20.0f, 13.08f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(8.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                moveTo(8.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _fileDocumentMinusOutline!!
    }

private var _fileDocumentMinusOutline: ImageVector? = null
