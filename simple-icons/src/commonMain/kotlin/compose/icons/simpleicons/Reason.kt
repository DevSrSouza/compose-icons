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

public val SimpleIcons.Reason: ImageVector
    get() {
        if (_reason != null) {
            return _reason!!
        }
        _reason = Builder(name = "Reason", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(11.52f, 21.89f)
                lineToRelative(-1.33f, -2.54f)
                lineTo(8.4f, 19.35f)
                verticalLineToRelative(2.54f)
                lineTo(6.0f, 21.89f)
                verticalLineToRelative(-9.2f)
                horizontalLineToRelative(4.13f)
                curveToRelative(2.44f, 0.0f, 3.83f, 1.19f, 3.83f, 3.24f)
                curveToRelative(0.0f, 1.39f, -0.58f, 2.4f, -1.64f, 2.96f)
                lineToRelative(1.92f, 3.0f)
                horizontalLineToRelative(-2.72f)
                close()
                moveTo(22.88f, 21.89f)
                lineTo(15.5f, 21.89f)
                verticalLineToRelative(-9.2f)
                horizontalLineToRelative(7.24f)
                verticalLineToRelative(1.92f)
                lineTo(17.9f, 14.61f)
                verticalLineToRelative(1.72f)
                horizontalLineToRelative(4.38f)
                verticalLineToRelative(1.9f)
                lineToRelative(-4.38f, 0.01f)
                verticalLineToRelative(1.73f)
                horizontalLineToRelative(4.99f)
                verticalLineToRelative(1.92f)
                close()
                moveTo(11.68f, 16.0f)
                curveToRelative(0.0f, 0.93f, -0.56f, 1.43f, -1.53f, 1.43f)
                lineTo(8.4f, 17.43f)
                verticalLineToRelative(-2.82f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.97f, 0.0f, 1.53f, 0.49f, 1.53f, 1.4f)
                close()
            }
        }
        .build()
        return _reason!!
    }

private var _reason: ImageVector? = null
