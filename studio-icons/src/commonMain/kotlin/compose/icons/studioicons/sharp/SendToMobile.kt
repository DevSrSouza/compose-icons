package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SendToMobile: ImageVector
    get() {
        if (_sendToMobile != null) {
            return _sendToMobile!!
        }
        _sendToMobile = Builder(name = "SendToMobile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                lineToRelative(-10.0f, 0.0f)
                lineToRelative(0.0f, -12.0f)
                lineToRelative(10.0f, 0.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-14.0f, 0.0f)
                lineToRelative(0.0f, 22.0f)
                lineToRelative(14.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _sendToMobile!!
    }

private var _sendToMobile: ImageVector? = null
