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

public val TablerIcons.CircleSquare: ImageVector
    get() {
        if (_circleSquare != null) {
            return _circleSquare!!
        }
        _circleSquare = Builder(name = "CircleSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 9.5f)
                moveToRelative(-6.5f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                lineTo(19.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 12.0f)
                lineTo(21.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                lineTo(12.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 19.0f)
                lineTo(10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _circleSquare!!
    }

private var _circleSquare: ImageVector? = null
