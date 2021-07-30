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
                moveTo(12.0f, 2.604f)
                lineToRelative(-0.43f, 0.283f)
                lineTo(0.0f, 10.459f)
                verticalLineToRelative(6.752f)
                lineToRelative(6.393f, 4.184f)
                lineTo(12.0f, 17.725f)
                lineToRelative(5.607f, 3.671f)
                lineTo(24.0f, 17.211f)
                verticalLineToRelative(-6.752f)
                lineTo(12.0f, 2.604f)
                close()
                moveTo(12.0f, 3.432f)
                lineToRelative(5.434f, 3.556f)
                lineToRelative(-2.717f, 1.778f)
                lineTo(12.0f, 10.545f)
                lineToRelative(-2.717f, -1.78f)
                lineToRelative(-2.717f, -1.777f)
                lineTo(12.0f, 3.432f)
                close()
                moveTo(6.39f, 7.104f)
                lineToRelative(5.434f, 3.556f)
                lineToRelative(-5.408f, 3.54f)
                lineToRelative(-5.434f, -3.557f)
                lineToRelative(5.409f, -3.54f)
                close()
                moveTo(17.61f, 7.104f)
                lineToRelative(5.431f, 3.554f)
                lineToRelative(-5.434f, 3.557f)
                lineToRelative(-5.433f, -3.555f)
                lineToRelative(5.435f, -3.556f)
                close()
                moveTo(0.925f, 10.867f)
                lineToRelative(5.379f, 3.52f)
                arcToRelative(0.123f, 0.08f, 0.0f, false, false, 0.027f, 0.013f)
                verticalLineToRelative(5.647f)
                lineToRelative(-5.406f, -3.54f)
                verticalLineToRelative(-5.64f)
                close()
                moveTo(12.138f, 10.982f)
                lineToRelative(5.408f, 3.54f)
                verticalLineToRelative(5.664f)
                lineToRelative(-5.408f, -3.54f)
                verticalLineToRelative(-5.664f)
                close()
            }
        }
        .build()
        return _flathub!!
    }

private var _flathub: ImageVector? = null
