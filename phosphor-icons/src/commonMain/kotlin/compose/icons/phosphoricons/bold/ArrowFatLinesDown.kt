package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) {
            return _arrowFatLinesDown!!
        }
        _arrowFatLinesDown = Builder(name = "ArrowFatLinesDown", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.1f, 131.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 124.0f)
                lineTo(188.0f, 124.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(80.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(8.0f)
                lineTo(32.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.1f, 7.4f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 2.6f, 13.1f)
                lineToRelative(96.0f, 96.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 235.1f, 131.4f)
                close()
                moveTo(128.0f, 215.0f)
                lineTo(61.0f, 148.0f)
                lineTo(80.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(68.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(80.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 44.0f)
                close()
                moveTo(68.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 68.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(80.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 80.0f)
                close()
            }
        }
        .build()
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null
