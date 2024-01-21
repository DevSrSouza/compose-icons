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

public val TablerIcons.Zeppelin: ImageVector
    get() {
        if (_zeppelin != null) {
            return _zeppelin!!
        }
        _zeppelin = Builder(name = "Zeppelin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 4.0f)
                curveToRelative(4.694f, 0.0f, 8.5f, 2.686f, 8.5f, 6.0f)
                reflectiveCurveToRelative(-3.806f, 6.0f, -8.5f, 6.0f)
                curveToRelative(-2.13f, 0.0f, -4.584f, -0.926f, -7.364f, -2.777f)
                lineToRelative(-2.136f, 1.777f)
                verticalLineToRelative(-3.33f)
                arcToRelative(46.07f, 46.07f, 0.0f, false, true, -2.0f, -1.67f)
                arcToRelative(46.07f, 46.07f, 0.0f, false, true, 2.0f, -1.67f)
                verticalLineToRelative(-3.33f)
                lineToRelative(2.135f, 1.778f)
                curveToRelative(2.78f, -1.852f, 5.235f, -2.778f, 7.365f, -2.778f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
            }
        }
        .build()
        return _zeppelin!!
    }

private var _zeppelin: ImageVector? = null
