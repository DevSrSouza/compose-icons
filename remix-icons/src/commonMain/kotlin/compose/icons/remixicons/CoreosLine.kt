package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CoreosLine: ImageVector
    get() {
        if (_coreosLine != null) {
            return _coreosLine!!
        }
        _coreosLine = Builder(name = "CoreosLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.42f, 4.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.202f, 9.91f)
                curveToRelative(-3.4f, 1.46f, -7.248f, 1.98f, -11.545f, 1.565f)
                curveToRelative(-0.711f, -4.126f, -0.264f, -7.95f, 1.343f, -11.475f)
                close()
                moveTo(11.868f, 3.986f)
                arcToRelative(16.805f, 16.805f, 0.0f, false, false, -1.542f, 3.769f)
                arcToRelative(5.98f, 5.98f, 0.0f, false, true, 4.115f, 1.756f)
                arcToRelative(5.977f, 5.977f, 0.0f, false, true, 1.745f, 3.861f)
                curveToRelative(1.33f, -0.341f, 2.589f, -0.82f, 3.78f, -1.433f)
                arcToRelative(7.994f, 7.994f, 0.0f, false, false, -8.098f, -7.953f)
                close()
                moveTo(4.895f, 19.057f)
                curveTo(0.99f, 15.152f, 0.99f, 8.82f, 4.895f, 4.915f)
                curveToRelative(3.905f, -3.905f, 10.237f, -3.905f, 14.142f, 0.0f)
                curveToRelative(3.905f, 3.905f, 3.905f, 10.237f, 0.0f, 14.142f)
                curveToRelative(-3.905f, 3.905f, -10.237f, 3.905f, -14.142f, 0.0f)
                close()
                moveTo(9.915f, 9.764f)
                arcToRelative(17.885f, 17.885f, 0.0f, false, false, -0.076f, 4.229f)
                arcToRelative(23.144f, 23.144f, 0.0f, false, false, 4.36f, -0.22f)
                arcToRelative(3.988f, 3.988f, 0.0f, false, false, -1.172f, -2.848f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, -3.112f, -1.161f)
                close()
            }
        }
        .build()
        return _coreosLine!!
    }

private var _coreosLine: ImageVector? = null
