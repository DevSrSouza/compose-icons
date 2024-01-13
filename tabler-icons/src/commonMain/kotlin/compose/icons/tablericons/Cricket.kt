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

public val TablerIcons.Cricket: ImageVector
    get() {
        if (_cricket != null) {
            return _cricket!!
        }
        _cricket = Builder(name = "Cricket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.105f, 18.79f)
                lineToRelative(-1.0f, 0.992f)
                arcToRelative(4.159f, 4.159f, 0.0f, false, true, -6.038f, -5.715f)
                lineToRelative(0.157f, -0.166f)
                lineToRelative(8.282f, -8.401f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(3.45f, -3.391f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, true, 3.057f, 2.815f)
                lineToRelative(-0.116f, 0.126f)
                lineToRelative(-3.391f, 3.45f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-3.668f, 3.617f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 7.5f)
                lineToRelative(6.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
            }
        }
        .build()
        return _cricket!!
    }

private var _cricket: ImageVector? = null
