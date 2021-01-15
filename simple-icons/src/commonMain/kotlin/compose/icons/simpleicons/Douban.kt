package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Douban: ImageVector
    get() {
        if (_douban != null) {
            return _douban!!
        }
        _douban = Builder(name = "Douban", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.643f, 0.92f)
                verticalLineToRelative(2.412f)
                horizontalLineToRelative(22.714f)
                lineTo(23.357f, 0.92f)
                lineTo(0.643f, 0.92f)
                close()
                moveTo(2.617f, 5.846f)
                verticalLineToRelative(9.42f)
                horizontalLineToRelative(18.764f)
                verticalLineToRelative(-9.42f)
                lineTo(2.617f, 5.846f)
                close()
                moveTo(5.337f, 8.254f)
                lineTo(18.69f, 8.254f)
                verticalLineToRelative(4.605f)
                lineTo(5.338f, 12.859f)
                lineTo(5.338f, 8.254f)
                close()
                moveTo(6.994f, 15.666f)
                lineToRelative(-2.512f, 0.938f)
                curveToRelative(1.037f, 1.461f, 1.87f, 2.825f, 2.512f, 4.091f)
                lineTo(0.0f, 20.695f)
                verticalLineToRelative(2.385f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.385f)
                horizontalLineToRelative(-6.678f)
                curveToRelative(0.818f, -1.176f, 1.589f, -2.543f, 2.303f, -4.091f)
                lineToRelative(-2.73f, -0.938f)
                arcToRelative(29.952f, 29.952f, 0.0f, false, true, -2.479f, 5.03f)
                horizontalLineToRelative(-4.75f)
                curveToRelative(-0.786f, -1.962f, -1.677f, -3.641f, -2.672f, -5.03f)
                close()
            }
        }
        .build()
        return _douban!!
    }

private var _douban: ImageVector? = null
