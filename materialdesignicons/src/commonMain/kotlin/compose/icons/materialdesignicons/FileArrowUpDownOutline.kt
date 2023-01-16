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

public val MaterialDesignIcons.FileArrowUpDownOutline: ImageVector
    get() {
        if (_fileArrowUpDownOutline != null) {
            return _fileArrowUpDownOutline!!
        }
        _fileArrowUpDownOutline = Builder(name = "FileArrowUpDownOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.09f, 20.0f)
                curveTo(13.21f, 20.72f, 13.46f, 21.39f, 13.81f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.11f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.89f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(14.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13.0f, 19.0f, 13.0f)
                curveTo(18.66f, 13.0f, 18.33f, 13.04f, 18.0f, 13.09f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.09f)
                moveTo(17.0f, 15.0f)
                lineTo(14.5f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.5f)
                lineTo(17.0f, 15.0f)
                moveTo(22.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.5f)
                lineTo(21.0f, 23.0f)
                lineTo(23.5f, 20.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _fileArrowUpDownOutline!!
    }

private var _fileArrowUpDownOutline: ImageVector? = null
