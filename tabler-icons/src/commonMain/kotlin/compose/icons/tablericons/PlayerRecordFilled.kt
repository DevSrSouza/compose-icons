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

public val TablerIcons.PlayerRecordFilled: ImageVector
    get() {
        if (_playerRecordFilled != null) {
            return _playerRecordFilled!!
        }
        _playerRecordFilled = Builder(name = "PlayerRecordFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 5.072f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -3.995f, 7.213f)
                lineToRelative(-0.005f, -0.285f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.995f, -6.643f)
                close()
            }
        }
        .build()
        return _playerRecordFilled!!
    }

private var _playerRecordFilled: ImageVector? = null
