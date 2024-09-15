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

public val LineAwesomeIcons.Mdb: ImageVector
    get() {
        if (_mdb != null) {
            return _mdb!!
        }
        _mdb = Builder(name = "Mdb", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.08f, 9.0f)
                lineTo(0.08f, 21.0f)
                lineTo(2.088f, 21.0f)
                lineTo(2.645f, 14.305f)
                lineTo(5.322f, 21.0f)
                lineTo(6.678f, 21.0f)
                lineTo(9.355f, 14.305f)
                lineTo(9.912f, 21.0f)
                lineTo(11.92f, 21.0f)
                lineTo(10.92f, 9.0f)
                lineTo(9.322f, 9.0f)
                lineTo(6.0f, 17.309f)
                lineTo(2.678f, 9.0f)
                lineTo(1.08f, 9.0f)
                close()
                moveTo(14.0f, 9.0f)
                lineTo(14.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                curveTo(19.302f, 21.0f, 22.0f, 18.302f, 22.0f, 15.0f)
                curveTo(22.0f, 11.698f, 19.302f, 9.0f, 16.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                close()
                moveTo(24.0f, 9.0f)
                lineTo(24.0f, 14.0f)
                lineTo(24.0f, 16.0f)
                lineTo(24.0f, 21.012f)
                lineTo(28.494f, 21.012f)
                curveTo(30.419f, 21.012f, 32.0f, 19.43f, 32.0f, 17.506f)
                curveTo(32.0f, 16.236f, 31.277f, 15.164f, 30.256f, 14.549f)
                curveTo(30.692f, 13.965f, 31.0f, 13.279f, 31.0f, 12.5f)
                curveTo(31.0f, 10.579f, 29.421f, 9.0f, 27.5f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(18.22f, 11.0f, 20.0f, 12.78f, 20.0f, 15.0f)
                curveTo(20.0f, 17.22f, 18.22f, 19.0f, 16.0f, 19.0f)
                lineTo(16.0f, 11.0f)
                close()
                moveTo(26.0f, 11.0f)
                lineTo(27.5f, 11.0f)
                curveTo(28.341f, 11.0f, 29.0f, 11.659f, 29.0f, 12.5f)
                curveTo(29.0f, 13.341f, 28.341f, 14.0f, 27.5f, 14.0f)
                lineTo(26.0f, 14.0f)
                lineTo(26.0f, 11.0f)
                close()
                moveTo(26.0f, 16.0f)
                lineTo(27.5f, 16.0f)
                lineTo(28.494f, 16.0f)
                curveTo(29.338f, 16.0f, 30.0f, 16.662f, 30.0f, 17.506f)
                curveTo(30.0f, 18.349f, 29.338f, 19.012f, 28.494f, 19.012f)
                lineTo(26.0f, 19.012f)
                lineTo(26.0f, 16.0f)
                close()
            }
        }
        .build()
        return _mdb!!
    }

private var _mdb: ImageVector? = null
