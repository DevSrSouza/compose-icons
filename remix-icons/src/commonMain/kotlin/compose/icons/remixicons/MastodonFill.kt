package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MastodonFill: ImageVector
    get() {
        if (_mastodonFill != null) {
            return _mastodonFill!!
        }
        _mastodonFill = Builder(name = "MastodonFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.258f, 13.99f)
                curveToRelative(-0.274f, 1.41f, -2.456f, 2.955f, -4.962f, 3.254f)
                curveToRelative(-1.306f, 0.156f, -2.593f, 0.3f, -3.965f, 0.236f)
                curveToRelative(-2.243f, -0.103f, -4.014f, -0.535f, -4.014f, -0.535f)
                curveToRelative(0.0f, 0.218f, 0.014f, 0.426f, 0.04f, 0.62f)
                curveToRelative(0.292f, 2.215f, 2.196f, 2.347f, 4.0f, 2.41f)
                curveToRelative(1.82f, 0.062f, 3.44f, -0.45f, 3.44f, -0.45f)
                lineToRelative(0.076f, 1.646f)
                reflectiveCurveToRelative(-1.274f, 0.684f, -3.542f, 0.81f)
                curveToRelative(-1.25f, 0.068f, -2.803f, -0.032f, -4.612f, -0.51f)
                curveToRelative(-3.923f, -1.039f, -4.598f, -5.22f, -4.701f, -9.464f)
                curveToRelative(-0.031f, -1.26f, -0.012f, -2.447f, -0.012f, -3.44f)
                curveToRelative(0.0f, -4.34f, 2.843f, -5.611f, 2.843f, -5.611f)
                curveToRelative(1.433f, -0.658f, 3.892f, -0.935f, 6.45f, -0.956f)
                horizontalLineToRelative(0.062f)
                curveToRelative(2.557f, 0.02f, 5.018f, 0.298f, 6.451f, 0.956f)
                curveToRelative(0.0f, 0.0f, 2.843f, 1.272f, 2.843f, 5.61f)
                curveToRelative(0.0f, 0.0f, 0.036f, 3.201f, -0.397f, 5.424f)
                close()
                moveTo(18.302f, 8.903f)
                curveToRelative(0.0f, -1.074f, -0.273f, -1.927f, -0.822f, -2.558f)
                curveToRelative(-0.567f, -0.631f, -1.308f, -0.955f, -2.229f, -0.955f)
                curveToRelative(-1.065f, 0.0f, -1.871f, 0.41f, -2.405f, 1.228f)
                lineToRelative(-0.518f, 0.87f)
                lineToRelative(-0.519f, -0.87f)
                curveTo(11.276f, 5.8f, 10.47f, 5.39f, 9.405f, 5.39f)
                curveToRelative(-0.921f, 0.0f, -1.663f, 0.324f, -2.229f, 0.955f)
                curveToRelative(-0.549f, 0.631f, -0.822f, 1.484f, -0.822f, 2.558f)
                verticalLineToRelative(5.253f)
                horizontalLineToRelative(2.081f)
                lineTo(8.435f, 9.057f)
                curveToRelative(0.0f, -1.075f, 0.452f, -1.62f, 1.357f, -1.62f)
                curveToRelative(1.0f, 0.0f, 1.501f, 0.647f, 1.501f, 1.927f)
                verticalLineToRelative(2.79f)
                horizontalLineToRelative(2.07f)
                verticalLineToRelative(-2.79f)
                curveToRelative(0.0f, -1.28f, 0.5f, -1.927f, 1.5f, -1.927f)
                curveToRelative(0.905f, 0.0f, 1.358f, 0.545f, 1.358f, 1.62f)
                verticalLineToRelative(5.1f)
                horizontalLineToRelative(2.08f)
                lineTo(18.301f, 8.902f)
                close()
            }
        }
        .build()
        return _mastodonFill!!
    }

private var _mastodonFill: ImageVector? = null
