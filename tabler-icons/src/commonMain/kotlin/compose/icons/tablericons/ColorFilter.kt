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

public val TablerIcons.ColorFilter: ImageVector
    get() {
        if (_colorFilter != null) {
            return _colorFilter!!
        }
        _colorFilter = Builder(name = "ColorFilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.58f, 13.79f)
                curveToRelative(0.27f, 0.68f, 0.42f, 1.43f, 0.42f, 2.21f)
                curveToRelative(0.0f, 1.77f, -0.77f, 3.37f, -2.0f, 4.46f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, true, -4.0f, 1.54f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                curveToRelative(0.0f, -2.76f, 1.88f, -5.1f, 4.42f, -5.79f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.58f, 10.21f)
                curveToRelative(2.54f, 0.69f, 4.42f, 3.03f, 4.42f, 5.79f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, true, -4.0f, -1.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                moveToRelative(-6.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -12.0f, 0.0f)
            }
        }
        .build()
        return _colorFilter!!
    }

private var _colorFilter: ImageVector? = null
