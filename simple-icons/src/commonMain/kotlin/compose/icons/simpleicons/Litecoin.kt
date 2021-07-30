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

public val SimpleIcons.Litecoin: ImageVector
    get() {
        if (_litecoin != null) {
            return _litecoin!!
        }
        _litecoin = Builder(name = "Litecoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(11.7383f, 3.6777f)
                horizontalLineToRelative(2.584f)
                arcToRelative(0.3425f, 0.3425f, 0.0f, false, true, 0.33f, 0.4356f)
                lineToRelative(-2.0312f, 6.918f)
                lineToRelative(1.9062f, -0.582f)
                lineToRelative(-0.4082f, 1.3847f)
                lineToRelative(-1.9238f, 0.5605f)
                lineToRelative(-1.248f, 4.213f)
                horizontalLineToRelative(6.6757f)
                arcToRelative(0.3425f, 0.3425f, 0.0f, false, true, 0.3282f, 0.4374f)
                lineToRelative(-0.582f, 2.0f)
                arcToRelative(0.4586f, 0.4586f, 0.0f, false, true, -0.4395f, 0.3301f)
                lineTo(6.7324f, 19.375f)
                lineToRelative(1.7227f, -5.8223f)
                lineToRelative(-1.9063f, 0.5801f)
                lineToRelative(0.42f, -1.3613f)
                lineToRelative(1.9101f, -0.58f)
                lineToRelative(2.4219f, -8.1798f)
                arcToRelative(0.4557f, 0.4557f, 0.0f, false, true, 0.4375f, -0.334f)
                close()
            }
        }
        .build()
        return _litecoin!!
    }

private var _litecoin: ImageVector? = null
