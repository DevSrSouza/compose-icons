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

public val SimpleIcons.Sessionize: ImageVector
    get() {
        if (_sessionize != null) {
            return _sessionize!!
        }
        _sessionize = Builder(name = "Sessionize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, 5.372f, 12.0f, 12.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.097f, -0.903f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-7.5f)
                lineToRelative(-0.001f, -0.169f)
                curveToRelative(-0.049f, -2.894f, -1.347f, -4.902f, -3.709f, -5.96f)
                lineTo(24.0f, 12.0f)
                lineToRelative(-0.32f, -0.109f)
                curveToRelative(-2.858f, -0.999f, -5.251f, -2.462f, -7.18f, -4.391f)
                curveToRelative(-1.928f, -1.928f, -3.392f, -4.322f, -4.391f, -7.181f)
                lineTo(12.0f, 0.0f)
                lineTo(4.0f, 18.0f)
                curveToRelative(0.0f, 0.667f, 0.167f, 1.167f, 0.5f, 1.5f)
                curveToRelative(0.334f, 0.334f, 0.834f, 0.5f, 1.5f, 0.5f)
                lineToRelative(0.187f, 0.001f)
                curveToRelative(3.771f, 0.04f, 5.313f, 1.295f, 5.313f, 3.999f)
                lineTo(2.0f, 24.0f)
                curveToRelative(-1.097f, 0.0f, -2.0f, -0.903f, -2.0f, -2.0f)
                lineTo(0.0f, 2.0f)
                curveTo(0.0f, 0.903f, 0.903f, 0.0f, 2.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(19.207f, 4.793f)
                curveToRelative(-0.781f, -0.781f, -1.73f, -1.097f, -2.121f, -0.707f)
                curveToRelative(-0.39f, 0.39f, -0.074f, 1.34f, 0.707f, 2.121f)
                curveToRelative(0.781f, 0.781f, 1.731f, 1.098f, 2.121f, 0.707f)
                curveToRelative(0.391f, -0.39f, 0.074f, -1.34f, -0.707f, -2.121f)
                close()
            }
        }
        .build()
        return _sessionize!!
    }

private var _sessionize: ImageVector? = null
