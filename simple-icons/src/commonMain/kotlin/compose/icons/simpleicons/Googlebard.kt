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

public val SimpleIcons.Googlebard: ImageVector
    get() {
        if (_googlebard != null) {
            return _googlebard!!
        }
        _googlebard = Builder(name = "Googlebard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.446f, 16.122f)
                lineToRelative(-0.957f, 2.196f)
                arcToRelative(1.034f, 1.034f, 0.0f, false, true, -1.906f, 0.0f)
                lineToRelative(-0.957f, -2.196f)
                arcToRelative(8.455f, 8.455f, 0.0f, false, false, -4.303f, -4.358f)
                lineToRelative(-2.638f, -1.17f)
                curveToRelative(-0.839f, -0.372f, -0.839f, -1.593f, 0.0f, -1.965f)
                lineTo(3.24f, 7.494f)
                arcTo(8.452f, 8.452f, 0.0f, false, false, 7.605f, 2.99f)
                lineTo(8.576f, 0.651f)
                arcToRelative(1.033f, 1.033f, 0.0f, false, true, 1.919f, 0.0f)
                lineToRelative(0.972f, 2.339f)
                arcToRelative(8.452f, 8.452f, 0.0f, false, false, 4.365f, 4.504f)
                lineToRelative(2.555f, 1.135f)
                curveToRelative(0.839f, 0.372f, 0.839f, 1.593f, 0.0f, 1.965f)
                lineToRelative(-2.638f, 1.17f)
                arcToRelative(8.455f, 8.455f, 0.0f, false, false, -4.303f, 4.358f)
                close()
                moveTo(20.353f, 23.044f)
                lineTo(20.083f, 23.661f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, true, -1.02f, 0.0f)
                lineToRelative(-0.27f, -0.617f)
                arcToRelative(4.77f, 4.77f, 0.0f, false, false, -2.426f, -2.459f)
                lineToRelative(-0.83f, -0.368f)
                curveToRelative(-0.449f, -0.2f, -0.449f, -0.853f, 0.0f, -1.052f)
                lineToRelative(0.783f, -0.348f)
                arcToRelative(4.769f, 4.769f, 0.0f, false, false, 2.461f, -2.541f)
                lineToRelative(0.277f, -0.667f)
                arcToRelative(0.554f, 0.554f, 0.0f, false, true, 1.029f, 0.0f)
                lineToRelative(0.277f, 0.667f)
                arcToRelative(4.764f, 4.764f, 0.0f, false, false, 2.46f, 2.541f)
                lineToRelative(0.785f, 0.348f)
                curveToRelative(0.448f, 0.199f, 0.448f, 0.852f, 0.0f, 1.052f)
                lineToRelative(-0.832f, 0.368f)
                arcToRelative(4.762f, 4.762f, 0.0f, false, false, -2.424f, 2.459f)
                close()
            }
        }
        .build()
        return _googlebard!!
    }

private var _googlebard: ImageVector? = null
