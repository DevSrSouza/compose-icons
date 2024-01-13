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

public val TablerIcons.Biohazard: ImageVector
    get() {
        if (_biohazard != null) {
            return _biohazard!!
        }
        _biohazard = Builder(name = "Biohazard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.939f, 14.0f)
                curveToRelative(0.0f, 0.173f, 0.048f, 0.351f, 0.056f, 0.533f)
                lineToRelative(0.0f, 0.217f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -4.533f, 4.745f)
                lineToRelative(-0.217f, 0.0f)
                moveToRelative(-4.75f, -4.75f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 7.737f, -3.693f)
                moveToRelative(6.513f, 8.443f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -4.69f, -5.503f)
                lineToRelative(-0.06f, 0.0f)
                moveToRelative(1.764f, -2.944f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 7.731f, 3.477f)
                lineToRelative(0.0f, 0.217f)
                moveToRelative(-11.195f, -3.813f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -1.828f, -7.624f)
                lineToRelative(0.164f, -0.172f)
                moveToRelative(6.718f, 0.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -1.665f, 7.798f)
            }
        }
        .build()
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
