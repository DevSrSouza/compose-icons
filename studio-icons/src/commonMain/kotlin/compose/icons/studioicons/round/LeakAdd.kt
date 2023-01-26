package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.LeakAdd: ImageVector
    get() {
        if (_leakAdd != null) {
            return _leakAdd!!
        }
        _leakAdd = Builder(name = "LeakAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.05f, 21.0f)
                curveToRelative(0.5f, 0.0f, 0.94f, -0.37f, 0.99f, -0.87f)
                curveToRelative(0.41f, -4.27f, 3.81f, -7.67f, 8.08f, -8.08f)
                curveToRelative(0.5f, -0.05f, 0.88f, -0.48f, 0.88f, -0.99f)
                curveToRelative(0.0f, -0.59f, -0.51f, -1.06f, -1.1f, -1.0f)
                curveToRelative(-5.19f, 0.52f, -9.32f, 4.65f, -9.84f, 9.83f)
                curveToRelative(-0.06f, 0.59f, 0.4f, 1.11f, 0.99f, 1.11f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                close()
                moveTo(15.09f, 21.0f)
                curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f)
                curveToRelative(0.36f, -2.08f, 2.0f, -3.72f, 4.08f, -4.08f)
                curveToRelative(0.49f, -0.08f, 0.85f, -0.49f, 0.85f, -0.98f)
                curveToRelative(0.0f, -0.61f, -0.54f, -1.09f, -1.14f, -1.0f)
                curveToRelative(-2.96f, 0.48f, -5.29f, 2.81f, -5.77f, 5.77f)
                curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f)
                close()
                moveTo(12.97f, 3.02f)
                curveToRelative(-0.5f, 0.0f, -0.94f, 0.37f, -0.99f, 0.87f)
                curveToRelative(-0.41f, 4.27f, -3.81f, 7.67f, -8.08f, 8.08f)
                curveToRelative(-0.5f, 0.05f, -0.88f, 0.48f, -0.88f, 0.99f)
                curveToRelative(0.0f, 0.59f, 0.51f, 1.06f, 1.1f, 1.0f)
                curveToRelative(5.19f, -0.52f, 9.32f, -4.65f, 9.84f, -9.83f)
                curveToRelative(0.07f, -0.58f, -0.39f, -1.11f, -0.99f, -1.11f)
                close()
                moveTo(6.03f, 3.02f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                close()
                moveTo(8.94f, 3.02f)
                curveToRelative(-0.49f, 0.0f, -0.9f, 0.36f, -0.98f, 0.85f)
                curveToRelative(-0.36f, 2.08f, -2.0f, 3.72f, -4.08f, 4.08f)
                curveToRelative(-0.49f, 0.09f, -0.85f, 0.49f, -0.85f, 0.99f)
                curveToRelative(0.0f, 0.61f, 0.54f, 1.09f, 1.14f, 1.0f)
                curveToRelative(2.96f, -0.48f, 5.29f, -2.81f, 5.77f, -5.77f)
                curveToRelative(0.09f, -0.61f, -0.4f, -1.15f, -1.0f, -1.15f)
                close()
            }
        }
        .build()
        return _leakAdd!!
    }

private var _leakAdd: ImageVector? = null
