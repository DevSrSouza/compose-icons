package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.8f, 102.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 238.0f, 88.8f)
                lineTo(238.0f, 64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(32.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 64.0f)
                lineTo(18.0f, 88.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.2f, 13.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 51.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 167.2f)
                lineTo(18.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(224.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 167.2f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -11.2f, -13.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, -51.0f)
                close()
                moveTo(30.0f, 192.0f)
                lineTo(30.0f, 167.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.6f, -2.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, -74.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.6f, -2.0f)
                lineTo(30.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(90.0f, 62.0f)
                lineTo(90.0f, 194.0f)
                lineTo(32.0f, 194.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 192.0f)
                close()
                moveTo(224.4f, 165.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.6f, 2.0f)
                lineTo(226.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(102.0f, 194.0f)
                lineTo(102.0f, 62.0f)
                lineTo(224.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(226.0f, 88.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.6f, 2.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, 74.4f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
