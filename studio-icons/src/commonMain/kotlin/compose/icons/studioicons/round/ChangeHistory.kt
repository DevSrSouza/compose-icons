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

public val RoundGroup.ChangeHistory: ImageVector
    get() {
        if (_changeHistory != null) {
            return _changeHistory!!
        }
        _changeHistory = Builder(name = "ChangeHistory", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.77f)
                lineTo(18.39f, 18.0f)
                horizontalLineTo(5.61f)
                lineTo(12.0f, 7.77f)
                moveToRelative(-0.85f, -2.41f)
                lineToRelative(-8.2f, 13.11f)
                curveToRelative(-0.41f, 0.67f, 0.07f, 1.53f, 0.85f, 1.53f)
                horizontalLineToRelative(16.4f)
                curveToRelative(0.79f, 0.0f, 1.26f, -0.86f, 0.85f, -1.53f)
                lineToRelative(-8.2f, -13.11f)
                curveToRelative(-0.39f, -0.63f, -1.31f, -0.63f, -1.7f, 0.0f)
                close()
            }
        }
        .build()
        return _changeHistory!!
    }

private var _changeHistory: ImageVector? = null
