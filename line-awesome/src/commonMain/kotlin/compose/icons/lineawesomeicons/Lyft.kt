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

public val LineAwesomeIcons.Lyft: ImageVector
    get() {
        if (_lyft != null) {
            return _lyft!!
        }
        _lyft = Builder(name = "Lyft", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.0f)
                lineTo(2.0f, 19.0f)
                curveTo(2.0f, 20.657f, 3.343f, 22.0f, 5.0f, 22.0f)
                lineTo(7.0625f, 22.0f)
                curveTo(6.4095f, 21.363f, 6.0f, 20.478f, 6.0f, 19.5f)
                lineTo(6.0f, 16.0f)
                lineTo(6.0f, 9.5f)
                lineTo(6.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                close()
                moveTo(22.5f, 8.0f)
                curveTo(19.462f, 8.0f, 17.0f, 10.462f, 17.0f, 13.5f)
                lineTo(17.0f, 15.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 22.0f)
                curveTo(19.209f, 22.0f, 21.0f, 20.209f, 21.0f, 18.0f)
                lineTo(23.0f, 18.0f)
                lineTo(23.0f, 14.0f)
                lineTo(21.0f, 14.0f)
                lineTo(21.0f, 13.5f)
                curveTo(21.0f, 12.672f, 21.672f, 12.0f, 22.5f, 12.0f)
                curveTo(23.328f, 12.0f, 24.0f, 12.672f, 24.0f, 13.5f)
                lineTo(24.0f, 16.0f)
                lineTo(24.0f, 17.0f)
                curveTo(24.0f, 19.761f, 26.239f, 22.0f, 29.0f, 22.0f)
                lineTo(30.0f, 22.0f)
                lineTo(30.0f, 18.0f)
                curveTo(28.895f, 18.0f, 28.0f, 17.105f, 28.0f, 16.0f)
                lineTo(30.0f, 16.0f)
                lineTo(30.0f, 12.0f)
                lineTo(27.7871f, 12.0f)
                curveTo(27.1331f, 9.693f, 25.017f, 8.0f, 22.5f, 8.0f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(7.0f, 19.0f)
                curveTo(7.0f, 20.65f, 8.35f, 22.0f, 10.0f, 22.0f)
                lineTo(10.5f, 22.0f)
                curveTo(11.209f, 22.0f, 11.867f, 21.7858f, 12.418f, 21.4238f)
                curveTo(12.287f, 21.6208f, 12.1387f, 21.8057f, 11.9707f, 21.9707f)
                curveTo(11.3407f, 22.6107f, 10.46f, 23.0f, 9.5f, 23.0f)
                curveTo(8.96f, 23.0f, 8.45f, 22.8804f, 8.0f, 22.6504f)
                lineTo(8.0f, 25.5801f)
                curveTo(8.61f, 25.8501f, 9.29f, 26.0f, 10.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                curveTo(13.75f, 26.0f, 16.0f, 23.75f, 16.0f, 21.0f)
                lineTo(16.0f, 12.0f)
                lineTo(12.0f, 12.0f)
                lineTo(12.0f, 17.5f)
                curveTo(12.0f, 17.775f, 11.775f, 18.0f, 11.5f, 18.0f)
                curveTo(11.225f, 18.0f, 11.0f, 17.775f, 11.0f, 17.5f)
                lineTo(11.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                close()
            }
        }
        .build()
        return _lyft!!
    }

private var _lyft: ImageVector? = null
