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

public val SimpleIcons.Protonvpn: ImageVector
    get() {
        if (_protonvpn != null) {
            return _protonvpn!!
        }
        _protonvpn = Builder(name = "Protonvpn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.176f, 20.058f)
                lineToRelative(0.858f, -1.28f)
                lineToRelative(6.513f, -9.838f)
                curveToRelative(0.57f, -0.86f, 0.026f, -2.014f, -1.005f, -2.131f)
                lineTo(0.378f, 4.95f)
                lineToRelative(8.373f, 15.055f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, 1.424f, 0.052f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(23.586f, 7.14f)
                lineToRelative(-9.662f, 14.61f)
                curveToRelative(-1.036f, 1.567f, -3.38f, 1.478f, -4.293f, -0.162f)
                lineToRelative(-0.093f, -0.168f)
                curveToRelative(0.3f, -0.01f, 0.594f, -0.086f, 0.855f, -0.235f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, false, 0.612f, -0.57f)
                lineToRelative(0.86f, -1.28f)
                lineToRelative(6.516f, -9.844f)
                curveToRelative(0.46f, -0.694f, 0.525f, -1.56f, 0.173f, -2.314f)
                arcToRelative(2.375f, 2.375f, 0.0f, false, false, -1.899f, -1.364f)
                lineTo(0.493f, 3.956f)
                lineToRelative(-0.476f, -0.054f)
                curveTo(-0.163f, 2.392f, 1.101f, 0.95f, 2.784f, 1.143f)
                lineToRelative(18.991f, 2.16f)
                curveToRelative(1.856f, 0.21f, 2.835f, 2.289f, 1.812f, 3.838f)
                close()
            }
        }
        .build()
        return _protonvpn!!
    }

private var _protonvpn: ImageVector? = null
