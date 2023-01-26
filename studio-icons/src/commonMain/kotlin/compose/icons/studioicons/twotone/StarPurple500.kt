package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.StarPurple500: ImageVector
    get() {
        if (_starPurple500 != null) {
            return _starPurple500!!
        }
        _starPurple500 = Builder(name = "StarPurple500", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.89f)
                lineTo(12.94f, 12.0f)
                horizontalLineToRelative(2.82f)
                lineToRelative(-2.27f, 1.62f)
                lineToRelative(0.93f, 3.01f)
                lineTo(12.0f, 14.79f)
                lineToRelative(-2.42f, 1.84f)
                lineToRelative(0.93f, -3.01f)
                lineTo(8.24f, 12.0f)
                horizontalLineToRelative(2.82f)
                lineTo(12.0f, 8.89f)
                moveTo(12.0f, 2.0f)
                lineToRelative(-2.42f, 8.0f)
                horizontalLineTo(2.0f)
                lineToRelative(6.17f, 4.41f)
                lineTo(5.83f, 22.0f)
                lineTo(12.0f, 17.31f)
                lineTo(18.18f, 22.0f)
                lineToRelative(-2.35f, -7.59f)
                lineTo(22.0f, 10.0f)
                horizontalLineToRelative(-7.58f)
                lineTo(12.0f, 2.0f)
                lineTo(12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _starPurple500!!
    }

private var _starPurple500: ImageVector? = null
