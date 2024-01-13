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

public val SimpleIcons.Coil: ImageVector
    get() {
        if (_coil != null) {
            return _coil!!
        }
        _coil = Builder(name = "Coil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.465f, 5.814f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, true, 2.756f, 0.83f)
                curveToRelative(1.215f, 0.886f, 1.465f, 1.856f, 1.465f, 2.5f)
                arcToRelative(1.845f, 1.845f, 0.0f, false, true, -0.086f, 0.6f)
                arcToRelative(2.77f, 2.77f, 0.0f, false, true, -2.305f, 1.906f)
                arcToRelative(5.675f, 5.675f, 0.0f, false, true, -0.654f, 0.055f)
                curveToRelative(-1.0f, 0.0f, -1.33f, -0.41f, -1.33f, -0.87f)
                curveToRelative(0.0f, -0.624f, 0.6f, -1.364f, 1.035f, -1.364f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.154f, 0.045f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, 0.375f, 0.093f)
                arcToRelative(0.265f, 0.265f, 0.0f, false, false, 0.11f, 0.0f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, 0.515f, -0.558f)
                curveToRelative(0.0f, -0.55f, -0.625f, -1.25f, -2.0f, -1.25f)
                arcToRelative(5.285f, 5.285f, 0.0f, false, false, -1.55f, 0.244f)
                arcTo(4.12f, 4.12f, 0.0f, false, false, 8.685f, 9.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 12.05f)
                arcTo(3.945f, 3.945f, 0.0f, false, false, 8.5f, 14.0f)
                arcToRelative(4.235f, 4.235f, 0.0f, false, false, 3.69f, 2.06f)
                horizontalLineToRelative(0.24f)
                curveToRelative(2.0f, -0.11f, 2.46f, -1.09f, 2.906f, -1.28f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, 0.299f, -0.065f)
                curveToRelative(0.325f, 0.0f, 0.745f, 0.164f, 1.035f, 0.86f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, 0.07f, 0.3f)
                curveToRelative(0.0f, 1.145f, -2.67f, 2.18f, -4.22f, 2.26f)
                horizontalLineToRelative(-0.35f)
                arcTo(6.38f, 6.38f, 0.0f, false, true, 6.62f, 15.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -0.77f, -2.94f)
                arcToRelative(6.085f, 6.085f, 0.0f, false, true, 1.035f, -3.39f)
                arcToRelative(6.195f, 6.195f, 0.0f, false, true, 3.385f, -2.5f)
                arcToRelative(7.295f, 7.295f, 0.0f, false, true, 2.195f, -0.356f)
                close()
            }
        }
        .build()
        return _coil!!
    }

private var _coil: ImageVector? = null
