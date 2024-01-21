package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BookOpenReader: ImageVector
    get() {
        if (_bookOpenReader != null) {
            return _bookOpenReader!!
        }
        _bookOpenReader = Builder(name = "BookOpenReader", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 96.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 192.0f, 0.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 160.0f, 96.0f)
                close()
                moveTo(240.0f, 248.0f)
                lineTo(240.0f, 512.0f)
                lineToRelative(-48.4f, -24.2f)
                curveToRelative(-20.9f, -10.4f, -43.5f, -17.0f, -66.8f, -19.3f)
                lineToRelative(-96.0f, -9.6f)
                curveTo(12.5f, 457.2f, 0.0f, 443.5f, 0.0f, 427.0f)
                lineTo(0.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(62.3f, 192.0f)
                curveToRelative(63.6f, 0.0f, 125.6f, 19.6f, 177.7f, 56.0f)
                close()
                moveTo(272.0f, 512.0f)
                lineTo(272.0f, 248.0f)
                curveToRelative(52.1f, -36.4f, 114.1f, -56.0f, 177.7f, -56.0f)
                lineTo(480.0f, 192.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(512.0f, 427.0f)
                curveToRelative(0.0f, 16.4f, -12.5f, 30.2f, -28.8f, 31.8f)
                lineToRelative(-96.0f, 9.6f)
                curveToRelative(-23.2f, 2.3f, -45.9f, 8.9f, -66.8f, 19.3f)
                lineTo(272.0f, 512.0f)
                close()
            }
        }
        .build()
        return _bookOpenReader!!
    }

private var _bookOpenReader: ImageVector? = null
