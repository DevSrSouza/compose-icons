package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(511.328f, 20.803f)
                curveToRelative(-11.608f, 38.703f, -34.307f, 111.702f, -61.303f, 187.701f)
                curveToRelative(6.999f, 2.094f, 13.404f, 4.0f, 18.607f, 5.594f)
                arcToRelative(16.062f, 16.062f, 0.0f, false, true, 9.499f, 22.906f)
                curveToRelative(-22.106f, 42.296f, -82.69f, 152.795f, -142.478f, 214.404f)
                curveToRelative(-1.0f, 1.094f, -2.0f, 2.5f, -3.0f, 3.5f)
                arcTo(194.83f, 194.83f, 0.0f, true, true, 57.085f, 179.41f)
                curveToRelative(1.0f, -1.0f, 2.406f, -2.0f, 3.499f, -3.0f)
                curveToRelative(61.6f, -59.905f, 171.974f, -120.405f, 214.373f, -142.498f)
                arcToRelative(16.058f, 16.058f, 0.0f, false, true, 22.903f, 9.5f)
                curveToRelative(1.594f, 5.094f, 3.499f, 11.594f, 5.593f, 18.594f)
                curveTo(379.348f, 35.006f, 452.431f, 12.303f, 491.128f, 0.709f)
                arcTo(16.183f, 16.183f, 0.0f, false, true, 511.328f, 20.803f)
                close()
                moveTo(319.951f, 320.002f)
                arcTo(127.98f, 127.98f, 0.0f, true, false, 191.971f, 448.0f)
                arcTo(127.976f, 127.976f, 0.0f, false, false, 319.951f, 320.002f)
                close()
                moveTo(191.971f, 288.002f)
                arcToRelative(31.995f, 31.995f, 0.0f, true, true, -31.995f, -32.0f)
                arcTo(31.959f, 31.959f, 0.0f, false, true, 191.971f, 288.002f)
                close()
                moveTo(223.966f, 368.001f)
                arcToRelative(15.998f, 15.998f, 0.0f, true, true, -15.998f, -16.0f)
                arcTo(16.05f, 16.05f, 0.0f, false, true, 223.966f, 368.001f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
