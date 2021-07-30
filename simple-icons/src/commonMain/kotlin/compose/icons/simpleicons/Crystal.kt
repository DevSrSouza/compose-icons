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

public val SimpleIcons.Crystal: ImageVector
    get() {
        if (_crystal != null) {
            return _crystal!!
        }
        _crystal = Builder(name = "Crystal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.964f, 15.266f)
                lineToRelative(-8.687f, 8.669f)
                curveToRelative(-0.034f, 0.035f, -0.086f, 0.052f, -0.121f, 0.035f)
                lineTo(3.29f, 20.79f)
                curveToRelative(-0.052f, -0.017f, -0.087f, -0.052f, -0.087f, -0.086f)
                lineTo(0.007f, 8.856f)
                curveToRelative(-0.018f, -0.053f, 0.0f, -0.087f, 0.035f, -0.122f)
                lineTo(8.728f, 0.065f)
                curveToRelative(0.035f, -0.035f, 0.087f, -0.052f, 0.121f, -0.035f)
                lineToRelative(11.866f, 3.18f)
                curveToRelative(0.052f, 0.017f, 0.087f, 0.052f, 0.087f, 0.086f)
                lineToRelative(3.18f, 11.848f)
                curveToRelative(0.034f, 0.053f, 0.016f, 0.087f, -0.018f, 0.122f)
                close()
                moveTo(12.324f, 5.833f)
                lineTo(0.667f, 8.943f)
                curveToRelative(-0.017f, 0.0f, -0.035f, 0.034f, -0.017f, 0.052f)
                lineToRelative(8.53f, 8.512f)
                curveToRelative(0.017f, 0.017f, 0.052f, 0.017f, 0.052f, -0.017f)
                lineToRelative(3.127f, -11.64f)
                curveToRelative(0.017f, 0.0f, -0.018f, -0.035f, -0.035f, -0.017f)
                close()
            }
        }
        .build()
        return _crystal!!
    }

private var _crystal: ImageVector? = null
