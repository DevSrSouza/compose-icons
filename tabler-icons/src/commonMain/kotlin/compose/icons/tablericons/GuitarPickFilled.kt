package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.GuitarPickFilled: ImageVector
    get() {
        if (_guitarPickFilled != null) {
            return _guitarPickFilled!!
        }
        _guitarPickFilled = Builder(name = "GuitarPickFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-1.613f, 0.0f, -2.882f, 0.104f, -3.825f, 0.323f)
                lineToRelative(-0.23f, 0.057f)
                curveToRelative(-3.019f, 0.708f, -4.945f, 2.503f, -4.945f, 5.62f)
                curveToRelative(0.0f, 3.367f, 1.939f, 8.274f, 4.22f, 11.125f)
                curveToRelative(0.32f, 0.4f, 0.664f, 0.786f, 1.03f, 1.158f)
                lineToRelative(0.367f, 0.36f)
                arcToRelative(4.904f, 4.904f, 0.0f, false, false, 6.752f, 0.011f)
                arcToRelative(15.04f, 15.04f, 0.0f, false, false, 1.41f, -1.528f)
                curveToRelative(2.491f, -3.113f, 4.221f, -7.294f, 4.221f, -11.126f)
                curveToRelative(0.0f, -3.025f, -1.813f, -4.806f, -4.71f, -5.562f)
                lineToRelative(-0.266f, -0.066f)
                curveToRelative(-0.936f, -0.25f, -2.281f, -0.372f, -4.024f, -0.372f)
                close()
            }
        }
        .build()
        return _guitarPickFilled!!
    }

private var _guitarPickFilled: ImageVector? = null
