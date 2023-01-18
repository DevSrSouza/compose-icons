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

public val LightGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.1f, 120.0f)
                verticalLineToRelative(-0.9f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.1f, -0.5f)
                verticalLineToRelative(-0.2f)
                curveToRelative(-0.1f, -0.2f, -0.1f, -0.4f, -0.2f, -0.5f)
                horizontalLineToRelative(-0.1f)
                lineTo(231.7f, 82.8f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -13.0f, -8.8f)
                lineTo(182.1f, 74.0f)
                lineTo(182.1f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(24.1f, 58.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                lineTo(10.1f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(38.7f, 198.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f)
                horizontalLineToRelative(61.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f)
                horizontalLineToRelative(14.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(246.1f, 120.0f)
                close()
                moveTo(218.7f, 86.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 1.9f, 1.3f)
                lineTo(231.2f, 114.0f)
                lineTo(182.1f, 114.0f)
                lineTo(182.1f, 86.0f)
                close()
                moveTo(24.1f, 70.0f)
                horizontalLineToRelative(146.0f)
                verticalLineToRelative(68.0f)
                lineTo(22.1f, 138.0f)
                lineTo(22.1f, 72.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 24.1f, 70.0f)
                close()
                moveTo(22.1f, 184.0f)
                lineTo(22.1f, 150.0f)
                horizontalLineToRelative(148.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(30.3f, 30.3f, 0.0f, false, false, -11.4f, 18.0f)
                lineTo(97.5f, 186.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f)
                lineTo(24.1f, 186.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.1f, 184.0f)
                close()
                moveTo(68.1f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 68.1f, 210.0f)
                close()
                moveTo(188.1f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 188.1f, 210.0f)
                close()
                moveTo(234.1f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(217.5f, 186.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -29.4f, -24.0f)
                arcToRelative(30.5f, 30.5f, 0.0f, false, false, -6.0f, 0.6f)
                lineTo(182.1f, 126.0f)
                horizontalLineToRelative(52.0f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
