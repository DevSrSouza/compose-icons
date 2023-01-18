package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SubwayWifiLine: ImageVector
    get() {
        if (_subwayWifiLine != null) {
            return _subwayWifiLine!!
        }
        _subwayWifiLine = Builder(name = "SubwayWifiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(1.8f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(-0.5f)
                lineTo(6.8f, 20.0f)
                lineTo(5.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(3.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(19.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(7.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(16.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(11.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(18.5f, 1.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, -9.0f)
                close()
                moveTo(18.5f, 6.167f)
                curveToRelative(-0.491f, 0.0f, -0.94f, 0.177f, -1.289f, 0.47f)
                lineToRelative(-0.125f, 0.115f)
                lineTo(18.5f, 8.167f)
                lineToRelative(1.413f, -1.416f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, -1.413f, -0.584f)
                close()
                moveTo(18.5f, 3.5f)
                arcToRelative(4.65f, 4.65f, 0.0f, false, false, -3.128f, 1.203f)
                lineToRelative(-0.173f, 0.165f)
                lineToRelative(0.944f, 0.942f)
                arcToRelative(3.323f, 3.323f, 0.0f, false, true, 2.357f, -0.977f)
                arcToRelative(3.32f, 3.32f, 0.0f, false, true, 2.201f, 0.83f)
                lineToRelative(0.156f, 0.147f)
                lineToRelative(0.943f, -0.943f)
                arcTo(4.652f, 4.652f, 0.0f, false, false, 18.5f, 3.5f)
                close()
            }
        }
        .build()
        return _subwayWifiLine!!
    }

private var _subwayWifiLine: ImageVector? = null
