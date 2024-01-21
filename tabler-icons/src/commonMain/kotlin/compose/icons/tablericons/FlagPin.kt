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

public val TablerIcons.FlagPin: ImageVector
    get() {
        if (_flagPin != null) {
            return _flagPin!!
        }
        _flagPin = Builder(name = "FlagPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.857f, 14.675f)
                arcToRelative(5.016f, 5.016f, 0.0f, false, true, -0.857f, -0.675f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.0f, 0.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 7.0f, 0.0f)
                verticalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                verticalLineToRelative(-7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.121f, 20.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -4.242f, 0.0f)
                curveToRelative(0.418f, 0.419f, 1.125f, 1.045f, 2.121f, 1.879f)
                curveToRelative(1.051f, -0.89f, 1.759f, -1.516f, 2.121f, -1.879f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                verticalLineToRelative(0.01f)
            }
        }
        .build()
        return _flagPin!!
    }

private var _flagPin: ImageVector? = null
