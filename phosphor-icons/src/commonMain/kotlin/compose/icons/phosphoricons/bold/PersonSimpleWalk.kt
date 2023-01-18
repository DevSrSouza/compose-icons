package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) {
            return _personSimpleWalk!!
        }
        _personSimpleWalk = Builder(name = "PersonSimpleWalk", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 152.0f, 84.0f)
                close()
                moveTo(152.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 36.0f)
                close()
                moveTo(216.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                curveToRelative(-37.2f, 0.0f, -55.5f, -19.7f, -70.2f, -35.5f)
                lineToRelative(-1.4f, -1.4f)
                lineToRelative(-8.0f, 18.4f)
                lineTo(159.0f, 166.2f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 5.0f, 9.8f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(140.0f, 182.2f)
                lineToRelative(-25.4f, -18.1f)
                lineTo(83.0f, 236.8f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 72.0f, 244.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -4.8f, -1.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 61.0f, 227.2f)
                lineToRelative(37.5f, -86.4f)
                horizontalLineToRelative(0.1f)
                lineToRelative(13.7f, -31.6f)
                curveToRelative(-8.1f, -1.0f, -18.2f, 2.0f, -30.3f, 8.9f)
                arcToRelative(156.7f, 156.7f, 0.0f, false, false, -29.5f, 22.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                arcTo(187.4f, 187.4f, 0.0f, false, true, 70.0f, 97.3f)
                curveToRelative(36.1f, -20.7f, 58.1f, -11.7f, 70.1f, -0.6f)
                curveToRelative(4.0f, 3.7f, 7.7f, 7.6f, 11.2f, 11.5f)
                curveTo(164.7f, 122.5f, 177.2f, 136.0f, 204.0f, 136.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 148.0f)
                close()
            }
        }
        .build()
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
