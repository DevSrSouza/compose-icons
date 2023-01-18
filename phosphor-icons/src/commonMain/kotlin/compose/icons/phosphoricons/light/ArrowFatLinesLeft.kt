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

public val LightGroup.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) {
            return _arrowFatLinesLeft!!
        }
        _arrowFatLinesLeft = Builder(name = "ArrowFatLinesLeft", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 74.0f)
                lineTo(126.0f, 74.0f)
                lineTo(126.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.7f, -5.5f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -6.5f, 1.3f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 8.4f)
                lineToRelative(96.0f, 96.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 120.0f, 230.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.3f, -0.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 126.0f, 224.0f)
                lineTo(126.0f, 182.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(158.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 74.0f)
                close()
                moveTo(146.0f, 170.0f)
                lineTo(120.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(33.5f)
                lineTo(32.5f, 128.0f)
                lineTo(114.0f, 46.5f)
                lineTo(114.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(26.0f)
                close()
                moveTo(222.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(210.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(190.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(178.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
