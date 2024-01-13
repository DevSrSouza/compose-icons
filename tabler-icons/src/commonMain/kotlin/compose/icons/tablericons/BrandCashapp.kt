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

public val TablerIcons.BrandCashapp: ImageVector
    get() {
        if (_brandCashapp != null) {
            return _brandCashapp!!
        }
        _brandCashapp = Builder(name = "BrandCashapp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.1f, 8.648f)
                arcToRelative(0.568f, 0.568f, 0.0f, false, true, -0.761f, 0.011f)
                arcToRelative(5.682f, 5.682f, 0.0f, false, false, -3.659f, -1.34f)
                curveToRelative(-1.102f, 0.0f, -2.205f, 0.363f, -2.205f, 1.374f)
                curveToRelative(0.0f, 1.023f, 1.182f, 1.364f, 2.546f, 1.875f)
                curveToRelative(2.386f, 0.796f, 4.363f, 1.796f, 4.363f, 4.137f)
                curveToRelative(0.0f, 2.545f, -1.977f, 4.295f, -5.204f, 4.488f)
                lineToRelative(-0.295f, 1.364f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, -0.546f, 0.443f)
                horizontalLineToRelative(-2.034f)
                lineToRelative(-0.102f, -0.011f)
                arcToRelative(0.568f, 0.568f, 0.0f, false, true, -0.432f, -0.67f)
                lineToRelative(0.318f, -1.444f)
                arcToRelative(7.432f, 7.432f, 0.0f, false, true, -3.273f, -1.784f)
                verticalLineToRelative(-0.011f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, 0.0f, -0.773f)
                lineToRelative(1.137f, -1.102f)
                curveToRelative(0.214f, -0.2f, 0.547f, -0.2f, 0.761f, 0.0f)
                arcToRelative(5.495f, 5.495f, 0.0f, false, false, 3.852f, 1.5f)
                curveToRelative(1.478f, 0.0f, 2.466f, -0.625f, 2.466f, -1.614f)
                curveToRelative(0.0f, -0.989f, -1.0f, -1.25f, -2.886f, -1.954f)
                curveToRelative(-2.0f, -0.716f, -3.898f, -1.728f, -3.898f, -4.091f)
                curveToRelative(0.0f, -2.75f, 2.284f, -4.091f, 4.989f, -4.216f)
                lineToRelative(0.284f, -1.398f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, 0.545f, -0.432f)
                horizontalLineToRelative(2.023f)
                lineToRelative(0.114f, 0.012f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, true, 0.42f, 0.647f)
                lineToRelative(-0.307f, 1.557f)
                arcToRelative(8.528f, 8.528f, 0.0f, false, true, 2.818f, 1.58f)
                lineToRelative(0.023f, 0.022f)
                curveToRelative(0.216f, 0.228f, 0.216f, 0.569f, 0.0f, 0.773f)
                lineToRelative(-1.057f, 1.057f)
                close()
            }
        }
        .build()
        return _brandCashapp!!
    }

private var _brandCashapp: ImageVector? = null
