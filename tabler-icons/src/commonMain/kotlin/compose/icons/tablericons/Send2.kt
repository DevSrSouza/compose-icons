package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Send2: ImageVector
    get() {
        if (_send2 != null) {
            return _send2!!
        }
        _send2 = Builder(name = "Send2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.698f, 4.034f)
                lineToRelative(16.302f, 7.966f)
                lineToRelative(-16.302f, 7.966f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, -0.546f, -0.124f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, true, -0.12f, -0.568f)
                lineToRelative(2.468f, -7.274f)
                lineToRelative(-2.468f, -7.274f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, true, 0.12f, -0.568f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, 0.546f, -0.124f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 12.0f)
                horizontalLineToRelative(14.5f)
            }
        }
        .build()
        return _send2!!
    }

private var _send2: ImageVector? = null
