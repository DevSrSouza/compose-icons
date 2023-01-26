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

public val SharpGroup.AutoFixNormal: ImageVector
    get() {
        if (_autoFixNormal != null) {
            return _autoFixNormal!!
        }
        _autoFixNormal = Builder(name = "AutoFixNormal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                lineToRelative(0.94f, -2.06f)
                lineToRelative(2.06f, -0.94f)
                lineToRelative(-2.06f, -0.94f)
                lineToRelative(-0.94f, -2.06f)
                lineToRelative(-0.94f, 2.06f)
                lineToRelative(-2.06f, 0.94f)
                lineToRelative(2.06f, 0.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.41f, 9.83f)
                lineToRelative(-4.24f, -4.24f)
                lineTo(1.59f, 18.17f)
                lineToRelative(4.24f, 4.24f)
                lineTo(18.41f, 9.83f)
                close()
                moveTo(14.21f, 11.21f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.38f, -1.38f)
                lineToRelative(1.41f, 1.41f)
                lineTo(14.21f, 11.21f)
                close()
            }
        }
        .build()
        return _autoFixNormal!!
    }

private var _autoFixNormal: ImageVector? = null
