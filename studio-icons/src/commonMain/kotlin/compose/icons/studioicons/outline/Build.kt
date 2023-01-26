package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Build: ImageVector
    get() {
        if (_build != null) {
            return _build!!
        }
        _build = Builder(name = "Build", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.61f, 18.99f)
                lineToRelative(-9.08f, -9.08f)
                curveToRelative(0.93f, -2.34f, 0.45f, -5.1f, -1.44f, -7.0f)
                curveTo(9.79f, 0.61f, 6.21f, 0.4f, 3.66f, 2.26f)
                lineTo(7.5f, 6.11f)
                lineTo(6.08f, 7.52f)
                lineTo(2.25f, 3.69f)
                curveTo(0.39f, 6.23f, 0.6f, 9.82f, 2.9f, 12.11f)
                curveToRelative(1.86f, 1.86f, 4.57f, 2.35f, 6.89f, 1.48f)
                lineToRelative(9.11f, 9.11f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(2.3f, -2.3f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.01f, 0.0f, -1.41f)
                close()
                moveTo(19.61f, 20.59f)
                lineToRelative(-9.46f, -9.46f)
                curveToRelative(-0.61f, 0.45f, -1.29f, 0.72f, -2.0f, 0.82f)
                curveToRelative(-1.36f, 0.2f, -2.79f, -0.21f, -3.83f, -1.25f)
                curveTo(3.37f, 9.76f, 2.93f, 8.5f, 3.0f, 7.26f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(-3.09f, -3.09f)
                curveToRelative(1.24f, -0.07f, 2.49f, 0.37f, 3.44f, 1.31f)
                curveToRelative(1.08f, 1.08f, 1.49f, 2.57f, 1.24f, 3.96f)
                curveToRelative(-0.12f, 0.71f, -0.42f, 1.37f, -0.88f, 1.96f)
                lineToRelative(9.45f, 9.45f)
                lineToRelative(-0.88f, 0.89f)
                close()
            }
        }
        .build()
        return _build!!
    }

private var _build: ImageVector? = null
