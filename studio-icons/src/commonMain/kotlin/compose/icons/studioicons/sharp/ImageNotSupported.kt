package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ImageNotSupported: ImageVector
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
                lineToRelative(-8.49f, -8.49f)
                lineToRelative(0.0f, 0.0f)
                lineTo(3.0f, 3.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineTo(3.0f, 5.83f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(15.17f)
                lineToRelative(2.31f, 2.31f)
                lineTo(21.9f, 21.9f)
                close()
                moveTo(5.0f, 18.0f)
                lineToRelative(3.5f, -4.5f)
                lineToRelative(2.5f, 3.01f)
                lineTo(12.17f, 15.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(21.0f, 18.17f)
                lineTo(5.83f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.17f)
                close()
            }
        }
        .build()
        return _imageNotSupported!!
    }

private var _imageNotSupported: ImageVector? = null
