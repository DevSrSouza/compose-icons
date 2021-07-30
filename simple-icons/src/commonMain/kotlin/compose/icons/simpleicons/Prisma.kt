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

public val SimpleIcons.Prisma: ImageVector
    get() {
        if (_prisma != null) {
            return _prisma!!
        }
        _prisma = Builder(name = "Prisma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8068f, 18.2848f)
                lineTo(13.5528f, 0.7565f)
                curveToRelative(-0.207f, -0.4382f, -0.639f, -0.7273f, -1.1286f, -0.7541f)
                curveToRelative(-0.5023f, -0.0293f, -0.9523f, 0.213f, -1.2062f, 0.6253f)
                lineTo(2.266f, 15.1271f)
                curveToRelative(-0.2773f, 0.4518f, -0.2718f, 1.0091f, 0.0158f, 1.4555f)
                lineToRelative(4.3759f, 6.7786f)
                curveToRelative(0.2608f, 0.4046f, 0.7127f, 0.6388f, 1.1823f, 0.6388f)
                curveToRelative(0.1332f, 0.0f, 0.267f, -0.0188f, 0.3987f, -0.0577f)
                lineToRelative(12.7019f, -3.7568f)
                curveToRelative(0.3891f, -0.1151f, 0.7072f, -0.3904f, 0.8737f, -0.7553f)
                reflectiveCurveToRelative(0.1633f, -0.7828f, -0.0075f, -1.1454f)
                close()
                moveTo(19.9587f, 19.0367f)
                lineTo(9.1814f, 22.2242f)
                curveToRelative(-0.3292f, 0.0975f, -0.6448f, -0.1873f, -0.5756f, -0.5194f)
                lineToRelative(3.8501f, -18.4386f)
                curveToRelative(0.072f, -0.3448f, 0.5486f, -0.3996f, 0.699f, -0.0803f)
                lineToRelative(7.1288f, 15.138f)
                curveToRelative(0.1344f, 0.2856f, -0.019f, 0.6224f, -0.325f, 0.7128f)
                close()
            }
        }
        .build()
        return _prisma!!
    }

private var _prisma: ImageVector? = null
