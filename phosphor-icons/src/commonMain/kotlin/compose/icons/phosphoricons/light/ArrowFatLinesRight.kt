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

public val LightGroup.ArrowFatLinesRight: ImageVector
    get() {
        if (_arrowFatLinesRight != null) {
            return _arrowFatLinesRight!!
        }
        _arrowFatLinesRight = Builder(name = "ArrowFatLinesRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 123.8f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -6.5f, -1.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 130.0f, 32.0f)
                lineTo(130.0f, 74.0f)
                lineTo(104.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.7f, 5.5f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.3f, 0.5f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, 4.2f, -1.8f)
                lineToRelative(96.0f, -96.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 236.2f, 123.8f)
                close()
                moveTo(142.0f, 209.5f)
                lineTo(142.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(110.0f, 170.0f)
                lineTo(110.0f, 86.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(142.0f, 46.5f)
                lineTo(223.5f, 128.0f)
                close()
                moveTo(46.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(34.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(78.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(66.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowFatLinesRight!!
    }

private var _arrowFatLinesRight: ImageVector? = null
