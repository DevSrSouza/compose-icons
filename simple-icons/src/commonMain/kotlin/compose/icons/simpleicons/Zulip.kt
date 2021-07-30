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

public val SimpleIcons.Zulip: ImageVector
    get() {
        if (_zulip != null) {
            return _zulip!!
        }
        _zulip = Builder(name = "Zulip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.767f, 3.589f)
                curveToRelative(0.0f, 1.209f, -0.543f, 2.283f, -1.37f, 2.934f)
                lineToRelative(-8.034f, 7.174f)
                curveToRelative(-0.149f, 0.128f, -0.343f, -0.078f, -0.235f, -0.25f)
                lineToRelative(2.946f, -5.9f)
                curveToRelative(0.083f, -0.165f, -0.024f, -0.368f, -0.194f, -0.368f)
                horizontalLineTo(4.452f)
                curveToRelative(-1.77f, 0.0f, -3.219f, -1.615f, -3.219f, -3.59f)
                curveTo(1.233f, 1.616f, 2.682f, 0.0f, 4.452f, 0.0f)
                horizontalLineToRelative(15.096f)
                curveToRelative(1.77f, -0.001f, 3.219f, 1.614f, 3.219f, 3.589f)
                close()
                moveTo(4.452f, 24.0f)
                horizontalLineToRelative(15.096f)
                curveToRelative(1.77f, 0.0f, 3.219f, -1.616f, 3.219f, -3.59f)
                curveToRelative(0.0f, -1.974f, -1.449f, -3.59f, -3.219f, -3.59f)
                horizontalLineTo(8.12f)
                curveToRelative(-0.17f, 0.0f, -0.277f, -0.202f, -0.194f, -0.367f)
                lineToRelative(2.946f, -5.9f)
                curveToRelative(0.108f, -0.172f, -0.086f, -0.378f, -0.235f, -0.25f)
                lineToRelative(-8.033f, 7.173f)
                curveToRelative(-0.828f, 0.65f, -1.37f, 1.725f, -1.37f, 2.934f)
                curveToRelative(0.0f, 1.974f, 1.448f, 3.59f, 3.218f, 3.59f)
                close()
            }
        }
        .build()
        return _zulip!!
    }

private var _zulip: ImageVector? = null
