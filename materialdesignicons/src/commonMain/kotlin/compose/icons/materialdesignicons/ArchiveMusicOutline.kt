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

public val MaterialDesignIcons.ArchiveMusicOutline: ImageVector
    get() {
        if (_archiveMusicOutline != null) {
            return _archiveMusicOutline!!
        }
        _archiveMusicOutline = Builder(name = "ArchiveMusicOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                moveTo(18.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                moveTo(14.5f, 11.0f)
                curveTo(14.78f, 11.0f, 15.0f, 11.22f, 15.0f, 11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 11.22f, 9.22f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(14.5f)
                moveTo(13.26f, 19.0f)
                curveTo(13.09f, 19.47f, 13.0f, 19.97f, 13.0f, 20.5f)
                curveTo(13.0f, 20.67f, 13.0f, 20.84f, 13.03f, 21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.26f)
                moveTo(22.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.5f)
                curveTo(20.0f, 21.88f, 18.88f, 23.0f, 17.5f, 23.0f)
                reflectiveCurveTo(15.0f, 21.88f, 15.0f, 20.5f)
                reflectiveCurveTo(16.12f, 18.0f, 17.5f, 18.0f)
                curveTo(17.86f, 18.0f, 18.19f, 18.07f, 18.5f, 18.21f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _archiveMusicOutline!!
    }

private var _archiveMusicOutline: ImageVector? = null
