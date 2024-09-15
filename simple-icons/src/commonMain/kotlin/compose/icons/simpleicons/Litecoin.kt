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
                moveTo(11.738f, 3.678f)
                horizontalLineToRelative(2.584f)
                arcToRelative(0.343f, 0.343f, 0.0f, false, true, 0.33f, 0.436f)
                lineToRelative(-2.031f, 6.918f)
                lineToRelative(1.906f, -0.582f)
                lineToRelative(-0.408f, 1.385f)
                lineToRelative(-1.924f, 0.561f)
                lineToRelative(-1.248f, 4.213f)
                horizontalLineToRelative(6.676f)
                arcToRelative(0.343f, 0.343f, 0.0f, false, true, 0.328f, 0.437f)
                lineToRelative(-0.582f, 2.0f)
                arcToRelative(0.459f, 0.459f, 0.0f, false, true, -0.44f, 0.33f)
                lineTo(6.732f, 19.375f)
                lineToRelative(1.723f, -5.822f)
                lineToRelative(-1.906f, 0.58f)
                lineToRelative(0.42f, -1.361f)
                lineToRelative(1.91f, -0.58f)
                lineToRelative(2.422f, -8.18f)
                arcToRelative(0.456f, 0.456f, 0.0f, false, true, 0.438f, -0.334f)
                close()
            }
        }
        .build()
        return _litecoin!!
    }

private var _litecoin: ImageVector? = null
