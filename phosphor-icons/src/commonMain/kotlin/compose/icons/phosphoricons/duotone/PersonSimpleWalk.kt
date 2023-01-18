package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) {
            return _personSimpleWalk!!
        }
        _personSimpleWalk = Builder(name = "PersonSimpleWalk", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 176.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 152.0f, 80.0f)
                close()
                moveTo(152.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 32.0f)
                close()
                moveTo(216.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                curveToRelative(-35.5f, 0.0f, -53.1f, -19.0f, -67.3f, -34.2f)
                lineToRelative(-7.1f, -7.4f)
                lineToRelative(-14.1f, 32.5f)
                lineToRelative(37.1f, 26.6f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 160.0f, 176.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(144.0f, 180.1f)
                lineToRelative(-31.1f, -22.2f)
                lineTo(79.3f, 235.2f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 72.0f, 240.0f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, true, -3.2f, -0.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.1f, -10.5f)
                lineToRelative(37.5f, -86.3f)
                horizontalLineToRelative(0.0f)
                lineToRelative(17.7f, -40.7f)
                curveToRelative(-9.4f, -2.3f, -21.4f, 0.6f, -35.7f, 8.8f)
                arcToRelative(157.3f, 157.3f, 0.0f, false, false, -30.5f, 23.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, true, -11.4f, -11.4f)
                curveToRelative(2.6f, -2.5f, 61.9f, -61.0f, 99.1f, -26.6f)
                curveToRelative(3.8f, 3.5f, 7.5f, 7.4f, 11.0f, 11.2f)
                curveToRelative(13.9f, 15.0f, 27.1f, 29.1f, 55.6f, 29.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 144.0f)
                close()
            }
        }
        .build()
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
