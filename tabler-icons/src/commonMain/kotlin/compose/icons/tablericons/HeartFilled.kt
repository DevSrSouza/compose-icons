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

public val TablerIcons.HeartFilled: ImageVector
    get() {
        if (_heartFilled != null) {
            return _heartFilled!!
        }
        _heartFilled = Builder(name = "HeartFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.979f, 3.074f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.988f, 1.425f)
                lineToRelative(0.037f, 0.033f)
                lineToRelative(0.034f, -0.03f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.733f, -1.44f)
                lineToRelative(0.246f, 0.036f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.364f, 10.008f)
                lineToRelative(-0.18f, 0.185f)
                lineToRelative(-0.048f, 0.041f)
                lineToRelative(-7.45f, 7.379f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.313f, 0.082f)
                lineToRelative(-0.094f, -0.082f)
                lineToRelative(-7.493f, -7.422f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.176f, -10.215f)
                close()
            }
        }
        .build()
        return _heartFilled!!
    }

private var _heartFilled: ImageVector? = null
