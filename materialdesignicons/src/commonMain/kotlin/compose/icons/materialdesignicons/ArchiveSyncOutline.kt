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

public val MaterialDesignIcons.ArchiveSyncOutline: ImageVector
    get() {
        if (_archiveSyncOutline != null) {
            return _archiveSyncOutline!!
        }
        _archiveSyncOutline = Builder(name = "ArchiveSyncOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.18f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.03f)
                curveTo(19.84f, 11.0f, 19.67f, 11.0f, 19.5f, 11.0f)
                curveTo(19.0f, 11.0f, 18.5f, 11.07f, 18.0f, 11.18f)
                moveTo(15.0f, 11.5f)
                curveTo(15.0f, 11.22f, 14.78f, 11.0f, 14.5f, 11.0f)
                horizontalLineTo(9.5f)
                curveTo(9.22f, 11.0f, 9.0f, 11.22f, 9.0f, 11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.82f)
                curveTo(14.88f, 12.94f, 14.94f, 12.88f, 15.0f, 12.82f)
                verticalLineTo(11.5f)
                moveTo(6.0f, 19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.03f)
                curveTo(13.64f, 20.39f, 13.35f, 19.72f, 13.18f, 19.0f)
                horizontalLineTo(6.0f)
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
                moveTo(19.0f, 13.5f)
                verticalLineTo(12.0f)
                lineTo(16.75f, 14.25f)
                lineTo(19.0f, 16.5f)
                verticalLineTo(15.0f)
                curveTo(20.38f, 15.0f, 21.5f, 16.12f, 21.5f, 17.5f)
                curveTo(21.5f, 17.9f, 21.41f, 18.28f, 21.24f, 18.62f)
                lineTo(22.33f, 19.71f)
                curveTo(22.75f, 19.08f, 23.0f, 18.32f, 23.0f, 17.5f)
                curveTo(23.0f, 15.29f, 21.21f, 13.5f, 19.0f, 13.5f)
                moveTo(19.0f, 20.0f)
                curveTo(17.62f, 20.0f, 16.5f, 18.88f, 16.5f, 17.5f)
                curveTo(16.5f, 17.1f, 16.59f, 16.72f, 16.76f, 16.38f)
                lineTo(15.67f, 15.29f)
                curveTo(15.25f, 15.92f, 15.0f, 16.68f, 15.0f, 17.5f)
                curveTo(15.0f, 19.71f, 16.79f, 21.5f, 19.0f, 21.5f)
                verticalLineTo(23.0f)
                lineTo(21.25f, 20.75f)
                lineTo(19.0f, 18.5f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _archiveSyncOutline!!
    }

private var _archiveSyncOutline: ImageVector? = null
