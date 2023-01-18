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

public val LightGroup.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 42.3f)
                lineTo(166.0f, 32.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(112.0f, 10.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 90.0f, 32.0f)
                lineTo(90.0f, 42.3f)
                arcTo(54.1f, 54.1f, 0.0f, false, false, 42.0f, 96.0f)
                lineTo(42.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 96.0f)
                arcTo(54.1f, 54.1f, 0.0f, false, false, 166.0f, 42.3f)
                close()
                moveTo(112.0f, 22.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                lineTo(154.0f, 42.0f)
                lineTo(102.0f, 42.0f)
                lineTo(102.0f, 32.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 112.0f, 22.0f)
                close()
                moveTo(170.0f, 162.0f)
                lineTo(86.0f, 162.0f)
                lineTo(86.0f, 152.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(86.0f, 174.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(150.0f, 174.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(44.0f)
                lineTo(86.0f, 218.0f)
                close()
                moveTo(202.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(182.0f, 218.0f)
                lineTo(182.0f, 152.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(96.0f, 130.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -22.0f, 22.0f)
                verticalLineToRelative(66.0f)
                lineTo(56.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 96.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 96.0f, 54.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f)
                close()
                moveTo(150.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(112.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 150.0f, 88.0f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
