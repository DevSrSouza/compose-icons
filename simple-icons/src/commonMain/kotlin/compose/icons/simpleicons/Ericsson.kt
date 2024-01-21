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

public val SimpleIcons.Ericsson: ImageVector
    get() {
        if (_ericsson != null) {
            return _ericsson!!
        }
        _ericsson = Builder(name = "Ericsson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.76f, 1.593f)
                arcTo(2.36f, 2.36f, 0.0f, false, false, 19.572f, 0.225f)
                curveToRelative(-0.54f, -0.27f, -1.188f, -0.336f, -2.256f, 0.02f)
                lineTo(5.187f, 4.29f)
                curveToRelative(-1.068f, 0.357f, -1.548f, 0.795f, -1.818f, 1.338f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, 1.059f, 3.174f)
                curveToRelative(0.54f, 0.27f, 1.188f, 0.336f, 2.256f, -0.021f)
                lineToRelative(12.129f, -4.044f)
                curveToRelative(1.068f, -0.354f, 1.548f, -0.795f, 1.818f, -1.338f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, false, 0.13f, -1.806f)
                close()
                moveTo(20.76f, 9.078f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, -1.188f, -1.368f)
                curveToRelative(-0.54f, -0.27f, -1.188f, -0.336f, -2.256f, 0.021f)
                lineTo(5.187f, 11.775f)
                curveToRelative(-1.068f, 0.357f, -1.548f, 0.795f, -1.818f, 1.338f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, 1.059f, 3.174f)
                curveToRelative(0.54f, 0.27f, 1.188f, 0.336f, 2.256f, -0.021f)
                lineToRelative(12.129f, -4.041f)
                curveToRelative(1.068f, -0.357f, 1.548f, -0.795f, 1.818f, -1.341f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, false, 0.13f, -1.806f)
                close()
                moveTo(20.76f, 16.566f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, -1.188f, -1.368f)
                curveToRelative(-0.54f, -0.27f, -1.188f, -0.336f, -2.256f, 0.021f)
                lineTo(5.187f, 19.263f)
                curveToRelative(-1.068f, 0.357f, -1.548f, 0.795f, -1.818f, 1.338f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, 1.059f, 3.174f)
                curveToRelative(0.54f, 0.27f, 1.188f, 0.336f, 2.256f, -0.02f)
                lineToRelative(12.129f, -4.045f)
                curveToRelative(1.068f, -0.354f, 1.548f, -0.795f, 1.818f, -1.338f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, false, 0.13f, -1.806f)
                close()
            }
        }
        .build()
        return _ericsson!!
    }

private var _ericsson: ImageVector? = null
