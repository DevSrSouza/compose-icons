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

public val RoundGroup.Replay: ImageVector
    get() {
        if (_replay != null) {
            return _replay!!
        }
        _replay = Builder(name = "Replay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                verticalLineTo(2.21f)
                curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-3.8f, 3.79f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f)
                lineToRelative(3.79f, 3.79f)
                curveToRelative(0.32f, 0.31f, 0.86f, 0.09f, 0.86f, -0.36f)
                verticalLineTo(7.0f)
                curveToRelative(3.73f, 0.0f, 6.68f, 3.42f, 5.86f, 7.29f)
                curveToRelative(-0.47f, 2.27f, -2.31f, 4.1f, -4.57f, 4.57f)
                curveToRelative(-3.57f, 0.75f, -6.75f, -1.7f, -7.23f, -5.01f)
                curveToRelative(-0.07f, -0.48f, -0.49f, -0.85f, -0.98f, -0.85f)
                curveToRelative(-0.6f, 0.0f, -1.08f, 0.53f, -1.0f, 1.13f)
                curveToRelative(0.62f, 4.39f, 4.8f, 7.64f, 9.53f, 6.72f)
                curveToRelative(3.12f, -0.61f, 5.63f, -3.12f, 6.24f, -6.24f)
                curveTo(20.84f, 9.48f, 16.94f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _replay!!
    }

private var _replay: ImageVector? = null
