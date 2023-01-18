package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 464.0f)
                curveTo(141.31f, 464.0f, 48.0f, 370.53f, 48.0f, 255.65f)
                curveToRelative(0.0f, -62.45f, 27.25f, -121.0f, 74.76f, -160.55f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 28.17f, 33.8f)
                curveTo(113.48f, 160.1f, 92.0f, 206.3f, 92.0f, 255.65f)
                curveTo(92.0f, 346.27f, 165.57f, 420.0f, 256.0f, 420.0f)
                reflectiveCurveToRelative(164.0f, -73.73f, 164.0f, -164.35f)
                arcTo(164.0f, 164.0f, 0.0f, false, false, 360.17f, 129.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 28.0f, -33.92f)
                arcTo(207.88f, 207.88f, 0.0f, false, true, 464.0f, 255.65f)
                curveTo(464.0f, 370.53f, 370.69f, 464.0f, 256.0f, 464.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 272.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, -22.0f)
                verticalLineTo(70.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 44.0f, 0.0f)
                verticalLineTo(250.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 256.0f, 272.0f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
