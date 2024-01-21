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

public val TablerIcons.ChefHat: ImageVector
    get() {
        if (_chefHat != null) {
            return _chefHat!!
        }
        _chefHat = Builder(name = "ChefHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(1.918f, 0.0f, 3.52f, 1.35f, 3.91f, 3.151f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.09f, 7.723f)
                lineToRelative(0.0f, 7.126f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-7.126f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.092f, -7.723f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.908f, -3.151f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.161f, 17.009f)
                lineToRelative(11.839f, -0.009f)
            }
        }
        .build()
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
