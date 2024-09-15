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

public val LineAwesomeIcons.BehanceSquare: ImageVector
    get() {
        if (_behanceSquare != null) {
            return _behanceSquare!!
        }
        _behanceSquare = Builder(name = "BehanceSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(9.0f, 11.369f)
                lineTo(9.0f, 19.98f)
                lineTo(13.18f, 19.98f)
                curveTo(14.74f, 19.97f, 16.211f, 19.221f, 16.211f, 17.471f)
                curveTo(16.211f, 16.381f, 15.691f, 15.46f, 14.641f, 15.16f)
                curveTo(15.411f, 14.78f, 15.811f, 14.36f, 15.811f, 13.5f)
                curveTo(15.811f, 11.78f, 14.541f, 11.369f, 13.061f, 11.369f)
                lineTo(9.0f, 11.369f)
                close()
                moveTo(18.141f, 12.0f)
                lineTo(18.141f, 12.85f)
                lineTo(21.619f, 12.85f)
                lineTo(21.619f, 12.0f)
                lineTo(18.141f, 12.0f)
                close()
                moveTo(10.9f, 12.689f)
                lineTo(12.68f, 12.689f)
                curveTo(13.35f, 12.689f, 13.971f, 12.88f, 13.971f, 13.67f)
                curveTo(13.971f, 14.4f, 13.491f, 14.699f, 12.811f, 14.699f)
                lineTo(10.9f, 14.699f)
                lineTo(10.9f, 12.689f)
                close()
                moveTo(19.961f, 13.43f)
                curveTo(18.071f, 13.43f, 16.779f, 14.841f, 16.779f, 16.721f)
                curveTo(16.779f, 18.661f, 17.991f, 20.0f, 19.961f, 20.0f)
                curveTo(21.451f, 20.0f, 22.421f, 19.33f, 22.881f, 17.9f)
                lineTo(21.369f, 17.9f)
                curveTo(21.199f, 18.43f, 20.54f, 18.711f, 20.02f, 18.711f)
                curveTo(19.01f, 18.711f, 18.49f, 18.121f, 18.49f, 17.131f)
                lineTo(22.98f, 17.131f)
                curveTo(22.99f, 17.031f, 23.0f, 16.911f, 23.0f, 16.801f)
                curveTo(23.0f, 14.961f, 21.911f, 13.43f, 19.961f, 13.43f)
                close()
                moveTo(19.9f, 14.711f)
                curveTo(20.77f, 14.711f, 21.2f, 15.221f, 21.27f, 16.051f)
                lineTo(18.49f, 16.051f)
                curveTo(18.54f, 15.231f, 19.08f, 14.711f, 19.9f, 14.711f)
                close()
                moveTo(10.891f, 16.131f)
                lineTo(12.961f, 16.131f)
                curveTo(13.791f, 16.131f, 14.32f, 16.479f, 14.32f, 17.369f)
                curveTo(14.32f, 18.229f, 13.69f, 18.5f, 12.92f, 18.5f)
                lineTo(10.891f, 18.5f)
                lineTo(10.891f, 16.131f)
                close()
            }
        }
        .build()
        return _behanceSquare!!
    }

private var _behanceSquare: ImageVector? = null
