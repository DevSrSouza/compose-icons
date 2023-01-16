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

public val MaterialDesignIcons.ArchiveClockOutline: ImageVector
    get() {
        if (_archiveClockOutline != null) {
            return _archiveClockOutline!!
        }
        _archiveClockOutline = Builder(name = "ArchiveClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(2.0f)
                moveTo(18.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                moveTo(16.0f, 9.0f)
                curveTo(14.69f, 9.0f, 13.46f, 9.37f, 12.41f, 10.0f)
                horizontalLineTo(8.5f)
                curveTo(8.22f, 10.0f, 8.0f, 10.22f, 8.0f, 10.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.26f)
                curveTo(9.47f, 13.13f, 9.0f, 14.5f, 9.0f, 16.0f)
                curveTo(9.0f, 16.7f, 9.11f, 17.37f, 9.29f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.26f)
                curveTo(11.53f, 21.81f, 13.62f, 23.0f, 16.0f, 23.0f)
                curveTo(19.87f, 23.0f, 23.0f, 19.87f, 23.0f, 16.0f)
                curveTo(23.0f, 12.13f, 19.87f, 9.0f, 16.0f, 9.0f)
                moveTo(16.0f, 21.0f)
                curveTo(13.24f, 21.0f, 11.0f, 18.76f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(21.0f, 13.24f, 21.0f, 16.0f)
                reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f)
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                close()
            }
        }
        .build()
        return _archiveClockOutline!!
    }

private var _archiveClockOutline: ImageVector? = null
