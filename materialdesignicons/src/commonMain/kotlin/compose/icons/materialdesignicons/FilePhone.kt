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

public val MaterialDesignIcons.FilePhone: ImageVector
    get() {
        if (_filePhone != null) {
            return _filePhone!!
        }
        _filePhone = Builder(name = "FilePhone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(17.0f, 19.44f)
                curveTo(17.0f, 19.75f, 16.75f, 20.0f, 16.44f, 20.0f)
                curveTo(11.23f, 20.0f, 7.0f, 15.77f, 7.0f, 10.56f)
                curveTo(7.0f, 10.25f, 7.25f, 10.0f, 7.56f, 10.0f)
                horizontalLineTo(9.5f)
                curveTo(9.81f, 10.0f, 10.06f, 10.25f, 10.06f, 10.56f)
                curveTo(10.06f, 11.25f, 10.17f, 11.92f, 10.37f, 12.54f)
                curveTo(10.43f, 12.73f, 10.39f, 12.95f, 10.23f, 13.11f)
                lineTo(9.0f, 14.33f)
                curveTo(9.81f, 15.9f, 11.1f, 17.19f, 12.67f, 18.0f)
                lineTo(13.9f, 16.77f)
                curveTo(14.05f, 16.61f, 14.27f, 16.57f, 14.46f, 16.63f)
                curveTo(15.08f, 16.83f, 15.75f, 16.95f, 16.45f, 16.95f)
                curveTo(16.75f, 16.95f, 17.0f, 17.19f, 17.0f, 17.5f)
                verticalLineTo(19.44f)
                moveTo(13.0f, 9.0f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _filePhone!!
    }

private var _filePhone: ImageVector? = null
