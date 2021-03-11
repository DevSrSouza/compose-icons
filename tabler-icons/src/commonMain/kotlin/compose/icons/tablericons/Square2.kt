package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Square2: ImageVector
    get() {
        if (_square2 != null) {
            return _square2!!
        }
        _square2 = Builder(name = "Square2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                curveToRelative(0.0f, 0.591f, -0.417f, 1.318f, -0.816f, 1.858f)
                lineToRelative(-3.184f, 4.143f)
                lineToRelative(4.0f, -0.001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                lineTo(18.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 6.0f)
                lineTo(20.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 18.0f)
                lineTo(4.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 4.0f)
                close()
            }
        }
        .build()
        return _square2!!
    }

private var _square2: ImageVector? = null
