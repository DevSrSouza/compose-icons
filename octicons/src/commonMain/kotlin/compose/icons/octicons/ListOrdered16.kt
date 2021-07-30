package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ListOrdered16: ImageVector
    get() {
        if (_listOrdered16 != null) {
            return _listOrdered16!!
        }
        _listOrdered16 = Builder(name = "ListOrdered16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.003f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.723f, -0.447f)
                lineToRelative(-1.003f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.446f, 0.895f)
                lineToRelative(0.28f, -0.14f)
                lineTo(1.003f, 6.0f)
                lineTo(0.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(2.006f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineToRelative(-0.503f)
                lineTo(2.003f, 2.5f)
                close()
                moveTo(5.0f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-8.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.0f, 3.25f)
                close()
                moveTo(5.0f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-8.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.0f, 8.25f)
                close()
                moveTo(5.0f, 13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(0.924f, 10.32f)
                lineToRelative(0.003f, -0.004f)
                arcToRelative(0.851f, 0.851f, 0.0f, false, true, 0.144f, -0.153f)
                arcTo(0.66f, 0.66f, 0.0f, false, true, 1.5f, 10.0f)
                curveToRelative(0.195f, 0.0f, 0.306f, 0.068f, 0.374f, 0.146f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, 0.128f, 0.376f)
                curveToRelative(0.0f, 0.453f, -0.269f, 0.682f, -0.8f, 1.078f)
                lineToRelative(-0.035f, 0.025f)
                curveTo(0.692f, 11.98f, 0.0f, 12.495f, 0.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.003f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(1.146f, 13.0f)
                curveToRelative(0.132f, -0.197f, 0.351f, -0.372f, 0.654f, -0.597f)
                lineToRelative(0.047f, -0.035f)
                curveToRelative(0.47f, -0.35f, 1.156f, -0.858f, 1.156f, -1.845f)
                curveToRelative(0.0f, -0.365f, -0.118f, -0.744f, -0.377f, -1.038f)
                curveToRelative(-0.268f, -0.303f, -0.658f, -0.484f, -1.126f, -0.484f)
                curveToRelative(-0.48f, 0.0f, -0.84f, 0.202f, -1.068f, 0.392f)
                arcToRelative(1.858f, 1.858f, 0.0f, false, false, -0.348f, 0.384f)
                lineToRelative(-0.007f, 0.011f)
                lineToRelative(-0.002f, 0.004f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(-0.001f, 0.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.851f, 0.525f)
                close()
                moveTo(0.5f, 10.055f)
                lineToRelative(-0.427f, -0.26f)
                lineToRelative(0.427f, 0.26f)
                close()
            }
        }
        .build()
        return _listOrdered16!!
    }

private var _listOrdered16: ImageVector? = null
