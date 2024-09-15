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

public val LineAwesomeIcons.Quora: ImageVector
    get() {
        if (_quora != null) {
            return _quora!!
        }
        _quora = Builder(name = "Quora", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.492f, 4.0f)
                curveTo(10.201f, 4.0f, 5.0f, 8.23f, 5.0f, 14.439f)
                curveTo(5.0f, 21.556f, 11.969f, 26.199f, 18.215f, 24.469f)
                curveTo(19.261f, 26.252f, 20.639f, 28.0f, 23.266f, 28.0f)
                curveTo(27.607f, 28.0f, 28.0f, 24.0f, 28.0f, 23.0f)
                lineTo(26.445f, 23.0f)
                curveTo(26.365f, 23.716f, 25.878f, 24.457f, 24.684f, 24.457f)
                curveTo(23.596f, 24.457f, 22.811f, 23.705f, 22.057f, 22.559f)
                curveTo(24.403f, 20.744f, 25.949f, 17.913f, 25.949f, 14.438f)
                curveTo(25.954f, 8.203f, 20.894f, 4.0f, 15.492f, 4.0f)
                close()
                moveTo(15.492f, 6.0f)
                curveTo(19.536f, 6.0f, 21.262f, 8.909f, 21.262f, 14.439f)
                curveTo(21.267f, 16.657f, 20.973f, 18.45f, 20.373f, 19.771f)
                curveTo(19.338f, 18.221f, 18.055f, 17.002f, 15.518f, 17.002f)
                curveTo(13.899f, 17.002f, 12.793f, 17.473f, 12.012f, 18.152f)
                lineTo(12.658f, 19.443f)
                curveTo(12.987f, 19.284f, 13.194f, 19.289f, 13.555f, 19.289f)
                curveTo(15.439f, 19.289f, 16.405f, 20.925f, 17.227f, 22.543f)
                curveTo(16.696f, 22.702f, 16.126f, 22.766f, 15.49f, 22.766f)
                curveTo(11.51f, 22.766f, 9.785f, 19.952f, 9.785f, 14.449f)
                curveTo(9.786f, 8.908f, 11.512f, 6.0f, 15.492f, 6.0f)
                close()
            }
        }
        .build()
        return _quora!!
    }

private var _quora: ImageVector? = null
