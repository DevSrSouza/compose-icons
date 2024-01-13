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

public val TablerIcons.GhostOff: ImageVector
    get() {
        if (_ghostOff != null) {
            return _ghostOff!!
        }
        _ghostOff = Builder(name = "GhostOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.794f, 4.776f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 10.206f, 6.224f)
                verticalLineToRelative(4.0f)
                moveToRelative(-0.12f, 3.898f)
                arcToRelative(1.779f, 1.779f, 0.0f, false, true, -2.98f, 0.502f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -2.6f, 0.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, -2.6f, 0.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -2.6f, 0.0f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, -3.1f, -1.4f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.683f, 0.594f, -3.227f, 1.583f, -4.434f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _ghostOff!!
    }

private var _ghostOff: ImageVector? = null
