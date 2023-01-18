package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.07f, 111.35f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 465.92f, 96.6f)
                curveTo(379.89f, 81.18f, 343.69f, 69.12f, 266.0f, 34.16f)
                curveToRelative(-7.76f, -2.89f, -12.57f, -2.84f, -20.0f, 0.0f)
                curveToRelative(-77.69f, 35.0f, -113.89f, 47.0f, -199.92f, 62.44f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.15f, 14.75f)
                curveToRelative(-3.85f, 61.1f, 4.34f, 118.0f, 24.36f, 169.15f)
                arcToRelative(348.86f, 348.86f, 0.0f, false, false, 71.43f, 112.41f)
                curveToRelative(44.67f, 47.43f, 94.2f, 75.12f, 119.74f, 85.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 15.11f, 0.0f)
                curveToRelative(27.0f, -10.92f, 74.69f, -37.82f, 119.71f, -85.62f)
                arcTo(348.86f, 348.86f, 0.0f, false, false, 454.71f, 280.5f)
                curveTo(474.73f, 229.36f, 482.92f, 172.45f, 479.07f, 111.35f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
