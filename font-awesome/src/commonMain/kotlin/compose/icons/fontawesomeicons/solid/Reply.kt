package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Reply: ImageVector
    get() {
        if (_reply != null) {
            return _reply!!
        }
        _reply = Builder(name = "Reply", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.31f, 189.84f)
                lineTo(184.31f, 37.85f)
                curveTo(199.72f, 24.55f, 224.0f, 35.35f, 224.0f, 56.01f)
                verticalLineToRelative(80.05f)
                curveToRelative(160.63f, 1.84f, 288.0f, 34.03f, 288.0f, 186.26f)
                curveToRelative(0.0f, 61.44f, -39.58f, 122.31f, -83.33f, 154.13f)
                curveToRelative(-13.65f, 9.93f, -33.11f, -2.53f, -28.08f, -18.63f)
                curveToRelative(45.34f, -145.01f, -21.51f, -183.51f, -176.59f, -185.74f)
                verticalLineTo(360.0f)
                curveToRelative(0.0f, 20.7f, -24.3f, 31.45f, -39.69f, 18.16f)
                lineToRelative(-176.0f, -152.0f)
                curveToRelative(-11.07f, -9.56f, -11.09f, -26.75f, 0.0f, -36.33f)
                close()
            }
        }
        .build()
        return _reply!!
    }

private var _reply: ImageVector? = null
