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

public val SimpleIcons.Scrapbox: ImageVector
    get() {
        if (_scrapbox != null) {
            return _scrapbox!!
        }
        _scrapbox = Builder(name = "Scrapbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(0.194f, 0.0f, 0.388f, 0.04f, 0.535f, 0.117f)
                lineToRelative(4.93f, 2.592f)
                curveToRelative(0.296f, 0.156f, 0.295f, 0.406f, 0.0f, 0.562f)
                lineTo(12.32f, 8.977f)
                curveToRelative(-0.177f, 0.092f, -0.177f, 0.244f, 0.0f, 0.337f)
                lineToRelative(5.145f, 2.706f)
                curveToRelative(0.183f, 0.096f, 0.342f, 0.286f, 0.44f, 0.498f)
                lineToRelative(-4.987f, 2.623f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, false, -0.281f, 0.476f)
                verticalLineToRelative(0.002f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, false, 0.281f, 0.479f)
                lineToRelative(4.836f, 2.545f)
                arcToRelative(0.948f, 0.948f, 0.0f, false, true, -0.29f, 0.248f)
                lineToRelative(-4.929f, 2.591f)
                curveToRelative(-0.296f, 0.156f, -0.774f, 0.156f, -1.07f, 0.0f)
                lineToRelative(-4.93f, -2.591f)
                curveToRelative(-0.296f, -0.156f, -0.295f, -0.407f, 0.0f, -0.563f)
                lineToRelative(5.145f, -2.705f)
                curveToRelative(0.176f, -0.092f, 0.177f, -0.245f, 0.0f, -0.338f)
                lineTo(6.535f, 12.58f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.373f, -0.367f)
                lineToRelative(4.942f, -2.57f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, false, 0.279f, -0.26f)
                arcToRelative(0.554f, 0.554f, 0.0f, false, false, 0.0f, -0.48f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, false, -0.28f, -0.258f)
                lineToRelative(-4.939f, -2.57f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.371f, -0.366f)
                lineToRelative(4.93f, -2.592f)
                arcTo(1.19f, 1.19f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(6.0f, 7.176f)
                lineToRelative(3.781f, 1.967f)
                lineTo(6.0f, 11.109f)
                lineTo(6.0f, 7.176f)
                close()
                moveTo(18.0f, 13.656f)
                verticalLineToRelative(3.926f)
                lineToRelative(-3.732f, -1.963f)
                lineTo(18.0f, 13.656f)
                close()
            }
        }
        .build()
        return _scrapbox!!
    }

private var _scrapbox: ImageVector? = null
