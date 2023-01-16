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

public val MaterialDesignIcons.FilePowerpointOutline: ImageVector
    get() {
        if (_filePowerpointOutline != null) {
            return _filePowerpointOutline!!
        }
        _filePowerpointOutline = Builder(name = "FilePowerpointOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(15.2f, 10.8f)
                curveTo(14.7f, 10.3f, 14.1f, 10.0f, 12.8f, 10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.6f)
                verticalLineTo(15.7f)
                horizontalLineTo(12.8f)
                curveTo(14.1f, 15.7f, 14.6f, 15.5f, 15.2f, 15.0f)
                curveTo(15.8f, 14.5f, 16.0f, 13.8f, 16.0f, 12.9f)
                curveTo(16.0f, 12.0f, 15.8f, 11.4f, 15.2f, 10.8f)
                moveTo(13.9f, 14.0f)
                curveTo(13.6f, 14.3f, 13.3f, 14.5f, 12.7f, 14.5f)
                horizontalLineTo(10.6f)
                verticalLineTo(11.3f)
                horizontalLineTo(12.6f)
                curveTo(13.2f, 11.3f, 13.6f, 11.5f, 13.9f, 11.8f)
                curveTo(14.2f, 12.1f, 14.3f, 12.4f, 14.3f, 12.9f)
                reflectiveCurveTo(14.2f, 13.7f, 13.9f, 14.0f)
                close()
            }
        }
        .build()
        return _filePowerpointOutline!!
    }

private var _filePowerpointOutline: ImageVector? = null
