package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Build: ImageVector
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
                lineTo(8.28f, 5.3f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(6.69f, 8.3f)
                curveToRelative(-0.39f, 0.4f, -1.02f, 0.4f, -1.41f, 0.0f)
                lineTo(1.65f, 4.67f)
                curveTo(0.48f, 7.1f, 0.89f, 10.09f, 2.9f, 12.1f)
                curveToRelative(1.86f, 1.86f, 4.58f, 2.35f, 6.89f, 1.48f)
                lineToRelative(7.96f, 7.96f)
                curveToRelative(1.03f, 1.03f, 2.69f, 1.03f, 3.71f, 0.0f)
                curveToRelative(1.03f, -1.03f, 1.03f, -2.69f, 0.0f, -3.71f)
                lineTo(13.54f, 9.9f)
                curveToRelative(0.92f, -2.34f, 0.44f, -5.1f, -1.45f, -6.99f)
                close()
            }
        }
        .build()
        return _build!!
    }

private var _build: ImageVector? = null
