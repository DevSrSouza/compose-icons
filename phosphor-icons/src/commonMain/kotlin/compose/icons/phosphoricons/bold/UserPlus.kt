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

public val BoldGroup.UserPlus: ImageVector
    get() {
        if (_userPlus != null) {
            return _userPlus!!
        }
        _userPlus = Builder(name = "UserPlus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 136.0f)
                close()
                moveTo(203.0f, 192.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.5f, 16.9f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -7.7f, 2.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -9.2f, -4.3f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, -153.2f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 13.0f, 192.3f)
                arcToRelative(124.4f, 124.4f, 0.0f, false, true, 50.3f, -36.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 89.4f, 0.0f)
                arcTo(124.4f, 124.4f, 0.0f, false, true, 203.0f, 192.3f)
                close()
                moveTo(108.0f, 148.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 108.0f, 148.0f)
                close()
            }
        }
        .build()
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
