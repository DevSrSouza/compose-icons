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

public val TablerIcons.TelescopeOff: ImageVector
    get() {
        if (_telescopeOff != null) {
            return _telescopeOff!!
        }
        _telescopeOff = Builder(name = "TelescopeOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 21.0f)
                lineToRelative(6.0f, -5.0f)
                lineToRelative(6.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                verticalLineToRelative(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.238f, 8.264f)
                lineToRelative(-4.183f, 2.51f)
                curveToRelative(-1.02f, 0.614f, -1.357f, 1.898f, -0.76f, 2.906f)
                lineToRelative(0.165f, 0.28f)
                curveToRelative(0.52f, 0.88f, 1.624f, 1.266f, 2.605f, 0.91f)
                lineToRelative(6.457f, -2.34f)
                moveToRelative(2.907f, -1.055f)
                lineToRelative(4.878f, -1.77f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, false, 0.565f, -1.455f)
                lineToRelative(-2.62f, -4.705f)
                arcToRelative(1.087f, 1.087f, 0.0f, false, false, -1.447f, -0.42f)
                lineToRelative(-0.056f, 0.032f)
                lineToRelative(-6.016f, 3.61f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                lineToRelative(3.0f, 5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _telescopeOff!!
    }

private var _telescopeOff: ImageVector? = null
