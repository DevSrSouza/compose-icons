package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Jira: ImageVector
    get() {
        if (_jira != null) {
            return _jira!!
        }
        _jira = Builder(name = "Jira", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.021f, 2.199f)
                lineTo(3.58f, 14.602f)
                curveTo(2.811f, 15.369f, 2.809f, 16.623f, 3.58f, 17.404f)
                lineTo(16.021f, 29.801f)
                lineTo(16.729f, 29.098f)
                curveTo(20.368f, 25.473f, 22.594f, 23.253f, 23.91f, 21.938f)
                lineTo(25.266f, 20.58f)
                curveTo(25.343f, 20.504f, 25.429f, 20.416f, 25.514f, 20.32f)
                curveTo(25.55f, 20.285f, 25.578f, 20.26f, 25.592f, 20.246f)
                lineTo(25.586f, 20.238f)
                curveTo(25.607f, 20.212f, 25.627f, 20.187f, 25.648f, 20.16f)
                curveTo(26.579f, 19.23f, 27.85f, 17.962f, 28.412f, 17.402f)
                curveTo(28.791f, 17.028f, 29.0f, 16.531f, 29.0f, 16.0f)
                curveTo(29.0f, 15.47f, 28.792f, 14.974f, 28.414f, 14.6f)
                curveTo(26.751f, 12.94f, 24.834f, 11.017f, 22.906f, 9.084f)
                curveTo(20.746f, 6.918f, 18.573f, 4.738f, 16.729f, 2.902f)
                lineTo(16.021f, 2.199f)
                close()
                moveTo(16.021f, 5.023f)
                curveTo(17.701f, 6.699f, 19.601f, 8.603f, 21.49f, 10.496f)
                curveTo(23.413f, 12.424f, 25.325f, 14.341f, 26.986f, 15.998f)
                curveTo(25.632f, 17.348f, 24.678f, 18.3f, 24.025f, 18.988f)
                curveTo(23.901f, 19.101f, 23.775f, 19.226f, 23.645f, 19.354f)
                curveTo(23.421f, 19.574f, 23.201f, 19.786f, 23.152f, 19.832f)
                lineTo(23.17f, 19.852f)
                curveTo(21.931f, 21.09f, 19.563f, 23.45f, 16.023f, 26.977f)
                lineTo(4.992f, 16.016f)
                lineTo(16.021f, 5.023f)
                close()
                moveTo(16.021f, 10.926f)
                lineTo(10.928f, 16.0f)
                lineTo(16.021f, 21.074f)
                lineTo(21.117f, 16.0f)
                lineTo(16.021f, 10.926f)
                close()
                moveTo(16.021f, 13.748f)
                lineTo(18.283f, 16.0f)
                lineTo(16.021f, 18.252f)
                lineTo(13.762f, 16.0f)
                lineTo(16.021f, 13.748f)
                close()
            }
        }
        .build()
        return _jira!!
    }

private var _jira: ImageVector? = null
