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

public val SimpleIcons.Tripadvisor: ImageVector
    get() {
        if (_tripadvisor != null) {
            return _tripadvisor!!
        }
        _tripadvisor = Builder(name = "Tripadvisor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.006f, 4.295f)
                curveToRelative(-2.67f, 0.0f, -5.338f, 0.784f, -7.645f, 2.353f)
                lineTo(0.0f, 6.648f)
                lineToRelative(1.963f, 2.135f)
                arcToRelative(5.997f, 5.997f, 0.0f, false, false, 4.04f, 10.43f)
                arcToRelative(5.976f, 5.976f, 0.0f, false, false, 4.075f, -1.6f)
                lineTo(12.0f, 19.705f)
                lineToRelative(1.922f, -2.09f)
                arcToRelative(5.972f, 5.972f, 0.0f, false, false, 4.072f, 1.598f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -5.998f)
                arcToRelative(5.982f, 5.982f, 0.0f, false, false, -1.957f, -4.432f)
                lineTo(24.0f, 6.648f)
                horizontalLineToRelative(-4.35f)
                arcToRelative(13.573f, 13.573f, 0.0f, false, false, -7.644f, -2.353f)
                close()
                moveTo(12.0f, 6.255f)
                curveToRelative(1.531f, 0.0f, 3.063f, 0.303f, 4.504f, 0.903f)
                curveTo(13.943f, 8.138f, 12.0f, 10.43f, 12.0f, 13.1f)
                curveToRelative(0.0f, -2.671f, -1.942f, -4.962f, -4.504f, -5.942f)
                arcTo(11.72f, 11.72f, 0.0f, false, true, 12.0f, 6.256f)
                close()
                moveTo(6.002f, 9.157f)
                arcToRelative(4.059f, 4.059f, 0.0f, true, true, 0.0f, 8.118f)
                arcToRelative(4.059f, 4.059f, 0.0f, false, true, 0.0f, -8.118f)
                close()
                moveTo(17.994f, 9.159f)
                arcToRelative(4.057f, 4.057f, 0.0f, true, true, 0.003f, 8.115f)
                arcToRelative(4.057f, 4.057f, 0.0f, false, true, -0.003f, -8.115f)
                close()
                moveTo(6.002f, 11.089f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, false, 0.0f, 4.256f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, false, 0.0f, -4.256f)
                close()
                moveTo(17.994f, 11.089f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, false, 0.0f, 4.256f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, false, 0.0f, -4.256f)
                close()
            }
        }
        .build()
        return _tripadvisor!!
    }

private var _tripadvisor: ImageVector? = null
