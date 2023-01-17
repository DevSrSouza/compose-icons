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

public val TablerIcons.PentagonOff: ImageVector
    get() {
        if (_pentagonOff != null) {
            return _pentagonOff!!
        }
        _pentagonOff = Builder(name = "PentagonOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.868f, 4.857f)
                lineToRelative(1.936f, -1.457f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.397f, -0.006f)
                lineToRelative(7.032f, 5.237f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.7f, 2.247f)
                lineToRelative(-1.522f, 4.485f)
                moveToRelative(-1.027f, 3.029f)
                lineToRelative(-0.424f, 1.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.894f, 1.358f)
                horizontalLineToRelative(-8.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.9f, -1.373f)
                lineToRelative(-2.896f, -8.765f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.696f, -2.225f)
                lineToRelative(2.736f, -2.06f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _pentagonOff!!
    }

private var _pentagonOff: ImageVector? = null
