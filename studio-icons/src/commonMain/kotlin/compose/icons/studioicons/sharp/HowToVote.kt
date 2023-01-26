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

public val SharpGroup.HowToVote: ImageVector
    get() {
        if (_howToVote != null) {
            return _howToVote!!
        }
        _howToVote = Builder(name = "HowToVote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(-0.68f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineToRelative(1.91f)
                lineTo(19.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                lineToRelative(1.78f, -2.0f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(6.0f, 13.0f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(19.81f, 7.96f)
                lineTo(13.45f, 1.6f)
                lineTo(5.68f, 9.36f)
                lineToRelative(6.36f, 6.36f)
                lineToRelative(7.77f, -7.76f)
                close()
                moveTo(13.46f, 4.41f)
                lineTo(17.0f, 7.95f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(4.95f, -4.95f)
                close()
            }
        }
        .build()
        return _howToVote!!
    }

private var _howToVote: ImageVector? = null
