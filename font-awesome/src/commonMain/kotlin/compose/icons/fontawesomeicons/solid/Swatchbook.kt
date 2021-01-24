package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Swatchbook: ImageVector
    get() {
        if (_swatchbook != null) {
            return _swatchbook!!
        }
        _swatchbook = Builder(name = "Swatchbook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(434.66f, 167.71f)
                horizontalLineToRelative(0.0f)
                lineTo(344.5f, 77.36f)
                arcToRelative(31.83f, 31.83f, 0.0f, false, false, -45.0f, -0.07f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.07f, 0.07f)
                lineTo(224.0f, 152.88f)
                lineTo(224.0f, 424.0f)
                lineTo(434.66f, 212.9f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 434.66f, 167.71f)
                close()
                moveTo(480.0f, 320.0f)
                lineTo(373.09f, 320.0f)
                lineTo(186.68f, 506.51f)
                curveToRelative(-2.06f, 2.07f, -4.5f, 3.58f, -6.68f, 5.49f)
                lineTo(480.0f, 512.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(512.0f, 352.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 480.0f, 320.0f)
                close()
                moveTo(192.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 160.0f, 0.0f)
                lineTo(32.0f, 0.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 0.0f, 32.0f)
                lineTo(0.0f, 416.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 192.0f, 0.0f)
                close()
                moveTo(96.0f, 440.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 96.0f, 440.0f)
                close()
                moveTo(128.0f, 256.0f)
                lineTo(64.0f, 256.0f)
                lineTo(64.0f, 192.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(128.0f, 128.0f)
                lineTo(64.0f, 128.0f)
                lineTo(64.0f, 64.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _swatchbook!!
    }

private var _swatchbook: ImageVector? = null
