package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.PlayerPlayFilled: ImageVector
    get() {
        if (_playerPlayFilled != null) {
            return _playerPlayFilled!!
        }
        _playerPlayFilled = Builder(name = "PlayerPlayFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.524f, 0.852f)
                lineToRelative(13.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.704f)
                lineToRelative(-13.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.524f, 0.852f)
                close()
            }
        }
        .build()
        return _playerPlayFilled!!
    }

private var _playerPlayFilled: ImageVector? = null
