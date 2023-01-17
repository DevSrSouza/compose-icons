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

public val SimpleIcons.Bukalapak: ImageVector
    get() {
        if (_bukalapak != null) {
            return _bukalapak!!
        }
        _bukalapak = Builder(name = "Bukalapak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.976f, 23.845f)
                arcToRelative(3.158f, 3.158f, 0.0f, true, true, -1.95f, -6.008f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, true, 1.95f, 6.008f)
                close()
                moveTo(17.53f, 20.962f)
                curveToRelative(4.047f, -1.315f, 7.315f, -5.981f, 5.689f, -10.984f)
                curveToRelative(-1.626f, -5.003f, -7.012f, -6.856f, -11.058f, -5.541f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, -1.252f, 2.249f)
                lineToRelative(0.414f, 1.682f)
                arcToRelative(1.892f, 1.892f, 0.0f, false, false, 2.42f, 1.348f)
                lineToRelative(0.162f, -0.053f)
                curveToRelative(1.861f, -0.606f, 3.592f, 0.504f, 4.071f, 2.019f)
                curveToRelative(0.505f, 1.507f, -0.244f, 3.422f, -2.106f, 4.027f)
                lineToRelative(-0.162f, 0.054f)
                arcToRelative(1.891f, 1.891f, 0.0f, false, false, -1.166f, 2.512f)
                lineToRelative(0.653f, 1.604f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, 2.335f, 1.083f)
                close()
                moveTo(10.568f, 12.98f)
                lineTo(7.841f, 1.752f)
                arcTo(2.3f, 2.3f, 0.0f, false, false, 4.897f, 0.113f)
                lineToRelative(-2.952f, 0.959f)
                arcTo(2.3f, 2.3f, 0.0f, false, false, 0.526f, 4.128f)
                lineTo(4.92f, 14.815f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 2.841f, 1.318f)
                lineToRelative(1.285f, -0.417f)
                arcToRelative(2.298f, 2.298f, 0.0f, false, false, 1.522f, -2.736f)
                close()
            }
        }
        .build()
        return _bukalapak!!
    }

private var _bukalapak: ImageVector? = null
