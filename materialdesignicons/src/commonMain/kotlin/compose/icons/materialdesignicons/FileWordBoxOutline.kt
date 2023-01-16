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

public val MaterialDesignIcons.FileWordBoxOutline: ImageVector
    get() {
        if (_fileWordBoxOutline != null) {
            return _fileWordBoxOutline!!
        }
        _fileWordBoxOutline = Builder(name = "FileWordBoxOutline", defaultWidth = 24.0.dp,
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
                moveTo(17.9f, 7.0f)
                lineTo(15.5f, 17.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 9.5f)
                lineTo(10.0f, 17.0f)
                horizontalLineTo(8.5f)
                lineTo(6.1f, 7.0f)
                horizontalLineTo(7.8f)
                lineTo(9.34f, 14.5f)
                lineTo(11.3f, 7.0f)
                horizontalLineTo(12.7f)
                lineTo(14.67f, 14.5f)
                lineTo(16.2f, 7.0f)
                horizontalLineTo(17.9f)
                close()
            }
        }
        .build()
        return _fileWordBoxOutline!!
    }

private var _fileWordBoxOutline: ImageVector? = null
