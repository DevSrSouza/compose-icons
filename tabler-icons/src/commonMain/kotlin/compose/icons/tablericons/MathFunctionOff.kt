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

public val TablerIcons.MathFunctionOff: ImageVector
    get() {
        if (_mathFunctionOff != null) {
            return _mathFunctionOff!!
        }
        _mathFunctionOff = Builder(name = "MathFunctionOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.882f, 0.0f, 0.986f, 0.777f, 1.694f, 2.692f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 17.0f)
                curveToRelative(0.864f, 0.0f, 1.727f, -0.663f, 2.495f, -1.512f)
                moveToRelative(1.717f, -2.302f)
                curveToRelative(0.993f, -1.45f, 2.39f, -3.186f, 3.788f, -3.186f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                curveToRelative(0.0f, 1.5f, 0.5f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -4.0f, 3.0f, -9.0f)
                curveToRelative(0.237f, -1.186f, 0.446f, -2.317f, 0.647f, -3.35f)
                moveToRelative(0.727f, -3.248f)
                curveToRelative(0.423f, -1.492f, 0.91f, -2.402f, 1.626f, -2.402f)
                curveToRelative(1.5f, 0.0f, 2.0f, 0.5f, 2.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _mathFunctionOff!!
    }

private var _mathFunctionOff: ImageVector? = null
