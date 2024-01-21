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

public val TablerIcons.BrandDiscordFilled: ImageVector
    get() {
        if (_brandDiscordFilled != null) {
            return _brandDiscordFilled!!
        }
        _brandDiscordFilled = Builder(name = "BrandDiscordFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.983f, 3.0f)
                lineToRelative(0.123f, 0.006f)
                curveToRelative(2.014f, 0.214f, 3.527f, 0.672f, 4.966f, 1.673f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.371f, 0.488f)
                curveToRelative(1.876f, 5.315f, 2.373f, 9.987f, 1.451f, 12.28f)
                curveToRelative(-1.003f, 2.005f, -2.606f, 3.553f, -4.394f, 3.553f)
                curveToRelative(-0.732f, 0.0f, -1.693f, -0.968f, -2.328f, -2.045f)
                arcToRelative(21.512f, 21.512f, 0.0f, false, false, 2.103f, -0.493f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.55f, -1.924f)
                curveToRelative(-3.32f, 0.95f, -6.13f, 0.95f, -9.45f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.55f, 1.924f)
                curveToRelative(0.717f, 0.204f, 1.416f, 0.37f, 2.103f, 0.494f)
                curveToRelative(-0.635f, 1.075f, -1.596f, 2.044f, -2.328f, 2.044f)
                curveToRelative(-1.788f, 0.0f, -3.391f, -1.548f, -4.428f, -3.629f)
                curveToRelative(-0.888f, -2.217f, -0.39f, -6.89f, 1.485f, -12.204f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.371f, -0.488f)
                curveToRelative(1.439f, -1.001f, 2.952f, -1.459f, 4.966f, -1.673f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.935f, 0.435f)
                lineToRelative(0.063f, 0.107f)
                lineToRelative(0.651f, 1.285f)
                lineToRelative(0.137f, -0.016f)
                arcToRelative(12.97f, 12.97f, 0.0f, false, true, 2.643f, 0.0f)
                lineToRelative(0.134f, 0.016f)
                lineToRelative(0.65f, -1.284f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.754f, -0.54f)
                lineToRelative(0.122f, -0.009f)
                close()
                moveTo(9.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.977f, 1.697f)
                lineToRelative(-0.018f, 0.154f)
                lineToRelative(-0.005f, 0.149f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 1.995f, -2.15f)
                close()
                moveTo(15.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.977f, 1.697f)
                lineToRelative(-0.018f, 0.154f)
                lineToRelative(-0.005f, 0.149f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 1.995f, -2.15f)
                close()
            }
        }
        .build()
        return _brandDiscordFilled!!
    }

private var _brandDiscordFilled: ImageVector? = null
