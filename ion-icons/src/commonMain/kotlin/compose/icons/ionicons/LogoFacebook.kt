package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoFacebook: ImageVector
    get() {
        if (_logoFacebook != null) {
            return _logoFacebook!!
        }
        _logoFacebook = Builder(name = "LogoFacebook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(480.0f, 257.35f)
                curveToRelative(0.0f, -123.7f, -100.3f, -224.0f, -224.0f, -224.0f)
                reflectiveCurveToRelative(-224.0f, 100.3f, -224.0f, 224.0f)
                curveToRelative(0.0f, 111.8f, 81.9f, 204.47f, 189.0f, 221.29f)
                verticalLineTo(322.12f)
                horizontalLineTo(164.11f)
                verticalLineTo(257.35f)
                horizontalLineTo(221.0f)
                verticalLineTo(208.0f)
                curveToRelative(0.0f, -56.13f, 33.45f, -87.16f, 84.61f, -87.16f)
                curveToRelative(24.51f, 0.0f, 50.15f, 4.38f, 50.15f, 4.38f)
                verticalLineToRelative(55.13f)
                horizontalLineTo(327.5f)
                curveToRelative(-27.81f, 0.0f, -36.51f, 17.26f, -36.51f, 35.0f)
                verticalLineToRelative(42.0f)
                horizontalLineToRelative(62.12f)
                lineToRelative(-9.92f, 64.77f)
                horizontalLineTo(291.0f)
                verticalLineTo(478.66f)
                curveTo(398.1f, 461.85f, 480.0f, 369.18f, 480.0f, 257.35f)
                close()
            }
        }
        .build()
        return _logoFacebook!!
    }

private var _logoFacebook: ImageVector? = null
