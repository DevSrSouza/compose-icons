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

public val TablerIcons.HelmetOff: ImageVector
    get() {
        if (_helmetOff != null) {
            return _helmetOff!!
        }
        _helmetOff = Builder(name = "HelmetOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.633f, 4.654f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 11.718f, 11.7f)
                moveToRelative(-1.503f, 2.486f)
                arcToRelative(9.008f, 9.008f, 0.0f, false, true, -1.192f, 1.16f)
                horizontalLineToRelative(-11.312f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -0.185f, -13.847f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(-7.0f)
                moveToRelative(-2.768f, 1.246f)
                curveToRelative(0.507f, 2.0f, 1.596f, 3.418f, 3.268f, 4.254f)
                curveToRelative(0.524f, 0.262f, 1.07f, 0.49f, 1.64f, 0.683f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _helmetOff!!
    }

private var _helmetOff: ImageVector? = null
