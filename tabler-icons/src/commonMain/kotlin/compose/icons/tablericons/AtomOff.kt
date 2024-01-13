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

public val TablerIcons.AtomOff: ImageVector
    get() {
        if (_atomOff != null) {
            return _atomOff!!
        }
        _atomOff = Builder(name = "AtomOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.172f, 9.172f)
                curveToRelative(-3.906f, 3.905f, -5.805f, 8.337f, -4.243f, 9.9f)
                curveToRelative(1.562f, 1.561f, 6.0f, -0.338f, 9.9f, -4.244f)
                moveToRelative(1.884f, -2.113f)
                curveToRelative(2.587f, -3.277f, 3.642f, -6.502f, 2.358f, -7.786f)
                curveToRelative(-1.284f, -1.284f, -4.508f, -0.23f, -7.784f, 2.357f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.929f, 4.929f)
                curveToRelative(-1.562f, 1.562f, 0.337f, 6.0f, 4.243f, 9.9f)
                curveToRelative(3.905f, 3.905f, 8.337f, 5.804f, 9.9f, 4.242f)
                moveToRelative(-0.072f, -4.071f)
                curveToRelative(-0.767f, -1.794f, -2.215f, -3.872f, -4.172f, -5.828f)
                curveToRelative(-1.944f, -1.945f, -4.041f, -3.402f, -5.828f, -4.172f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _atomOff!!
    }

private var _atomOff: ImageVector? = null
