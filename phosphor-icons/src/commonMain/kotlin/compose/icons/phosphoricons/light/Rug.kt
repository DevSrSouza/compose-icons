package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Rug: ImageVector
    get() {
        if (_rug != null) {
            return _rug!!
        }
        _rug = Builder(name = "Rug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(194.0f, 42.0f)
                lineTo(158.0f, 42.0f)
                lineTo(158.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(146.0f, 42.0f)
                lineTo(110.0f, 42.0f)
                lineTo(110.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(98.0f, 42.0f)
                lineTo(62.0f, 42.0f)
                lineTo(62.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(50.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(62.0f, 214.0f)
                lineTo(98.0f, 214.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(110.0f, 214.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(158.0f, 214.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(206.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 18.0f)
                close()
                moveTo(62.0f, 54.0f)
                lineTo(194.0f, 54.0f)
                lineTo(194.0f, 202.0f)
                lineTo(62.0f, 202.0f)
                close()
                moveTo(128.0f, 174.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 5.1f, -2.9f)
                lineToRelative(24.0f, -40.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, -6.2f)
                lineToRelative(-24.0f, -40.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -10.2f, 0.0f)
                lineToRelative(-24.0f, 40.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 6.2f)
                lineToRelative(24.0f, 40.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 128.0f, 174.0f)
                close()
                moveTo(128.0f, 99.7f)
                lineTo(145.0f, 128.0f)
                lineToRelative(-17.0f, 28.3f)
                lineTo(111.0f, 128.0f)
                close()
            }
        }
        .build()
        return _rug!!
    }

private var _rug: ImageVector? = null
