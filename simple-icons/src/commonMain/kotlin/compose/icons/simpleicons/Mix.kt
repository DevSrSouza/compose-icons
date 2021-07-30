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

public val SimpleIcons.Mix: ImageVector
    get() {
        if (_mix != null) {
            return _mix!!
        }
        _mix = Builder(name = "Mix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.001f, 0.0f)
                verticalLineToRelative(21.61f)
                curveToRelative(0.0f, 1.32f, 1.074f, 2.39f, 2.4f, 2.39f)
                arcToRelative(2.396f, 2.396f, 0.0f, false, false, 2.402f, -2.39f)
                verticalLineTo(8.54f)
                curveToRelative(0.0f, 0.014f, -0.005f, 0.026f, -0.006f, 0.04f)
                verticalLineTo(6.364f)
                arcToRelative(2.395f, 2.395f, 0.0f, false, true, 2.399f, -2.393f)
                arcToRelative(2.396f, 2.396f, 0.0f, false, true, 2.398f, 2.393f)
                verticalLineToRelative(9.356f)
                arcToRelative(2.394f, 2.394f, 0.0f, false, false, 2.398f, 2.393f)
                arcToRelative(2.394f, 2.394f, 0.0f, false, false, 2.398f, -2.39f)
                verticalLineToRelative(-3.692f)
                arcToRelative(2.398f, 2.398f, 0.0f, false, true, 2.385f, -2.078f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.41f, 2.389f)
                verticalLineToRelative(1.214f)
                arcToRelative(2.397f, 2.397f, 0.0f, false, false, 2.408f, 2.389f)
                arcToRelative(2.399f, 2.399f, 0.0f, false, false, 2.406f, -2.39f)
                verticalLineTo(0.006f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -0.145f, -0.004f)
                curveToRelative(-1.31f, 0.0f, -2.558f, 0.264f, -3.693f, 0.74f)
                arcTo(9.449f, 9.449f, 0.0f, false, true, 23.841f, 0.0f)
                close()
            }
        }
        .build()
        return _mix!!
    }

private var _mix: ImageVector? = null
