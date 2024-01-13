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

public val TablerIcons.FrustumOff: ImageVector
    get() {
        if (_frustumOff != null) {
            return _frustumOff!!
        }
        _frustumOff = Builder(name = "FrustumOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.72f, 3.728f)
                lineToRelative(3.484f, -1.558f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, true, 1.59f, 0.0f)
                lineToRelative(4.496f, 2.01f)
                curveToRelative(0.554f, 0.246f, 0.963f, 0.736f, 1.112f, 1.328f)
                lineToRelative(2.538f, 10.158f)
                curveToRelative(0.103f, 0.412f, 0.07f, 0.832f, -0.075f, 1.206f)
                moveToRelative(-2.299f, 1.699f)
                lineToRelative(-5.725f, 2.738f)
                arcToRelative(1.945f, 1.945f, 0.0f, false, true, -1.682f, 0.0f)
                lineToRelative(-7.035f, -3.365f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, -1.064f, -2.278f)
                lineToRelative(2.52f, -10.08f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 4.82f)
                lineToRelative(-5.198f, 2.324f)
                arcToRelative(1.963f, 1.963f, 0.0f, false, true, -1.602f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.32f)
                verticalLineToRelative(0.68f)
                moveToRelative(0.0f, 4.0f)
                verticalLineToRelative(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _frustumOff!!
    }

private var _frustumOff: ImageVector? = null
