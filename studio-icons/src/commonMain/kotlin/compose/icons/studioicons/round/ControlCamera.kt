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

public val RoundGroup.ControlCamera: ImageVector
    get() {
        if (_controlCamera != null) {
            return _controlCamera!!
        }
        _controlCamera = Builder(name = "ControlCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.65f, 9.35f)
                lineTo(2.7f, 11.3f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.95f, 1.95f)
                curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f)
                curveToRelative(0.48f, -0.49f, 0.48f, -1.27f, 0.0f, -1.76f)
                lineToRelative(-0.88f, -0.9f)
                lineToRelative(0.88f, -0.89f)
                curveToRelative(0.48f, -0.49f, 0.48f, -1.27f, 0.0f, -1.76f)
                reflectiveCurveToRelative(-1.28f, -0.49f, -1.77f, 0.0f)
                close()
                moveTo(17.58f, 9.35f)
                curveToRelative(-0.48f, 0.49f, -0.48f, 1.27f, 0.0f, 1.76f)
                lineToRelative(0.88f, 0.89f)
                lineToRelative(-0.88f, 0.89f)
                curveToRelative(-0.48f, 0.49f, -0.48f, 1.27f, 0.0f, 1.76f)
                curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f)
                lineToRelative(1.95f, -1.95f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-1.95f, -1.95f)
                curveToRelative(-0.49f, -0.48f, -1.29f, -0.48f, -1.77f, 0.01f)
                close()
                moveTo(12.0f, 18.46f)
                lineToRelative(-0.89f, -0.88f)
                curveToRelative(-0.49f, -0.48f, -1.27f, -0.48f, -1.76f, 0.0f)
                curveToRelative(-0.49f, 0.49f, -0.49f, 1.28f, 0.0f, 1.77f)
                lineToRelative(1.95f, 1.95f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(1.95f, -1.95f)
                curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f)
                curveToRelative(-0.49f, -0.48f, -1.27f, -0.48f, -1.76f, 0.0f)
                lineToRelative(-0.9f, 0.88f)
                close()
                moveTo(9.35f, 6.42f)
                curveToRelative(0.49f, 0.48f, 1.27f, 0.48f, 1.76f, 0.0f)
                lineToRelative(0.89f, -0.88f)
                lineToRelative(0.89f, 0.88f)
                curveToRelative(0.49f, 0.48f, 1.27f, 0.48f, 1.76f, 0.0f)
                curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f)
                lineTo(12.7f, 2.7f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(9.35f, 4.65f)
                curveToRelative(-0.49f, 0.49f, -0.49f, 1.29f, 0.0f, 1.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
        .build()
        return _controlCamera!!
    }

private var _controlCamera: ImageVector? = null
