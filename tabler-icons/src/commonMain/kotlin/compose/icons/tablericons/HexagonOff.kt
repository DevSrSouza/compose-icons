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

public val TablerIcons.HexagonOff: ImageVector
    get() {
        if (_hexagonOff != null) {
            return _hexagonOff!!
        }
        _hexagonOff = Builder(name = "HexagonOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.693f, 4.69f)
                lineToRelative(2.336f, -1.39f)
                arcToRelative(2.056f, 2.056f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(6.0f, 3.573f)
                horizontalLineToRelative(-0.029f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 1.747f)
                verticalLineToRelative(6.536f)
                curveToRelative(0.0f, 0.246f, -0.045f, 0.485f, -0.13f, 0.707f)
                moveToRelative(-2.16f, 1.847f)
                lineToRelative(-4.739f, 3.027f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.942f, 0.0f)
                lineToRelative(-6.0f, -3.833f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.029f, -1.747f)
                verticalLineToRelative(-6.537f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.029f, -1.748f)
                lineToRelative(1.154f, -0.687f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _hexagonOff!!
    }

private var _hexagonOff: ImageVector? = null
