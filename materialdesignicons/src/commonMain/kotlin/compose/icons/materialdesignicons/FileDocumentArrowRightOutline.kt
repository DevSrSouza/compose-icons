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

public val MaterialDesignIcons.FileDocumentArrowRightOutline: ImageVector
    get() {
        if (_fileDocumentArrowRightOutline != null) {
            return _fileDocumentArrowRightOutline!!
        }
        _fileDocumentArrowRightOutline = Builder(name = "FileDocumentArrowRightOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 19.0f)
                lineTo(20.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                lineTo(23.0f, 19.0f)
                moveTo(13.8f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.9f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(14.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(13.1f)
                curveTo(19.7f, 13.0f, 19.3f, 13.0f, 19.0f, 13.0f)
                reflectiveCurveTo(18.3f, 13.0f, 18.0f, 13.1f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.1f)
                curveTo(13.2f, 20.7f, 13.5f, 21.4f, 13.8f, 22.0f)
                moveTo(8.0f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.8f)
                curveTo(15.9f, 13.9f, 15.8f, 13.9f, 15.7f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                moveTo(8.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _fileDocumentArrowRightOutline!!
    }

private var _fileDocumentArrowRightOutline: ImageVector? = null
