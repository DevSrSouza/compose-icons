package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.0f, 56.0f)
                lineTo(46.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(34.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(132.6f, 112.4f)
                lineTo(110.0f, 119.7f)
                lineTo(110.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(23.7f)
                lineToRelative(-22.6f, -7.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.7f, 11.4f)
                lineToRelative(22.6f, 7.4f)
                lineToRelative(-14.0f, 19.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 1.4f, 8.3f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 3.5f, 1.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.8f, -2.5f)
                lineToRelative(14.0f, -19.2f)
                lineToRelative(14.0f, 19.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.8f, 2.5f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 3.5f, -1.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 1.4f, -8.3f)
                lineToRelative(-14.0f, -19.2f)
                lineToRelative(22.6f, -7.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.7f, -11.4f)
                close()
                moveTo(236.1f, 116.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.5f, -3.9f)
                lineTo(206.0f, 119.7f)
                lineTo(206.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(23.7f)
                lineToRelative(-22.6f, -7.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.7f, 11.4f)
                lineToRelative(22.6f, 7.4f)
                lineToRelative(-14.0f, 19.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 1.4f, 8.3f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 3.5f, 1.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.8f, -2.5f)
                lineToRelative(14.0f, -19.2f)
                lineToRelative(14.0f, 19.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.8f, 2.5f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 3.5f, -1.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 1.4f, -8.3f)
                lineToRelative(-14.0f, -19.2f)
                lineToRelative(22.6f, -7.4f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 236.1f, 116.3f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
