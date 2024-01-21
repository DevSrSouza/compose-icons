package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Diamonds: ImageVector
    get() {
        if (_diamonds != null) {
            return _diamonds!!
        }
        _diamonds = Builder(name = "Diamonds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.831f, 20.413f)
                lineToRelative(-5.375f, -6.91f)
                curveToRelative(-0.608f, -0.783f, -0.608f, -2.223f, 0.0f, -3.0f)
                lineToRelative(5.375f, -6.911f)
                arcToRelative(1.457f, 1.457f, 0.0f, false, true, 2.338f, 0.0f)
                lineToRelative(5.375f, 6.91f)
                curveToRelative(0.608f, 0.783f, 0.608f, 2.223f, 0.0f, 3.0f)
                lineToRelative(-5.375f, 6.911f)
                arcToRelative(1.457f, 1.457f, 0.0f, false, true, -2.338f, 0.0f)
                close()
            }
        }
        .build()
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null
