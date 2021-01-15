package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = Builder(name = "EyeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineTo(21.0f, 21.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.584f, 10.587f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.828f, 2.83f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.363f, 5.365f)
                arcToRelative(9.466f, 9.466f, 0.0f, false, true, 2.637f, -0.365f)
                curveToRelative(4.0f, 0.0f, 7.333f, 2.333f, 10.0f, 7.0f)
                curveToRelative(-0.778f, 1.361f, -1.612f, 2.524f, -2.503f, 3.488f)
                moveToRelative(-2.14f, 1.861f)
                curveToRelative(-1.631f, 1.1f, -3.415f, 1.651f, -5.357f, 1.651f)
                curveToRelative(-4.0f, 0.0f, -7.333f, -2.333f, -10.0f, -7.0f)
                curveToRelative(1.369f, -2.395f, 2.913f, -4.175f, 4.632f, -5.341f)
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
