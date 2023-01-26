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

public val RoundGroup.LocalDining: ImageVector
    get() {
        if (_localDining != null) {
            return _localDining!!
        }
        _localDining = Builder(name = "LocalDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1f, 13.34f)
                lineToRelative(2.83f, -2.83f)
                lineToRelative(-6.19f, -6.18f)
                curveToRelative(-0.48f, -0.48f, -1.31f, -0.35f, -1.61f, 0.27f)
                curveToRelative(-0.71f, 1.49f, -0.45f, 3.32f, 0.78f, 4.56f)
                lineToRelative(4.19f, 4.18f)
                close()
                moveTo(14.88f, 11.53f)
                curveToRelative(1.53f, 0.71f, 3.68f, 0.21f, 5.27f, -1.38f)
                curveToRelative(1.91f, -1.91f, 2.28f, -4.65f, 0.81f, -6.12f)
                curveToRelative(-1.46f, -1.46f, -4.2f, -1.1f, -6.12f, 0.81f)
                curveToRelative(-1.59f, 1.59f, -2.09f, 3.74f, -1.38f, 5.27f)
                lineToRelative(-9.05f, 9.05f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineTo(12.0f, 14.41f)
                lineToRelative(6.18f, 6.18f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(13.41f, 13.0f)
                lineToRelative(1.47f, -1.47f)
                close()
            }
        }
        .build()
        return _localDining!!
    }

private var _localDining: ImageVector? = null
