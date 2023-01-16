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

public val MaterialDesignIcons.ArchiveCancel: ImageVector
    get() {
        if (_archiveCancel != null) {
            return _archiveCancel!!
        }
        _archiveCancel = Builder(name = "ArchiveCancel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                curveTo(19.0f, 12.0f, 19.5f, 12.07f, 20.0f, 12.18f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.5f)
                curveTo(12.18f, 20.23f, 12.0f, 19.39f, 12.0f, 18.5f)
                curveTo(12.0f, 14.91f, 14.91f, 12.0f, 18.5f, 12.0f)
                moveTo(9.0f, 13.0f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 11.22f, 9.22f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(14.5f)
                curveTo(14.78f, 11.0f, 15.0f, 11.22f, 15.0f, 11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                moveTo(21.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                moveTo(18.5f, 14.0f)
                curveTo(16.0f, 14.0f, 14.0f, 16.0f, 14.0f, 18.5f)
                reflectiveCurveTo(16.0f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(23.0f, 21.0f, 23.0f, 18.5f)
                reflectiveCurveTo(21.0f, 14.0f, 18.5f, 14.0f)
                moveTo(18.5f, 21.5f)
                curveTo(16.84f, 21.5f, 15.5f, 20.16f, 15.5f, 18.5f)
                curveTo(15.5f, 17.94f, 15.65f, 17.42f, 15.92f, 17.0f)
                lineTo(20.0f, 21.08f)
                curveTo(19.58f, 21.35f, 19.06f, 21.5f, 18.5f, 21.5f)
                moveTo(21.08f, 20.0f)
                lineTo(17.0f, 15.92f)
                curveTo(17.42f, 15.65f, 17.94f, 15.5f, 18.5f, 15.5f)
                curveTo(20.16f, 15.5f, 21.5f, 16.84f, 21.5f, 18.5f)
                curveTo(21.5f, 19.06f, 21.35f, 19.58f, 21.08f, 20.0f)
                close()
            }
        }
        .build()
        return _archiveCancel!!
    }

private var _archiveCancel: ImageVector? = null
