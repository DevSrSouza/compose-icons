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

public val SimpleIcons.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.48f, 10.92f)
                verticalLineToRelative(3.28f)
                horizontalLineToRelative(7.84f)
                curveToRelative(-0.24f, 1.84f, -0.853f, 3.187f, -1.787f, 4.133f)
                curveToRelative(-1.147f, 1.147f, -2.933f, 2.4f, -6.053f, 2.4f)
                curveToRelative(-4.827f, 0.0f, -8.6f, -3.893f, -8.6f, -8.72f)
                reflectiveCurveToRelative(3.773f, -8.72f, 8.6f, -8.72f)
                curveToRelative(2.6f, 0.0f, 4.507f, 1.027f, 5.907f, 2.347f)
                lineToRelative(2.307f, -2.307f)
                curveTo(18.747f, 1.44f, 16.133f, 0.0f, 12.48f, 0.0f)
                curveTo(5.867f, 0.0f, 0.307f, 5.387f, 0.307f, 12.0f)
                reflectiveCurveToRelative(5.56f, 12.0f, 12.173f, 12.0f)
                curveToRelative(3.573f, 0.0f, 6.267f, -1.173f, 8.373f, -3.36f)
                curveToRelative(2.16f, -2.16f, 2.84f, -5.213f, 2.84f, -7.667f)
                curveToRelative(0.0f, -0.76f, -0.053f, -1.467f, -0.173f, -2.053f)
                horizontalLineTo(12.48f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
