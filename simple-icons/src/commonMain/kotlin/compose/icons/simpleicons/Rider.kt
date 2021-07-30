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

public val SimpleIcons.Rider: ImageVector
    get() {
        if (_rider != null) {
            return _rider!!
        }
        _rider = Builder(name = "Rider", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(7.031f, 3.113f)
                arcTo(4.063f, 4.063f, 0.0f, false, true, 9.72f, 4.14f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, 0.84f, 2.28f)
                arcTo(3.16f, 3.16f, 0.0f, false, true, 8.4f, 9.54f)
                lineToRelative(2.46f, 3.6f)
                lineTo(8.28f, 13.14f)
                lineTo(6.12f, 9.9f)
                lineTo(4.38f, 9.9f)
                verticalLineToRelative(3.24f)
                lineTo(2.16f, 13.14f)
                lineTo(2.16f, 3.12f)
                curveToRelative(1.61f, -0.004f, 3.281f, 0.009f, 4.871f, -0.007f)
                close()
                moveTo(12.54f, 3.12f)
                horizontalLineToRelative(3.96f)
                curveToRelative(3.18f, 0.0f, 5.34f, 2.16f, 5.34f, 5.04f)
                curveToRelative(0.0f, 2.82f, -2.16f, 5.04f, -5.34f, 5.04f)
                horizontalLineToRelative(-3.96f)
                close()
                moveTo(16.609f, 5.096f)
                curveToRelative(-0.607f, 0.01f, -1.235f, 0.004f, -1.849f, 0.004f)
                verticalLineToRelative(6.06f)
                horizontalLineToRelative(1.74f)
                arcToRelative(2.882f, 2.882f, 0.0f, false, false, 3.06f, -3.0f)
                arcToRelative(2.897f, 2.897f, 0.0f, false, false, -2.951f, -3.064f)
                close()
                moveTo(4.319f, 5.1f)
                verticalLineToRelative(2.88f)
                lineTo(6.6f, 7.98f)
                curveToRelative(1.08f, 0.0f, 1.68f, -0.6f, 1.68f, -1.44f)
                curveToRelative(0.0f, -0.96f, -0.66f, -1.44f, -1.74f, -1.44f)
                close()
                moveTo(2.16f, 19.5f)
                horizontalLineToRelative(9.0f)
                lineTo(11.16f, 21.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _rider!!
    }

private var _rider: ImageVector? = null
