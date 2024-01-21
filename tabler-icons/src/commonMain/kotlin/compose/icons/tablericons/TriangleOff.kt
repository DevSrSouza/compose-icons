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

public val TablerIcons.TriangleOff: ImageVector
    get() {
        if (_triangleOff != null) {
            return _triangleOff!!
        }
        _triangleOff = Builder(name = "TriangleOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.825f, 7.83f)
                lineToRelative(-5.568f, 9.295f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, 1.636f, 2.871f)
                horizontalLineToRelative(16.107f)
                moveToRelative(1.998f, -1.99f)
                arcToRelative(1.913f, 1.913f, 0.0f, false, false, -0.255f, -0.88f)
                lineToRelative(-8.106f, -13.536f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, -3.274f, 0.0f)
                lineToRelative(-1.028f, 1.718f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _triangleOff!!
    }

private var _triangleOff: ImageVector? = null
