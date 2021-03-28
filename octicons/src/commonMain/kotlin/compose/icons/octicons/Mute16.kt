package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Mute16: ImageVector
    get() {
        if (_mute16 != null) {
            return _mute16!!
        }
        _mute16 = Builder(name = "Mute16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.238f, -0.57f)
                lineTo(3.472f, 5.0f)
                lineTo(1.75f, 5.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 6.75f)
                verticalLineToRelative(2.5f)
                curveTo(0.0f, 10.216f, 0.784f, 11.0f, 1.75f, 11.0f)
                horizontalLineToRelative(1.723f)
                lineToRelative(3.289f, 2.82f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 8.0f, 13.25f)
                lineTo(8.0f, 2.75f)
                close()
                moveTo(4.238f, 6.32f)
                lineTo(6.5f, 4.38f)
                verticalLineToRelative(7.24f)
                lineTo(4.238f, 9.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.488f, -0.18f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.488f, -0.18f)
                close()
                moveTo(11.28f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(11.94f, 8.0f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineTo(13.0f, 9.06f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(14.06f, 8.0f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineTo(13.0f, 6.94f)
                lineToRelative(-1.72f, -1.72f)
                close()
            }
        }
        .build()
        return _mute16!!
    }

private var _mute16: ImageVector? = null
