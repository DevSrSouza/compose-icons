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

public val FeatherIcons.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.54f, 6.42f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, false, -1.94f, -2.0f)
                curveTo(18.88f, 4.0f, 12.0f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(-6.88f, 0.0f, -8.6f, 0.46f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, false, -1.94f, 2.0f)
                arcTo(29.0f, 29.0f, 0.0f, false, false, 1.0f, 11.75f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, false, 0.46f, 5.33f)
                arcTo(2.78f, 2.78f, 0.0f, false, false, 3.4f, 19.0f)
                curveToRelative(1.72f, 0.46f, 8.6f, 0.46f, 8.6f, 0.46f)
                reflectiveCurveToRelative(6.88f, 0.0f, 8.6f, -0.46f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, false, 1.94f, -2.0f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, false, 0.46f, -5.25f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, false, -0.46f, -5.33f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.75f, 15.02f)
                lineToRelative(5.75f, -3.27f)
                lineToRelative(-5.75f, -3.27f)
                lineToRelative(0.0f, 6.54f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
