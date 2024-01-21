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

public val TablerIcons.Wood: ImageVector
    get() {
        if (_wood != null) {
            return _wood!!
        }
        _wood = Builder(name = "Wood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                moveToRelative(-6.0f, 0.0f)
                arcToRelative(6.0f, 2.5f, 0.0f, true, false, 12.0f, 0.0f)
                arcToRelative(6.0f, 2.5f, 0.0f, true, false, -12.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 5.5f)
                verticalLineToRelative(4.626f)
                arcToRelative(1.415f, 1.415f, 0.0f, false, true, 1.683f, 2.18f)
                lineToRelative(-0.097f, 0.108f)
                lineToRelative(-1.586f, 1.586f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.61f, -2.54f, 2.925f, -5.725f, 3.0f)
                lineToRelative(-0.275f, 0.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -1.343f, -6.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-1.586f, -1.586f)
                arcToRelative(1.414f, 1.414f, 0.0f, false, true, 1.586f, -2.287f)
                verticalLineToRelative(-6.627f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.5f)
                verticalLineToRelative(1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 16.0f)
                verticalLineToRelative(1.0f)
            }
        }
        .build()
        return _wood!!
    }

private var _wood: ImageVector? = null
