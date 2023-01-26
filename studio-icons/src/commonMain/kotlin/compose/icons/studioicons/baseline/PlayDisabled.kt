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

public val BaselineGroup.PlayDisabled: ImageVector
    get() {
        if (_playDisabled != null) {
            return _playDisabled!!
        }
        _playDisabled = Builder(name = "PlayDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.19f)
                lineTo(8.0f, 5.0f)
                lineToRelative(11.0f, 7.0f)
                lineToRelative(-2.55f, 1.63f)
                lineTo(8.0f, 5.19f)
                close()
                moveTo(20.0f, 19.73f)
                lineToRelative(-5.11f, -5.11f)
                lineTo(8.0f, 7.73f)
                lineTo(4.27f, 4.0f)
                lineTo(3.0f, 5.27f)
                lineToRelative(5.0f, 5.0f)
                lineTo(8.0f, 19.0f)
                lineToRelative(5.33f, -3.4f)
                lineToRelative(5.4f, 5.4f)
                lineTo(20.0f, 19.73f)
                close()
            }
        }
        .build()
        return _playDisabled!!
    }

private var _playDisabled: ImageVector? = null
