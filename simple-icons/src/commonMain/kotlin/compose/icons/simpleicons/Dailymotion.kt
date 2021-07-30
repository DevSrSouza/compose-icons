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

public val SimpleIcons.Dailymotion: ImageVector
    get() {
        if (_dailymotion != null) {
            return _dailymotion!!
        }
        _dailymotion = Builder(name = "Dailymotion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.068f, 11.313f)
                curveToRelative(-1.754f, 0.0f, -3.104f, 1.427f, -3.104f, 3.11f)
                curveToRelative(0.0f, 1.753f, 1.35f, 3.085f, 3.255f, 3.085f)
                lineToRelative(-0.016f, 0.002f)
                curveToRelative(1.59f, 0.0f, 2.925f, -1.31f, 2.925f, -3.04f)
                curveToRelative(0.0f, -1.8f, -1.336f, -3.157f, -3.062f, -3.157f)
                close()
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(20.693f, 20.807f)
                horizontalLineToRelative(-3.576f)
                verticalLineToRelative(-1.41f)
                curveToRelative(-1.1f, 1.08f, -2.223f, 1.47f, -3.715f, 1.47f)
                curveToRelative(-1.522f, 0.0f, -2.832f, -0.495f, -3.93f, -1.485f)
                curveToRelative(-1.448f, -1.275f, -2.198f, -2.97f, -2.198f, -4.936f)
                curveToRelative(0.0f, -1.8f, 0.7f, -3.414f, 2.01f, -4.674f)
                curveToRelative(1.17f, -1.146f, 2.595f, -1.73f, 4.185f, -1.73f)
                curveToRelative(1.52f, 0.0f, 2.69f, 0.513f, 3.53f, 1.59f)
                lineTo(16.999f, 4.157f)
                lineToRelative(3.693f, -0.765f)
                lineTo(20.692f, 3.39f)
                lineToRelative(0.002f, 0.003f)
                horizontalLineToRelative(-0.002f)
                verticalLineToRelative(17.414f)
                close()
            }
        }
        .build()
        return _dailymotion!!
    }

private var _dailymotion: ImageVector? = null
