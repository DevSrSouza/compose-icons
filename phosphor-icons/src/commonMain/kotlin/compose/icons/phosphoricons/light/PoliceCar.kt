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

public val LightGroup.PoliceCar: ImageVector
    get() {
        if (_policeCar != null) {
            return _policeCar!!
        }
        _policeCar = Builder(name = "PoliceCar", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 114.0f)
                lineTo(227.5f, 114.0f)
                lineToRelative(-28.0f, -48.9f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 187.4f, 58.0f)
                lineTo(68.6f, 58.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -12.1f, 7.1f)
                lineTo(28.5f, 114.0f)
                lineTo(16.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(26.0f, 126.0f)
                verticalLineToRelative(82.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(64.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(78.0f, 190.0f)
                lineTo(178.0f, 190.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 126.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(66.9f, 71.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.7f, -1.0f)
                lineTo(187.4f, 70.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.7f, 1.0f)
                lineToRelative(24.6f, 43.0f)
                lineTo(42.3f, 114.0f)
                close()
                moveTo(66.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 190.0f)
                lineTo(66.0f, 190.0f)
                close()
                moveTo(216.0f, 210.0f)
                lineTo(192.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(190.0f, 190.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 210.0f)
                close()
                moveTo(218.0f, 178.0f)
                lineTo(38.0f, 178.0f)
                lineTo(38.0f, 126.0f)
                lineTo(218.0f, 126.0f)
                close()
                moveTo(58.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(80.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(64.0f, 158.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 58.0f, 152.0f)
                close()
                moveTo(170.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(176.0f, 158.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 170.0f, 152.0f)
                close()
                moveTo(98.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(104.0f, 38.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 98.0f, 32.0f)
                close()
            }
        }
        .build()
        return _policeCar!!
    }

private var _policeCar: ImageVector? = null
