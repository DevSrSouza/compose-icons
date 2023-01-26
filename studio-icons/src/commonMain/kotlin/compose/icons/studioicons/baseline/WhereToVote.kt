package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.WhereToVote: ImageVector
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
                curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                curveToRelative(0.0f, 5.25f, -7.0f, 13.0f, -7.0f, 13.0f)
                reflectiveCurveTo(5.0f, 14.25f, 5.0f, 9.0f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                close()
                moveTo(10.47f, 14.0f)
                lineTo(17.0f, 7.41f)
                lineTo(15.6f, 6.0f)
                lineToRelative(-5.13f, 5.18f)
                lineTo(8.4f, 9.09f)
                lineTo(7.0f, 10.5f)
                lineToRelative(3.47f, 3.5f)
                close()
            }
        }
        .build()
        return _whereToVote!!
    }

private var _whereToVote: ImageVector? = null
