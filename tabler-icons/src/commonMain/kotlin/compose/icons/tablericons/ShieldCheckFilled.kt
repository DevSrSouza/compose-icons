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

public val TablerIcons.ShieldCheckFilled: ImageVector
    get() {
        if (_shieldCheckFilled != null) {
            return _shieldCheckFilled!!
        }
        _shieldCheckFilled = Builder(name = "ShieldCheckFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.998f, 2.0f)
                lineToRelative(0.118f, 0.007f)
                lineToRelative(0.059f, 0.008f)
                lineToRelative(0.061f, 0.013f)
                lineToRelative(0.111f, 0.034f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, 0.217f, 0.112f)
                lineToRelative(0.104f, 0.082f)
                lineToRelative(0.255f, 0.218f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 7.189f, 2.537f)
                lineToRelative(0.342f, -0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.005f, 0.717f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -9.208f, 16.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.502f, 0.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -9.209f, -16.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.005f, -0.717f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 7.531f, -2.527f)
                lineToRelative(0.263f, -0.225f)
                lineToRelative(0.096f, -0.075f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, 0.217f, -0.112f)
                lineToRelative(0.112f, -0.034f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, true, 0.119f, -0.021f)
                lineToRelative(0.115f, -0.007f)
                close()
                moveTo(15.708f, 9.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.415f, 0.0f)
                lineToRelative(-3.293f, 3.292f)
                lineToRelative(-1.293f, -1.292f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 1.497f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -0.083f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.083f, -1.32f)
                close()
            }
        }
        .build()
        return _shieldCheckFilled!!
    }

private var _shieldCheckFilled: ImageVector? = null
