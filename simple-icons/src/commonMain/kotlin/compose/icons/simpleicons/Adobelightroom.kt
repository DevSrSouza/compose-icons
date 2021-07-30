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

public val SimpleIcons.Adobelightroom: ImageVector
    get() {
        if (_adobelightroom != null) {
            return _adobelightroom!!
        }
        _adobelightroom = Builder(name = "Adobelightroom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 0.3f)
                lineTo(4.25f, 0.3f)
                curveTo(1.9f, 0.3f, 0.0f, 2.2f, 0.0f, 4.55f)
                verticalLineToRelative(14.9f)
                curveToRelative(0.0f, 2.35f, 1.9f, 4.25f, 4.25f, 4.25f)
                horizontalLineToRelative(15.5f)
                curveToRelative(2.35f, 0.0f, 4.25f, -1.9f, 4.25f, -4.25f)
                lineTo(24.0f, 4.55f)
                curveTo(24.0f, 2.2f, 22.1f, 0.3f, 19.75f, 0.3f)
                close()
                moveTo(12.76f, 16.689f)
                curveToRelative(0.0f, 0.051f, -0.029f, 0.09f, -0.06f, 0.121f)
                curveToRelative(-0.03f, 0.02f, -0.06f, 0.029f, -0.101f, 0.029f)
                lineTo(6.26f, 16.839f)
                curveToRelative(-0.11f, 0.0f, -0.16f, -0.061f, -0.16f, -0.18f)
                lineTo(6.1f, 6.44f)
                curveToRelative(-0.01f, -0.07f, 0.04f, -0.13f, 0.11f, -0.14f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.05f, -0.01f, 0.11f, 0.03f, 0.11f, 0.08f)
                verticalLineToRelative(8.43f)
                horizontalLineToRelative(4.62f)
                curveToRelative(0.101f, 0.0f, 0.131f, 0.049f, 0.11f, 0.14f)
                lineToRelative(-0.29f, 1.739f)
                close()
                moveTo(19.01f, 8.83f)
                verticalLineToRelative(1.95f)
                curveToRelative(0.0f, 0.08f, -0.05f, 0.11f, -0.16f, 0.11f)
                curveToRelative(-0.649f, -0.04f, -1.3f, 0.08f, -1.89f, 0.34f)
                curveToRelative(-0.2f, 0.09f, -0.39f, 0.21f, -0.54f, 0.37f)
                verticalLineToRelative(5.1f)
                curveToRelative(0.0f, 0.1f, -0.04f, 0.14f, -0.13f, 0.14f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(-0.08f, 0.01f, -0.15f, -0.04f, -0.16f, -0.119f)
                lineTo(14.18f, 11.14f)
                curveToRelative(0.0f, -0.24f, 0.0f, -0.49f, -0.01f, -0.75f)
                reflectiveCurveToRelative(-0.01f, -0.52f, -0.02f, -0.78f)
                curveToRelative(-0.01f, -0.22f, -0.03f, -0.44f, -0.061f, -0.66f)
                curveToRelative(-0.01f, -0.05f, 0.02f, -0.1f, 0.07f, -0.11f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.01f, 0.04f, 0.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.1f, 0.0f, 0.18f, 0.07f, 0.21f, 0.16f)
                curveToRelative(0.04f, 0.07f, 0.07f, 0.15f, 0.08f, 0.23f)
                curveToRelative(0.02f, 0.1f, 0.039f, 0.21f, 0.05f, 0.31f)
                curveToRelative(0.01f, 0.11f, 0.021f, 0.23f, 0.021f, 0.36f)
                curveToRelative(0.299f, -0.35f, 0.66f, -0.64f, 1.069f, -0.86f)
                curveToRelative(0.46f, -0.25f, 0.97f, -0.37f, 1.49f, -0.36f)
                curveToRelative(0.069f, -0.01f, 0.13f, 0.04f, 0.14f, 0.11f)
                curveToRelative(0.001f, 0.01f, 0.001f, 0.02f, 0.001f, 0.04f)
                close()
            }
        }
        .build()
        return _adobelightroom!!
    }

private var _adobelightroom: ImageVector? = null
