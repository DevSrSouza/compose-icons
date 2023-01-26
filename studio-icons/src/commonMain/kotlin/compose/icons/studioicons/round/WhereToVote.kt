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

public val RoundGroup.WhereToVote: ImageVector
    get() {
        if (_whereToVote != null) {
            return _whereToVote!!
        }
        _whereToVote = Builder(name = "WhereToVote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f)
                curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f)
                curveTo(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f)
                curveTo(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.23f, 12.66f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.83f, -2.83f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-3.54f, 3.54f)
                curveTo(11.26f, 13.05f, 10.62f, 13.05f, 10.23f, 12.66f)
                close()
            }
        }
        .build()
        return _whereToVote!!
    }

private var _whereToVote: ImageVector? = null
