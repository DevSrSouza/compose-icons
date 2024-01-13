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

public val SimpleIcons.Stagetimer: ImageVector
    get() {
        if (_stagetimer != null) {
            return _stagetimer!!
        }
        _stagetimer = Builder(name = "Stagetimer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.127f, 2.639f)
                curveToRelative(0.0f, 0.821f, 0.662f, 1.475f, 1.464f, 1.644f)
                arcToRelative(7.832f, 7.832f, 0.0f, false, true, 6.201f, 7.666f)
                curveToRelative(0.0f, 4.326f, -3.499f, 7.833f, -7.815f, 7.833f)
                arcToRelative(7.767f, 7.767f, 0.0f, false, true, -3.932f, -1.062f)
                curveToRelative(-0.716f, -0.419f, -1.66f, -0.372f, -2.207f, 0.253f)
                lineToRelative(-0.794f, 0.906f)
                curveToRelative(-0.549f, 0.625f, -0.491f, 1.586f, 0.196f, 2.053f)
                arcTo(11.946f, 11.946f, 0.0f, false, false, 11.977f, 24.0f)
                curveTo(18.617f, 24.0f, 24.0f, 18.605f, 24.0f, 11.949f)
                curveTo(24.0f, 5.86f, 19.495f, 0.826f, 13.644f, 0.013f)
                curveToRelative(-0.829f, -0.116f, -1.517f, 0.571f, -1.517f, 1.411f)
                verticalLineToRelative(1.215f)
                close()
                moveTo(2.01f, 15.376f)
                curveToRelative(-0.8f, 0.27f, -1.236f, 1.135f, -0.866f, 1.886f)
                curveToRelative(0.255f, 0.518f, 0.546f, 1.016f, 0.871f, 1.492f)
                curveToRelative(0.473f, 0.693f, 1.449f, 0.752f, 2.085f, 0.202f)
                lineToRelative(0.921f, -0.797f)
                curveToRelative(0.636f, -0.551f, 0.686f, -1.502f, 0.26f, -2.224f)
                lineToRelative(-0.035f, -0.06f)
                curveToRelative(-0.419f, -0.726f, -1.277f, -1.158f, -2.077f, -0.889f)
                lineToRelative(-1.159f, 0.39f)
                close()
                moveTo(1.688f, 13.992f)
                curveToRelative(-0.807f, 0.162f, -1.6f, -0.369f, -1.658f, -1.198f)
                curveToRelative(-0.04f, -0.571f, -0.04f, -1.143f, 0.0f, -1.714f)
                curveToRelative(0.058f, -0.829f, 0.851f, -1.36f, 1.658f, -1.198f)
                lineToRelative(1.168f, 0.233f)
                curveToRelative(0.807f, 0.162f, 1.316f, 0.957f, 1.312f, 1.788f)
                verticalLineToRelative(0.068f)
                curveToRelative(0.004f, 0.831f, -0.505f, 1.626f, -1.312f, 1.787f)
                lineToRelative(-1.168f, 0.234f)
                close()
            }
        }
        .build()
        return _stagetimer!!
    }

private var _stagetimer: ImageVector? = null
