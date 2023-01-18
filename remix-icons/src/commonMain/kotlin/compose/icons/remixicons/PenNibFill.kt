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

public val RemixIcons.PenNibFill: ImageVector
    get() {
        if (_penNibFill != null) {
            return _penNibFill!!
        }
        _penNibFill = Builder(name = "PenNibFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 21.485f)
                lineToRelative(5.846f, -5.846f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-5.846f, 5.846f)
                lineToRelative(-1.06f, -1.06f)
                curveToRelative(2.827f, -3.3f, 3.888f, -6.954f, 5.302f, -13.082f)
                lineToRelative(6.364f, -0.707f)
                lineToRelative(5.657f, 5.657f)
                lineToRelative(-0.707f, 6.364f)
                curveToRelative(-6.128f, 1.414f, -9.782f, 2.475f, -13.081f, 5.303f)
                lineToRelative(-1.061f, -1.06f)
                close()
                moveTo(16.596f, 2.04f)
                lineToRelative(6.347f, 6.346f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.277f, 0.848f)
                lineToRelative(-1.474f, 0.23f)
                lineToRelative(-5.656f, -5.656f)
                lineToRelative(0.212f, -1.485f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.848f, -0.283f)
                close()
            }
        }
        .build()
        return _penNibFill!!
    }

private var _penNibFill: ImageVector? = null
