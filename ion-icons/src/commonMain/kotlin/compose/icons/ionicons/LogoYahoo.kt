package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoYahoo: ImageVector
    get() {
        if (_logoYahoo != null) {
            return _logoYahoo!!
        }
        _logoYahoo = Builder(name = "LogoYahoo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(410.32f, 37.13f)
                curveToRelative(-13.56f, 0.0f, -27.0f, -0.93f, -39.12f, -5.13f)
                lineTo(256.0f, 218.67f)
                lineTo(140.8f, 32.0f)
                curveToRelative(-12.12f, 4.2f, -24.84f, 5.13f, -38.4f, 5.13f)
                curveTo(89.08f, 37.13f, 75.88f, 36.08f, 64.0f, 32.0f)
                lineTo(217.6f, 280.15f)
                verticalLineTo(480.0f)
                curveToRelative(12.0f, -4.08f, 25.0f, -5.13f, 38.4f, -5.13f)
                reflectiveCurveToRelative(26.4f, 1.05f, 38.4f, 5.13f)
                verticalLineTo(280.5f)
                lineTo(448.0f, 32.0f)
                curveTo(436.12f, 36.0f, 423.64f, 37.13f, 410.32f, 37.13f)
                close()
            }
        }
        .build()
        return _logoYahoo!!
    }

private var _logoYahoo: ImageVector? = null
