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

public val SimpleIcons.Linear: ImageVector
    get() {
        if (_linear != null) {
            return _linear!!
        }
        _linear = Builder(name = "Linear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.886f, 4.18f)
                arcTo(11.982f, 11.982f, 0.0f, false, true, 11.99f, 0.0f)
                curveTo(18.624f, 0.0f, 24.0f, 5.376f, 24.0f, 12.009f)
                curveToRelative(0.0f, 3.64f, -1.62f, 6.903f, -4.18f, 9.105f)
                lineTo(2.887f, 4.18f)
                close()
                moveTo(1.817f, 5.626f)
                lineToRelative(16.556f, 16.556f)
                curveToRelative(-0.524f, 0.33f, -1.075f, 0.62f, -1.65f, 0.866f)
                lineTo(0.951f, 7.277f)
                curveToRelative(0.247f, -0.575f, 0.537f, -1.126f, 0.866f, -1.65f)
                close()
                moveTo(0.322f, 9.163f)
                lineToRelative(14.515f, 14.515f)
                curveToRelative(-0.71f, 0.172f, -1.443f, 0.282f, -2.195f, 0.322f)
                lineTo(0.0f, 11.358f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.322f, -2.195f)
                close()
                moveTo(0.152f, 14.025f)
                lineTo(9.975f, 23.849f)
                arcToRelative(12.02f, 12.02f, 0.0f, false, true, -9.824f, -9.824f)
                close()
            }
        }
        .build()
        return _linear!!
    }

private var _linear: ImageVector? = null
