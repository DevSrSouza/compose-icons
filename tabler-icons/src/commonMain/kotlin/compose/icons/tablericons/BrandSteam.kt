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

public val TablerIcons.BrandSteam: ImageVector
    get() {
        if (_brandSteam != null) {
            return _brandSteam!!
        }
        _brandSteam = Builder(name = "BrandSteam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 5.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -0.653f, 8.953f)
                lineToRelative(-4.347f, 3.009f)
                lineToRelative(0.0f, 0.038f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 3.0f)
                lineToRelative(-0.176f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.94f, -2.402f)
                lineToRelative(-2.56f, -1.098f)
                verticalLineToRelative(-3.5f)
                lineToRelative(3.51f, 1.755f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, true, 2.834f, -0.635f)
                lineToRelative(2.727f, -3.818f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.429f, -5.302f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 9.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _brandSteam!!
    }

private var _brandSteam: ImageVector? = null
