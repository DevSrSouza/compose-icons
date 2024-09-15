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
                lineTo(11.266f, 13.359f)
                curveTo(8.71f, 14.949f, 7.0f, 17.775f, 7.0f, 21.0f)
                curveTo(7.0f, 25.962f, 11.037f, 30.0f, 16.0f, 30.0f)
                curveTo(20.963f, 30.0f, 25.0f, 25.962f, 25.0f, 21.0f)
                curveTo(25.0f, 17.775f, 23.29f, 14.949f, 20.734f, 13.359f)
                lineTo(25.0f, 3.0f)
                lineTo(22.838f, 3.0f)
                lineTo(18.926f, 12.498f)
                curveTo(18.269f, 12.271f, 17.581f, 12.113f, 16.865f, 12.045f)
                lineTo(20.588f, 3.0f)
                lineTo(18.426f, 3.0f)
                lineTo(14.674f, 12.109f)
                curveTo(14.123f, 12.191f, 13.588f, 12.321f, 13.074f, 12.498f)
                lineTo(9.162f, 3.0f)
                lineTo(7.0f, 3.0f)
                close()
                moveTo(11.412f, 3.0f)
                lineTo(13.953f, 9.174f)
                lineTo(15.035f, 6.547f)
                lineTo(13.574f, 3.0f)
                lineTo(11.412f, 3.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(19.859f, 14.0f, 23.0f, 17.14f, 23.0f, 21.0f)
                curveTo(23.0f, 24.86f, 19.859f, 28.0f, 16.0f, 28.0f)
                curveTo(12.141f, 28.0f, 9.0f, 24.86f, 9.0f, 21.0f)
                curveTo(9.0f, 17.14f, 12.141f, 14.0f, 16.0f, 14.0f)
                close()
                moveTo(16.0f, 17.162f)
                lineTo(14.832f, 19.781f)
                lineTo(12.0f, 20.092f)
                lineTo(14.119f, 21.996f)
                lineTo(13.523f, 24.807f)
                lineTo(16.0f, 23.377f)
                lineTo(18.477f, 24.807f)
                lineTo(17.881f, 21.996f)
                lineTo(20.0f, 20.092f)
                lineTo(17.168f, 19.781f)
                lineTo(16.0f, 17.162f)
                close()
            }
        }
        .build()
        return _medalSolid!!
    }

private var _medalSolid: ImageVector? = null
