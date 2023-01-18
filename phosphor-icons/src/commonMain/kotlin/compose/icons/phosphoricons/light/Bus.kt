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

public val LightGroup.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 34.0f)
                lineTo(66.0f, 34.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 36.0f, 64.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(74.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(88.0f, 198.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(220.0f, 64.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 190.0f, 34.0f)
                close()
                moveTo(48.0f, 186.0f)
                lineTo(48.0f, 126.0f)
                lineTo(208.0f, 126.0f)
                verticalLineToRelative(60.0f)
                close()
                moveTo(48.0f, 78.0f)
                lineTo(208.0f, 78.0f)
                verticalLineToRelative(36.0f)
                lineTo(48.0f, 114.0f)
                close()
                moveTo(66.0f, 46.0f)
                lineTo(190.0f, 46.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(48.0f, 66.0f)
                lineTo(48.0f, 64.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 66.0f, 46.0f)
                close()
                moveTo(76.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(50.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(48.0f, 198.0f)
                lineTo(76.0f, 198.0f)
                close()
                moveTo(206.0f, 218.0f)
                lineTo(182.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(180.0f, 198.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 206.0f, 218.0f)
                close()
                moveTo(94.0f, 156.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 156.0f)
                close()
                moveTo(182.0f, 156.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 182.0f, 156.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null
