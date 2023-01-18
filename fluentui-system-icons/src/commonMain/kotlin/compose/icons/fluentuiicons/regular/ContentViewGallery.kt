package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ContentViewGallery: ImageVector
    get() {
        if (_contentViewGallery != null) {
            return _contentViewGallery!!
        }
        _contentViewGallery = Builder(name = "ContentViewGallery", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.75f, 19.5f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.75f)
                close()
                moveTo(19.5f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(19.5f)
                close()
                moveTo(19.5f, 8.0f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.5f)
                close()
                moveTo(6.0f, 13.75f)
                curveTo(6.0f, 13.3358f, 6.3358f, 13.0f, 6.75f, 13.0f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 13.0f, 12.0f, 13.3358f, 12.0f, 13.75f)
                curveTo(12.0f, 14.1642f, 11.6642f, 14.5f, 11.25f, 14.5f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 14.5f, 6.0f, 14.1642f, 6.0f, 13.75f)
                close()
                moveTo(7.25f, 6.5f)
                curveTo(6.5596f, 6.5f, 6.0f, 7.0596f, 6.0f, 7.75f)
                verticalLineTo(10.25f)
                curveTo(6.0f, 10.9404f, 6.5596f, 11.5f, 7.25f, 11.5f)
                horizontalLineTo(10.75f)
                curveTo(11.4404f, 11.5f, 12.0f, 10.9404f, 12.0f, 10.25f)
                verticalLineTo(7.75f)
                curveTo(12.0f, 7.0596f, 11.4404f, 6.5f, 10.75f, 6.5f)
                horizontalLineTo(7.25f)
                close()
                moveTo(7.5f, 10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(6.0f, 16.75f)
                curveTo(6.0f, 16.3358f, 6.3358f, 16.0f, 6.75f, 16.0f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 16.0f, 12.0f, 16.3358f, 12.0f, 16.75f)
                curveTo(12.0f, 17.1642f, 11.6642f, 17.5f, 11.25f, 17.5f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 17.5f, 6.0f, 17.1642f, 6.0f, 16.75f)
                close()
            }
        }
        .build()
        return _contentViewGallery!!
    }

private var _contentViewGallery: ImageVector? = null
