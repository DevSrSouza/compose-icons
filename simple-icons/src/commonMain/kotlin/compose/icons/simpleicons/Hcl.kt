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

public val SimpleIcons.Hcl: ImageVector
    get() {
        if (_hcl != null) {
            return _hcl!!
        }
        _hcl = Builder(name = "Hcl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.397f, 10.401f)
                lineToRelative(-1.097f, 2.44f)
                lineTo(24.0f, 12.841f)
                lineToRelative(-0.343f, 0.763f)
                lineTo(17.294f, 13.604f)
                lineToRelative(1.433f, -3.203f)
                close()
                moveTo(14.998f, 11.491f)
                horizontalLineToRelative(2.463f)
                curveToRelative(-0.015f, -0.538f, -0.536f, -0.911f, -1.567f, -1.059f)
                curveToRelative(-2.035f, -0.299f, -4.235f, -0.172f, -5.802f, 0.693f)
                curveToRelative(-1.235f, 0.686f, -1.329f, 1.718f, -0.099f, 2.223f)
                curveToRelative(1.036f, 0.422f, 3.211f, 0.466f, 4.767f, 0.201f)
                curveToRelative(1.008f, -0.171f, 1.778f, -0.502f, 2.209f, -0.997f)
                lineTo(14.454f, 12.552f)
                curveToRelative(-0.326f, 0.251f, -0.753f, 0.376f, -1.25f, 0.38f)
                curveToRelative(-1.412f, 0.009f, -1.599f, -0.418f, -1.352f, -0.911f)
                curveToRelative(0.293f, -0.58f, 0.908f, -0.897f, 1.845f, -0.922f)
                curveToRelative(0.738f, -0.02f, 1.103f, 0.144f, 1.302f, 0.391f)
                moveTo(0.0f, 13.607f)
                horizontalLineToRelative(2.604f)
                lineToRelative(0.558f, -1.279f)
                horizontalLineToRelative(2.553f)
                lineToRelative(-0.573f, 1.277f)
                horizontalLineToRelative(2.635f)
                lineToRelative(1.446f, -3.203f)
                horizontalLineToRelative(-2.653f)
                lineToRelative(-0.477f, 1.081f)
                lineTo(3.542f, 11.482f)
                lineToRelative(0.483f, -1.081f)
                lineToRelative(-2.578f, -0.001f)
                close()
            }
        }
        .build()
        return _hcl!!
    }

private var _hcl: ImageVector? = null
