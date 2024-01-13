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

public val SimpleIcons.Flathub: ImageVector
    get() {
        if (_flathub != null) {
            return _flathub!!
        }
        _flathub = Builder(name = "Flathub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.068f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.998f, -6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.998f, -6.0f)
                close()
                moveTo(15.218f, 0.08f)
                arcToRelative(1.656f, 1.656f, 0.0f, false, false, -1.654f, 1.656f)
                verticalLineToRelative(8.15f)
                arcToRelative(1.656f, 1.656f, 0.0f, false, false, 2.483f, 1.434f)
                lineToRelative(7.058f, -4.074f)
                arcToRelative(1.656f, 1.656f, 0.0f, false, false, 0.0f, -2.869f)
                lineToRelative(-1.044f, -0.604f)
                lineToRelative(-6.014f, -3.47f)
                arcToRelative(1.656f, 1.656f, 0.0f, false, false, -0.828f, -0.223f)
                close()
                moveTo(18.793f, 13.215f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, false, -0.816f, 0.818f)
                verticalLineToRelative(2.453f)
                horizontalLineToRelative(-2.454f)
                arcToRelative(0.817f, 0.817f, 0.0f, true, false, 0.0f, 1.635f)
                horizontalLineToRelative(2.454f)
                verticalLineToRelative(2.453f)
                arcToRelative(0.817f, 0.817f, 0.0f, true, false, 1.635f, 0.0f)
                verticalLineToRelative(-2.453f)
                horizontalLineToRelative(2.452f)
                arcToRelative(0.817f, 0.817f, 0.0f, true, false, 0.0f, -1.635f)
                horizontalLineToRelative(-2.453f)
                verticalLineToRelative(-2.453f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, false, -0.818f, -0.818f)
                close()
                moveTo(2.865f, 13.5f)
                arcToRelative(2.794f, 2.794f, 0.0f, false, false, -2.799f, 2.8f)
                verticalLineToRelative(4.9f)
                curveToRelative(0.0f, 1.55f, 1.248f, 2.8f, 2.8f, 2.8f)
                horizontalLineToRelative(4.9f)
                curveToRelative(1.55f, 0.0f, 2.8f, -1.25f, 2.8f, -2.8f)
                verticalLineToRelative(-4.9f)
                curveToRelative(0.0f, -1.55f, -1.25f, -2.8f, -2.8f, -2.8f)
                close()
            }
        }
        .build()
        return _flathub!!
    }

private var _flathub: ImageVector? = null
