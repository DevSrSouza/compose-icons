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

public val LightGroup.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) {
            return _personSimpleWalk!!
        }
        _personSimpleWalk = Builder(name = "PersonSimpleWalk", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 78.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 152.0f, 78.0f)
                close()
                moveTo(152.0f, 30.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 152.0f, 30.0f)
                close()
                moveTo(214.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                curveToRelative(-34.6f, 0.0f, -51.2f, -17.8f, -65.8f, -33.6f)
                curveToRelative(-3.2f, -3.3f, -6.2f, -6.6f, -9.3f, -9.5f)
                lineTo(117.0f, 143.6f)
                lineToRelative(38.5f, 27.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 176.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(146.0f, 179.1f)
                lineToRelative(-33.9f, -24.2f)
                lineTo(77.5f, 234.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 72.0f, 238.0f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, -2.4f, -0.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -3.1f, -7.9f)
                lineTo(104.0f, 143.3f)
                horizontalLineToRelative(0.1f)
                lineToRelative(18.6f, -42.8f)
                curveToRelative(-10.3f, -3.5f, -23.6f, -0.7f, -39.5f, 8.4f)
                reflectiveCurveToRelative(-30.8f, 23.3f, -31.0f, 23.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, -8.4f)
                curveToRelative(2.4f, -2.5f, 60.4f, -59.7f, 96.3f, -26.7f)
                curveToRelative(3.7f, 3.5f, 7.4f, 7.4f, 10.9f, 11.2f)
                curveToRelative(13.6f, 14.6f, 27.6f, 29.7f, 57.0f, 29.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 144.0f)
                close()
            }
        }
        .build()
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
