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

public val TablerIcons.MickeyFilled: ImageVector
    get() {
        if (_mickeyFilled != null) {
            return _mickeyFilled!!
        }
        _mickeyFilled = Builder(name = "MickeyFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.501f, 2.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.878f, 8.913f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.374f, 3.372f)
                lineToRelative(-0.005f, -0.285f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(7.991f, 7.991f, 0.0f, false, true, 0.615f, -2.803f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -3.187f, -6.348f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, 3.596f, -2.539f)
                lineToRelative(0.225f, -0.018f)
                lineToRelative(0.281f, -0.007f)
                lineToRelative(0.244f, 0.009f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.215f, 4.247f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, true, 4.013f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.493f, -4.256f)
                close()
            }
        }
        .build()
        return _mickeyFilled!!
    }

private var _mickeyFilled: ImageVector? = null
