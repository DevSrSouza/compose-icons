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

public val MaterialDesignIcons.FileCad: ImageVector
    get() {
        if (_fileCad != null) {
            return _fileCad!!
        }
        _fileCad = Builder(name = "FileCad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 22.0f, 20.0f, 21.1f, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                moveTo(9.88f, 9.25f)
                horizontalLineTo(11.12f)
                verticalLineTo(10.19f)
                curveTo(11.81f, 10.18f, 12.38f, 10.75f, 12.38f, 11.44f)
                verticalLineTo(13.5f)
                lineTo(12.26f, 13.63f)
                lineTo(13.15f, 15.17f)
                curveTo(13.47f, 14.67f, 13.63f, 14.09f, 13.62f, 13.5f)
                horizontalLineTo(14.88f)
                curveTo(14.88f, 14.54f, 14.5f, 15.55f, 13.83f, 16.35f)
                lineTo(15.5f, 19.25f)
                verticalLineTo(20.5f)
                lineTo(14.42f, 19.88f)
                lineTo(12.87f, 17.19f)
                curveTo(12.17f, 17.65f, 11.34f, 17.89f, 10.5f, 17.89f)
                curveTo(9.66f, 17.89f, 8.84f, 17.65f, 8.13f, 17.19f)
                lineTo(6.58f, 19.88f)
                lineTo(5.5f, 20.5f)
                verticalLineTo(19.25f)
                lineTo(8.74f, 13.63f)
                lineTo(8.62f, 13.5f)
                verticalLineTo(11.44f)
                curveTo(8.62f, 10.75f, 9.19f, 10.18f, 9.88f, 10.19f)
                moveTo(10.5f, 11.44f)
                curveTo(9.81f, 11.44f, 9.46f, 12.28f, 9.95f, 12.77f)
                curveTo(10.44f, 13.26f, 11.28f, 12.92f, 11.28f, 12.22f)
                curveTo(11.28f, 11.79f, 10.93f, 11.44f, 10.5f, 11.44f)
                moveTo(9.66f, 14.54f)
                lineTo(8.76f, 16.11f)
                curveTo(9.81f, 16.82f, 11.19f, 16.82f, 12.24f, 16.11f)
                lineTo(11.34f, 14.54f)
                curveTo(10.87f, 15.0f, 10.13f, 15.0f, 9.66f, 14.54f)
                close()
            }
        }
        .build()
        return _fileCad!!
    }

private var _fileCad: ImageVector? = null
