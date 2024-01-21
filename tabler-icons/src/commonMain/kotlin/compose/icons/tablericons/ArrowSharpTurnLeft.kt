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

public val TablerIcons.ArrowSharpTurnLeft: ImageVector
    get() {
        if (_arrowSharpTurnLeft != null) {
            return _arrowSharpTurnLeft!!
        }
        _arrowSharpTurnLeft = Builder(name = "ArrowSharpTurnLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                verticalLineToRelative(-11.31f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -1.195f, -0.495f)
                lineToRelative(-9.805f, 9.805f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
            }
        }
        .build()
        return _arrowSharpTurnLeft!!
    }

private var _arrowSharpTurnLeft: ImageVector? = null
