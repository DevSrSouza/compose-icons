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

public val TablerIcons.HeadphonesFilled: ImageVector
    get() {
        if (_headphonesFilled != null) {
            return _headphonesFilled!!
        }
        _headphonesFilled = Builder(name = "HeadphonesFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.351f, 0.0f, 0.688f, 0.06f, 1.0f, 0.171f)
                verticalLineToRelative(-0.171f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -13.996f, -0.24f)
                lineToRelative(-0.004f, 0.24f)
                verticalLineToRelative(0.17f)
                curveToRelative(0.25f, -0.088f, 0.516f, -0.144f, 0.791f, -0.163f)
                lineToRelative(0.209f, -0.007f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-6.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 17.996f, -0.265f)
                lineToRelative(0.004f, 0.265f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _headphonesFilled!!
    }

private var _headphonesFilled: ImageVector? = null
