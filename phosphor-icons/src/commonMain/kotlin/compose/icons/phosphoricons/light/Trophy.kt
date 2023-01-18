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

public val LightGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 66.0f)
                lineTo(206.0f, 66.0f)
                lineTo(206.0f, 56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(64.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 56.0f)
                lineTo(50.0f, 66.0f)
                lineTo(23.9f, 66.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                lineTo(9.9f, 96.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(9.2f, 30.5f, 36.2f, 53.2f, 68.6f, 55.7f)
                lineTo(122.0f, 218.0f)
                lineTo(96.0f, 218.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 218.0f)
                lineTo(134.0f, 189.8f)
                arcToRelative(77.0f, 77.0f, 0.0f, false, false, 48.9f, -22.4f)
                arcToRelative(78.7f, 78.7f, 0.0f, false, false, 20.0f, -33.4f)
                lineTo(208.0f, 134.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                lineTo(246.0f, 80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 66.0f)
                close()
                moveTo(47.9f, 122.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                lineTo(21.9f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(50.0f, 78.0f)
                verticalLineToRelative(33.1f)
                arcToRelative(78.8f, 78.8f, 0.0f, false, false, 0.8f, 10.9f)
                close()
                moveTo(174.5f, 158.8f)
                arcTo(65.6f, 65.6f, 0.0f, false, true, 128.0f, 178.0f)
                horizontalLineToRelative(-0.5f)
                curveTo(91.4f, 177.7f, 62.0f, 147.7f, 62.0f, 111.1f)
                lineTo(62.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(192.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(56.0f)
                arcTo(65.2f, 65.2f, 0.0f, false, true, 174.5f, 158.8f)
                close()
                moveTo(234.0f, 96.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, -26.0f, 26.0f)
                horizontalLineToRelative(-2.7f)
                arcToRelative(66.3f, 66.3f, 0.0f, false, false, 0.7f, -10.0f)
                lineTo(206.0f, 78.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
