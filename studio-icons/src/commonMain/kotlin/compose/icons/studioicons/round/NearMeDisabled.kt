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

public val RoundGroup.NearMeDisabled: ImageVector
    get() {
        if (_nearMeDisabled != null) {
            return _nearMeDisabled!!
        }
        _nearMeDisabled = Builder(name = "NearMeDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.34f)
                lineToRelative(6.95f, -2.58f)
                curveToRelative(0.8f, -0.3f, 1.58f, 0.48f, 1.29f, 1.29f)
                lineTo(17.66f, 12.0f)
                lineTo(12.0f, 6.34f)
                close()
                moveTo(21.9f, 19.07f)
                lineTo(4.93f, 2.1f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(4.36f, 4.36f)
                lineToRelative(-4.2f, 1.56f)
                curveTo(3.27f, 9.59f, 3.0f, 9.97f, 3.0f, 10.4f)
                curveToRelative(0.0f, 0.42f, 0.26f, 0.8f, 0.65f, 0.96f)
                lineToRelative(6.42f, 2.57f)
                lineToRelative(2.57f, 6.42f)
                curveTo(12.8f, 20.74f, 13.18f, 21.0f, 13.6f, 21.0f)
                curveToRelative(0.43f, 0.0f, 0.82f, -0.27f, 0.97f, -0.67f)
                lineToRelative(1.56f, -4.2f)
                lineToRelative(4.36f, 4.36f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveTo(22.29f, 20.09f, 22.29f, 19.46f, 21.9f, 19.07f)
                close()
            }
        }
        .build()
        return _nearMeDisabled!!
    }

private var _nearMeDisabled: ImageVector? = null
