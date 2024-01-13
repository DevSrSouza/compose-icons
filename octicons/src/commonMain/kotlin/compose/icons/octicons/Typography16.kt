package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Typography16: ImageVector
    get() {
        if (_typography16 != null) {
            return _typography16!!
        }
        _typography16 = Builder(name = "Typography16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.71f, 10.0f)
                lineTo(2.332f, 10.0f)
                lineToRelative(-0.874f, 2.498f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.415f, -0.496f)
                lineToRelative(3.39f, -9.688f)
                arcToRelative(1.217f, 1.217f, 0.0f, false, true, 2.302f, 0.018f)
                lineToRelative(3.227f, 9.681f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.423f, 0.474f)
                close()
                moveTo(9.84f, 5.642f)
                curveTo(10.53f, 4.374f, 11.87f, 4.0f, 13.0f, 4.0f)
                curveToRelative(1.5f, 0.0f, 3.0f, 0.939f, 3.0f, 2.601f)
                verticalLineToRelative(5.649f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.448f, 0.275f)
                curveTo(13.995f, 12.82f, 13.3f, 13.0f, 12.5f, 13.0f)
                curveToRelative(-0.77f, 0.0f, -1.514f, -0.231f, -2.078f, -0.709f)
                curveToRelative(-0.577f, -0.488f, -0.922f, -1.199f, -0.922f, -2.041f)
                curveToRelative(0.0f, -0.694f, 0.265f, -1.411f, 0.887f, -1.944f)
                curveTo(11.0f, 7.78f, 11.88f, 7.5f, 13.0f, 7.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-0.899f)
                curveToRelative(0.0f, -0.54f, -0.5f, -1.101f, -1.5f, -1.101f)
                curveToRelative(-0.869f, 0.0f, -1.528f, 0.282f, -1.84f, 0.858f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.32f, -0.716f)
                close()
                moveTo(6.21f, 8.5f)
                lineTo(4.574f, 3.594f)
                lineTo(2.857f, 8.5f)
                close()
                moveTo(14.5f, 9.0f)
                lineTo(13.0f, 9.0f)
                curveToRelative(-0.881f, 0.0f, -1.375f, 0.22f, -1.637f, 0.444f)
                curveToRelative(-0.253f, 0.217f, -0.363f, 0.5f, -0.363f, 0.806f)
                curveToRelative(0.0f, 0.408f, 0.155f, 0.697f, 0.39f, 0.896f)
                curveToRelative(0.249f, 0.21f, 0.63f, 0.354f, 1.11f, 0.354f)
                curveToRelative(0.732f, 0.0f, 1.26f, -0.209f, 1.588f, -0.449f)
                curveToRelative(0.35f, -0.257f, 0.412f, -0.495f, 0.412f, -0.551f)
                close()
            }
        }
        .build()
        return _typography16!!
    }

private var _typography16: ImageVector? = null
