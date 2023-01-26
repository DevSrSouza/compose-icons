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

public val SharpGroup.BorderColor: ImageVector
    get() {
        if (_borderColor != null) {
            return _borderColor!!
        }
        _borderColor = Builder(name = "BorderColor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 24.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(24.0f)
                close()
                moveTo(13.06f, 5.19f)
                lineToRelative(3.75f, 3.75f)
                lineTo(7.75f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-3.75f)
                lineTo(13.06f, 5.19f)
                close()
                moveTo(17.88f, 7.87f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(2.53f, -2.54f)
                lineToRelative(3.75f, 3.75f)
                lineTo(17.88f, 7.87f)
                close()
            }
        }
        .build()
        return _borderColor!!
    }

private var _borderColor: ImageVector? = null
