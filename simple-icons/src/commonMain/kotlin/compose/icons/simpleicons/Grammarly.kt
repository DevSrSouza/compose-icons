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

public val SimpleIcons.Grammarly: ImageVector
    get() {
        if (_grammarly != null) {
            return _grammarly!!
        }
        _grammarly = Builder(name = "Grammarly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                curveTo(0.0f, 5.372f, 5.373f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, 5.372f, 12.0f, 12.0f)
                moveToRelative(-9.633f, 1.626f)
                arcToRelative(0.81f, 0.815f, 0.0f, false, false, -0.799f, 0.965f)
                curveToRelative(0.071f, 0.393f, 0.44f, 0.662f, 0.84f, 0.662f)
                horizontalLineToRelative(1.257f)
                lineToRelative(0.729f, -0.102f)
                curveToRelative(-1.166f, 1.71f, -3.19f, 2.498f, -5.405f, 2.15f)
                curveToRelative(-1.802f, -0.282f, -3.35f, -1.502f, -4.003f, -3.205f)
                curveToRelative(-1.483f, -3.865f, 1.34f, -7.556f, 5.02f, -7.556f)
                curveToRelative(1.916f, 0.0f, 3.598f, 1.122f, 4.562f, 2.478f)
                curveToRelative(0.277f, 0.39f, 0.763f, 0.504f, 1.133f, 0.248f)
                arcToRelative(0.795f, 0.8f, 0.0f, false, false, 0.236f, -1.069f)
                horizontalLineToRelative(0.006f)
                arcToRelative(7.04f, 7.04f, 0.0f, false, false, -6.425f, -3.233f)
                curveToRelative(-3.508f, 0.236f, -6.347f, 3.107f, -6.55f, 6.617f)
                curveToRelative(-0.233f, 4.086f, 3.007f, 7.421f, 7.037f, 7.421f)
                arcToRelative(6.976f, 6.976f, 0.0f, false, false, 5.304f, -2.413f)
                lineToRelative(-0.153f, 0.855f)
                verticalLineToRelative(0.773f)
                curveToRelative(0.0f, 0.4f, 0.269f, 0.77f, 0.662f, 0.84f)
                arcToRelative(0.814f, 0.814f, 0.0f, false, false, 0.964f, -0.8f)
                verticalLineToRelative(-4.63f)
                horizontalLineToRelative(-4.415f)
            }
        }
        .build()
        return _grammarly!!
    }

private var _grammarly: ImageVector? = null
