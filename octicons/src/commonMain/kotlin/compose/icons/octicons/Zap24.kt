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

public val Octicons.Zap24: ImageVector
    get() {
        if (_zap24 != null) {
            return _zap24!!
        }
        _zap24 = Builder(name = "Zap24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.716f, 1.329f)
                arcToRelative(1.341f, 1.341f, 0.0f, false, true, 2.109f, 1.55f)
                lineTo(15.147f, 9.0f)
                horizontalLineToRelative(4.161f)
                curveToRelative(1.623f, 0.0f, 2.372f, 2.016f, 1.143f, 3.075f)
                lineTo(8.102f, 22.721f)
                arcToRelative(1.148f, 1.148f, 0.0f, false, true, -1.81f, -1.317f)
                lineTo(8.996f, 15.0f)
                lineTo(4.674f, 15.0f)
                curveToRelative(-1.619f, 0.0f, -2.37f, -2.008f, -1.148f, -3.07f)
                lineToRelative(12.19f, -10.6f)
                close()
                moveTo(16.168f, 2.924f)
                lineTo(4.51f, 13.061f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.164f, 0.439f)
                horizontalLineToRelative(5.45f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.692f, 1.041f)
                lineToRelative(-2.559f, 6.066f)
                lineToRelative(11.215f, -9.668f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.164f, -0.439f)
                lineTo(14.0f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.687f, -1.05f)
                close()
            }
        }
        .build()
        return _zap24!!
    }

private var _zap24: ImageVector? = null
