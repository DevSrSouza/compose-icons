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

public val SimpleIcons.Nintendoswitch: ImageVector
    get() {
        if (_nintendoswitch != null) {
            return _nintendoswitch!!
        }
        _nintendoswitch = Builder(name = "Nintendoswitch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.176f, 24.0f)
                horizontalLineToRelative(3.674f)
                curveToRelative(3.376f, 0.0f, 6.15f, -2.774f, 6.15f, -6.15f)
                lineTo(24.0f, 6.15f)
                curveTo(24.0f, 2.775f, 21.226f, 0.0f, 17.85f, 0.0f)
                lineTo(14.1f, 0.0f)
                curveToRelative(-0.074f, 0.0f, -0.15f, 0.074f, -0.15f, 0.15f)
                verticalLineToRelative(23.7f)
                curveToRelative(-0.001f, 0.076f, 0.075f, 0.15f, 0.226f, 0.15f)
                close()
                moveTo(18.75f, 10.801f)
                curveToRelative(1.351f, 0.0f, 2.399f, 1.125f, 2.399f, 2.398f)
                curveToRelative(0.0f, 1.352f, -1.125f, 2.4f, -2.399f, 2.4f)
                curveToRelative(-1.35f, 0.0f, -2.4f, -1.049f, -2.4f, -2.4f)
                curveToRelative(-0.075f, -1.349f, 1.05f, -2.398f, 2.4f, -2.398f)
                close()
                moveTo(11.4f, 0.0f)
                lineTo(6.15f, 0.0f)
                curveTo(2.775f, 0.0f, 0.0f, 2.775f, 0.0f, 6.15f)
                verticalLineToRelative(11.7f)
                curveTo(0.0f, 21.226f, 2.775f, 24.0f, 6.15f, 24.0f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.074f, 0.0f, 0.15f, -0.074f, 0.15f, -0.149f)
                lineTo(11.55f, 0.15f)
                curveToRelative(0.001f, -0.076f, -0.075f, -0.15f, -0.15f, -0.15f)
                close()
                moveTo(9.676f, 22.051f)
                lineTo(6.15f, 22.051f)
                curveToRelative(-2.326f, 0.0f, -4.201f, -1.875f, -4.201f, -4.201f)
                lineTo(1.949f, 6.15f)
                curveToRelative(0.0f, -2.326f, 1.875f, -4.201f, 4.201f, -4.201f)
                lineTo(9.6f, 1.949f)
                lineToRelative(0.076f, 20.102f)
                close()
                moveTo(3.75f, 7.199f)
                curveToRelative(0.0f, 1.275f, 0.975f, 2.25f, 2.25f, 2.25f)
                reflectiveCurveToRelative(2.25f, -0.975f, 2.25f, -2.25f)
                curveToRelative(0.0f, -1.273f, -0.975f, -2.25f, -2.25f, -2.25f)
                reflectiveCurveToRelative(-2.25f, 0.977f, -2.25f, 2.25f)
                close()
            }
        }
        .build()
        return _nintendoswitch!!
    }

private var _nintendoswitch: ImageVector? = null
