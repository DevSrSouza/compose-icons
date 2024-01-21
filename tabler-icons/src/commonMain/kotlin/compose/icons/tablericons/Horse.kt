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

public val TablerIcons.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
                lineToRelative(-0.85f, 8.507f)
                arcToRelative(1.357f, 1.357f, 0.0f, false, false, 1.35f, 1.493f)
                horizontalLineToRelative(0.146f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.857f, -1.257f)
                lineToRelative(0.994f, -2.486f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.857f, -1.257f)
                horizontalLineToRelative(1.292f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.857f, 1.257f)
                lineToRelative(0.994f, 2.486f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.857f, 1.257f)
                horizontalLineToRelative(0.146f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, false, 1.364f, -1.494f)
                lineToRelative(-0.864f, -9.506f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(0.0f, -3.0f, -3.0f, -5.0f, -6.0f, -5.0f)
                lineToRelative(-3.0f, 6.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(3.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
