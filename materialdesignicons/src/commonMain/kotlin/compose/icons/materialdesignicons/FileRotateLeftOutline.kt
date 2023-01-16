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

public val MaterialDesignIcons.FileRotateLeftOutline: ImageVector
    get() {
        if (_fileRotateLeftOutline != null) {
            return _fileRotateLeftOutline!!
        }
        _fileRotateLeftOutline = Builder(name = "FileRotateLeftOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.0f)
                curveTo(4.0f, 6.58f, 7.58f, 3.0f, 12.0f, 3.0f)
                lineTo(13.0f, 3.06f)
                verticalLineTo(5.08f)
                lineTo(12.0f, 5.0f)
                curveTo(8.69f, 5.0f, 6.0f, 7.69f, 6.0f, 11.0f)
                horizontalLineTo(9.0f)
                lineTo(5.0f, 15.0f)
                lineTo(1.0f, 11.0f)
                horizontalLineTo(4.0f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(13.0f)
                curveTo(11.9f, 7.0f, 11.0f, 7.9f, 11.0f, 9.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 19.11f, 11.9f, 20.0f, 13.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 20.0f, 21.0f, 19.11f, 21.0f, 18.0f)
                verticalLineTo(11.0f)
                lineTo(17.0f, 7.0f)
                moveTo(19.0f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _fileRotateLeftOutline!!
    }

private var _fileRotateLeftOutline: ImageVector? = null
