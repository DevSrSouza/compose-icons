package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PictureInPictureExit: ImageVector
    get() {
        if (_pictureInPictureExit != null) {
            return _pictureInPictureExit!!
        }
        _pictureInPictureExit = Builder(name = "PictureInPictureExit", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                curveTo(11.1046f, 11.0f, 12.0f, 10.1046f, 12.0f, 9.0f)
                verticalLineTo(4.0f)
                curveTo(12.0f, 2.8954f, 11.1046f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(1.8954f, 2.0f, 1.0f, 2.8954f, 1.0f, 4.0f)
                verticalLineTo(9.0f)
                curveTo(1.0f, 9.7594f, 1.4232f, 10.4199f, 2.0467f, 10.7586f)
                curveTo(2.3301f, 10.9126f, 2.6548f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineTo(3.0f)
                curveTo(2.6494f, 12.0f, 2.3128f, 11.9398f, 2.0f, 11.8293f)
                verticalLineTo(17.75f)
                curveTo(2.0f, 19.5449f, 3.4551f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 21.0f, 22.0f, 19.5449f, 22.0f, 17.75f)
                verticalLineTo(8.25f)
                curveTo(22.0f, 6.4551f, 20.5449f, 5.0f, 18.75f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 10.6569f, 11.6569f, 12.0f, 10.0f, 12.0f)
                close()
                moveTo(14.25f, 16.0f)
                horizontalLineTo(15.9393f)
                lineTo(13.2197f, 13.2803f)
                curveTo(12.9268f, 12.9874f, 12.9268f, 12.5126f, 13.2197f, 12.2197f)
                curveTo(13.5126f, 11.9268f, 13.9874f, 11.9268f, 14.2803f, 12.2197f)
                lineTo(17.0f, 14.9393f)
                verticalLineTo(13.25f)
                curveTo(17.0f, 12.8358f, 17.3358f, 12.5f, 17.75f, 12.5f)
                curveTo(18.1642f, 12.5f, 18.5f, 12.8358f, 18.5f, 13.25f)
                verticalLineTo(16.75f)
                curveTo(18.5f, 17.1642f, 18.1642f, 17.5f, 17.75f, 17.5f)
                horizontalLineTo(14.25f)
                curveTo(13.8358f, 17.5f, 13.5f, 17.1642f, 13.5f, 16.75f)
                curveTo(13.5f, 16.3358f, 13.8358f, 16.0f, 14.25f, 16.0f)
                close()
            }
        }
        .build()
        return _pictureInPictureExit!!
    }

private var _pictureInPictureExit: ImageVector? = null
