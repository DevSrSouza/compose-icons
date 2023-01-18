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

public val LightGroup.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) {
            return _bugBeetle!!
        }
        _bugBeetle = Builder(name = "BugBeetle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 142.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(206.0f, 130.0f)
                lineTo(206.0f, 110.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(205.7f, 98.0f)
                arcToRelative(77.1f, 77.1f, 0.0f, false, false, -20.9f, -47.3f)
                lineToRelative(19.3f, -18.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.2f, -8.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, -0.2f)
                lineTo(175.9f, 42.5f)
                arcToRelative(77.7f, 77.7f, 0.0f, false, false, -95.9f, 0.1f)
                lineTo(60.1f, 23.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, 0.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.2f, 8.4f)
                lineTo(71.1f, 50.7f)
                arcTo(77.2f, 77.2f, 0.0f, false, false, 50.3f, 98.0f)
                lineTo(32.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 110.0f)
                verticalLineToRelative(20.0f)
                lineTo(32.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 142.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(66.3f, 66.3f, 0.0f, false, false, 0.7f, 10.0f)
                lineTo(32.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(53.2f, 174.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 149.6f, 0.0f)
                lineTo(224.0f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(205.3f, 162.0f)
                arcToRelative(66.3f, 66.3f, 0.0f, false, false, 0.7f, -10.0f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, 65.7f, 60.0f)
                lineTo(62.3f, 98.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(134.0f, 217.7f)
                lineTo(134.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(81.7f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 62.0f, 152.0f)
                lineTo(62.0f, 110.0f)
                lineTo(194.0f, 110.0f)
                verticalLineToRelative(42.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 134.0f, 217.7f)
                close()
            }
        }
        .build()
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
