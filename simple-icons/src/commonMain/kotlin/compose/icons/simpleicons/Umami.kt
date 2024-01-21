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

public val SimpleIcons.Umami: ImageVector
    get() {
        if (_umami != null) {
            return _umami!!
        }
        _umami = Builder(name = "Umami", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.203f, 8.611f)
                lineTo(0.857f, 8.611f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, false, -0.841f, 0.841f)
                verticalLineToRelative(0.858f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, false, -0.016f, 0.6f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.527f, 0.0f, 11.837f, -5.212f, 11.996f, -11.701f)
                curveToRelative(0.0f, -0.025f, 0.004f, -0.05f, 0.004f, -0.075f)
                lineTo(24.0f, 9.452f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, false, -0.841f, -0.841f)
                horizontalLineToRelative(-1.346f)
                curveToRelative(-1.159f, -4.329f, -5.112f, -7.521f, -9.805f, -7.521f)
                curveToRelative(-4.692f, 0.0f, -8.645f, 3.192f, -9.805f, 7.521f)
                close()
                moveTo(20.647f, 8.611f)
                lineTo(3.37f, 8.611f)
                curveToRelative(1.127f, -3.702f, 4.57f, -6.399f, 8.638f, -6.399f)
                curveToRelative(4.069f, 0.0f, 7.512f, 2.697f, 8.639f, 6.399f)
                close()
            }
        }
        .build()
        return _umami!!
    }

private var _umami: ImageVector? = null
