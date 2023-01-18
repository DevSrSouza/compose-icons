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

public val LightGroup.UserMinus: ImageVector
    get() {
        if (_userMinus != null) {
            return _userMinus!!
        }
        _userMinus = Builder(name = "UserMinus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(200.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 254.0f, 136.0f)
                close()
                moveTo(198.4f, 196.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -0.7f, 8.5f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -3.9f, 1.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.6f, -2.1f)
                arcToRelative(105.9f, 105.9f, 0.0f, false, false, -162.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.2f, -7.8f)
                arcToRelative(117.9f, 117.9f, 0.0f, false, true, 59.3f, -37.9f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 62.2f, 0.0f)
                arcTo(117.9f, 117.9f, 0.0f, false, true, 198.4f, 196.1f)
                close()
                moveTo(108.0f, 154.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, -54.0f, -54.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 108.0f, 154.0f)
                close()
            }
        }
        .build()
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
