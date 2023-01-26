package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ImageNotSupported: ImageVector
    get() {
        if (_imageNotSupported != null) {
            return _imageNotSupported!!
        }
        _imageNotSupported = Builder(name = "ImageNotSupported", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9f, 21.9f)
                lineToRelative(-6.1f, -6.1f)
                lineToRelative(-2.69f, -2.69f)
                lineToRelative(0.0f, 0.0f)
                lineTo(5.0f, 5.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(3.59f, 3.59f)
                lineToRelative(0.0f, 0.0f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineTo(3.0f, 5.83f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.17f)
                lineToRelative(2.31f, 2.31f)
                lineTo(21.9f, 21.9f)
                close()
                moveTo(5.0f, 19.0f)
                verticalLineTo(7.83f)
                lineToRelative(6.84f, 6.84f)
                lineTo(11.0f, 15.72f)
                lineTo(9.0f, 13.0f)
                lineToRelative(-3.0f, 4.0f)
                horizontalLineToRelative(8.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(7.83f, 5.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(19.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(13.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.83f)
                close()
            }
        }
        .build()
        return _imageNotSupported!!
    }

private var _imageNotSupported: ImageVector? = null
