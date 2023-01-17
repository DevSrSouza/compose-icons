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

public val SimpleIcons.Nextbilliondotai: ImageVector
    get() {
        if (_nextbilliondotai != null) {
            return _nextbilliondotai!!
        }
        _nextbilliondotai = Builder(name = "Nextbilliondotai", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.399f, 13.3694f)
                arcToRelative(6.3067f, 6.3067f, 0.0f, false, false, -0.5655f, -0.567f)
                arcToRelative(6.3754f, 6.3754f, 0.0f, false, false, -4.2337f, -1.5994f)
                horizontalLineToRelative(-4.7989f)
                lineTo(12.8009f, 6.4007f)
                arcToRelative(6.3783f, 6.3783f, 0.0f, false, false, -1.5993f, -4.2338f)
                arcToRelative(6.1066f, 6.1066f, 0.0f, false, false, -0.567f, -0.5641f)
                arcTo(6.3973f, 6.3973f, 0.0f, false, false, 0.002f, 6.4016f)
                verticalLineToRelative(4.7989f)
                arcToRelative(1.5994f, 1.5994f, 0.0f, false, false, 1.5993f, 1.5993f)
                horizontalLineToRelative(9.5959f)
                verticalLineToRelative(4.7989f)
                arcToRelative(6.3696f, 6.3696f, 0.0f, false, false, 0.855f, 3.1985f)
                lineToRelative(0.0842f, 0.1453f)
                arcToRelative(6.3445f, 6.3445f, 0.0f, false, false, 0.6615f, 0.8942f)
                arcToRelative(6.6637f, 6.6637f, 0.0f, false, false, 0.5641f, 0.5641f)
                arcToRelative(6.4689f, 6.4689f, 0.0f, false, false, 0.8913f, 0.6586f)
                lineToRelative(0.1453f, 0.0858f)
                arcToRelative(6.4074f, 6.4074f, 0.0f, false, false, 7.4324f, -0.7444f)
                arcToRelative(6.6963f, 6.6963f, 0.0f, false, false, 0.5655f, -0.5655f)
                arcToRelative(6.3973f, 6.3973f, 0.0f, false, false, 0.0f, -8.4677f)
                close()
                moveTo(11.201f, 11.1986f)
                lineTo(1.6052f, 11.1986f)
                verticalLineToRelative(-4.799f)
                arcToRelative(4.7989f, 4.7989f, 0.0f, false, true, 9.5958f, 0.0f)
                close()
                moveTo(17.5975f, 22.3937f)
                arcToRelative(4.7703f, 4.7703f, 0.0f, false, true, -3.1986f, -1.2243f)
                arcToRelative(4.1977f, 4.1977f, 0.0f, false, true, -0.378f, -0.3766f)
                arcToRelative(4.782f, 4.782f, 0.0f, false, true, -1.2211f, -3.1985f)
                verticalLineToRelative(-4.7964f)
                horizontalLineToRelative(4.7988f)
                arcToRelative(4.7989f, 4.7989f, 0.0f, false, true, 0.0f, 9.5958f)
                close()
            }
        }
        .build()
        return _nextbilliondotai!!
    }

private var _nextbilliondotai: ImageVector? = null
