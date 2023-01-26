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

public val RoundGroup.NearMe: ImageVector
    get() {
        if (_nearMe != null) {
            return _nearMe!!
        }
        _nearMe = Builder(name = "NearMe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 3.94f)
                lineTo(4.07f, 10.08f)
                curveToRelative(-0.83f, 0.35f, -0.81f, 1.53f, 0.02f, 1.85f)
                lineTo(9.43f, 14.0f)
                curveToRelative(0.26f, 0.1f, 0.47f, 0.31f, 0.57f, 0.57f)
                lineToRelative(2.06f, 5.33f)
                curveToRelative(0.32f, 0.84f, 1.51f, 0.86f, 1.86f, 0.03f)
                lineToRelative(6.15f, -14.67f)
                curveToRelative(0.33f, -0.83f, -0.5f, -1.66f, -1.32f, -1.32f)
                close()
            }
        }
        .build()
        return _nearMe!!
    }

private var _nearMe: ImageVector? = null
