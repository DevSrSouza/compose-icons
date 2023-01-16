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

public val MaterialDesignIcons.FileXmlBox: ImageVector
    get() {
        if (_fileXmlBox != null) {
            return _fileXmlBox!!
        }
        _fileXmlBox = Builder(name = "FileXmlBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.11f, 3.0f, 19.0f, 3.0f)
                moveTo(8.0f, 15.0f)
                horizontalLineTo(6.5f)
                lineTo(6.0f, 13.0f)
                lineTo(5.5f, 15.0f)
                horizontalLineTo(4.0f)
                lineTo(4.75f, 12.0f)
                lineTo(4.0f, 9.0f)
                horizontalLineTo(5.5f)
                lineTo(6.0f, 11.0f)
                lineTo(6.5f, 9.0f)
                horizontalLineTo(8.0f)
                lineTo(7.25f, 12.0f)
                lineTo(8.0f, 15.0f)
                moveTo(15.5f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                curveTo(9.0f, 9.9f, 9.9f, 9.0f, 11.0f, 9.0f)
                horizontalLineTo(13.5f)
                curveTo(14.61f, 9.0f, 15.5f, 9.9f, 15.5f, 11.0f)
                verticalLineTo(15.0f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _fileXmlBox!!
    }

private var _fileXmlBox: ImageVector? = null
