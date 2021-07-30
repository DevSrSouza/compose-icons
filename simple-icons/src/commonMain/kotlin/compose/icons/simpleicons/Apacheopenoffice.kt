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

public val SimpleIcons.Apacheopenoffice: ImageVector
    get() {
        if (_apacheopenoffice != null) {
            return _apacheopenoffice!!
        }
        _apacheopenoffice = Builder(name = "Apacheopenoffice", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.371f, 0.0f, 12.0f)
                curveToRelative(0.0f, 0.843f, 0.088f, 1.667f, 0.254f, 2.462f)
                arcToRelative(12.594f, 12.594f, 0.0f, false, true, 3.309f, -0.44f)
                curveToRelative(1.836f, 0.0f, 3.579f, 0.392f, 5.152f, 1.099f)
                arcToRelative(12.536f, 12.536f, 0.0f, false, true, 7.303f, -2.332f)
                curveToRelative(1.704f, 0.0f, 3.33f, 0.339f, 4.811f, 0.953f)
                lineToRelative(0.023f, 0.01f)
                arcToRelative(0.186f, 0.186f, 0.0f, false, true, -0.083f, 0.353f)
                lineToRelative(-0.267f, -0.02f)
                arcToRelative(12.525f, 12.525f, 0.0f, false, false, -0.895f, -0.032f)
                curveToRelative(-4.208f, 0.0f, -7.988f, 1.546f, -10.281f, 4.681f)
                lineToRelative(-0.11f, 0.151f)
                arcToRelative(0.183f, 0.183f, 0.0f, false, true, -0.28f, 0.008f)
                curveTo(6.76f, 16.847f, 3.894f, 16.037f, 0.677f, 15.981f)
                curveTo(2.32f, 20.65f, 6.768f, 24.0f, 11.998f, 24.0f)
                curveTo(18.628f, 24.0f, 24.0f, 18.627f, 24.0f, 12.0f)
                curveToRelative(0.0f, -6.628f, -5.373f, -12.0f, -12.001f, -12.0f)
                close()
                moveTo(21.395f, 7.181f)
                curveToRelative(-0.042f, -0.004f, -0.114f, -0.016f, -0.16f, -0.022f)
                arcToRelative(6.703f, 6.703f, 0.0f, false, false, -0.405f, -0.051f)
                curveToRelative(-2.447f, -0.23f, -4.725f, 0.449f, -6.21f, 2.171f)
                curveToRelative(-0.063f, 0.064f, -0.118f, 0.067f, -0.179f, 0.003f)
                curveToRelative(-1.181f, -1.34f, -2.864f, -1.935f, -4.795f, -2.118f)
                arcToRelative(7.24f, 7.24f, 0.0f, false, false, -2.01f, 0.09f)
                lineToRelative(-0.01f, 0.001f)
                lineToRelative(-0.02f, 0.002f)
                arcToRelative(0.125f, 0.125f, 0.0f, false, true, -0.075f, -0.223f)
                lineToRelative(0.035f, -0.02f)
                arcToRelative(7.23f, 7.23f, 0.0f, false, true, 4.05f, -0.795f)
                curveToRelative(1.054f, 0.1f, 2.035f, 0.42f, 2.9f, 0.91f)
                arcToRelative(7.279f, 7.279f, 0.0f, false, true, 6.797f, -0.255f)
                curveToRelative(0.045f, 0.025f, 0.093f, 0.047f, 0.14f, 0.073f)
                arcToRelative(0.116f, 0.116f, 0.0f, false, true, 0.067f, 0.11f)
                curveToRelative(0.0f, 0.069f, -0.044f, 0.134f, -0.125f, 0.124f)
                close()
            }
        }
        .build()
        return _apacheopenoffice!!
    }

private var _apacheopenoffice: ImageVector? = null
