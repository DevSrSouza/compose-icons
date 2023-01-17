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

public val SimpleIcons.Renault: ImageVector
    get() {
        if (_renault != null) {
            return _renault!!
        }
        _renault = Builder(name = "Renault", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.463f, 11.99f)
                lineToRelative(-4.097f, -7.692f)
                lineToRelative(-0.924f, 1.707f)
                lineToRelative(3.213f, 5.985f)
                lineToRelative(-5.483f, 10.283f)
                lineTo(4.69f, 11.99f)
                lineTo(11.096f, 0.0f)
                lineTo(9.27f, 0.0f)
                lineTo(2.882f, 11.99f)
                lineTo(9.269f, 24.0f)
                horizontalLineToRelative(1.807f)
                close()
                moveTo(21.118f, 11.99f)
                lineTo(14.711f, 0.0f)
                horizontalLineToRelative(-1.807f)
                lineTo(6.517f, 11.99f)
                lineToRelative(4.117f, 7.712f)
                lineToRelative(0.904f, -1.707f)
                lineToRelative(-3.193f, -6.005f)
                lineToRelative(5.463f, -10.263f)
                lineTo(19.29f, 11.99f)
                lineTo(12.904f, 24.0f)
                horizontalLineToRelative(1.807f)
                close()
            }
        }
        .build()
        return _renault!!
    }

private var _renault: ImageVector? = null
