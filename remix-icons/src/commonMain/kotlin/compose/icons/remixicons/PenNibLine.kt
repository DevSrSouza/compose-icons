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

public val RemixIcons.PenNibLine: ImageVector
    get() {
        if (_penNibLine != null) {
            return _penNibLine!!
        }
        _penNibLine = Builder(name = "PenNibLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.596f, 1.04f)
                lineToRelative(6.347f, 6.346f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.277f, 0.848f)
                lineToRelative(-1.474f, 0.23f)
                lineToRelative(-5.656f, -5.656f)
                lineToRelative(0.212f, -1.485f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.848f, -0.283f)
                close()
                moveTo(4.595f, 20.15f)
                curveToRelative(3.722f, -3.331f, 7.995f, -4.328f, 12.643f, -5.52f)
                lineToRelative(0.446f, -4.018f)
                lineToRelative(-4.297f, -4.297f)
                lineToRelative(-4.018f, 0.446f)
                curveToRelative(-1.192f, 4.648f, -2.189f, 8.92f, -5.52f, 12.643f)
                lineTo(2.454f, 18.01f)
                curveToRelative(2.828f, -3.3f, 3.89f, -6.953f, 5.303f, -13.081f)
                lineToRelative(6.364f, -0.707f)
                lineToRelative(5.657f, 5.657f)
                lineToRelative(-0.707f, 6.364f)
                curveToRelative(-6.128f, 1.414f, -9.782f, 2.475f, -13.081f, 5.303f)
                lineTo(4.595f, 20.15f)
                close()
                moveTo(9.879f, 14.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.828f, -2.828f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.88f, 14.12f)
                close()
            }
        }
        .build()
        return _penNibLine!!
    }

private var _penNibLine: ImageVector? = null
