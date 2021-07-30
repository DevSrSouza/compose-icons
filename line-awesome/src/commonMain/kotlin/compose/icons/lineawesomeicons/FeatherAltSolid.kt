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

public val LineAwesomeIcons.FeatherAltSolid: ImageVector
    get() {
        if (_featherAltSolid != null) {
            return _featherAltSolid!!
        }
        _featherAltSolid = Builder(name = "FeatherAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.0f, 4.0f)
                curveTo(18.197f, 4.0f, 13.7985f, 8.7946f, 11.6855f, 11.0996f)
                lineTo(8.6367f, 14.1758f)
                curveTo(6.9357f, 15.8748f, 6.0f, 18.1341f, 6.0f, 20.5391f)
                lineTo(6.0f, 22.0f)
                lineTo(8.0273f, 19.9727f)
                curveTo(8.1593f, 18.3167f, 8.8629f, 16.7758f, 10.0469f, 15.5918f)
                lineTo(13.1602f, 12.4512f)
                curveTo(14.9962f, 10.4492f, 18.7286f, 6.3784f, 25.9746f, 6.0234f)
                curveTo(25.7532f, 10.5447f, 24.0859f, 13.6968f, 22.377f, 15.875f)
                lineTo(19.0f, 17.0f)
                lineTo(21.418f, 17.0f)
                curveTo(20.7237f, 17.7564f, 20.0666f, 18.365f, 19.5488f, 18.8398f)
                lineTo(18.5684f, 19.8105f)
                lineTo(15.0f, 21.0f)
                lineTo(17.3672f, 21.0f)
                lineTo(16.4102f, 21.9473f)
                curveTo(15.0882f, 23.2693f, 13.3309f, 23.998f, 11.4609f, 23.998f)
                lineTo(9.416f, 23.998f)
                lineTo(18.707f, 14.707f)
                lineTo(17.293f, 13.293f)
                lineTo(4.0f, 26.5859f)
                lineTo(5.4141f, 28.0f)
                lineTo(7.416f, 25.998f)
                lineTo(11.4609f, 25.998f)
                curveTo(13.8649f, 25.998f, 16.1251f, 25.0614f, 17.8281f, 23.3574f)
                lineTo(20.8984f, 20.3125f)
                curveTo(23.2034f, 18.2015f, 28.0f, 13.804f, 28.0f, 5.0f)
                lineTo(28.0f, 4.0f)
                lineTo(27.0f, 4.0f)
                close()
            }
        }
        .build()
        return _featherAltSolid!!
    }

private var _featherAltSolid: ImageVector? = null
