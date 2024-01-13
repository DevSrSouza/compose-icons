package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Googlefonts: ImageVector
    get() {
        if (_googlefonts != null) {
            return _googlefonts!!
        }
        _googlefonts = Builder(name = "Googlefonts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.8f)
                arcTo(3.6f, 3.6f, 0.0f, true, false, 4.0f, 10.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 0.0f, -7.2f)
                close()
                moveTo(11.6f, 2.8f)
                verticalLineToRelative(18.4f)
                horizontalLineToRelative(7.2f)
                arcToRelative(5.2f, 5.2f, 0.0f, true, true, 0.0f, -10.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                close()
                moveTo(18.8f, 2.8f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                close()
                moveTo(18.8f, 10.8f)
                verticalLineToRelative(10.4f)
                arcTo(5.2f, 5.2f, 0.0f, false, false, 24.0f, 16.0f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, -5.2f, -5.2f)
                close()
                moveTo(11.1f, 3.594f)
                lineTo(0.0f, 21.199f)
                horizontalLineToRelative(8.8f)
                lineToRelative(2.3f, -3.64f)
                close()
            }
        }
        .build()
        return _googlefonts!!
    }

private var _googlefonts: ImageVector? = null
