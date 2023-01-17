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

public val SimpleIcons.Arxiv: ImageVector
    get() {
        if (_arxiv != null) {
            return _arxiv!!
        }
        _arxiv = Builder(name = "Arxiv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.318f, 8.465f)
                lineTo(16.318f, 9.59f)
                horizontalLineToRelative(1.344f)
                lineTo(17.662f, 8.465f)
                close()
                moveTo(9.418f, 8.693f)
                lineToRelative(2.059f, 3.412f)
                lineToRelative(-2.155f, 3.311f)
                horizontalLineToRelative(1.14f)
                lineToRelative(1.563f, -2.41f)
                lineToRelative(1.46f, 2.41f)
                horizontalLineToRelative(1.628f)
                lineToRelative(-2.136f, -3.553f)
                lineToRelative(2.056f, -3.17f)
                horizontalLineToRelative(-1.125f)
                lineToRelative(-1.484f, 2.264f)
                lineToRelative(-1.371f, -2.264f)
                close()
                moveTo(9.322f, 15.416f)
                lineTo(9.32f, 15.416f)
                verticalLineToRelative(0.004f)
                close()
                moveTo(2.25f, 10.314f)
                arcToRelative(5.039f, 5.039f, 0.0f, false, false, -1.814f, 0.348f)
                verticalLineToRelative(0.926f)
                arcToRelative(3.32f, 3.32f, 0.0f, false, true, 1.593f, -0.445f)
                curveToRelative(0.59f, 0.0f, 0.883f, 0.258f, 0.883f, 0.775f)
                verticalLineToRelative(0.455f)
                horizontalLineToRelative(-0.355f)
                curveToRelative(-0.822f, 0.001f, -1.453f, 0.152f, -1.893f, 0.451f)
                arcToRelative(1.456f, 1.456f, 0.0f, false, false, -0.663f, 1.278f)
                arcToRelative(1.382f, 1.382f, 0.0f, false, false, 0.408f, 1.033f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, false, 1.065f, 0.398f)
                curveToRelative(0.517f, 0.0f, 0.998f, -0.217f, 1.443f, -0.652f)
                lineToRelative(0.004f, 0.002f)
                horizontalLineToRelative(0.053f)
                curveToRelative(0.159f, 0.435f, 0.512f, 0.652f, 1.066f, 0.652f)
                arcToRelative(2.757f, 2.757f, 0.0f, false, false, 0.754f, -0.129f)
                lineToRelative(-0.031f, -0.756f)
                arcToRelative(0.803f, 0.803f, 0.0f, false, true, -0.176f, 0.022f)
                curveToRelative(-0.254f, 0.0f, -0.377f, -0.192f, -0.377f, -0.584f)
                verticalLineToRelative(-2.215f)
                curveToRelative(0.001f, -1.038f, -0.653f, -1.559f, -1.961f, -1.559f)
                close()
                moveTo(8.896f, 10.314f)
                curveToRelative(-0.713f, 0.0f, -1.246f, 0.353f, -1.591f, 1.057f)
                verticalLineToRelative(-0.941f)
                lineTo(5.959f, 10.43f)
                verticalLineToRelative(4.99f)
                horizontalLineToRelative(1.346f)
                verticalLineToRelative(-3.178f)
                curveToRelative(0.336f, -0.535f, 0.768f, -0.805f, 1.306f, -0.805f)
                arcToRelative(1.607f, 1.607f, 0.0f, false, true, 0.534f, 0.104f)
                verticalLineToRelative(-1.2f)
                arcToRelative(1.408f, 1.408f, 0.0f, false, false, -0.249f, -0.027f)
                close()
                moveTo(16.318f, 10.43f)
                verticalLineToRelative(4.994f)
                lineToRelative(1.344f, -0.004f)
                verticalLineToRelative(-4.99f)
                close()
                moveTo(18.838f, 10.43f)
                lineToRelative(1.902f, 4.99f)
                horizontalLineToRelative(1.332f)
                lineTo(24.0f, 10.43f)
                horizontalLineToRelative(-0.965f)
                lineToRelative(-1.385f, 3.6f)
                lineToRelative(-1.396f, -3.6f)
                close()
                moveTo(2.596f, 13.145f)
                horizontalLineToRelative(0.322f)
                verticalLineToRelative(1.013f)
                curveToRelative(-0.331f, 0.305f, -0.651f, 0.46f, -0.982f, 0.455f)
                arcToRelative(0.643f, 0.643f, 0.0f, false, true, -0.643f, -0.65f)
                curveToRelative(0.0f, -0.543f, 0.433f, -0.818f, 1.303f, -0.818f)
                close()
            }
        }
        .build()
        return _arxiv!!
    }

private var _arxiv: ImageVector? = null
