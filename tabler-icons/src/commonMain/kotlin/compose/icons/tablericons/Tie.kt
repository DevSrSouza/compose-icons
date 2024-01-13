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

public val TablerIcons.Tie: ImageVector
    get() {
        if (_tie != null) {
            return _tie!!
        }
        _tie = Builder(name = "Tie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-2.5f, -11.0f)
                lineToRelative(0.993f, -2.649f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.936f, -1.351f)
                horizontalLineToRelative(-3.114f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.936f, 1.351f)
                lineToRelative(0.993f, 2.649f)
                lineToRelative(-2.5f, 11.0f)
                lineToRelative(4.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 7.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(5.0f, 5.5f)
            }
        }
        .build()
        return _tie!!
    }

private var _tie: ImageVector? = null
