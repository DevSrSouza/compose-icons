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

public val SimpleIcons.Ktm: ImageVector
    get() {
        if (_ktm != null) {
            return _ktm!!
        }
        _ktm = Builder(name = "Ktm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 15.735f)
                horizontalLineToRelative(3.354f)
                lineToRelative(0.843f, -2.06f)
                lineToRelative(1.55f, 2.06f)
                horizontalLineToRelative(7.225f)
                lineToRelative(2.234f, -2.081f)
                lineToRelative(-0.372f, 2.081f)
                horizontalLineToRelative(2.83f)
                lineTo(20.0f, 13.675f)
                lineToRelative(-0.32f, 2.06f)
                horizontalLineToRelative(3.052f)
                lineTo(24.0f, 9.99f)
                horizontalLineToRelative(-3.068f)
                lineToRelative(-2.486f, 2.191f)
                lineToRelative(0.48f, -2.19f)
                horizontalLineToRelative(-2.942f)
                lineToRelative(-3.209f, 3.216f)
                lineToRelative(1.342f, -3.938f)
                horizontalLineToRelative(4.907f)
                lineToRelative(0.225f, -1.003f)
                horizontalLineTo(6.381f)
                lineToRelative(-0.378f, 1.003f)
                horizontalLineToRelative(4.732f)
                lineToRelative(-1.994f, 5.054f)
                lineToRelative(-1.572f, -2.066f)
                lineTo(9.886f, 9.99f)
                horizontalLineTo(7.612f)
                lineToRelative(-2.787f, 2.23f)
                lineToRelative(0.938f, -2.23f)
                horizontalLineTo(2.44f)
                lineTo(0.0f, 15.735f)
                close()
            }
        }
        .build()
        return _ktm!!
    }

private var _ktm: ImageVector? = null
