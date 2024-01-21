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

public val TablerIcons.BrandAmigo: ImageVector
    get() {
        if (_brandAmigo != null) {
            return _brandAmigo!!
        }
        _brandAmigo = Builder(name = "BrandAmigo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(9.591f, 3.635f)
                lineToRelative(-7.13f, 14.082f)
                curveToRelative(-1.712f, 3.38f, 1.759f, 5.45f, 3.69f, 3.573f)
                lineToRelative(1.86f, -1.81f)
                curveToRelative(3.142f, -3.054f, 4.959f, -2.99f, 8.039f, 0.11f)
                lineToRelative(1.329f, 1.337f)
                curveToRelative(2.372f, 2.387f, 5.865f, 0.078f, 4.176f, -3.225f)
                lineToRelative(-7.195f, -14.067f)
                curveToRelative(-1.114f, -2.18f, -3.666f, -2.18f, -4.77f, 0.0f)
                close()
            }
        }
        .build()
        return _brandAmigo!!
    }

private var _brandAmigo: ImageVector? = null
