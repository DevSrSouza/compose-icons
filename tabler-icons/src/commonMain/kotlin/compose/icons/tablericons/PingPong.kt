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

public val TablerIcons.PingPong: ImageVector
    get() {
        if (_pingPong != null) {
            return _pingPong!!
        }
        _pingPong = Builder(name = "PingPong", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.718f, 20.713f)
                arcToRelative(7.64f, 7.64f, 0.0f, false, true, -7.48f, -12.755f)
                lineToRelative(0.72f, -0.72f)
                arcToRelative(7.643f, 7.643f, 0.0f, false, true, 9.105f, -1.283f)
                lineToRelative(2.387f, -2.345f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, true, 3.057f, 2.815f)
                lineToRelative(-0.116f, 0.126f)
                lineToRelative(-2.346f, 2.387f)
                arcToRelative(7.644f, 7.644f, 0.0f, false, true, -1.052f, 8.864f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.3f, 5.3f)
                lineToRelative(9.4f, 9.4f)
            }
        }
        .build()
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
