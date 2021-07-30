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

public val SimpleIcons.Bloglovin: ImageVector
    get() {
        if (_bloglovin != null) {
            return _bloglovin!!
        }
        _bloglovin = Builder(name = "Bloglovin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.526f, 11.695f)
                curveToRelative(1.84f, -0.382f, 3.367f, -2.044f, 3.367f, -4.478f)
                curveToRelative(0.0f, -2.604f, -1.9f, -4.97f, -5.615f, -4.97f)
                lineTo(0.0f, 2.247f)
                verticalLineToRelative(19.506f)
                horizontalLineToRelative(10.6f)
                curveToRelative(3.75f, 0.0f, 5.683f, -2.341f, 5.683f, -5.292f)
                curveToRelative(-0.009f, -2.426f, -1.646f, -4.444f, -3.757f, -4.766f)
                close()
                moveTo(4.156f, 5.902f)
                horizontalLineToRelative(5.207f)
                curveToRelative(1.407f, 0.0f, 2.28f, 0.849f, 2.28f, 2.044f)
                curveToRelative(0.0f, 1.255f, -0.881f, 2.044f, -2.28f, 2.044f)
                lineTo(4.155f, 9.99f)
                close()
                moveTo(9.54f, 18.098f)
                lineTo(4.155f, 18.098f)
                verticalLineToRelative(-4.444f)
                horizontalLineToRelative(5.386f)
                curveToRelative(1.61f, 0.0f, 2.484f, 0.992f, 2.484f, 2.222f)
                curveToRelative(0.009f, 1.399f, -0.932f, 2.222f, -2.484f, 2.222f)
                close()
                moveTo(21.396f, 2.28f)
                curveToRelative(-1.255f, 0.0f, -2.315f, 1.052f, -2.315f, 2.307f)
                reflectiveCurveToRelative(0.882f, 2.103f, 1.993f, 2.103f)
                curveToRelative(0.238f, 0.0f, 0.467f, -0.025f, 0.56f, -0.085f)
                curveToRelative(-0.238f, 1.052f, -1.315f, 2.282f, -2.256f, 2.782f)
                lineToRelative(1.611f, 1.314f)
                curveTo(22.796f, 9.422f, 24.0f, 7.462f, 24.0f, 5.266f)
                curveToRelative(0.0f, -1.9f, -1.23f, -2.985f, -2.604f, -2.985f)
                close()
            }
        }
        .build()
        return _bloglovin!!
    }

private var _bloglovin: ImageVector? = null
