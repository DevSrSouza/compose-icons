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

public val TablerIcons.BrandTerraform: ImageVector
    get() {
        if (_brandTerraform != null) {
            return _brandTerraform!!
        }
        _brandTerraform = Builder(name = "BrandTerraform", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.5f)
                lineToRelative(-11.476f, -6.216f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.524f, -0.88f)
                verticalLineToRelative(-4.054f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, 2.03f, -1.166f)
                lineToRelative(9.97f, 5.816f)
                verticalLineToRelative(10.65f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -2.03f, 1.166f)
                lineToRelative(-3.474f, -2.027f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.496f, -0.863f)
                verticalLineToRelative(-11.926f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.5f)
                lineToRelative(5.504f, -3.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.496f, -0.864f)
                verticalLineToRelative(-3.576f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, -2.03f, -1.166f)
                lineToRelative(-3.97f, 2.316f)
            }
        }
        .build()
        return _brandTerraform!!
    }

private var _brandTerraform: ImageVector? = null
