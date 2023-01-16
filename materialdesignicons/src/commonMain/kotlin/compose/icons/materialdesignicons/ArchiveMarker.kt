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

public val MaterialDesignIcons.ArchiveMarker: ImageVector
    get() {
        if (_archiveMarker != null) {
            return _archiveMarker!!
        }
        _archiveMarker = Builder(name = "ArchiveMarker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                moveTo(13.63f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 11.22f, 9.22f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(14.5f)
                curveTo(14.72f, 11.0f, 14.9f, 11.14f, 14.97f, 11.33f)
                curveTo(15.93f, 10.5f, 17.17f, 10.0f, 18.5f, 10.0f)
                curveTo(19.0f, 10.0f, 19.5f, 10.08f, 20.0f, 10.22f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.19f)
                curveTo(14.12f, 19.43f, 13.0f, 17.35f, 13.0f, 15.5f)
                curveTo(13.0f, 14.61f, 13.23f, 13.76f, 13.63f, 13.0f)
                moveTo(22.0f, 15.5f)
                curveTo(22.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                reflectiveCurveTo(15.0f, 18.1f, 15.0f, 15.5f)
                curveTo(15.0f, 13.6f, 16.6f, 12.0f, 18.5f, 12.0f)
                reflectiveCurveTo(22.0f, 13.6f, 22.0f, 15.5f)
                moveTo(19.7f, 15.6f)
                curveTo(19.7f, 15.0f, 19.1f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                reflectiveCurveTo(19.8f, 16.2f, 19.7f, 15.6f)
                close()
            }
        }
        .build()
        return _archiveMarker!!
    }

private var _archiveMarker: ImageVector? = null
