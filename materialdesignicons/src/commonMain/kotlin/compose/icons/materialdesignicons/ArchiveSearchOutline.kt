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

public val MaterialDesignIcons.ArchiveSearchOutline: ImageVector
    get() {
        if (_archiveSearchOutline != null) {
            return _archiveSearchOutline!!
        }
        _archiveSearchOutline = Builder(name = "ArchiveSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.04f, 10.0f)
                curveTo(12.64f, 10.25f, 12.26f, 10.55f, 11.9f, 10.9f)
                curveTo(11.57f, 11.24f, 11.27f, 11.61f, 11.03f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.5f)
                curveTo(8.0f, 10.22f, 8.22f, 10.0f, 8.5f, 10.0f)
                horizontalLineTo(13.04f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                moveTo(18.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                moveTo(5.0f, 18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.82f)
                curveTo(11.24f, 19.4f, 10.8f, 18.72f, 10.5f, 18.0f)
                horizontalLineTo(5.0f)
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
        return _archiveSearchOutline!!
    }

private var _archiveSearchOutline: ImageVector? = null
