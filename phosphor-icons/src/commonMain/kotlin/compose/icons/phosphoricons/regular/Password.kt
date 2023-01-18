package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Password: ImageVector
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
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(132.0f, 110.5f)
                lineTo(112.0f, 117.0f)
                lineTo(112.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(21.0f)
                lineToRelative(-20.0f, -6.5f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -10.0f, 5.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.1f, 10.1f)
                lineToRelative(20.0f, 6.5f)
                lineToRelative(-12.4f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.8f, 11.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 11.2f, -1.8f)
                lineToRelative(12.3f, -17.0f)
                lineToRelative(12.3f, 17.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 11.2f, 1.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.8f, -11.2f)
                lineToRelative(-12.4f, -17.0f)
                lineToRelative(20.0f, -6.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.1f, -10.1f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 132.0f, 110.5f)
                close()
                moveTo(238.0f, 115.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -10.0f, -5.1f)
                lineTo(208.0f, 117.0f)
                lineTo(208.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(21.0f)
                lineToRelative(-20.0f, -6.5f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -10.0f, 5.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.1f, 10.1f)
                lineToRelative(20.0f, 6.5f)
                lineToRelative(-12.4f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.8f, 11.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 11.2f, -1.8f)
                lineToRelative(12.3f, -17.0f)
                lineToRelative(12.3f, 17.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 11.2f, 1.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.8f, -11.2f)
                lineToRelative(-12.4f, -17.0f)
                lineToRelative(20.0f, -6.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 238.0f, 115.6f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
