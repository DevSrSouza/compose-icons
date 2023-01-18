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

public val LightGroup.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 90.0f)
                lineTo(225.2f, 90.0f)
                lineToRelative(-6.3f, -44.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -13.8f, -12.0f)
                lineTo(50.9f, 34.0f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 37.1f, 46.0f)
                lineTo(30.8f, 90.0f)
                lineTo(16.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(30.0f, 102.0f)
                lineTo(30.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(68.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(82.0f, 182.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(226.0f, 102.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(49.0f, 47.7f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 50.9f, 46.0f)
                lineTo(205.1f, 46.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.9f, 1.7f)
                lineTo(213.1f, 90.0f)
                lineTo(42.9f, 90.0f)
                close()
                moveTo(70.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(44.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(42.0f, 182.0f)
                lineTo(70.0f, 182.0f)
                close()
                moveTo(212.0f, 210.0f)
                lineTo(188.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(186.0f, 182.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(26.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 212.0f, 210.0f)
                close()
                moveTo(214.0f, 170.0f)
                lineTo(150.0f, 170.0f)
                lineTo(150.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(42.0f)
                lineTo(118.0f, 170.0f)
                lineTo(118.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(42.0f)
                lineTo(42.0f, 170.0f)
                lineTo(42.0f, 102.0f)
                lineTo(214.0f, 102.0f)
                close()
                moveTo(62.0f, 132.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 62.0f, 132.0f)
                close()
                moveTo(174.0f, 132.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 132.0f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null
