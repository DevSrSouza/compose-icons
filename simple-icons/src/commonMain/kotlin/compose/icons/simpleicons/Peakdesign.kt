package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Peakdesign: ImageVector
    get() {
        if (_peakdesign != null) {
            return _peakdesign!!
        }
        _peakdesign = Builder(name = "Peakdesign", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.523f)
                lineToRelative(-9.446f, 6.493f)
                lineToRelative(-4.74f, -3.271f)
                lineToRelative(4.723f, -3.255f)
                lineToRelative(3.738f, 2.57f)
                lineToRelative(3.705f, -2.537f)
                close()
                moveTo(17.257f, 13.778f)
                lineTo(14.537f, 11.892f)
                lineTo(11.833f, 13.745f)
                lineTo(14.57f, 15.614f)
                close()
                moveTo(9.463f, 13.494f)
                lineTo(5.725f, 10.924f)
                lineTo(2.019f, 13.478f)
                horizontalLineToRelative(-2.019f)
                lineToRelative(9.43f, -6.493f)
                lineToRelative(4.756f, 3.255f)
                close()
                moveTo(6.726f, 10.24f)
                lineTo(9.463f, 12.109f)
                lineTo(12.167f, 10.24f)
                lineTo(9.43f, 8.37f)
                close()
            }
        }
        .build()
        return _peakdesign!!
    }

private var _peakdesign: ImageVector? = null
