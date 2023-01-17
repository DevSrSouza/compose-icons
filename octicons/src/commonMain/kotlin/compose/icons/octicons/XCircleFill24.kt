package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.XCircleFill24: ImageVector
    get() {
        if (_xCircleFill24 != null) {
            return _xCircleFill24!!
        }
        _xCircleFill24 = Builder(name = "XCircleFill24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(11.0f, 4.925f, 11.0f, 11.0f)
                reflectiveCurveToRelative(-4.925f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 18.075f, 1.0f, 12.0f)
                close()
                moveTo(9.036f, 7.976f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -0.018f, 1.042f)
                lineTo(10.939f, 12.0f)
                lineToRelative(-2.963f, 2.963f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.734f, -0.215f)
                lineTo(12.0f, 13.06f)
                lineToRelative(2.963f, 2.964f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.061f, -1.06f)
                lineTo(13.061f, 12.0f)
                lineToRelative(2.963f, -2.964f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.326f, -1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.734f, 0.215f)
                lineTo(12.0f, 10.939f)
                close()
            }
        }
        .build()
        return _xCircleFill24!!
    }

private var _xCircleFill24: ImageVector? = null
