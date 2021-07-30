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

public val SimpleIcons.Elementary: ImageVector
    get() {
        if (_elementary != null) {
            return _elementary!!
        }
        _elementary = Builder(name = "Elementary", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(12.0f, 1.0f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 10.59f, 8.01f)
                arcToRelative(19.09f, 19.09f, 0.0f, false, true, -4.66f, 6.08f)
                curveToRelative(-0.94f, 0.81f, -1.96f, 1.53f, -3.08f, 2.04f)
                curveToRelative(-1.13f, 0.5f, -2.37f, 0.8f, -3.6f, 0.72f)
                arcToRelative(6.23f, 6.23f, 0.0f, false, true, -2.66f, -0.76f)
                arcToRelative(20.02f, 20.02f, 0.0f, false, false, 5.68f, -4.58f)
                arcToRelative(9.97f, 9.97f, 0.0f, false, false, 2.31f, -4.17f)
                curveToRelative(0.18f, -0.79f, 0.2f, -1.6f, 0.04f, -2.4f)
                arcToRelative(4.42f, 4.42f, 0.0f, false, false, -1.08f, -2.11f)
                arcToRelative(4.33f, 4.33f, 0.0f, false, false, -2.0f, -1.19f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, -2.33f, -0.08f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 7.2f, 4.85f)
                arcToRelative(9.77f, 9.77f, 0.0f, false, false, -2.94f, 7.49f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, false, 1.95f, 4.59f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -3.56f, 0.85f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 12.0f, 1.0f)
                close()
                moveTo(12.07f, 3.22f)
                curveToRelative(0.77f, 0.0f, 1.55f, 0.24f, 2.17f, 0.7f)
                curveToRelative(0.55f, 0.42f, 0.97f, 1.02f, 1.2f, 1.68f)
                curveToRelative(0.23f, 0.65f, 0.3f, 1.37f, 0.21f, 2.06f)
                arcToRelative(7.85f, 7.85f, 0.0f, false, true, -1.7f, 3.76f)
                arcToRelative(16.22f, 16.22f, 0.0f, false, true, -6.37f, 4.96f)
                curveToRelative(-0.48f, -0.42f, -0.9f, -0.92f, -1.2f, -1.48f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, true, -0.75f, -3.87f)
                curveToRelative(0.12f, -1.32f, 0.58f, -2.6f, 1.2f, -3.79f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, 3.02f, -3.42f)
                curveToRelative(0.68f, -0.37f, 1.45f, -0.6f, 2.22f, -0.6f)
                close()
                moveTo(22.9f, 10.52f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 3.52f, 19.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 3.63f, -1.2f)
                curveToRelative(0.51f, 0.4f, 1.08f, 0.71f, 1.67f, 0.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.44f, -0.04f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, false, 4.64f, -2.95f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 4.0f, -5.22f)
                close()
            }
        }
        .build()
        return _elementary!!
    }

private var _elementary: ImageVector? = null
