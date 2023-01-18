package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Image2Line: ImageVector
    get() {
        if (_image2Line != null) {
            return _image2Line!!
        }
        _image2Line = Builder(name = "Image2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.1f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(5.5f, 5.5f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(3.0f, 3.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(6.1f)
                close()
                moveTo(5.0f, 13.929f)
                lineTo(5.0f, 19.0f)
                horizontalLineToRelative(3.1f)
                lineToRelative(2.986f, -2.985f)
                lineTo(7.0f, 11.929f)
                lineToRelative(-2.0f, 2.0f)
                close()
                moveTo(10.929f, 19.0f)
                lineTo(19.0f, 19.0f)
                verticalLineToRelative(-2.071f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(10.929f, 19.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(15.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _image2Line!!
    }

private var _image2Line: ImageVector? = null