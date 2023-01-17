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

public val TablerIcons.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = Builder(name = "Axe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                lineToRelative(7.383f, 7.418f)
                curveToRelative(0.823f, 0.82f, 0.823f, 2.148f, 0.0f, 2.967f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, true, -2.976f, 0.0f)
                lineToRelative(-7.407f, -7.385f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.66f, 15.66f)
                lineToRelative(-3.32f, -3.32f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.42f, -2.044f)
                lineToRelative(3.24f, -1.296f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-1.296f, 3.24f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.044f, 0.42f)
                close()
            }
        }
        .build()
        return _axe!!
    }

private var _axe: ImageVector? = null
