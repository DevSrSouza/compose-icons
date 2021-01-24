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

public val SolidGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(290.74f, 93.24f)
                lineToRelative(128.02f, 128.02f)
                lineToRelative(-277.99f, 277.99f)
                lineToRelative(-114.14f, 12.6f)
                curveTo(11.35f, 513.54f, -1.56f, 500.62f, 0.14f, 485.34f)
                lineToRelative(12.7f, -114.22f)
                lineToRelative(277.9f, -277.88f)
                close()
                moveTo(497.94f, 74.18f)
                lineToRelative(-60.11f, -60.11f)
                curveToRelative(-18.75f, -18.75f, -49.16f, -18.75f, -67.91f, 0.0f)
                lineToRelative(-56.55f, 56.55f)
                lineToRelative(128.02f, 128.02f)
                lineToRelative(56.55f, -56.55f)
                curveToRelative(18.75f, -18.76f, 18.75f, -49.16f, 0.0f, -67.91f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
