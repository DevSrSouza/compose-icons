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

public val TablerIcons.DiaboloOff: ImageVector
    get() {
        if (_diaboloOff != null) {
            return _diaboloOff!!
        }
        _diaboloOff = Builder(name = "DiaboloOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.727f, 4.749f)
                curveToRelative(-0.467f, 0.38f, -0.727f, 0.804f, -0.727f, 1.251f)
                curveToRelative(0.0f, 1.217f, 1.933f, 2.265f, 4.71f, 2.735f)
                moveToRelative(4.257f, 0.243f)
                curveToRelative(3.962f, -0.178f, 7.033f, -1.444f, 7.033f, -2.978f)
                curveToRelative(0.0f, -1.657f, -3.582f, -3.0f, -8.0f, -3.0f)
                curveToRelative(-1.66f, 0.0f, -3.202f, 0.19f, -4.48f, 0.514f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineToRelative(0.143f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.048f, 0.307f)
                lineToRelative(1.952f, 5.55f)
                lineToRelative(-1.964f, 5.67f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.036f, 0.265f)
                verticalLineToRelative(0.065f)
                curveToRelative(0.0f, 1.657f, 3.582f, 3.0f, 8.0f, 3.0f)
                curveToRelative(3.218f, 0.0f, 5.992f, -0.712f, 7.262f, -1.74f)
                moveToRelative(-0.211f, -4.227f)
                lineToRelative(-1.051f, -3.033f)
                lineToRelative(1.952f, -5.55f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.048f, -0.307f)
                verticalLineToRelative(-0.143f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, 2.686f, 2.0f, 6.0f, 2.0f)
                curveToRelative(0.656f, 0.0f, 1.288f, -0.035f, 1.879f, -0.1f)
                moveToRelative(3.198f, -0.834f)
                curveToRelative(0.585f, -0.308f, 0.923f, -0.674f, 0.923f, -1.066f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _diaboloOff!!
    }

private var _diaboloOff: ImageVector? = null
