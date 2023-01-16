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

public val MaterialDesignIcons.ArchiveClock: ImageVector
    get() {
        if (_archiveClock != null) {
            return _archiveClock!!
        }
        _archiveClock = Builder(name = "ArchiveClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                moveTo(16.5f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                lineTo(18.61f, 19.16f)
                lineTo(19.36f, 17.94f)
                lineTo(16.5f, 16.25f)
                verticalLineTo(12.0f)
                moveTo(23.0f, 16.0f)
                curveTo(23.0f, 19.87f, 19.87f, 23.0f, 16.0f, 23.0f)
                curveTo(13.62f, 23.0f, 11.53f, 21.81f, 10.26f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.68f)
                curveTo(21.36f, 10.81f, 23.0f, 13.21f, 23.0f, 16.0f)
                moveTo(8.0f, 12.0f)
                horizontalLineTo(10.26f)
                curveTo(10.83f, 11.19f, 11.56f, 10.5f, 12.41f, 10.0f)
                horizontalLineTo(8.5f)
                curveTo(8.22f, 10.0f, 8.0f, 10.22f, 8.0f, 10.5f)
                verticalLineTo(12.0f)
                moveTo(21.0f, 16.0f)
                curveTo(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(11.0f, 13.24f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 21.0f, 16.0f, 21.0f)
                reflectiveCurveTo(21.0f, 18.76f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _archiveClock!!
    }

private var _archiveClock: ImageVector? = null
