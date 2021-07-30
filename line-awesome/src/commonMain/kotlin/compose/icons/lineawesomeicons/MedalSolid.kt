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

public val LineAwesomeIcons.MedalSolid: ImageVector
    get() {
        if (_medalSolid != null) {
            return _medalSolid!!
        }
        _medalSolid = Builder(name = "MedalSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                lineTo(11.2656f, 13.3594f)
                curveTo(8.7097f, 14.9489f, 7.0f, 17.7754f, 7.0f, 21.0f)
                curveTo(7.0f, 25.962f, 11.037f, 30.0f, 16.0f, 30.0f)
                curveTo(20.963f, 30.0f, 25.0f, 25.962f, 25.0f, 21.0f)
                curveTo(25.0f, 17.7754f, 23.2903f, 14.9489f, 20.7344f, 13.3594f)
                lineTo(25.0f, 3.0f)
                lineTo(22.8379f, 3.0f)
                lineTo(18.9258f, 12.498f)
                curveTo(18.2686f, 12.2712f, 17.5809f, 12.1135f, 16.8652f, 12.0449f)
                lineTo(20.5879f, 3.0f)
                lineTo(18.4258f, 3.0f)
                lineTo(14.6738f, 12.1094f)
                curveTo(14.1226f, 12.1913f, 13.5884f, 12.3206f, 13.0742f, 12.498f)
                lineTo(9.1621f, 3.0f)
                lineTo(7.0f, 3.0f)
                close()
                moveTo(11.4121f, 3.0f)
                lineTo(13.9531f, 9.1738f)
                lineTo(15.0352f, 6.5469f)
                lineTo(13.5742f, 3.0f)
                lineTo(11.4121f, 3.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(19.859f, 14.0f, 23.0f, 17.14f, 23.0f, 21.0f)
                curveTo(23.0f, 24.86f, 19.859f, 28.0f, 16.0f, 28.0f)
                curveTo(12.141f, 28.0f, 9.0f, 24.86f, 9.0f, 21.0f)
                curveTo(9.0f, 17.14f, 12.141f, 14.0f, 16.0f, 14.0f)
                close()
                moveTo(16.0f, 17.1621f)
                lineTo(14.832f, 19.7813f)
                lineTo(12.0f, 20.0918f)
                lineTo(14.1191f, 21.9961f)
                lineTo(13.5234f, 24.8066f)
                lineTo(16.0f, 23.377f)
                lineTo(18.4766f, 24.8066f)
                lineTo(17.8809f, 21.9961f)
                lineTo(20.0f, 20.0918f)
                lineTo(17.168f, 19.7813f)
                lineTo(16.0f, 17.1621f)
                close()
            }
        }
        .build()
        return _medalSolid!!
    }

private var _medalSolid: ImageVector? = null
