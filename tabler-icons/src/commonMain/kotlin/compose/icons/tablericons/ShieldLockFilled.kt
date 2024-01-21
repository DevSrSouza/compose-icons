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

public val TablerIcons.ShieldLockFilled: ImageVector
    get() {
        if (_shieldLockFilled != null) {
            return _shieldLockFilled!!
        }
        _shieldLockFilled = Builder(name = "ShieldLockFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.995f, 1.581f)
                verticalLineToRelative(1.769f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.993f, -0.117f)
                lineToRelative(0.001f, -1.768f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.001f, -3.732f)
                close()
            }
        }
        .build()
        return _shieldLockFilled!!
    }

private var _shieldLockFilled: ImageVector? = null
