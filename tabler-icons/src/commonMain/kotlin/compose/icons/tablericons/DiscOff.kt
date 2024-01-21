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

public val TablerIcons.DiscOff: ImageVector
    get() {
        if (_discOff != null) {
            return _discOff!!
        }
        _discOff = Builder(name = "DiscOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.044f, 16.04f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -12.082f, -12.085f)
                moveToRelative(-2.333f, 1.688f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 6.371f, 15.357f)
                curveToRelative(2.491f, 0.0f, 4.73f, -1.0f, 6.36f, -2.631f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.298f, 11.288f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.402f, 1.427f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                curveToRelative(0.0f, -1.38f, 0.559f, -2.629f, 1.462f, -3.534f)
                moveToRelative(2.607f, -1.38f)
                curveToRelative(0.302f, -0.056f, 0.613f, -0.086f, 0.931f, -0.086f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                arcToRelative(4.985f, 4.985f, 0.0f, false, false, 3.551f, -1.48f)
                moveToRelative(1.362f, -2.587f)
                curveToRelative(0.057f, -0.302f, 0.087f, -0.614f, 0.087f, -0.933f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _discOff!!
    }

private var _discOff: ImageVector? = null
