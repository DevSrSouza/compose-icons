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

public val TablerIcons.View360Off: ImageVector
    get() {
        if (_view360Off != null) {
            return _view360Off!!
        }
        _view360Off = Builder(name = "View360Off", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.335f, 8.388f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, false, -0.335f, 3.612f)
                curveToRelative(0.0f, 4.97f, 1.79f, 9.0f, 4.0f, 9.0f)
                curveToRelative(1.622f, 0.0f, 3.018f, -2.172f, 3.646f, -5.294f)
                moveToRelative(0.354f, -3.706f)
                curveToRelative(0.0f, -4.97f, -1.79f, -9.0f, -4.0f, -9.0f)
                curveToRelative(-1.035f, 0.0f, -1.979f, 0.885f, -2.689f, 2.337f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.65f, 5.623f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 12.71f, 12.745f)
                moveToRelative(1.684f, -2.328f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -12.094f, -12.08f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.32f, 8.349f)
                curveToRelative(-3.136f, 0.625f, -5.32f, 2.025f, -5.32f, 3.651f)
                curveToRelative(0.0f, 2.21f, 4.03f, 4.0f, 9.0f, 4.0f)
                curveToRelative(1.286f, 0.0f, 2.51f, -0.12f, 3.616f, -0.336f)
                moveToRelative(3.059f, -0.98f)
                curveToRelative(1.445f, -0.711f, 2.325f, -1.653f, 2.325f, -2.684f)
                curveToRelative(0.0f, -2.21f, -4.03f, -4.0f, -9.0f, -4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _view360Off!!
    }

private var _view360Off: ImageVector? = null
