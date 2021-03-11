package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
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
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.647f, 3.653f)
                lineToRelative(0.353f, -0.353f)
                curveToRelative(0.2f, -0.2f, 0.4f, -0.3f, 0.7f, -0.3f)
                horizontalLineToRelative(6.6f)
                curveToRelative(0.3f, 0.0f, 0.5f, 0.1f, 0.7f, 0.3f)
                lineToRelative(4.7f, 4.7f)
                curveToRelative(0.2f, 0.2f, 0.3f, 0.4f, 0.3f, 0.7f)
                verticalLineToRelative(6.6f)
                curveToRelative(0.0f, 0.3f, -0.1f, 0.5f, -0.3f, 0.7f)
                lineToRelative(-0.35f, 0.35f)
                moveToRelative(-1.997f, 1.997f)
                lineToRelative(-2.353f, 2.353f)
                curveToRelative(-0.2f, 0.2f, -0.4f, 0.3f, -0.7f, 0.3f)
                horizontalLineToRelative(-6.6f)
                curveToRelative(-0.3f, 0.0f, -0.5f, -0.1f, -0.7f, -0.3f)
                lineToRelative(-4.7f, -4.7f)
                curveToRelative(-0.2f, -0.2f, -0.3f, -0.4f, -0.3f, -0.7f)
                verticalLineToRelative(-6.6f)
                curveToRelative(0.0f, -0.3f, 0.1f, -0.5f, 0.3f, -0.7f)
                lineToRelative(2.35f, -2.35f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _octagonOff!!
    }

private var _octagonOff: ImageVector? = null
