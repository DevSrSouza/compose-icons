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

public val TablerIcons.OctagonOff: ImageVector
    get() {
        if (_octagonOff != null) {
            return _octagonOff!!
        }
        _octagonOff = Builder(name = "OctagonOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.027f, 19.002f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, -0.65f, 0.444f)
                lineToRelative(-5.575f, 2.39f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, -1.604f, 0.0f)
                lineToRelative(-5.575f, -2.39f)
                arcToRelative(2.036f, 2.036f, 0.0f, false, true, -1.07f, -1.07f)
                lineToRelative(-2.388f, -5.574f)
                arcToRelative(2.036f, 2.036f, 0.0f, false, true, 0.0f, -1.604f)
                lineToRelative(2.389f, -5.575f)
                curveToRelative(0.103f, -0.24f, 0.25f, -0.457f, 0.433f, -0.639f)
                moveToRelative(2.689f, -1.31f)
                lineToRelative(3.522f, -1.51f)
                arcToRelative(2.036f, 2.036f, 0.0f, false, true, 1.604f, 0.0f)
                lineToRelative(5.575f, 2.39f)
                curveToRelative(0.48f, 0.206f, 0.863f, 0.589f, 1.07f, 1.07f)
                lineToRelative(2.388f, 5.574f)
                curveToRelative(0.22f, 0.512f, 0.22f, 1.092f, 0.0f, 1.604f)
                lineToRelative(-1.509f, 3.522f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _octagonOff!!
    }

private var _octagonOff: ImageVector? = null
