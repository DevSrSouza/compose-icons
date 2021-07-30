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

public val SimpleIcons.Analogue: ImageVector
    get() {
        if (_analogue != null) {
            return _analogue!!
        }
        _analogue = Builder(name = "Analogue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.468f, 12.804f)
                arcToRelative(5.145f, 5.145f, 0.0f, true, false, -0.644f, 10.27f)
                arcToRelative(5.145f, 5.145f, 0.0f, false, false, 0.644f, -10.27f)
                close()
                moveTo(23.309f, 15.366f)
                lineTo(16.45f, 3.484f)
                arcToRelative(5.146f, 5.146f, 0.0f, false, false, -8.912f, 5.15f)
                lineToRelative(6.86f, 11.878f)
                arcToRelative(5.148f, 5.148f, 0.0f, false, false, 7.031f, 1.885f)
                arcToRelative(5.146f, 5.146f, 0.0f, false, false, 1.881f, -7.031f)
                close()
            }
        }
        .build()
        return _analogue!!
    }

private var _analogue: ImageVector? = null
