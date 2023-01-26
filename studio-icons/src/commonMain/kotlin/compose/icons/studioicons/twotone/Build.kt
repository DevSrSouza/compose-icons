package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Build: ImageVector
    get() {
        if (_build != null) {
            return _build!!
        }
        _build = Builder(name = "Build", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.92f, 8.28f)
                curveToRelative(0.24f, -1.4f, -0.16f, -2.89f, -1.24f, -3.96f)
                curveToRelative(-0.94f, -0.95f, -2.2f, -1.39f, -3.44f, -1.32f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(-4.24f, 4.24f)
                lineTo(3.0f, 7.24f)
                curveToRelative(-0.07f, 1.24f, 0.37f, 2.49f, 1.31f, 3.44f)
                curveToRelative(1.04f, 1.04f, 2.47f, 1.45f, 3.83f, 1.25f)
                curveToRelative(0.71f, -0.1f, 1.4f, -0.38f, 2.0f, -0.82f)
                lineToRelative(9.46f, 9.46f)
                lineToRelative(0.88f, -0.88f)
                lineToRelative(-9.45f, -9.45f)
                curveToRelative(0.47f, -0.6f, 0.77f, -1.26f, 0.89f, -1.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.61f, 18.97f)
                lineTo(13.54f, 9.9f)
                curveToRelative(0.93f, -2.34f, 0.45f, -5.1f, -1.44f, -7.0f)
                curveTo(9.8f, 0.6f, 6.22f, 0.39f, 3.67f, 2.25f)
                lineTo(7.5f, 6.08f)
                lineTo(6.08f, 7.5f)
                lineTo(2.25f, 3.67f)
                curveTo(0.39f, 6.21f, 0.6f, 9.79f, 2.9f, 12.09f)
                curveToRelative(1.86f, 1.86f, 4.57f, 2.35f, 6.89f, 1.48f)
                lineToRelative(9.11f, 9.11f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(2.3f, -2.3f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.0f, -1.41f)
                close()
                moveTo(19.61f, 20.57f)
                lineToRelative(-9.46f, -9.46f)
                curveToRelative(-0.61f, 0.45f, -1.29f, 0.72f, -2.0f, 0.82f)
                curveToRelative(-1.36f, 0.2f, -2.79f, -0.21f, -3.83f, -1.25f)
                curveToRelative(-0.95f, -0.94f, -1.39f, -2.2f, -1.32f, -3.44f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(4.24f, -4.24f)
                lineTo(7.24f, 3.0f)
                curveToRelative(1.24f, -0.07f, 2.49f, 0.37f, 3.44f, 1.31f)
                curveToRelative(1.08f, 1.08f, 1.49f, 2.57f, 1.24f, 3.96f)
                curveToRelative(-0.12f, 0.7f, -0.42f, 1.36f, -0.88f, 1.95f)
                lineToRelative(9.45f, 9.45f)
                lineToRelative(-0.88f, 0.9f)
                close()
            }
        }
        .build()
        return _build!!
    }

private var _build: ImageVector? = null
