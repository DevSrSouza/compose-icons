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

public val MaterialDesignIcons.ArchiveCheckOutline: ImageVector
    get() {
        if (_archiveCheckOutline != null) {
            return _archiveCheckOutline!!
        }
        _archiveCheckOutline = Builder(name = "ArchiveCheckOutline", defaultWidth = 24.0.dp,
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
                moveTo(14.5f, 11.0f)
                curveTo(14.78f, 11.0f, 15.0f, 11.22f, 15.0f, 11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 11.22f, 9.22f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(14.5f)
                moveTo(18.0f, 13.09f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13.0f, 19.0f, 13.0f)
                curveTo(18.66f, 13.0f, 18.33f, 13.04f, 18.0f, 13.09f)
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 19.7f, 13.13f, 20.37f, 13.35f, 21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                moveTo(22.5f, 17.25f)
                lineTo(17.75f, 22.0f)
                lineTo(15.0f, 19.0f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
                close()
            }
        }
        .build()
        return _archiveCheckOutline!!
    }

private var _archiveCheckOutline: ImageVector? = null
