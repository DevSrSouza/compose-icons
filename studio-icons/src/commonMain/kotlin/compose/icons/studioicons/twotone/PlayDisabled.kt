package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.PlayDisabled: ImageVector
    get() {
        if (_playDisabled != null) {
            return _playDisabled!!
        }
        _playDisabled = Builder(name = "PlayDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.83f)
                lineToRelative(0.0f, 2.53f)
                lineToRelative(1.55f, -0.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(8.0f, 10.83f)
                verticalLineTo(19.0f)
                lineToRelative(4.99f, -3.18f)
                lineToRelative(6.78f, 6.78f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(10.0f, 15.36f)
                verticalLineToRelative(-2.53f)
                lineToRelative(1.55f, 1.55f)
                lineTo(10.0f, 15.36f)
                close()
                moveTo(19.0f, 12.0f)
                lineTo(8.0f, 5.0f)
                verticalLineToRelative(0.17f)
                lineToRelative(8.45f, 8.45f)
                lineTo(19.0f, 12.0f)
                close()
            }
        }
        .build()
        return _playDisabled!!
    }

private var _playDisabled: ImageVector? = null
