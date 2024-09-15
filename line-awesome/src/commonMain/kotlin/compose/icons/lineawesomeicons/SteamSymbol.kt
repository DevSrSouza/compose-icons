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

public val LineAwesomeIcons.SteamSymbol: ImageVector
    get() {
        if (_steamSymbol != null) {
            return _steamSymbol!!
        }
        _steamSymbol = Builder(name = "SteamSymbol", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                curveTo(18.746f, 6.0f, 16.095f, 8.604f, 16.008f, 11.838f)
                lineTo(12.338f, 17.084f)
                curveTo(12.066f, 17.032f, 11.787f, 17.0f, 11.5f, 17.0f)
                curveTo(10.552f, 17.0f, 9.674f, 17.298f, 8.947f, 17.801f)
                lineTo(4.0f, 15.844f)
                lineTo(4.0f, 21.221f)
                lineTo(7.105f, 22.449f)
                curveTo(7.543f, 24.475f, 9.345f, 26.0f, 11.5f, 26.0f)
                curveTo(13.704f, 26.0f, 15.534f, 24.405f, 15.918f, 22.311f)
                lineTo(21.691f, 17.984f)
                curveTo(21.794f, 17.99f, 21.896f, 18.0f, 22.0f, 18.0f)
                curveTo(25.309f, 18.0f, 28.0f, 15.309f, 28.0f, 12.0f)
                curveTo(28.0f, 8.691f, 25.309f, 6.0f, 22.0f, 6.0f)
                close()
                moveTo(22.0f, 8.0f)
                curveTo(24.206f, 8.0f, 26.0f, 9.794f, 26.0f, 12.0f)
                curveTo(26.0f, 14.206f, 24.206f, 16.0f, 22.0f, 16.0f)
                curveTo(19.794f, 16.0f, 18.0f, 14.206f, 18.0f, 12.0f)
                curveTo(18.0f, 9.794f, 19.794f, 8.0f, 22.0f, 8.0f)
                close()
                moveTo(22.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 9.0f)
                close()
                moveTo(11.5f, 18.0f)
                curveTo(13.43f, 18.0f, 15.0f, 19.57f, 15.0f, 21.5f)
                curveTo(15.0f, 23.43f, 13.43f, 25.0f, 11.5f, 25.0f)
                curveTo(10.079f, 25.0f, 8.858f, 24.145f, 8.311f, 22.926f)
                lineTo(10.58f, 23.824f)
                curveTo(10.882f, 23.944f, 11.192f, 24.002f, 11.498f, 24.002f)
                curveTo(12.494f, 24.002f, 13.436f, 23.404f, 13.824f, 22.422f)
                curveTo(14.333f, 21.138f, 13.704f, 19.684f, 12.42f, 19.176f)
                lineTo(10.143f, 18.273f)
                curveTo(10.56f, 18.097f, 11.019f, 18.0f, 11.5f, 18.0f)
                close()
            }
        }
        .build()
        return _steamSymbol!!
    }

private var _steamSymbol: ImageVector? = null
