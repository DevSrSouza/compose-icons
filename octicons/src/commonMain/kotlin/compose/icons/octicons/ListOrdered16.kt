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

public val Octicons.ListOrdered16: ImageVector
    get() {
        if (_listOrdered16 != null) {
            return _listOrdered16!!
        }
        _listOrdered16 = Builder(name = "ListOrdered16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.851f, -0.525f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(0.002f, -0.004f)
                lineToRelative(0.007f, -0.011f)
                curveToRelative(0.097f, -0.144f, 0.215f, -0.273f, 0.348f, -0.384f)
                curveToRelative(0.228f, -0.19f, 0.588f, -0.392f, 1.068f, -0.392f)
                curveToRelative(0.468f, 0.0f, 0.858f, 0.181f, 1.126f, 0.484f)
                curveToRelative(0.259f, 0.294f, 0.377f, 0.673f, 0.377f, 1.038f)
                curveToRelative(0.0f, 0.987f, -0.686f, 1.495f, -1.156f, 1.845f)
                lineToRelative(-0.047f, 0.035f)
                curveToRelative(-0.303f, 0.225f, -0.522f, 0.4f, -0.654f, 0.597f)
                horizontalLineToRelative(1.357f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(0.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                curveToRelative(0.0f, -1.005f, 0.692f, -1.52f, 1.167f, -1.875f)
                lineToRelative(0.035f, -0.025f)
                curveToRelative(0.531f, -0.396f, 0.8f, -0.625f, 0.8f, -1.078f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, -0.128f, -0.376f)
                curveTo(1.806f, 10.068f, 1.695f, 10.0f, 1.5f, 10.0f)
                arcToRelative(0.658f, 0.658f, 0.0f, false, false, -0.429f, 0.163f)
                arcToRelative(0.835f, 0.835f, 0.0f, false, false, -0.144f, 0.153f)
                close()
                moveTo(2.003f, 2.5f)
                lineTo(2.003f, 6.0f)
                horizontalLineToRelative(0.503f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(0.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(0.503f)
                lineTo(1.003f, 3.308f)
                lineToRelative(-0.28f, 0.14f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.446f, -0.895f)
                lineToRelative(1.003f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.723f, 0.447f)
                close()
            }
        }
        .build()
        return _listOrdered16!!
    }

private var _listOrdered16: ImageVector? = null
