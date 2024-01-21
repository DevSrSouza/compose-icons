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

public val TablerIcons.PepperOff: ImageVector
    get() {
        if (_pepperOff != null) {
            return _pepperOff!!
        }
        _pepperOff = Builder(name = "PepperOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.59f, 12.59f)
                curveToRelative(-0.77f, 1.418f, -2.535f, 2.41f, -4.59f, 2.41f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -1.79f, -5.0f, -4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.643f, 5.67f)
                moveToRelative(1.64f, -2.357f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, false, 0.717f, -3.313f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.545f, -1.59f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                curveToRelative(0.0f, -2.0f, 2.0f, -4.0f, 4.0f, -4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _pepperOff!!
    }

private var _pepperOff: ImageVector? = null
