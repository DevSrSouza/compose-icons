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

public val SimpleIcons.Runkit: ImageVector
    get() {
        if (_runkit != null) {
            return _runkit!!
        }
        _runkit = Builder(name = "Runkit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.97f, 14.797f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.47f, 3.02f)
                lineToRelative(-9.0f, 5.2f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 0.0f)
                lineToRelative(-9.0f, -5.2f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.47f, -3.02f)
                lineToRelative(1.32f, -7.2f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.98f, -1.82f)
                arcToRelative(2.96f, 2.96f, 0.0f, false, true, 0.49f, -0.35f)
                lineToRelative(7.55f, -4.37f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, true, 3.28f, 0.02f)
                lineToRelative(7.53f, 4.35f)
                curveToRelative(0.1f, 0.05f, 0.19f, 0.1f, 0.28f, 0.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.19f, 2.0f)
                close()
                moveTo(14.43f, 4.027f)
                lineToRelative(-7.72f, 1.59f)
                curveToRelative(-0.43f, 0.08f, -0.51f, 0.64f, -0.14f, 0.86f)
                lineToRelative(5.6f, 3.23f)
                curveToRelative(0.23f, 0.13f, 0.5f, 0.07f, 0.63f, -0.19f)
                lineToRelative(1.58f, -3.6f)
                lineToRelative(0.53f, -1.22f)
                curveToRelative(0.16f, -0.35f, -0.11f, -0.75f, -0.5f, -0.67f)
                close()
            }
        }
        .build()
        return _runkit!!
    }

private var _runkit: ImageVector? = null
