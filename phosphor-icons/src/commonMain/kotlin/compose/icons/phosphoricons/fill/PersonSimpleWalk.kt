package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) {
            return _personSimpleWalk!!
        }
        _personSimpleWalk = Builder(name = "PersonSimpleWalk", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 120.0f, 48.0f)
                close()
                moveTo(208.0f, 136.0f)
                curveToRelative(-28.5f, 0.0f, -41.7f, -14.1f, -55.6f, -29.1f)
                curveToRelative(-3.5f, -3.8f, -7.2f, -7.7f, -11.0f, -11.2f)
                curveToRelative(-37.2f, -34.4f, -96.5f, 24.1f, -99.1f, 26.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, false, 11.4f, 11.4f)
                arcToRelative(157.3f, 157.3f, 0.0f, false, true, 30.5f, -23.2f)
                curveToRelative(14.3f, -8.2f, 26.3f, -11.1f, 35.7f, -8.8f)
                lineToRelative(-17.7f, 40.7f)
                horizontalLineToRelative(0.0f)
                lineTo(64.7f, 228.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.1f, 10.5f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, false, 3.2f, 0.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.3f, -4.8f)
                lineToRelative(33.6f, -77.3f)
                lineTo(144.0f, 180.1f)
                lineTo(144.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(160.0f, 176.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -3.4f, -6.5f)
                lineToRelative(-37.1f, -26.6f)
                lineToRelative(14.1f, -32.5f)
                lineToRelative(7.1f, 7.4f)
                curveTo(154.9f, 133.0f, 172.5f, 152.0f, 208.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
