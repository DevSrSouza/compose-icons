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

public val SimpleIcons.Avianca: ImageVector
    get() {
        if (_avianca != null) {
            return _avianca!!
        }
        _avianca = Builder(name = "Avianca", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.813f, 0.0f)
                reflectiveCurveToRelative(-2.326f, 2.052f, -2.51f, 6.367f)
                curveToRelative(-0.205f, 4.716f, 2.324f, 9.47f, 10.654f, 10.076f)
                curveToRelative(0.026f, 0.005f, 0.055f, 0.005f, 0.08f, 0.008f)
                curveTo(7.806f, 11.534f, 4.955f, 5.241f, 3.812f, 0.0f)
                close()
                moveTo(12.037f, 16.451f)
                arcToRelative(30.654f, 30.654f, 0.0f, false, false, 2.2f, 2.303f)
                lineTo(5.282f, 18.754f)
                curveToRelative(0.12f, 0.278f, 0.53f, 0.472f, 1.463f, 0.527f)
                curveToRelative(5.59f, 0.332f, 6.38f, 4.719f, 14.381f, 4.719f)
                curveToRelative(0.702f, 0.0f, 1.14f, -0.042f, 1.582f, -0.125f)
                curveToRelative(-3.16f, -0.972f, -6.0f, -2.8f, -8.47f, -5.121f)
                horizontalLineToRelative(2.21f)
                curveToRelative(0.917f, 0.0f, 1.325f, 0.076f, 1.58f, 0.191f)
                curveToRelative(-0.392f, -1.218f, -1.631f, -2.168f, -5.992f, -2.494f)
                close()
            }
        }
        .build()
        return _avianca!!
    }

private var _avianca: ImageVector? = null
