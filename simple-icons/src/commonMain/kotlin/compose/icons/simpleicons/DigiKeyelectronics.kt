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

public val SimpleIcons.Digikeyelectronics: ImageVector
    get() {
        if (_digikeyelectronics != null) {
            return _digikeyelectronics!!
        }
        _digikeyelectronics = Builder(name = "Digikeyelectronics", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.246f, 0.221f)
                arcTo(11.786f, 11.786f, 0.0f, false, true, 23.89f, 10.418f)
                curveToRelative(0.912f, 6.593f, -3.944f, 12.711f, -10.558f, 13.297f)
                curveToRelative(-0.454f, 0.04f, -0.912f, 0.063f, -1.369f, 0.064f)
                lineToRelative(-10.705f, 0.003f)
                verticalLineToRelative(-3.749f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.987f)
                horizontalLineToRelative(1.222f)
                verticalLineTo(0.218f)
                lineToRelative(11.024f, 0.003f)
                close()
                moveTo(17.9f, 19.423f)
                lineToRelative(-8.26f, -7.422f)
                lineToRelative(8.25f, -7.422f)
                horizontalLineToRelative(-6.938f)
                lineTo(5.615f, 9.361f)
                verticalLineTo(4.598f)
                horizontalLineTo(0.56f)
                verticalLineToRelative(14.803f)
                horizontalLineToRelative(5.105f)
                verticalLineToRelative(-4.724f)
                lineToRelative(5.289f, 4.746f)
                horizontalLineTo(17.9f)
                close()
            }
        }
        .build()
        return _digikeyelectronics!!
    }

private var _digikeyelectronics: ImageVector? = null
