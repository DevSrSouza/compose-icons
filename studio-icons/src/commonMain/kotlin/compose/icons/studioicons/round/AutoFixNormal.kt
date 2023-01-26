package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AutoFixNormal: ImageVector
    get() {
        if (_autoFixNormal != null) {
            return _autoFixNormal!!
        }
        _autoFixNormal = Builder(name = "AutoFixNormal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.45f, 6.0f)
                lineToRelative(0.49f, -1.06f)
                lineTo(22.0f, 4.45f)
                curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f)
                lineToRelative(-1.06f, -0.49f)
                lineTo(20.45f, 2.0f)
                curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f)
                lineToRelative(-0.49f, 1.06f)
                lineTo(18.0f, 3.55f)
                curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f)
                lineToRelative(1.06f, 0.49f)
                lineTo(19.55f, 6.0f)
                curveTo(19.72f, 6.39f, 20.28f, 6.39f, 20.45f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.71f, 9.12f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(2.29f, 17.46f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.83f, 2.83f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(11.17f, -11.17f)
                curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f)
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
