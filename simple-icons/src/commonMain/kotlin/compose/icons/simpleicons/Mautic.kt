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

public val SimpleIcons.Mautic: ImageVector
    get() {
        if (_mautic != null) {
            return _mautic!!
        }
        _mautic = Builder(name = "Mautic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.394f, 0.0f, 0.0f, 5.374f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.394f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.626f, 0.0f, 12.0f, -5.394f, 12.0f, -11.98f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, -0.727f, -4.12f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, false, -1.05f, -0.486f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, false, -0.486f, 1.05f)
                curveToRelative(0.425f, 1.132f, 0.627f, 2.324f, 0.627f, 3.556f)
                curveToRelative(0.0f, 5.717f, -4.647f, 10.364f, -10.364f, 10.364f)
                curveToRelative(-5.717f, 0.0f, -10.363f, -4.647f, -10.363f, -10.364f)
                curveTo(1.637f, 6.303f, 6.283f, 1.657f, 12.0f, 1.657f)
                curveToRelative(1.374f, 0.0f, 2.707f, 0.262f, 3.98f, 0.787f)
                arcTo(0.843f, 0.843f, 0.0f, false, false, 17.05f, 2.0f)
                arcToRelative(0.843f, 0.843f, 0.0f, false, false, -0.444f, -1.07f)
                arcTo(11.588f, 11.588f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(20.08f, 4.323f)
                lineTo(16.485f, 5.03f)
                lineTo(17.131f, 5.677f)
                lineTo(12.0f, 11.111f)
                lineTo(7.616f, 6.606f)
                lineTo(5.091f, 17.051f)
                horizontalLineToRelative(2.343f)
                lineToRelative(1.394f, -5.799f)
                lineTo(12.0f, 14.707f)
                lineToRelative(6.788f, -7.394f)
                lineToRelative(0.646f, 0.667f)
                close()
                moveTo(17.252f, 10.768f)
                lineTo(15.394f, 12.708f)
                lineTo(16.424f, 17.051f)
                horizontalLineToRelative(2.344f)
                close()
            }
        }
        .build()
        return _mautic!!
    }

private var _mautic: ImageVector? = null
