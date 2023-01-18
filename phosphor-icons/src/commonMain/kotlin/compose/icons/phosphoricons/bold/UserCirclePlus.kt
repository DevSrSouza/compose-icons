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

public val BoldGroup.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) {
            return _userCirclePlus!!
        }
        _userCirclePlus = Builder(name = "UserCirclePlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(188.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(212.0f, 44.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(212.0f, 68.0f)
                lineTo(212.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(188.0f, 68.0f)
                lineTo(176.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 56.0f)
                close()
                moveTo(234.7f, 111.0f)
                arcTo(108.4f, 108.4f, 0.0f, false, true, 201.0f, 207.5f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -1.6f, 1.5f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, true, -142.8f, 0.0f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -1.6f, -1.5f)
                arcTo(108.1f, 108.1f, 0.0f, false, true, 145.0f, 21.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 10.0f, 13.8f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 141.3f, 45.0f)
                arcTo(85.1f, 85.1f, 0.0f, false, false, 128.0f, 44.0f)
                arcTo(83.9f, 83.9f, 0.0f, false, false, 62.1f, 179.9f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 91.0f, 156.5f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 74.0f, 0.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 28.9f, 23.4f)
                arcTo(83.4f, 83.4f, 0.0f, false, false, 212.0f, 128.0f)
                arcToRelative(85.1f, 85.1f, 0.0f, false, false, -1.0f, -13.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 9.9f, -13.7f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 234.7f, 111.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.5f, 83.5f, 0.0f, false, false, 48.4f, -15.4f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, false, -96.8f, 0.0f)
                arcTo(83.5f, 83.5f, 0.0f, false, false, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
