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

public val SimpleIcons.Statuspal: ImageVector
    get() {
        if (_statuspal != null) {
            return _statuspal!!
        }
        _statuspal = Builder(name = "Statuspal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.275f, 9.296f)
                curveToRelative(0.0f, -1.242f, -1.02f, -2.25f, -2.275f, -2.25f)
                curveToRelative(-1.256f, 0.0f, -2.275f, 1.008f, -2.275f, 2.25f)
                curveToRelative(0.0f, 0.936f, 0.58f, 1.737f, 1.403f, 2.077f)
                lineTo(5.934f, 24.0f)
                curveToRelative(1.896f, -1.1f, 3.98f, -1.651f, 6.066f, -1.651f)
                curveToRelative(2.085f, 0.0f, 4.17f, 0.55f, 6.066f, 1.65f)
                lineToRelative(-5.194f, -12.626f)
                arcToRelative(2.251f, 2.251f, 0.0f, false, false, 1.403f, -2.077f)
                close()
                moveTo(15.462f, 21.306f)
                arcTo(13.44f, 13.44f, 0.0f, false, false, 12.0f, 20.849f)
                arcToRelative(13.44f, 13.44f, 0.0f, false, false, -3.463f, 0.457f)
                lineTo(12.0f, 13.389f)
                close()
                moveTo(16.55f, 13.5f)
                arcToRelative(5.58f, 5.58f, 0.0f, false, false, -0.723f, -7.535f)
                arcToRelative(5.732f, 5.732f, 0.0f, false, false, -7.654f, 0.0f)
                arcTo(5.58f, 5.58f, 0.0f, false, false, 7.45f, 13.5f)
                arcToRelative(6.167f, 6.167f, 0.0f, false, true, 0.143f, -8.716f)
                curveToRelative(2.446f, -2.379f, 6.368f, -2.379f, 8.813f, 0.0f)
                arcToRelative(6.167f, 6.167f, 0.0f, false, true, 0.144f, 8.716f)
                close()
                moveTo(16.55f, 16.5f)
                curveToRelative(3.047f, -1.988f, 4.416f, -5.716f, 3.366f, -9.174f)
                curveTo(18.867f, 3.867f, 15.65f, 1.5f, 12.0f, 1.5f)
                curveToRelative(-3.65f, 0.0f, -6.869f, 2.367f, -7.917f, 5.826f)
                curveToRelative(-1.049f, 3.458f, 0.32f, 7.186f, 3.367f, 9.174f)
                curveToRelative(-3.481f, -2.029f, -5.16f, -6.111f, -4.096f, -9.968f)
                curveTo(4.417f, 2.675f, 7.96f, 0.0f, 12.0f, 0.0f)
                curveToRelative(4.042f, 0.0f, 7.583f, 2.675f, 8.646f, 6.532f)
                curveToRelative(1.063f, 3.857f, -0.615f, 7.94f, -4.096f, 9.968f)
                close()
            }
        }
        .build()
        return _statuspal!!
    }

private var _statuspal: ImageVector? = null
