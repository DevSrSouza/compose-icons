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

public val LightGroup.FirstAidKit: ImageVector
    get() {
        if (_firstAidKit != null) {
            return _firstAidKit!!
        }
        _firstAidKit = Builder(name = "FirstAidKit", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(134.0f, 150.0f)
                verticalLineToRelative(22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 150.0f)
                lineTo(100.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(22.0f)
                lineTo(122.0f, 116.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(22.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 162.0f, 144.0f)
                close()
                moveTo(230.0f, 80.0f)
                lineTo(230.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(40.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 66.0f)
                lineTo(82.0f, 66.0f)
                lineTo(82.0f, 56.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, 22.0f, -22.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, 22.0f, 22.0f)
                lineTo(174.0f, 66.0f)
                horizontalLineToRelative(42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 80.0f)
                close()
                moveTo(94.0f, 66.0f)
                horizontalLineToRelative(68.0f)
                lineTo(162.0f, 56.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(104.0f, 46.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 94.0f, 56.0f)
                close()
                moveTo(218.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 78.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(216.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _firstAidKit!!
    }

private var _firstAidKit: ImageVector? = null
