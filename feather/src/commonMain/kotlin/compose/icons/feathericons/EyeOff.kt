package compose.icons.feathericons

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
import compose.icons.FeatherIcons

public val FeatherIcons.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = Builder(name = "EyeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.94f, 17.94f)
                arcTo(10.07f, 10.07f, 0.0f, false, true, 12.0f, 20.0f)
                curveToRelative(-7.0f, 0.0f, -11.0f, -8.0f, -11.0f, -8.0f)
                arcToRelative(18.45f, 18.45f, 0.0f, false, true, 5.06f, -5.94f)
                moveTo(9.9f, 4.24f)
                arcTo(9.12f, 9.12f, 0.0f, false, true, 12.0f, 4.0f)
                curveToRelative(7.0f, 0.0f, 11.0f, 8.0f, 11.0f, 8.0f)
                arcToRelative(18.5f, 18.5f, 0.0f, false, true, -2.16f, 3.19f)
                moveToRelative(-6.72f, -1.07f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.24f, -4.24f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 1.0f)
                lineTo(23.0f, 23.0f)
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
