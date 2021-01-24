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

public val SolidGroup.Voicemail: ImageVector
    get() {
        if (_voicemail != null) {
            return _voicemail!!
        }
        _voicemail = Builder(name = "Voicemail", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 128.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, false, false, -119.74f, 224.0f)
                lineTo(263.74f, 352.0f)
                arcTo(144.0f, 144.0f, 0.0f, true, false, 144.0f, 416.0f)
                horizontalLineToRelative(352.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, false, false, 0.0f, -288.0f)
                close()
                moveTo(64.0f, 272.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 80.0f, 80.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, -80.0f)
                close()
                moveTo(496.0f, 352.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 80.0f, -80.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
