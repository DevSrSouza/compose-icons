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

public val SimpleIcons.Windowsxp: ImageVector
    get() {
        if (_windowsxp != null) {
            return _windowsxp!!
        }
        _windowsxp = Builder(name = "Windowsxp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.302f, 1.415f)
                curveToRelative(-1.184f, 0.02f, -2.592f, 0.32f, -4.341f, 1.044f)
                lineToRelative(-2.283f, 7.949f)
                curveToRelative(1.846f, -0.761f, 3.311f, -1.114f, 4.537f, -1.1f)
                arcToRelative(7.596f, 7.596f, 0.0f, false, true, 4.37f, 1.593f)
                lineToRelative(2.296f, -7.92f)
                curveToRelative(-1.26f, -0.855f, -2.607f, -1.599f, -4.58f, -1.566f)
                close()
                moveTo(15.052f, 3.826f)
                lineToRelative(-2.256f, 7.949f)
                curveToRelative(2.016f, 1.367f, 4.44f, 2.494f, 8.907f, 0.493f)
                lineTo(24.0f, 4.333f)
                horizontalLineToRelative(-0.042f)
                curveToRelative(-4.651f, 1.931f, -6.906f, 0.846f, -8.907f, -0.507f)
                close()
                moveTo(6.617f, 10.77f)
                curveToRelative(-1.184f, 0.018f, -2.591f, 0.315f, -4.335f, 1.034f)
                lineTo(0.0f, 19.779f)
                curveToRelative(4.65f, -1.93f, 6.863f, -0.803f, 8.878f, 0.55f)
                lineToRelative(2.326f, -7.99f)
                curveToRelative(-1.26f, -0.855f, -2.613f, -1.6f, -4.586f, -1.57f)
                close()
                moveTo(12.401f, 13.114f)
                lineToRelative(0.011f, 0.008f)
                lineToRelative(0.003f, -0.008f)
                close()
                moveTo(12.412f, 13.122f)
                lineToRelative(-2.294f, 7.898f)
                curveToRelative(2.015f, 1.367f, 4.256f, 2.453f, 8.906f, 0.522f)
                lineToRelative(2.297f, -7.92f)
                curveToRelative(-4.641f, 1.927f, -6.882f, 0.85f, -8.909f, -0.5f)
                close()
            }
        }
        .build()
        return _windowsxp!!
    }

private var _windowsxp: ImageVector? = null
