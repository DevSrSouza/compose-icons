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

public val TablerIcons.ZeppelinOff: ImageVector
    get() {
        if (_zeppelinOff != null) {
            return _zeppelinOff!!
        }
        _zeppelinOff = Builder(name = "ZeppelinOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.773f, 15.783f)
                curveToRelative(-0.723f, 0.141f, -1.486f, 0.217f, -2.273f, 0.217f)
                curveToRelative(-2.13f, 0.0f, -4.584f, -0.926f, -7.364f, -2.777f)
                lineToRelative(-2.136f, 1.777f)
                verticalLineToRelative(-3.33f)
                arcToRelative(46.07f, 46.07f, 0.0f, false, true, -2.0f, -1.67f)
                arcToRelative(46.07f, 46.07f, 0.0f, false, true, 2.0f, -1.67f)
                verticalLineToRelative(-3.33f)
                lineToRelative(2.135f, 1.778f)
                curveToRelative(0.13f, -0.087f, 0.261f, -0.172f, 0.39f, -0.256f)
                moveToRelative(2.564f, -1.42f)
                curveToRelative(1.601f, -0.735f, 3.071f, -1.102f, 4.411f, -1.102f)
                curveToRelative(4.694f, 0.0f, 8.5f, 2.686f, 8.5f, 6.0f)
                curveToRelative(0.0f, 1.919f, -1.276f, 3.627f, -3.261f, 4.725f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _zeppelinOff!!
    }

private var _zeppelinOff: ImageVector? = null
