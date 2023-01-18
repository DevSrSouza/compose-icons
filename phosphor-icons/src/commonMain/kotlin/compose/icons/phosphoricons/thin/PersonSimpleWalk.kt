package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) {
            return _personSimpleWalk!!
        }
        _personSimpleWalk = Builder(name = "PersonSimpleWalk", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 152.0f, 76.0f)
                close()
                moveTo(152.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 152.0f, 28.0f)
                close()
                moveTo(212.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                curveToRelative(-33.7f, 0.0f, -50.0f, -17.5f, -64.4f, -32.9f)
                curveToRelative(-3.5f, -3.8f, -6.8f, -7.4f, -10.3f, -10.6f)
                lineToRelative(-1.1f, -0.9f)
                lineToRelative(-17.7f, 40.7f)
                lineToRelative(39.8f, 28.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 176.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(148.0f, 178.1f)
                lineToRelative(-36.8f, -26.3f)
                lineTo(75.7f, 233.6f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 72.0f, 236.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.6f, -0.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.1f, -5.3f)
                lineToRelative(37.6f, -86.3f)
                horizontalLineToRelative(0.0f)
                lineToRelative(19.4f, -44.7f)
                curveToRelative(-29.6f, -12.7f, -74.0f, 31.0f, -74.5f, 31.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, -5.6f)
                arcToRelative(176.7f, 176.7f, 0.0f, false, true, 32.8f, -25.0f)
                curveToRelative(25.2f, -14.4f, 46.2f, -15.0f, 60.7f, -1.6f)
                curveToRelative(3.7f, 3.4f, 7.2f, 7.1f, 10.8f, 11.0f)
                curveToRelative(13.9f, 15.0f, 28.3f, 30.4f, 58.5f, 30.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 144.0f)
                close()
            }
        }
        .build()
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
