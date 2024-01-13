package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Stardock: ImageVector
    get() {
        if (_stardock != null) {
            return _stardock!!
        }
        _stardock = Builder(name = "Stardock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.337f, 3.28f)
                curveToRelative(-0.108f, 0.0f, -0.22f, 0.007f, -0.336f, 0.017f)
                curveToRelative(-1.553f, 0.129f, -3.886f, 0.917f, -6.557f, 2.217f)
                arcToRelative(7.326f, 7.326f, 0.0f, false, false, -3.71f, -0.994f)
                curveToRelative(-4.124f, 0.0f, -7.478f, 3.354f, -7.478f, 7.496f)
                curveToRelative(0.0f, 0.674f, 0.093f, 1.33f, 0.262f, 1.95f)
                curveToRelative(-3.224f, 2.697f, -5.04f, 5.153f, -4.385f, 6.221f)
                curveToRelative(0.712f, 1.125f, 3.992f, 0.412f, 8.115f, -1.556f)
                arcToRelative(7.55f, 7.55f, 0.0f, false, false, 3.484f, 0.863f)
                curveToRelative(4.124f, 0.0f, 7.48f, -3.356f, 7.48f, -7.478f)
                curveToRelative(0.0f, -0.544f, -0.058f, -1.086f, -0.17f, -1.592f)
                curveToRelative(3.504f, -2.867f, 5.529f, -5.491f, 4.816f, -6.615f)
                curveToRelative(-0.24f, -0.375f, -0.768f, -0.545f, -1.521f, -0.53f)
                close()
                moveTo(18.013f, 4.988f)
                curveToRelative(-1.912f, 0.769f, -4.666f, 1.706f, -5.64f, 3.711f)
                curveToRelative(-0.564f, 1.143f, 0.371f, 2.436f, 0.84f, 3.035f)
                curveToRelative(0.47f, 0.62f, 1.35f, 2.174f, -0.13f, 3.786f)
                curveToRelative(-1.5f, 1.63f, -7.028f, 3.318f, -7.028f, 3.318f)
                curveToRelative(1.78f, -0.843f, 4.91f, -2.06f, 5.396f, -4.16f)
                curveToRelative(0.375f, -1.593f, -1.142f, -2.493f, -1.555f, -3.205f)
                curveToRelative(-0.412f, -0.712f, -0.842f, -1.93f, 1.313f, -3.54f)
                curveToRelative(2.156f, -1.631f, 6.804f, -2.945f, 6.804f, -2.945f)
                close()
                moveTo(19.033f, 5.746f)
                curveToRelative(0.67f, -0.007f, 1.153f, 0.151f, 1.378f, 0.498f)
                curveToRelative(0.43f, 0.675f, -0.207f, 1.95f, -1.556f, 3.393f)
                arcToRelative(7.514f, 7.514f, 0.0f, false, false, -2.323f, -3.393f)
                curveToRelative(0.975f, -0.318f, 1.832f, -0.49f, 2.502f, -0.498f)
                close()
                moveTo(4.8f, 14.79f)
                arcToRelative(7.627f, 7.627f, 0.0f, false, false, 2.305f, 3.074f)
                curveToRelative(-1.762f, 0.525f, -3.074f, 0.524f, -3.467f, -0.113f)
                curveToRelative(-0.394f, -0.618f, 0.075f, -1.706f, 1.162f, -2.96f)
                close()
            }
        }
        .build()
        return _stardock!!
    }

private var _stardock: ImageVector? = null
