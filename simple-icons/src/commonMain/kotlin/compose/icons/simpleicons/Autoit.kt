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

public val SimpleIcons.Autoit: ImageVector
    get() {
        if (_autoit != null) {
            return _autoit!!
        }
        _autoit = Builder(name = "Autoit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.351f, 15.563f)
                lineToRelative(-5.486f, -7.941f)
                arcToRelative(2.684f, 2.684f, 0.0f, false, false, -0.702f, -0.702f)
                curveToRelative(-0.276f, -0.188f, -0.62f, -0.283f, -1.03f, -0.283f)
                curveToRelative(-0.43f, 0.0f, -0.784f, 0.101f, -1.064f, 0.302f)
                curveToRelative(-0.28f, 0.202f, -0.512f, 0.43f, -0.696f, 0.683f)
                lineToRelative(-5.63f, 7.94f)
                horizontalLineToRelative(3.215f)
                lineToRelative(4.122f, -5.827f)
                lineToRelative(1.575f, 2.323f)
                curveToRelative(0.148f, 0.21f, 0.304f, 0.436f, 0.466f, 0.676f)
                curveToRelative(0.161f, 0.24f, 0.304f, 0.44f, 0.426f, 0.597f)
                arcToRelative(9.106f, 9.106f, 0.0f, false, false, -0.741f, -0.026f)
                lineTo(10.78f, 13.305f)
                lineToRelative(-1.64f, 2.258f)
                close()
                moveTo(12.0f, 24.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 2.39f)
                arcToRelative(9.61f, 9.61f, 0.0f, true, false, 0.0f, 19.22f)
                arcToRelative(9.61f, 9.61f, 0.0f, true, false, 0.0f, -19.22f)
                close()
            }
        }
        .build()
        return _autoit!!
    }

private var _autoit: ImageVector? = null
