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

public val SimpleIcons.Uml: ImageVector
    get() {
        if (_uml != null) {
            return _uml!!
        }
        _uml = Builder(name = "Uml", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.768f, 0.0f)
                lineTo(7.182f, 1.604f)
                reflectiveCurveToRelative(6.126f, 2.72f, 6.852f, 3.055f)
                curveToRelative(0.72f, 0.335f, 1.744f, 0.947f, 0.565f, 1.629f)
                curveToRelative(-1.18f, 0.682f, -2.423f, 0.477f, -3.259f, 0.09f)
                curveToRelative(-0.835f, -0.384f, -7.012f, -3.257f, -7.012f, -3.257f)
                lineTo(0.666f, 4.777f)
                reflectiveCurveToRelative(6.4f, 2.935f, 7.4f, 3.417f)
                curveToRelative(1.003f, 0.482f, 4.753f, 1.784f, 8.48f, 0.002f)
                curveToRelative(3.727f, -1.781f, 3.261f, -2.577f, 3.268f, -2.724f)
                curveToRelative(0.006f, -0.148f, -0.036f, -0.933f, -0.632f, -1.467f)
                curveToRelative(-0.599f, -0.534f, -2.378f, -1.375f, -3.127f, -1.73f)
                curveTo(15.305f, 1.916f, 10.77f, 0.0f, 10.77f, 0.0f)
                close()
                moveTo(0.411f, 5.299f)
                verticalLineToRelative(13.215f)
                lineToRelative(2.904f, 1.402f)
                verticalLineToRelative(-7.963f)
                lineToRelative(1.585f, 8.6f)
                lineToRelative(2.58f, 1.243f)
                lineToRelative(1.66f, -7.154f)
                verticalLineToRelative(7.826f)
                lineToRelative(2.916f, 1.38f)
                lineTo(12.056f, 10.643f)
                lineTo(7.629f, 8.628f)
                lineToRelative(-1.403f, 6.296f)
                lineToRelative(-1.412f, -7.598f)
                close()
                moveTo(17.171f, 8.414f)
                lineTo(12.547f, 10.729f)
                lineTo(12.559f, 24.0f)
                lineToRelative(11.03f, -5.225f)
                lineToRelative(-0.025f, -3.613f)
                lineToRelative(-6.393f, 2.92f)
                close()
            }
        }
        .build()
        return _uml!!
    }

private var _uml: ImageVector? = null
