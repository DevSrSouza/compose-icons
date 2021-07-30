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

public val Octicons.HeartFill24: ImageVector
    get() {
        if (_heartFill24 != null) {
            return _heartFill24!!
        }
        _heartFill24 = Builder(name = "HeartFill24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 20.408f)
                curveToRelative(-0.492f, 0.308f, -0.903f, 0.546f, -1.192f, 0.709f)
                curveToRelative(-0.153f, 0.086f, -0.308f, 0.17f, -0.463f, 0.252f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.686f, 0.0f)
                arcToRelative(16.709f, 16.709f, 0.0f, false, true, -0.465f, -0.252f)
                arcToRelative(31.147f, 31.147f, 0.0f, false, true, -4.803f, -3.34f)
                curveTo(3.8f, 15.572f, 1.0f, 12.331f, 1.0f, 8.513f)
                curveTo(1.0f, 5.052f, 3.829f, 2.5f, 6.736f, 2.5f)
                curveTo(9.03f, 2.5f, 10.881f, 3.726f, 12.0f, 5.605f)
                curveTo(13.12f, 3.726f, 14.97f, 2.5f, 17.264f, 2.5f)
                curveTo(20.17f, 2.5f, 23.0f, 5.052f, 23.0f, 8.514f)
                curveToRelative(0.0f, 3.818f, -2.801f, 7.06f, -5.389f, 9.262f)
                arcTo(31.146f, 31.146f, 0.0f, false, true, 14.0f, 20.408f)
                close()
            }
        }
        .build()
        return _heartFill24!!
    }

private var _heartFill24: ImageVector? = null
