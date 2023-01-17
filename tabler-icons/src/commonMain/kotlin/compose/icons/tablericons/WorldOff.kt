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

public val TablerIcons.WorldOff: ImageVector
    get() {
        if (_worldOff != null) {
            return _worldOff!!
        }
        _worldOff = Builder(name = "WorldOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.6f, 9.0f)
                horizontalLineToRelative(5.4f)
                moveToRelative(4.0f, 0.0f)
                horizontalLineToRelative(7.4f)
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
                moveTo(3.6f, 15.0f)
                horizontalLineToRelative(11.4f)
                moveToRelative(4.0f, 0.0f)
                horizontalLineToRelative(1.4f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.335f, 8.388f)
                arcToRelative(18.998f, 18.998f, 0.0f, false, false, -0.335f, 3.612f)
                curveToRelative(0.0f, 4.97f, 1.79f, 9.0f, 4.0f, 9.0f)
                curveToRelative(1.622f, 0.0f, 3.018f, -2.172f, 3.646f, -5.294f)
                moveToRelative(0.354f, -3.706f)
                curveToRelative(0.0f, -4.97f, -1.79f, -9.0f, -4.0f, -9.0f)
                curveToRelative(-1.035f, 0.0f, -1.979f, 0.885f, -2.689f, 2.337f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _worldOff!!
    }

private var _worldOff: ImageVector? = null
