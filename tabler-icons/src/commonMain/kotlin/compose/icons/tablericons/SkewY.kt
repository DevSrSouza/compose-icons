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

public val TablerIcons.SkewY: ImageVector
    get() {
        if (_skewY != null) {
            return _skewY!!
        }
        _skewY = Builder(name = "SkewY", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.326f, 19.0f)
                horizontalLineToRelative(15.348f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.962f, -1.275f)
                lineToRelative(-3.429f, -12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.961f, -0.725f)
                horizontalLineToRelative(-8.492f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.961f, 0.725f)
                lineToRelative(-3.429f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.962f, 1.275f)
                close()
            }
        }
        .build()
        return _skewY!!
    }

private var _skewY: ImageVector? = null
