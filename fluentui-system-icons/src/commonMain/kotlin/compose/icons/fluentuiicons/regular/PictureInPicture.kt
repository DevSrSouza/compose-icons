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

public val RegularGroup.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) {
            return _pictureInPicture!!
        }
        _pictureInPicture = Builder(name = "PictureInPicture", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 4.4551f, 3.4551f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 3.0f, 22.0f, 4.4551f, 22.0f, 6.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 5.2835f, 19.7165f, 4.5f, 18.75f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 4.5f, 3.5f, 5.2835f, 3.5f, 6.25f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 16.7165f, 4.2835f, 17.5f, 5.25f, 17.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 19.0f, 2.0f, 17.5449f, 2.0f, 15.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(14.0f, 13.0f)
                curveTo(12.8954f, 13.0f, 12.0f, 13.8954f, 12.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(12.0f, 21.1046f, 12.8954f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1046f, 22.0f, 23.0f, 21.1046f, 23.0f, 20.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 13.8954f, 22.1046f, 13.0f, 21.0f, 13.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
