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

public val ThinGroup.UserPlus: ImageVector
    get() {
        if (_userPlus != null) {
            return _userPlus!!
        }
        _userPlus = Builder(name = "UserPlus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(228.0f, 140.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(220.0f, 140.0f)
                lineTo(200.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(220.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 136.0f)
                close()
                moveTo(196.9f, 197.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.5f, 5.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.6f, 0.9f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -3.1f, -1.4f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, false, -165.4f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.2f, -5.2f)
                arcToRelative(116.3f, 116.3f, 0.0f, false, true, 63.6f, -38.6f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 50.6f, 0.0f)
                arcTo(116.3f, 116.3f, 0.0f, false, true, 196.9f, 197.4f)
                close()
                moveTo(108.0f, 156.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -56.0f, -56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 108.0f, 156.0f)
                close()
            }
        }
        .build()
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
