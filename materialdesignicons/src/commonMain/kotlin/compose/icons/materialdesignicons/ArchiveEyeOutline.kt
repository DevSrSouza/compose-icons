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

public val MaterialDesignIcons.ArchiveEyeOutline: ImageVector
    get() {
        if (_archiveEyeOutline != null) {
            return _archiveEyeOutline!!
        }
        _archiveEyeOutline = Builder(name = "ArchiveEyeOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 11.0f)
                curveTo(14.78f, 11.0f, 15.0f, 11.22f, 15.0f, 11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 11.22f, 9.22f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(14.5f)
                moveTo(20.0f, 13.55f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.06f)
                curveTo(18.69f, 13.14f, 19.36f, 13.31f, 20.0f, 13.55f)
                moveTo(21.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                moveTo(19.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                moveTo(8.85f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.78f)
                curveTo(9.54f, 20.61f, 9.32f, 20.19f, 9.14f, 19.75f)
                lineTo(8.85f, 19.0f)
                moveTo(17.0f, 18.0f)
                curveTo(16.44f, 18.0f, 16.0f, 18.44f, 16.0f, 19.0f)
                reflectiveCurveTo(16.44f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveTo(18.0f, 19.56f, 18.0f, 19.0f)
                reflectiveCurveTo(17.56f, 18.0f, 17.0f, 18.0f)
                moveTo(23.0f, 19.0f)
                curveTo(22.06f, 21.34f, 19.73f, 23.0f, 17.0f, 23.0f)
                reflectiveCurveTo(11.94f, 21.34f, 11.0f, 19.0f)
                curveTo(11.94f, 16.66f, 14.27f, 15.0f, 17.0f, 15.0f)
                reflectiveCurveTo(22.06f, 16.66f, 23.0f, 19.0f)
                moveTo(19.5f, 19.0f)
                curveTo(19.5f, 17.62f, 18.38f, 16.5f, 17.0f, 16.5f)
                reflectiveCurveTo(14.5f, 17.62f, 14.5f, 19.0f)
                reflectiveCurveTo(15.62f, 21.5f, 17.0f, 21.5f)
                reflectiveCurveTo(19.5f, 20.38f, 19.5f, 19.0f)
                close()
            }
        }
        .build()
        return _archiveEyeOutline!!
    }

private var _archiveEyeOutline: ImageVector? = null
