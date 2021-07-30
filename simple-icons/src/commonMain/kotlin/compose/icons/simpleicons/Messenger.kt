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

public val SimpleIcons.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(name = "Messenger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.001f, 11.639f)
                curveTo(0.001f, 4.949f, 5.241f, 0.0f, 12.001f, 0.0f)
                reflectiveCurveTo(24.0f, 4.95f, 24.0f, 11.639f)
                curveToRelative(0.0f, 6.689f, -5.24f, 11.638f, -12.0f, 11.638f)
                curveToRelative(-1.21f, 0.0f, -2.38f, -0.16f, -3.47f, -0.46f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, false, -0.64f, 0.05f)
                lineToRelative(-2.39f, 1.05f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -1.35f, -0.85f)
                lineToRelative(-0.07f, -2.14f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, false, -0.32f, -0.68f)
                arcTo(11.39f, 11.389f, 0.0f, false, true, 0.002f, 11.64f)
                close()
                moveTo(8.321f, 9.449f)
                lineToRelative(-3.52f, 5.6f)
                curveToRelative(-0.35f, 0.53f, 0.32f, 1.139f, 0.82f, 0.75f)
                lineToRelative(3.79f, -2.87f)
                curveToRelative(0.26f, -0.2f, 0.6f, -0.2f, 0.87f, 0.0f)
                lineToRelative(2.8f, 2.1f)
                curveToRelative(0.84f, 0.63f, 2.04f, 0.4f, 2.6f, -0.48f)
                lineToRelative(3.52f, -5.6f)
                curveToRelative(0.35f, -0.53f, -0.32f, -1.13f, -0.82f, -0.75f)
                lineToRelative(-3.79f, 2.87f)
                curveToRelative(-0.25f, 0.2f, -0.6f, 0.2f, -0.86f, 0.0f)
                lineToRelative(-2.8f, -2.1f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -2.61f, 0.48f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null
