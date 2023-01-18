package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) {
            return _arrowsOutCardinal!!
        }
        _arrowsOutCardinal = Builder(name = "ArrowsOutCardinal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.7f, 200.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -1.8f, 8.7f)
                lineToRelative(-28.2f, 28.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(94.1f, 209.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.6f, -13.7f)
                lineTo(120.0f, 195.7f)
                lineTo(120.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(35.7f)
                horizontalLineToRelative(20.3f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 163.7f, 200.7f)
                close()
                moveTo(99.7f, 60.3f)
                lineTo(120.0f, 60.3f)
                lineTo(120.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 60.3f)
                horizontalLineToRelative(20.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, -13.7f)
                lineTo(133.7f, 18.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -11.4f, 0.0f)
                lineTo(94.1f, 46.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, 13.7f)
                close()
                moveTo(96.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(60.3f, 120.0f)
                lineTo(60.3f, 99.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.7f, -5.6f)
                lineTo(18.3f, 122.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                lineToRelative(28.3f, 28.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, 2.4f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 3.0f, -0.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.0f, -7.4f)
                lineTo(60.3f, 136.0f)
                close()
                moveTo(237.7f, 122.3f)
                lineTo(209.4f, 94.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.7f, 5.6f)
                lineTo(195.7f, 120.0f)
                lineTo(160.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(35.7f)
                verticalLineToRelative(20.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.0f, 7.4f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 3.0f, 0.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, -2.4f)
                lineToRelative(28.3f, -28.2f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 237.7f, 122.3f)
                close()
            }
        }
        .build()
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
