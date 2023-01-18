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

public val BoldGroup.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) {
            return _arrowFatLinesLeft!!
        }
        _arrowFatLinesLeft = Builder(name = "ArrowFatLinesLeft", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 68.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(132.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.4f, -11.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -13.1f, 2.6f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(96.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 120.0f, 236.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 4.6f, -0.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 132.0f, 224.0f)
                lineTo(132.0f, 188.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(152.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 68.0f)
                close()
                moveTo(128.0f, 164.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(19.0f)
                lineTo(41.0f, 128.0f)
                lineToRelative(67.0f, -67.0f)
                lineTo(108.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(224.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(200.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(188.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(164.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
