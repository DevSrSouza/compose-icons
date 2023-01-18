package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 56.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(24.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(130.7f, 106.7f)
                lineTo(116.0f, 111.5f)
                lineTo(116.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(15.5f)
                lineToRelative(-14.7f, -4.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -7.4f, 22.8f)
                lineToRelative(14.7f, 4.8f)
                lineToRelative(-9.1f, 12.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 2.6f, 16.8f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 7.1f, 2.3f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 9.7f, -5.0f)
                lineToRelative(9.1f, -12.5f)
                lineToRelative(9.1f, 12.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 9.7f, 5.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 7.1f, -2.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 2.6f, -16.8f)
                lineToRelative(-9.1f, -12.5f)
                lineToRelative(14.7f, -4.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.4f, -22.8f)
                close()
                moveTo(241.8f, 114.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.1f, -7.7f)
                lineTo(212.0f, 111.5f)
                lineTo(212.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(15.5f)
                lineToRelative(-14.7f, -4.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -7.4f, 22.8f)
                lineToRelative(14.7f, 4.8f)
                lineToRelative(-9.1f, 12.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 2.6f, 16.8f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 7.1f, 2.3f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 9.7f, -5.0f)
                lineToRelative(9.1f, -12.5f)
                lineToRelative(9.1f, 12.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 9.7f, 5.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 7.1f, -2.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 2.6f, -16.8f)
                lineToRelative(-9.1f, -12.5f)
                lineToRelative(14.7f, -4.8f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 241.8f, 114.4f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
