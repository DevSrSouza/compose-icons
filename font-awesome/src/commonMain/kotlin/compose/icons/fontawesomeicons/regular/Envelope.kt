package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 64.0f)
                lineTo(48.0f, 64.0f)
                curveTo(21.49f, 64.0f, 0.0f, 85.49f, 0.0f, 112.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(512.0f, 112.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(464.0f, 112.0f)
                verticalLineToRelative(40.805f)
                curveToRelative(-22.422f, 18.259f, -58.168f, 46.651f, -134.587f, 106.49f)
                curveToRelative(-16.841f, 13.247f, -50.201f, 45.072f, -73.413f, 44.701f)
                curveToRelative(-23.208f, 0.375f, -56.579f, -31.459f, -73.413f, -44.701f)
                curveTo(106.18f, 199.465f, 70.425f, 171.067f, 48.0f, 152.805f)
                lineTo(48.0f, 112.0f)
                horizontalLineToRelative(416.0f)
                close()
                moveTo(48.0f, 400.0f)
                lineTo(48.0f, 214.398f)
                curveToRelative(22.914f, 18.251f, 55.409f, 43.862f, 104.938f, 82.646f)
                curveToRelative(21.857f, 17.205f, 60.134f, 55.186f, 103.062f, 54.955f)
                curveToRelative(42.717f, 0.231f, 80.509f, -37.199f, 103.053f, -54.947f)
                curveToRelative(49.528f, -38.783f, 82.032f, -64.401f, 104.947f, -82.653f)
                lineTo(464.0f, 400.0f)
                lineTo(48.0f, 400.0f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
