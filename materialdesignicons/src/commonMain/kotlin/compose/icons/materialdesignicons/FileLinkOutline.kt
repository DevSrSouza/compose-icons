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

public val MaterialDesignIcons.FileLinkOutline: ImageVector
    get() {
        if (_fileLinkOutline != null) {
            return _fileLinkOutline!!
        }
        _fileLinkOutline = Builder(name = "FileLinkOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                moveTo(11.0f, 19.0f)
                horizontalLineTo(10.75f)
                curveTo(9.45f, 19.0f, 7.0f, 18.22f, 7.0f, 15.25f)
                reflectiveCurveTo(9.45f, 11.5f, 10.75f, 11.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.75f)
                curveTo(10.38f, 13.0f, 8.5f, 13.13f, 8.5f, 15.25f)
                curveTo(8.5f, 17.44f, 10.5f, 17.5f, 10.75f, 17.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                moveTo(13.0f, 11.5f)
                horizontalLineTo(13.25f)
                curveTo(14.55f, 11.5f, 17.0f, 12.28f, 17.0f, 15.25f)
                reflectiveCurveTo(14.55f, 19.0f, 13.25f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(13.25f)
                curveTo(13.62f, 17.5f, 15.5f, 17.37f, 15.5f, 15.25f)
                curveTo(15.5f, 13.06f, 13.5f, 13.0f, 13.25f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _fileLinkOutline!!
    }

private var _fileLinkOutline: ImageVector? = null
