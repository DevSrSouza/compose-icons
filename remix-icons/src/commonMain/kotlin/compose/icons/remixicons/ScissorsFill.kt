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

public val RemixIcons.ScissorsFill: ImageVector
    get() {
        if (_scissorsFill != null) {
            return _scissorsFill!!
        }
        _scissorsFill = Builder(name = "ScissorsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.683f, 7.562f)
                lineTo(12.0f, 9.88f)
                lineToRelative(6.374f, -6.375f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.829f, 0.0f)
                lineToRelative(0.707f, 0.707f)
                lineTo(9.683f, 16.438f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.121f, -2.121f)
                lineTo(9.88f, 12.0f)
                lineTo(7.562f, 9.683f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.121f, -2.121f)
                close()
                moveTo(6.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(6.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(15.535f, 13.413f)
                lineToRelative(6.375f, 6.376f)
                lineToRelative(-0.707f, 0.707f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.829f, 0.0f)
                lineToRelative(-4.96f, -4.961f)
                lineToRelative(2.12f, -2.122f)
                close()
            }
        }
        .build()
        return _scissorsFill!!
    }

private var _scissorsFill: ImageVector? = null
