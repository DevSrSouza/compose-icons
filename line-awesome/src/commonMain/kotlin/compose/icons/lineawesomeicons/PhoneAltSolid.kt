package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.PhoneAltSolid: ImageVector
    get() {
        if (_phoneAltSolid != null) {
            return _phoneAltSolid!!
        }
        _phoneAltSolid = Builder(name = "PhoneAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.625f, 3.031f)
                curveTo(22.305f, 3.063f, 21.977f, 3.148f, 21.656f, 3.281f)
                lineTo(21.656f, 3.25f)
                curveTo(21.641f, 3.254f, 21.609f, 3.277f, 21.594f, 3.281f)
                curveTo(19.16f, 4.137f, 14.5f, 6.281f, 10.281f, 10.5f)
                curveTo(6.031f, 14.75f, 3.98f, 19.496f, 3.063f, 21.844f)
                lineTo(3.063f, 21.875f)
                curveTo(2.656f, 23.09f, 2.945f, 24.406f, 3.75f, 25.344f)
                lineTo(3.781f, 25.375f)
                lineTo(3.781f, 25.406f)
                lineTo(6.781f, 28.375f)
                lineTo(6.906f, 28.5f)
                curveTo(7.734f, 29.328f, 9.172f, 29.328f, 10.0f, 28.5f)
                lineTo(14.094f, 24.406f)
                curveTo(14.922f, 23.578f, 14.922f, 22.109f, 14.094f, 21.281f)
                lineTo(12.125f, 19.313f)
                curveTo(12.469f, 18.598f, 13.359f, 16.84f, 14.938f, 15.188f)
                curveTo(16.504f, 13.547f, 18.301f, 12.711f, 19.0f, 12.406f)
                lineTo(21.063f, 14.469f)
                lineTo(21.156f, 14.531f)
                curveTo(21.625f, 14.844f, 22.16f, 15.02f, 22.719f, 15.0f)
                curveTo(23.242f, 14.98f, 23.785f, 14.723f, 24.188f, 14.281f)
                lineTo(24.219f, 14.313f)
                lineTo(24.281f, 14.219f)
                lineTo(28.313f, 10.219f)
                curveTo(29.141f, 9.391f, 29.141f, 7.922f, 28.313f, 7.094f)
                lineTo(25.219f, 4.0f)
                curveTo(24.781f, 3.563f, 24.191f, 3.234f, 23.563f, 3.094f)
                curveTo(23.258f, 3.027f, 22.945f, 3.0f, 22.625f, 3.031f)
                close()
                moveTo(22.781f, 5.031f)
                curveTo(23.16f, 5.004f, 23.539f, 5.164f, 23.781f, 5.406f)
                lineTo(26.906f, 8.5f)
                curveTo(27.078f, 8.672f, 27.078f, 8.609f, 26.906f, 8.781f)
                lineTo(22.719f, 12.969f)
                curveTo(22.723f, 12.965f, 22.719f, 12.996f, 22.625f, 13.0f)
                curveTo(22.547f, 13.004f, 22.43f, 12.938f, 22.313f, 12.875f)
                lineTo(22.25f, 12.875f)
                lineTo(19.906f, 10.5f)
                lineTo(19.438f, 10.031f)
                lineTo(18.844f, 10.25f)
                curveTo(18.844f, 10.25f, 15.77f, 11.398f, 13.469f, 13.813f)
                curveTo(11.207f, 16.18f, 9.969f, 19.094f, 9.969f, 19.094f)
                lineTo(9.719f, 19.719f)
                lineTo(10.188f, 20.219f)
                lineTo(12.688f, 22.719f)
                curveTo(12.859f, 22.891f, 12.859f, 22.828f, 12.688f, 23.0f)
                lineTo(8.594f, 27.094f)
                curveTo(8.422f, 27.266f, 8.484f, 27.266f, 8.313f, 27.094f)
                lineTo(5.25f, 24.063f)
                curveTo(5.242f, 24.055f, 5.258f, 24.039f, 5.25f, 24.031f)
                lineTo(5.219f, 24.0f)
                curveTo(4.871f, 23.566f, 4.766f, 23.105f, 4.938f, 22.563f)
                curveTo(4.941f, 22.551f, 4.934f, 22.543f, 4.938f, 22.531f)
                curveTo(5.824f, 20.273f, 7.777f, 15.848f, 11.719f, 11.906f)
                curveTo(15.676f, 7.949f, 20.164f, 5.914f, 22.344f, 5.156f)
                lineTo(22.375f, 5.125f)
                lineTo(22.406f, 5.125f)
                curveTo(22.527f, 5.07f, 22.656f, 5.039f, 22.781f, 5.031f)
                close()
            }
        }
        .build()
        return _phoneAltSolid!!
    }

private var _phoneAltSolid: ImageVector? = null
