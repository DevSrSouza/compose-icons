package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Statuspage: ImageVector
    get() {
        if (_statuspage != null) {
            return _statuspage!!
        }
        _statuspage = Builder(name = "Statuspage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.008f, 9.597f)
                arcToRelative(5.623f, 5.623f, 0.0f, true, true, 0.0f, 11.245f)
                arcToRelative(5.623f, 5.623f, 0.0f, false, true, 0.0f, -11.245f)
                close()
                moveTo(0.154f, 8.717f)
                lineToRelative(3.02f, 3.574f)
                arcToRelative(0.639f, 0.639f, 0.0f, false, false, 0.913f, 0.068f)
                curveToRelative(4.885f, -4.379f, 10.97f, -4.379f, 15.84f, 0.0f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, false, 0.916f, -0.068f)
                lineToRelative(3.006f, -3.574f)
                arcToRelative(0.646f, 0.646f, 0.0f, false, false, -0.075f, -0.906f)
                curveToRelative(-7.1f, -6.204f, -16.462f, -6.204f, -23.555f, 0.0f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.065f, 0.906f)
                close()
            }
        }
        .build()
        return _statuspage!!
    }

private var _statuspage: ImageVector? = null
