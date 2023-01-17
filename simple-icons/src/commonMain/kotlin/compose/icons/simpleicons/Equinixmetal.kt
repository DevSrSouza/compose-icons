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

public val SimpleIcons.Equinixmetal: ImageVector
    get() {
        if (_equinixmetal != null) {
            return _equinixmetal!!
        }
        _equinixmetal = Builder(name = "Equinixmetal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.399f, 7.789f)
                verticalLineToRelative(7.005f)
                lineToRelative(-1.599f, 0.56f)
                verticalLineTo(7.231f)
                lineTo(16.0f, 5.557f)
                verticalLineToRelative(11.472f)
                lineToRelative(-1.601f, 0.557f)
                verticalLineTo(4.996f)
                lineTo(12.0f, 4.16f)
                lineToRelative(-2.4f, 0.836f)
                verticalLineToRelative(12.59f)
                lineToRelative(-1.599f, -0.557f)
                verticalLineTo(5.557f)
                lineTo(3.2f, 7.232f)
                verticalLineToRelative(8.121f)
                lineToRelative(-1.599f, -0.56f)
                verticalLineTo(7.79f)
                lineTo(0.0f, 8.349f)
                verticalLineToRelative(7.582f)
                lineToRelative(4.801f, 1.676f)
                verticalLineToRelative(-9.24f)
                lineToRelative(1.6f, -0.558f)
                verticalLineToRelative(10.356f)
                lineTo(11.2f, 19.84f)
                verticalLineTo(6.133f)
                lineToRelative(0.8f, -0.28f)
                lineToRelative(0.8f, 0.28f)
                verticalLineToRelative(13.708f)
                lineToRelative(4.801f, -1.676f)
                verticalLineTo(7.809f)
                lineToRelative(1.599f, 0.558f)
                verticalLineToRelative(9.24f)
                lineTo(24.0f, 15.93f)
                verticalLineTo(8.349f)
                close()
            }
        }
        .build()
        return _equinixmetal!!
    }

private var _equinixmetal: ImageVector? = null
