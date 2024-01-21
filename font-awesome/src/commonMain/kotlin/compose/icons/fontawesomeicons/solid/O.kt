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

public val SolidGroup.O: ImageVector
    get() {
        if (_o != null) {
            return _o!!
        }
        _o = Builder(name = "O", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, false, 0.0f, 320.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, false, 0.0f, -320.0f)
                close()
                moveTo(448.0f, 256.0f)
                arcTo(224.0f, 224.0f, 0.0f, true, true, 0.0f, 256.0f)
                arcToRelative(224.0f, 224.0f, 0.0f, true, true, 448.0f, 0.0f)
                close()
            }
        }
        .build()
        return _o!!
    }

private var _o: ImageVector? = null
