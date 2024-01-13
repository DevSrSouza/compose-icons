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

public val SolidGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, false, 224.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 0.0f, 256.0f)
                close()
                moveTo(178.3f, 304.0f)
                curveTo(79.8f, 304.0f, 0.0f, 383.8f, 0.0f, 482.3f)
                curveTo(0.0f, 498.7f, 13.3f, 512.0f, 29.7f, 512.0f)
                lineTo(418.3f, 512.0f)
                curveToRelative(16.4f, 0.0f, 29.7f, -13.3f, 29.7f, -29.7f)
                curveTo(448.0f, 383.8f, 368.2f, 304.0f, 269.7f, 304.0f)
                lineTo(178.3f, 304.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
