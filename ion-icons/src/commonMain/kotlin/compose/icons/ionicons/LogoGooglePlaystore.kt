package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoGooglePlaystore: ImageVector
    get() {
        if (_logoGooglePlaystore != null) {
            return _logoGooglePlaystore!!
        }
        _logoGooglePlaystore = Builder(name = "LogoGooglePlaystore", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 59.49f)
                verticalLineToRelative(393.0f)
                arcToRelative(4.33f, 4.33f, 0.0f, false, false, 7.37f, 3.07f)
                lineTo(260.0f, 256.0f)
                lineTo(55.37f, 56.42f)
                arcTo(4.33f, 4.33f, 0.0f, false, false, 48.0f, 59.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(345.8f, 174.0f)
                lineTo(89.22f, 32.64f)
                lineToRelative(-0.16f, -0.09f)
                curveToRelative(-4.42f, -2.4f, -8.62f, 3.58f, -5.0f, 7.06f)
                lineTo(285.19f, 231.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.08f, 472.39f)
                curveToRelative(-3.64f, 3.48f, 0.56f, 9.46f, 5.0f, 7.06f)
                lineToRelative(0.16f, -0.09f)
                lineTo(345.8f, 338.0f)
                lineToRelative(-60.61f, -57.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(449.38f, 231.0f)
                lineToRelative(-71.65f, -39.46f)
                lineTo(310.36f, 256.0f)
                lineToRelative(67.37f, 64.43f)
                lineTo(449.38f, 281.0f)
                curveTo(468.87f, 270.23f, 468.87f, 241.77f, 449.38f, 231.0f)
                close()
            }
        }
        .build()
        return _logoGooglePlaystore!!
    }

private var _logoGooglePlaystore: ImageVector? = null
