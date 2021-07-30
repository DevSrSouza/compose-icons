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

public val SimpleIcons.Suzuki: ImageVector
    get() {
        if (_suzuki != null) {
            return _suzuki!!
        }
        _suzuki = Builder(name = "Suzuki", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.369f, 19.995f)
                curveTo(13.51f, 22.39f, 12.0f, 24.0f, 12.0f, 24.0f)
                lineTo(0.105f, 15.705f)
                reflectiveCurveToRelative(5.003f, -3.715f, 9.186f, -0.87f)
                lineToRelative(5.61f, 3.882f)
                lineToRelative(0.683f, -0.453f)
                lineTo(0.106f, 7.321f)
                reflectiveCurveToRelative(2.226f, -0.65f, 6.524f, -3.315f)
                curveTo(10.49f, 1.609f, 12.0f, 0.0f, 12.0f, 0.0f)
                lineToRelative(11.895f, 8.296f)
                reflectiveCurveToRelative(-5.003f, 3.715f, -9.187f, 0.87f)
                lineTo(9.1f, 5.281f)
                lineToRelative(-0.683f, 0.454f)
                lineTo(23.893f, 16.68f)
                reflectiveCurveToRelative(-2.224f, 0.649f, -6.524f, 3.315f)
                close()
            }
        }
        .build()
        return _suzuki!!
    }

private var _suzuki: ImageVector? = null
