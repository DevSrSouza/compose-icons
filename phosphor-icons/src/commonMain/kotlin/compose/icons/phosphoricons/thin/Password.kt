package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 56.0f)
                lineTo(44.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(133.2f, 114.3f)
                lineTo(108.0f, 122.5f)
                lineTo(108.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(26.5f)
                lineToRelative(-25.2f, -8.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.5f, 7.6f)
                lineToRelative(25.2f, 8.2f)
                lineTo(82.0f, 151.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.8f, 5.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.2f, -1.7f)
                lineTo(104.0f, 134.8f)
                lineToRelative(15.6f, 21.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.2f, 1.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, -0.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.8f, -5.6f)
                lineToRelative(-15.5f, -21.4f)
                lineToRelative(25.2f, -8.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.5f, -7.6f)
                close()
                moveTo(234.2f, 116.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.0f, -2.6f)
                lineTo(204.0f, 122.5f)
                lineTo(204.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(26.5f)
                lineToRelative(-25.2f, -8.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.5f, 7.6f)
                lineToRelative(25.2f, 8.2f)
                lineTo(178.0f, 151.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.8f, 5.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.2f, -1.7f)
                lineTo(200.0f, 134.8f)
                lineToRelative(15.6f, 21.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.2f, 1.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, -0.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.8f, -5.6f)
                lineToRelative(-15.5f, -21.4f)
                lineToRelative(25.2f, -8.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 234.2f, 116.9f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
