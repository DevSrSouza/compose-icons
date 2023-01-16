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

public val MaterialDesignIcons.ArchiveSearch: ImageVector
    get() {
        if (_archiveSearch != null) {
            return _archiveSearch!!
        }
        _archiveSearch = Builder(name = "ArchiveSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                moveTo(11.03f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.5f)
                curveTo(8.0f, 10.22f, 8.22f, 10.0f, 8.5f, 10.0f)
                horizontalLineTo(13.04f)
                curveTo(14.84f, 8.87f, 17.07f, 8.7f, 19.0f, 9.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.82f)
                curveTo(9.7f, 17.8f, 9.44f, 14.5f, 11.03f, 12.0f)
                moveTo(23.39f, 21.0f)
                lineTo(22.0f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20.0f, 16.5f, 20.0f)
                curveTo(14.0f, 20.0f, 12.0f, 18.0f, 12.0f, 15.5f)
                reflectiveCurveTo(14.0f, 11.0f, 16.5f, 11.0f)
                reflectiveCurveTo(21.0f, 13.0f, 21.0f, 15.5f)
                curveTo(21.0f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21.0f)
                moveTo(19.0f, 15.5f)
                curveTo(19.0f, 14.12f, 17.88f, 13.0f, 16.5f, 13.0f)
                reflectiveCurveTo(14.0f, 14.12f, 14.0f, 15.5f)
                reflectiveCurveTo(15.12f, 18.0f, 16.5f, 18.0f)
                reflectiveCurveTo(19.0f, 16.88f, 19.0f, 15.5f)
                close()
            }
        }
        .build()
        return _archiveSearch!!
    }

private var _archiveSearch: ImageVector? = null
