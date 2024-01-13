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

public val TablerIcons.DirectionSign: ImageVector
    get() {
        if (_directionSign != null) {
            return _directionSign!!
        }
        _directionSign = Builder(name = "DirectionSign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.32f, 12.774f)
                lineToRelative(7.906f, 7.905f)
                curveToRelative(0.427f, 0.428f, 1.12f, 0.428f, 1.548f, 0.0f)
                lineToRelative(7.905f, -7.905f)
                arcToRelative(1.095f, 1.095f, 0.0f, false, false, 0.0f, -1.548f)
                lineToRelative(-7.905f, -7.905f)
                arcToRelative(1.095f, 1.095f, 0.0f, false, false, -1.548f, 0.0f)
                lineToRelative(-7.905f, 7.905f)
                arcToRelative(1.095f, 1.095f, 0.0f, false, false, 0.0f, 1.548f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-3.5f, 3.5f)
            }
        }
        .build()
        return _directionSign!!
    }

private var _directionSign: ImageVector? = null
