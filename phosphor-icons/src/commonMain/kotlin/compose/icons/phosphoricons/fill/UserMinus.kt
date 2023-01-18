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

public val FillGroup.UserMinus: ImageVector
    get() {
        if (_userMinus != null) {
            return _userMinus!!
        }
        _userMinus = Builder(name = "UserMinus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 136.0f)
                close()
                moveTo(144.1f, 157.6f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -72.2f, 0.0f)
                arcToRelative(118.4f, 118.4f, 0.0f, false, false, -55.8f, 37.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -1.1f, 8.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.2f, 4.6f)
                horizontalLineTo(193.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.2f, -4.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -1.1f, -8.5f)
                arcTo(118.4f, 118.4f, 0.0f, false, false, 144.1f, 157.6f)
                close()
            }
        }
        .build()
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
