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

public val TablerIcons.LassoOff: ImageVector
    get() {
        if (_lassoOff != null) {
            return _lassoOff!!
        }
        _lassoOff = Builder(name = "LassoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.028f, 13.252f)
                curveToRelative(-0.657f, -0.972f, -1.028f, -2.078f, -1.028f, -3.252f)
                curveToRelative(0.0f, -1.804f, 0.878f, -3.449f, 2.319f, -4.69f)
                moveToRelative(2.49f, -1.506f)
                arcToRelative(11.066f, 11.066f, 0.0f, false, true, 4.191f, -0.804f)
                curveToRelative(4.97f, 0.0f, 9.0f, 3.134f, 9.0f, 7.0f)
                curveToRelative(0.0f, 1.799f, -0.873f, 3.44f, -2.307f, 4.68f)
                moveToRelative(-2.503f, 1.517f)
                arcToRelative(11.066f, 11.066f, 0.0f, false, true, -4.19f, 0.803f)
                curveToRelative(-1.913f, 0.0f, -3.686f, -0.464f, -5.144f, -1.255f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 17.0f)
                curveToRelative(0.0f, 1.42f, 0.316f, 2.805f, 1.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _lassoOff!!
    }

private var _lassoOff: ImageVector? = null
