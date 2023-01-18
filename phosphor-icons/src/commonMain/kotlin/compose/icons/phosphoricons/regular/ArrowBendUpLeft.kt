package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) {
            return _arrowBendUpLeft!!
        }
        _arrowBendUpLeft = Builder(name = "ArrowBendUpLeft", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, -88.0f)
                horizontalLineTo(51.3f)
                lineToRelative(34.4f, 34.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 85.7f, 61.7f)
                lineTo(51.3f, 96.0f)
                horizontalLineTo(128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, true, 232.0f, 200.0f)
                close()
            }
        }
        .build()
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
