package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 3.0f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, true, -3.14f, 1.53f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, -7.86f, 3.0f)
                verticalLineToRelative(1.0f)
                arcTo(10.66f, 10.66f, 0.0f, false, true, 3.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, 9.0f, 5.0f, 13.0f)
                arcToRelative(11.64f, 11.64f, 0.0f, false, true, -7.0f, 2.0f)
                curveToRelative(9.0f, 5.0f, 20.0f, 0.0f, 20.0f, -11.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -0.08f, -0.83f)
                arcTo(7.72f, 7.72f, 0.0f, false, false, 23.0f, 3.0f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
