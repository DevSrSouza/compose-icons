package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.UsersThree: ImageVector
    get() {
        if (_usersThree != null) {
            return _usersThree!!
        }
        _usersThree = Builder(name = "UsersThree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 140.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(12.0f, 148.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -7.2f, -4.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.8f, -8.4f)
                arcTo(67.8f, 67.8f, 0.0f, false, true, 33.0f, 113.5f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 66.3f, -37.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -3.8f, 8.4f)
                arcToRelative(64.3f, 64.3f, 0.0f, false, false, -27.8f, 33.8f)
                arcTo(61.6f, 61.6f, 0.0f, false, false, 64.0f, 140.0f)
                close()
                moveTo(250.4f, 135.2f)
                arcTo(67.8f, 67.8f, 0.0f, false, false, 223.0f, 113.5f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -66.3f, -37.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 3.8f, 8.4f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 27.8f, 33.8f)
                arcTo(61.6f, 61.6f, 0.0f, false, true, 192.0f, 140.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.4f, -12.8f)
                close()
                moveTo(157.2f, 178.1f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -58.4f, 0.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, -35.6f, 34.4f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.5f, 7.7f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 6.7f, 3.8f)
                lineTo(185.6f, 224.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 6.7f, -3.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.5f, -7.7f)
                arcTo(72.1f, 72.1f, 0.0f, false, false, 157.2f, 178.1f)
                close()
            }
        }
        .build()
        return _usersThree!!
    }

private var _usersThree: ImageVector? = null
