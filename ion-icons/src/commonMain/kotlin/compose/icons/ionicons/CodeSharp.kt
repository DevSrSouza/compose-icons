package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.CodeSharp: ImageVector
    get() {
        if (_codeSharp != null) {
            return _codeSharp!!
        }
        _codeSharp = Builder(name = "CodeSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.98f, 397.63f)
                lineToRelative(-161.98f, -141.63f)
                lineToRelative(161.98f, -141.63f)
                lineToRelative(27.65f, 31.61f)
                lineToRelative(-125.63f, 110.02f)
                lineToRelative(125.63f, 110.02f)
                lineToRelative(-27.65f, 31.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(350.02f, 397.63f)
                lineToRelative(-27.65f, -31.61f)
                lineToRelative(125.63f, -110.02f)
                lineToRelative(-125.63f, -110.02f)
                lineToRelative(27.65f, -31.61f)
                lineToRelative(161.98f, 141.63f)
                lineToRelative(-161.98f, 141.63f)
                close()
            }
        }
        .build()
        return _codeSharp!!
    }

private var _codeSharp: ImageVector? = null
