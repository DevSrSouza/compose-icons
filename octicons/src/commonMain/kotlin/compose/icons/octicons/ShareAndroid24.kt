package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ShareAndroid24: ImageVector
    get() {
        if (_shareAndroid24 != null) {
            return _shareAndroid24!!
        }
        _shareAndroid24 = Builder(name = "ShareAndroid24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 5.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.062f, 2.385f)
                lineToRelative(-5.112f, 3.021f)
                arcToRelative(3.497f, 3.497f, 0.0f, false, true, 0.0f, 2.188f)
                lineToRelative(5.112f, 3.021f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -0.764f, 1.29f)
                lineToRelative(-5.112f, -3.02f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -4.77f)
                lineToRelative(5.112f, -3.021f)
                verticalLineToRelative(0.001f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 20.0f, 5.5f)
                close()
                moveTo(18.5f, 5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(5.5f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(18.5f, 18.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shareAndroid24!!
    }

private var _shareAndroid24: ImageVector? = null
