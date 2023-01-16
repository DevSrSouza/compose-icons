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

public val MaterialDesignIcons.FileEyeOutline: ImageVector
    get() {
        if (_fileEyeOutline != null) {
            return _fileEyeOutline!!
        }
        _fileEyeOutline = Builder(name = "FileEyeOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                curveTo(17.56f, 18.0f, 18.0f, 18.44f, 18.0f, 19.0f)
                curveTo(18.0f, 19.56f, 17.56f, 20.0f, 17.0f, 20.0f)
                curveTo(16.44f, 20.0f, 16.0f, 19.56f, 16.0f, 19.0f)
                curveTo(16.0f, 18.44f, 16.44f, 18.0f, 17.0f, 18.0f)
                moveTo(17.0f, 15.0f)
                curveTo(14.27f, 15.0f, 11.94f, 16.66f, 11.0f, 19.0f)
                curveTo(11.94f, 21.34f, 14.27f, 23.0f, 17.0f, 23.0f)
                curveTo(19.73f, 23.0f, 22.06f, 21.34f, 23.0f, 19.0f)
                curveTo(22.06f, 16.66f, 19.73f, 15.0f, 17.0f, 15.0f)
                moveTo(17.0f, 21.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 21.5f)
                moveTo(9.27f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.07f)
                curveTo(18.7f, 13.15f, 19.36f, 13.32f, 20.0f, 13.56f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(10.5f)
                curveTo(10.0f, 21.41f, 9.59f, 20.73f, 9.27f, 20.0f)
                close()
            }
        }
        .build()
        return _fileEyeOutline!!
    }

private var _fileEyeOutline: ImageVector? = null
