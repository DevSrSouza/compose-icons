package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PlayDisabled: ImageVector
    get() {
        if (_playDisabled != null) {
            return _playDisabled!!
        }
        _playDisabled = Builder(name = "PlayDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.45f, 13.62f)
                lineToRelative(2.55f, -1.62f)
                lineToRelative(-11.0f, -7.0f)
                lineToRelative(0.0f, 0.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineToRelative(-1.42f, 1.41f)
                lineToRelative(6.61f, 6.61f)
                lineToRelative(0.0f, 8.17f)
                lineToRelative(4.99f, -3.18f)
                lineToRelative(6.79f, 6.79f)
                lineToRelative(1.41f, -1.42f)
                close()
            }
        }
        .build()
        return _playDisabled!!
    }

private var _playDisabled: ImageVector? = null
