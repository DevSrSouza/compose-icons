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

public val SimpleIcons.Ingress: ImageVector
    get() {
        if (_ingress != null) {
            return _ingress!!
        }
        _ingress = Builder(name = "Ingress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.55f, 6.55f)
                verticalLineToRelative(10.9f)
                curveToRelative(0.0f, 0.434f, -0.184f, 0.749f, -0.55f, 0.95f)
                lineToRelative(-9.45f, 5.45f)
                curveToRelative(-0.367f, 0.2f, -0.733f, 0.2f, -1.1f, 0.0f)
                lineTo(2.0f, 18.4f)
                curveToRelative(-0.366f, -0.201f, -0.55f, -0.516f, -0.55f, -0.95f)
                lineTo(1.45f, 6.55f)
                curveToRelative(0.0f, -0.434f, 0.184f, -0.749f, 0.55f, -0.95f)
                lineTo(11.45f, 0.15f)
                curveToRelative(0.367f, -0.2f, 0.733f, -0.2f, 1.1f, 0.0f)
                lineTo(22.0f, 5.6f)
                curveToRelative(0.366f, 0.201f, 0.55f, 0.516f, 0.55f, 0.95f)
                close()
                moveTo(21.0f, 17.8f)
                lineToRelative(-3.9f, -2.25f)
                lineToRelative(0.5f, -0.9f)
                lineToRelative(3.9f, 2.249f)
                lineTo(21.5f, 6.549f)
                lineToRelative(-0.05f, -0.048f)
                lineToRelative(-8.95f, -5.2f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-9.0f, 5.2f)
                verticalLineToRelative(10.398f)
                lineToRelative(3.9f, -2.248f)
                lineToRelative(0.5f, 0.899f)
                lineTo(3.0f, 17.8f)
                lineToRelative(8.95f, 5.15f)
                horizontalLineToRelative(0.1f)
                lineTo(21.0f, 17.8f)
                close()
                moveTo(4.55f, 7.675f)
                curveToRelative(0.0f, -0.016f, 0.016f, -0.025f, 0.05f, -0.025f)
                horizontalLineToRelative(14.8f)
                curveToRelative(0.033f, 0.0f, 0.05f, 0.009f, 0.05f, 0.025f)
                verticalLineToRelative(0.075f)
                lineToRelative(-7.4f, 12.799f)
                curveToRelative(0.0f, 0.034f, -0.017f, 0.05f, -0.05f, 0.05f)
                curveToRelative(-0.034f, 0.0f, -0.05f, -0.016f, -0.05f, -0.05f)
                lineTo(4.55f, 7.75f)
                verticalLineToRelative(-0.075f)
                close()
                moveTo(11.5f, 12.751f)
                curveToRelative(0.0f, -0.301f, -0.15f, -0.533f, -0.45f, -0.7f)
                lineTo(6.9f, 9.65f)
                horizontalLineToRelative(-0.05f)
                verticalLineToRelative(0.05f)
                lineToRelative(4.6f, 7.9f)
                curveToRelative(0.033f, 0.0f, 0.05f, -0.019f, 0.05f, -0.051f)
                verticalLineToRelative(-4.8f)
                close()
                moveTo(12.4f, 11.15f)
                lineToRelative(4.2f, -2.45f)
                lineTo(7.4f, 8.7f)
                lineToRelative(0.05f, 0.051f)
                lineToRelative(4.15f, 2.399f)
                arcToRelative(0.701f, 0.701f, 0.0f, false, false, 0.8f, 0.0f)
                close()
                moveTo(17.15f, 9.7f)
                verticalLineToRelative(-0.05f)
                horizontalLineToRelative(-0.05f)
                lineToRelative(-4.15f, 2.4f)
                curveToRelative(-0.3f, 0.167f, -0.45f, 0.417f, -0.45f, 0.749f)
                verticalLineToRelative(4.8f)
                horizontalLineToRelative(0.1f)
                lineToRelative(4.55f, -7.899f)
                close()
            }
        }
        .build()
        return _ingress!!
    }

private var _ingress: ImageVector? = null
