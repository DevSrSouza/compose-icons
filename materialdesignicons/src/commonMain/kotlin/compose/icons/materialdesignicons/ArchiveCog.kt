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

public val MaterialDesignIcons.ArchiveCog: ImageVector
    get() {
        if (_archiveCog != null) {
            return _archiveCog!!
        }
        _archiveCog = Builder(name = "ArchiveCog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                moveTo(12.0f, 19.0f)
                curveTo(12.0f, 19.7f, 12.11f, 20.37f, 12.3f, 21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.08f)
                curveTo(19.67f, 12.03f, 19.34f, 12.0f, 19.0f, 12.0f)
                curveTo(15.13f, 12.0f, 12.0f, 15.13f, 12.0f, 19.0f)
                moveTo(15.0f, 13.0f)
                verticalLineTo(11.5f)
                curveTo(15.0f, 11.22f, 14.78f, 11.0f, 14.5f, 11.0f)
                horizontalLineTo(9.5f)
                curveTo(9.22f, 11.0f, 9.0f, 11.22f, 9.0f, 11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                moveTo(23.8f, 20.4f)
                curveTo(23.9f, 20.4f, 23.9f, 20.5f, 23.8f, 20.6f)
                lineTo(22.8f, 22.3f)
                curveTo(22.7f, 22.4f, 22.6f, 22.4f, 22.5f, 22.4f)
                lineTo(21.3f, 22.0f)
                curveTo(21.0f, 22.2f, 20.8f, 22.3f, 20.5f, 22.5f)
                lineTo(20.3f, 23.8f)
                curveTo(20.3f, 23.9f, 20.2f, 24.0f, 20.1f, 24.0f)
                horizontalLineTo(18.1f)
                curveTo(18.0f, 24.0f, 17.9f, 23.9f, 17.8f, 23.8f)
                lineTo(17.6f, 22.5f)
                curveTo(17.3f, 22.4f, 17.0f, 22.2f, 16.8f, 22.0f)
                lineTo(15.6f, 22.5f)
                curveTo(15.5f, 22.5f, 15.4f, 22.5f, 15.3f, 22.4f)
                lineTo(14.3f, 20.7f)
                curveTo(14.2f, 20.6f, 14.3f, 20.5f, 14.4f, 20.4f)
                lineTo(15.5f, 19.6f)
                verticalLineTo(18.6f)
                lineTo(14.4f, 17.8f)
                curveTo(14.3f, 17.7f, 14.3f, 17.6f, 14.3f, 17.5f)
                lineTo(15.3f, 15.8f)
                curveTo(15.4f, 15.7f, 15.5f, 15.7f, 15.6f, 15.7f)
                lineTo(16.8f, 16.2f)
                curveTo(17.1f, 16.0f, 17.3f, 15.9f, 17.6f, 15.7f)
                lineTo(17.8f, 14.4f)
                curveTo(17.8f, 14.3f, 17.9f, 14.2f, 18.1f, 14.2f)
                horizontalLineTo(20.1f)
                curveTo(20.2f, 14.2f, 20.3f, 14.3f, 20.3f, 14.4f)
                lineTo(20.5f, 15.7f)
                curveTo(20.8f, 15.8f, 21.1f, 16.0f, 21.4f, 16.2f)
                lineTo(22.6f, 15.7f)
                curveTo(22.7f, 15.7f, 22.9f, 15.7f, 22.9f, 15.8f)
                lineTo(23.9f, 17.5f)
                curveTo(24.0f, 17.6f, 23.9f, 17.7f, 23.8f, 17.8f)
                lineTo(22.7f, 18.6f)
                verticalLineTo(19.6f)
                lineTo(23.8f, 20.4f)
                moveTo(20.5f, 19.0f)
                curveTo(20.5f, 18.2f, 19.8f, 17.5f, 19.0f, 17.5f)
                reflectiveCurveTo(17.5f, 18.2f, 17.5f, 19.0f)
                reflectiveCurveTo(18.2f, 20.5f, 19.0f, 20.5f)
                reflectiveCurveTo(20.5f, 19.8f, 20.5f, 19.0f)
                close()
            }
        }
        .build()
        return _archiveCog!!
    }

private var _archiveCog: ImageVector? = null
