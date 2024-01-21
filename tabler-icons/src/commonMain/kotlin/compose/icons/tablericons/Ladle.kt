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

public val TablerIcons.Ladle: ImageVector
    get() {
        if (_ladle != null) {
            return _ladle!!
        }
        _ladle = Builder(name = "Ladle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 16.0f)
                curveToRelative(-0.663f, 0.0f, -1.3f, -0.036f, -1.896f, -0.102f)
                lineToRelative(-0.5f, -0.064f)
                curveToRelative(-2.123f, -0.308f, -3.604f, -1.013f, -3.604f, -1.834f)
                curveToRelative(0.0f, -0.82f, 1.482f, -1.526f, 3.603f, -1.834f)
                lineToRelative(0.5f, -0.064f)
                arcToRelative(17.27f, 17.27f, 0.0f, false, true, 1.897f, -0.102f)
                curveToRelative(0.663f, 0.0f, 1.3f, 0.036f, 1.896f, 0.102f)
                lineToRelative(0.5f, 0.064f)
                curveToRelative(2.123f, 0.308f, 3.604f, 1.013f, 3.604f, 1.834f)
                curveToRelative(0.0f, 0.82f, -1.482f, 1.526f, -3.603f, 1.834f)
                lineToRelative(-0.5f, 0.064f)
                arcToRelative(17.27f, 17.27f, 0.0f, false, true, -1.897f, 0.102f)
                close()
            }
        }
        .build()
        return _ladle!!
    }

private var _ladle: ImageVector? = null
