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

public val TablerIcons.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) {
            return _planeArrival!!
        }
        _planeArrival = Builder(name = "PlaneArrival", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.157f, 11.811f)
                lineToRelative(4.83f, 1.294f)
                arcToRelative(2.0f, 2.0f, 91.816f, false, true, -1.035f, 3.864f)
                lineToRelative(-14.489f, -3.882f)
                lineToRelative(-1.345f, -6.572f)
                lineToRelative(2.898f, 0.776f)
                lineToRelative(1.414f, 2.449f)
                lineToRelative(2.898f, 0.776f)
                lineToRelative(-0.12f, -7.279f)
                lineToRelative(2.898f, 0.776f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                lineTo(21.0f, 21.0f)
            }
        }
        .build()
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
