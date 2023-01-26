package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Build: ImageVector
    get() {
        if (_build != null) {
            return _build!!
        }
        _build = Builder(name = "Build", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.09f, 2.91f)
                curveTo(10.08f, 0.9f, 7.07f, 0.49f, 4.65f, 1.67f)
                lineToRelative(4.34f, 4.34f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-4.34f, -4.34f)
                curveTo(0.48f, 7.1f, 0.89f, 10.09f, 2.9f, 12.1f)
                curveToRelative(1.86f, 1.86f, 4.58f, 2.35f, 6.89f, 1.48f)
                lineToRelative(9.82f, 9.82f)
                lineToRelative(3.71f, -3.71f)
                lineToRelative(-9.78f, -9.79f)
                curveToRelative(0.92f, -2.34f, 0.44f, -5.1f, -1.45f, -6.99f)
                close()
            }
        }
        .build()
        return _build!!
    }

private var _build: ImageVector? = null
