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

public val SimpleIcons.Nec: ImageVector
    get() {
        if (_nec != null) {
            return _nec!!
        }
        _nec = Builder(name = "Nec", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.496f, 8.8f)
                arcToRelative(13.892f, 13.892f, 0.0f, false, false, -2.453f, 0.198f)
                curveToRelative(-0.6f, 0.11f, -1.165f, 0.223f, -1.693f, 0.57f)
                curveToRelative(-0.807f, 0.526f, -1.076f, 1.49f, -1.086f, 2.394f)
                curveToRelative(-0.012f, 0.98f, 0.283f, 2.06f, 1.21f, 2.54f)
                curveToRelative(0.735f, 0.384f, 1.537f, 0.552f, 2.355f, 0.624f)
                curveToRelative(1.397f, 0.118f, 2.792f, 0.1f, 4.171f, -0.09f)
                verticalLineToRelative(-0.98f)
                curveToRelative(-1.04f, 0.19f, -2.107f, 0.31f, -3.184f, 0.152f)
                curveToRelative(-1.652f, -0.24f, -1.93f, -1.473f, -1.93f, -2.286f)
                curveToRelative(0.0f, -0.451f, 0.06f, -0.987f, 0.482f, -1.526f)
                curveToRelative(0.676f, -0.865f, 2.667f, -0.956f, 4.55f, -0.59f)
                lineTo(23.918f, 8.95f)
                arcToRelative(22.777f, 22.777f, 0.0f, false, false, -2.422f, -0.15f)
                close()
                moveTo(8.684f, 8.997f)
                verticalLineToRelative(4.446f)
                curveToRelative(0.03f, 0.744f, 0.295f, 1.518f, 1.834f, 1.581f)
                curveToRelative(1.814f, 0.075f, 3.54f, 0.045f, 5.334f, -0.024f)
                verticalLineToRelative(-0.896f)
                curveToRelative(-0.89f, 0.014f, -3.487f, 0.001f, -3.65f, 0.0f)
                curveToRelative(-0.704f, -0.042f, -0.973f, -0.256f, -0.998f, -0.837f)
                arcToRelative(32.12f, 32.12f, 0.0f, false, true, -0.02f, -1.055f)
                horizontalLineToRelative(4.177f)
                verticalLineToRelative(-0.834f)
                horizontalLineToRelative(-4.176f)
                lineTo(11.185f, 9.851f)
                horizontalLineToRelative(4.582f)
                verticalLineToRelative(-0.854f)
                close()
                moveTo(0.0f, 8.997f)
                verticalLineToRelative(5.999f)
                horizontalLineToRelative(1.146f)
                verticalLineToRelative(-4.254f)
                lineToRelative(3.383f, 3.764f)
                curveToRelative(0.41f, 0.404f, 0.763f, 0.478f, 1.122f, 0.49f)
                horizontalLineToRelative(2.015f)
                lineTo(7.666f, 8.997f)
                horizontalLineToRelative(-1.15f)
                verticalLineToRelative(4.397f)
                lineToRelative(-3.39f, -3.757f)
                curveToRelative(-0.232f, -0.227f, -0.753f, -0.64f, -1.194f, -0.64f)
                close()
            }
        }
        .build()
        return _nec!!
    }

private var _nec: ImageVector? = null
