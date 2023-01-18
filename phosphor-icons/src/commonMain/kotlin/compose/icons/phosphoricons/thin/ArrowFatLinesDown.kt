package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) {
            return _arrowFatLinesDown!!
        }
        _arrowFatLinesDown = Builder(name = "ArrowFatLinesDown", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.7f, 134.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 132.0f)
                lineTo(180.0f, 132.0f)
                lineTo(180.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(80.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(28.0f)
                lineTo(32.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.7f, 2.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.9f, 4.3f)
                lineToRelative(96.0f, 96.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 227.7f, 134.5f)
                close()
                moveTo(128.0f, 226.3f)
                lineTo(41.7f, 140.0f)
                lineTo(80.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(84.0f, 108.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(38.3f)
                close()
                moveTo(76.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(80.0f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 76.0f, 40.0f)
                close()
                moveTo(76.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(80.0f, 76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 76.0f, 72.0f)
                close()
            }
        }
        .build()
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null
