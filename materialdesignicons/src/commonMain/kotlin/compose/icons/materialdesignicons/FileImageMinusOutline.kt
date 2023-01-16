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

public val MaterialDesignIcons.FileImageMinusOutline: ImageVector
    get() {
        if (_fileImageMinusOutline != null) {
            return _fileImageMinusOutline!!
        }
        _fileImageMinusOutline = Builder(name = "FileImageMinusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                lineTo(12.0f, 14.0f)
                lineTo(13.88f, 15.88f)
                curveTo(13.33f, 16.79f, 13.0f, 17.86f, 13.0f, 19.0f)
                horizontalLineTo(7.0f)
                moveTo(10.0f, 10.5f)
                curveTo(10.0f, 9.67f, 9.33f, 9.0f, 8.5f, 9.0f)
                reflectiveCurveTo(7.0f, 9.67f, 7.0f, 10.5f)
                reflectiveCurveTo(7.67f, 12.0f, 8.5f, 12.0f)
                reflectiveCurveTo(10.0f, 11.33f, 10.0f, 10.5f)
                moveTo(13.09f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.09f)
                curveTo(18.33f, 13.04f, 18.66f, 13.0f, 19.0f, 13.0f)
                curveTo(19.34f, 13.0f, 19.67f, 13.04f, 20.0f, 13.09f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(13.81f)
                curveTo(13.46f, 21.39f, 13.21f, 20.72f, 13.09f, 20.0f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _fileImageMinusOutline!!
    }

private var _fileImageMinusOutline: ImageVector? = null
