package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandGithub: ImageVector
    get() {
        if (_brandGithub != null) {
            return _brandGithub!!
        }
        _brandGithub = Builder(name = "BrandGithub", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 19.0f)
                curveToRelative(-4.3f, 1.4f, -4.3f, -2.5f, -6.0f, -3.0f)
                moveToRelative(12.0f, 5.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.0f, 0.1f, -1.4f, -0.5f, -2.0f)
                curveToRelative(2.8f, -0.3f, 5.5f, -1.4f, 5.5f, -6.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -1.3f, -3.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -0.1f, -3.2f)
                reflectiveCurveToRelative(-1.1f, -0.3f, -3.5f, 1.3f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -6.2f, 0.0f)
                curveToRelative(-2.4f, -1.6f, -3.5f, -1.3f, -3.5f, -1.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -0.1f, 3.2f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -1.3f, 3.2f)
                curveToRelative(0.0f, 4.6f, 2.7f, 5.7f, 5.5f, 6.0f)
                curveToRelative(-0.6f, 0.6f, -0.6f, 1.2f, -0.5f, 2.0f)
                verticalLineToRelative(3.5f)
            }
        }
        .build()
        return _brandGithub!!
    }

private var _brandGithub: ImageVector? = null
