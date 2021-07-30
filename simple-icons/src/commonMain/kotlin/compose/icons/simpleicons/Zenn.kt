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

public val SimpleIcons.Zenn: ImageVector
    get() {
        if (_zenn != null) {
            return _zenn!!
        }
        _zenn = Builder(name = "Zenn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.264f, 23.771f)
                horizontalLineToRelative(4.984f)
                curveToRelative(0.264f, 0.0f, 0.498f, -0.147f, 0.645f, -0.352f)
                lineTo(19.614f, 0.874f)
                curveToRelative(0.176f, -0.293f, -0.029f, -0.645f, -0.381f, -0.645f)
                horizontalLineToRelative(-4.72f)
                curveToRelative(-0.235f, 0.0f, -0.44f, 0.117f, -0.557f, 0.323f)
                lineTo(0.03f, 23.361f)
                curveToRelative(-0.088f, 0.176f, 0.029f, 0.41f, 0.234f, 0.41f)
                close()
                moveTo(17.445f, 23.419f)
                lineToRelative(6.479f, -10.408f)
                curveToRelative(0.205f, -0.323f, -0.029f, -0.733f, -0.41f, -0.733f)
                horizontalLineToRelative(-4.691f)
                curveToRelative(-0.176f, 0.0f, -0.352f, 0.088f, -0.44f, 0.235f)
                lineToRelative(-6.655f, 10.643f)
                curveToRelative(-0.176f, 0.264f, 0.029f, 0.616f, 0.352f, 0.616f)
                horizontalLineToRelative(4.779f)
                curveToRelative(0.234f, -0.001f, 0.468f, -0.118f, 0.586f, -0.353f)
                close()
            }
        }
        .build()
        return _zenn!!
    }

private var _zenn: ImageVector? = null
