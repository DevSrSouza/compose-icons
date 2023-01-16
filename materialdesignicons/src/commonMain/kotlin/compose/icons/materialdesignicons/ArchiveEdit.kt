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

public val MaterialDesignIcons.ArchiveEdit: ImageVector
    get() {
        if (_archiveEdit != null) {
            return _archiveEdit!!
        }
        _archiveEdit = Builder(name = "ArchiveEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.3f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.13f)
                lineTo(19.39f, 10.74f)
                curveTo(19.57f, 10.56f, 19.78f, 10.42f, 20.0f, 10.3f)
                moveTo(15.0f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 11.22f, 9.22f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(14.5f)
                curveTo(14.78f, 11.0f, 15.0f, 11.22f, 15.0f, 11.5f)
                verticalLineTo(13.0f)
                moveTo(21.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                moveTo(22.85f, 14.19f)
                lineTo(21.87f, 15.17f)
                lineTo(19.83f, 13.13f)
                lineTo(20.81f, 12.15f)
                curveTo(21.0f, 11.95f, 21.33f, 11.95f, 21.53f, 12.15f)
                lineTo(22.85f, 13.47f)
                curveTo(23.05f, 13.67f, 23.05f, 14.0f, 22.85f, 14.19f)
                moveTo(19.13f, 13.83f)
                lineTo(21.17f, 15.87f)
                lineTo(15.04f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.96f)
                lineTo(19.13f, 13.83f)
                close()
            }
        }
        .build()
        return _archiveEdit!!
    }

private var _archiveEdit: ImageVector? = null
