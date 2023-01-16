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

public val MaterialDesignIcons.FileImagePlus: ImageVector
    get() {
        if (_fileImagePlus != null) {
            return _fileImagePlus!!
        }
        _fileImagePlus = Builder(name = "FileImagePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.09f, 20.0f)
                horizontalLineTo(6.0f)
                lineTo(12.0f, 14.0f)
                lineTo(13.88f, 15.88f)
                curveTo(14.5f, 14.9f, 15.36f, 14.1f, 16.4f, 13.6f)
                lineTo(18.0f, 12.0f)
                verticalLineTo(13.09f)
                curveTo(18.33f, 13.04f, 18.66f, 13.0f, 19.0f, 13.0f)
                curveTo(19.34f, 13.0f, 19.67f, 13.04f, 20.0f, 13.09f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(13.81f)
                curveTo(13.46f, 21.39f, 13.21f, 20.72f, 13.09f, 20.0f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                moveTo(8.0f, 9.0f)
                curveTo(9.11f, 9.0f, 10.0f, 9.9f, 10.0f, 11.0f)
                reflectiveCurveTo(9.11f, 13.0f, 8.0f, 13.0f)
                reflectiveCurveTo(6.0f, 12.11f, 6.0f, 11.0f)
                reflectiveCurveTo(6.9f, 9.0f, 8.0f, 9.0f)
                moveTo(20.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _fileImagePlus!!
    }

private var _fileImagePlus: ImageVector? = null
