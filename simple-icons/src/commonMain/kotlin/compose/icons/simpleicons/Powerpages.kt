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

public val SimpleIcons.Powerpages: ImageVector
    get() {
        if (_powerpages != null) {
            return _powerpages!!
        }
        _powerpages = Builder(name = "Powerpages", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.42f, 14.624f)
                lineTo(3.585f, 16.0f)
                arcToRelative(1.258f, 1.258f, 0.0f, false, false, 0.0f, 2.014f)
                lineToRelative(7.66f, 5.745f)
                arcToRelative(1.257f, 1.257f, 0.0f, false, false, 1.51f, 0.0f)
                lineToRelative(2.612f, -1.959f)
                arcToRelative(1.841f, 1.841f, 0.0f, false, true, -0.828f, -0.337f)
                curveToRelative(-3.081f, -2.223f, -6.1f, -4.531f, -9.119f, -6.839f)
                close()
                moveTo(18.58f, 10.002f)
                lineTo(23.505f, 13.696f)
                curveToRelative(0.66f, 0.503f, 0.66f, 1.497f, 0.0f, 2.001f)
                lineToRelative(-7.155f, 5.366f)
                arcToRelative(1.259f, 1.259f, 0.0f, false, true, -1.511f, 0.0f)
                lineToRelative(-5.693f, -4.27f)
                curveToRelative(0.294f, -0.038f, 0.58f, -0.15f, 0.828f, -0.337f)
                lineToRelative(8.606f, -6.454f)
                close()
                moveTo(0.503f, 10.311f)
                arcToRelative(1.259f, 1.259f, 0.0f, false, true, 0.001f, -2.014f)
                lineTo(11.245f, 0.241f)
                arcToRelative(1.257f, 1.257f, 0.0f, false, true, 1.51f, 0.0f)
                lineToRelative(7.661f, 5.745f)
                curveToRelative(0.671f, 0.503f, 0.671f, 1.51f, 0.0f, 2.013f)
                lineTo(9.674f, 16.056f)
                arcToRelative(1.262f, 1.262f, 0.0f, false, true, -1.511f, 0.0f)
                lineToRelative(-7.66f, -5.745f)
                close()
            }
        }
        .build()
        return _powerpages!!
    }

private var _powerpages: ImageVector? = null
