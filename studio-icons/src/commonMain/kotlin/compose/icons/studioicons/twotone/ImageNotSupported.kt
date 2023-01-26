package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ImageNotSupported: ImageVector
    get() {
        if (_imageNotSupported != null) {
            return _imageNotSupported!!
        }
        _imageNotSupported = Builder(name = "ImageNotSupported", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.83f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(11.17f)
                lineTo(7.83f, 5.0f)
                close()
                moveTo(16.17f, 19.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(6.0f)
                lineToRelative(3.0f, -4.0f)
                lineToRelative(2.0f, 2.72f)
                lineToRelative(0.84f, -1.05f)
                lineTo(5.0f, 7.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.83f, 3.0f)
                horizontalLineTo(19.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(13.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.83f)
                lineTo(5.83f, 3.0f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(18.17f, 21.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(5.83f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(1.49f, 1.49f)
                lineTo(5.0f, 5.0f)
                lineToRelative(8.11f, 8.11f)
                lineToRelative(2.69f, 2.69f)
                lineTo(19.0f, 19.0f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.49f, 1.49f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(16.17f, 19.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(6.0f)
                lineToRelative(3.0f, -4.0f)
                lineToRelative(2.0f, 2.72f)
                lineToRelative(0.84f, -1.05f)
                lineTo(5.0f, 7.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.17f)
                close()
            }
        }
        .build()
        return _imageNotSupported!!
    }

private var _imageNotSupported: ImageVector? = null
