package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.HowToVote: ImageVector
    get() {
        if (_howToVote != null) {
            return _howToVote!!
        }
        _howToVote = Builder(name = "HowToVote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.18f)
                lineToRelative(-1.5f, 1.64f)
                lineToRelative(2.0f, 2.18f)
                horizontalLineToRelative(-13.0f)
                lineToRelative(2.0f, -2.18f)
                lineTo(6.0f, 12.18f)
                lineToRelative(-3.0f, 3.27f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.54f)
                lineTo(18.0f, 12.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.59f, 14.42f)
                curveToRelative(0.78f, 0.79f, 2.05f, 0.8f, 2.84f, 0.01f)
                lineToRelative(4.98f, -4.98f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(-3.54f, -3.53f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineTo(7.09f, 8.04f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.03f, -0.01f, 2.82f)
                lineTo(10.59f, 14.42f)
                close()
                moveTo(13.46f, 4.5f)
                lineToRelative(3.53f, 3.53f)
                lineToRelative(-4.94f, 4.94f)
                lineTo(8.52f, 9.44f)
                lineTo(13.46f, 4.5f)
                close()
            }
        }
        .build()
        return _howToVote!!
    }

private var _howToVote: ImageVector? = null
