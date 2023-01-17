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

public val TablerIcons.SchoolBell: ImageVector
    get() {
        if (_schoolBell != null) {
            return _schoolBell!!
        }
        _schoolBell = Builder(name = "SchoolBell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.805f, 6.37f)
                lineToRelative(2.783f, -2.784f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.829f, 2.828f)
                lineToRelative(-2.784f, 2.786f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.505f, 7.495f)
                arcToRelative(5.105f, 5.105f, 0.0f, false, true, 0.176f, 7.035f)
                lineToRelative(-0.176f, 0.184f)
                lineToRelative(-1.867f, 1.867f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, -1.013f, 2.234f)
                lineToRelative(-0.008f, 0.23f)
                verticalLineToRelative(0.934f)
                curveToRelative(0.0f, 0.327f, -0.13f, 0.64f, -0.36f, 0.871f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.652f, 0.06f)
                lineToRelative(-0.07f, -0.06f)
                lineToRelative(-9.385f, -9.384f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.0f, -0.722f)
                curveToRelative(0.198f, -0.198f, 0.456f, -0.322f, 0.732f, -0.353f)
                lineToRelative(0.139f, -0.008f)
                horizontalLineToRelative(0.933f)
                curveToRelative(0.848f, 0.0f, 1.663f, -0.309f, 2.297f, -0.864f)
                lineToRelative(0.168f, -0.157f)
                lineToRelative(1.867f, -1.867f)
                lineToRelative(0.16f, -0.153f)
                arcToRelative(5.105f, 5.105f, 0.0f, false, true, 7.059f, 0.153f)
                close()
            }
        }
        .build()
        return _schoolBell!!
    }

private var _schoolBell: ImageVector? = null
