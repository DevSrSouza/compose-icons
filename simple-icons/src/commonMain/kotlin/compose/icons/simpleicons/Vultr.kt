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

public val SimpleIcons.Vultr: ImageVector
    get() {
        if (_vultr != null) {
            return _vultr!!
        }
        _vultr = Builder(name = "Vultr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.36f, 2.172f)
                arcTo(1.194f, 1.194f, 0.0f, false, false, 7.348f, 1.6f)
                lineTo(1.2f, 1.6f)
                arcTo(1.2f, 1.2f, 0.0f, false, false, 0.0f, 2.8f)
                arcToRelative(1.211f, 1.211f, 0.0f, false, false, 0.182f, 0.64f)
                lineToRelative(11.6f, 18.4f)
                arcToRelative(1.206f, 1.206f, 0.0f, false, false, 2.035f, 0.0f)
                lineToRelative(3.075f, -4.874f)
                arcToRelative(1.229f, 1.229f, 0.0f, false, false, 0.182f, -0.64f)
                arcToRelative(1.211f, 1.211f, 0.0f, false, false, -0.182f, -0.642f)
                close()
                moveTo(18.709f, 10.852f)
                arcToRelative(1.206f, 1.206f, 0.0f, false, false, 2.035f, 0.0f)
                lineTo(21.8f, 9.178f)
                lineToRelative(2.017f, -3.2f)
                arcToRelative(1.211f, 1.211f, 0.0f, false, false, 0.183f, -0.64f)
                arcToRelative(1.229f, 1.229f, 0.0f, false, false, -0.183f, -0.64f)
                lineToRelative(-1.6f, -2.526f)
                arcToRelative(1.206f, 1.206f, 0.0f, false, false, -1.016f, -0.571f)
                horizontalLineToRelative(-6.148f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -1.201f, 1.2f)
                arcToRelative(1.143f, 1.143f, 0.0f, false, false, 0.188f, 0.64f)
                close()
            }
        }
        .build()
        return _vultr!!
    }

private var _vultr: ImageVector? = null
