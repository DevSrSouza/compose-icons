package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Dailymotion: ImageVector
    get() {
        if (_dailymotion != null) {
            return _dailymotion!!
        }
        _dailymotion = Builder(name = "Dailymotion", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(298.93f, 267.0f)
                arcToRelative(48.4f, 48.4f, 0.0f, false, false, -24.36f, -6.21f)
                quadToRelative(-19.83f, 0.0f, -33.44f, 13.27f)
                reflectiveQuadToRelative(-13.61f, 33.42f)
                quadToRelative(0.0f, 21.16f, 13.28f, 34.6f)
                reflectiveQuadToRelative(33.43f, 13.44f)
                quadToRelative(20.5f, 0.0f, 34.11f, -13.78f)
                reflectiveQuadTo(322.0f, 307.47f)
                arcTo(47.13f, 47.13f, 0.0f, false, false, 315.9f, 284.0f)
                arcTo(44.13f, 44.13f, 0.0f, false, false, 298.93f, 267.0f)
                close()
                moveTo(0.0f, 32.0f)
                verticalLineTo(480.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(32.0f)
                close()
                moveTo(374.71f, 405.26f)
                horizontalLineToRelative(-53.1f)
                verticalLineTo(381.37f)
                horizontalLineToRelative(-0.67f)
                quadToRelative(-15.79f, 26.2f, -55.78f, 26.2f)
                quadToRelative(-27.56f, 0.0f, -48.89f, -13.1f)
                arcToRelative(88.29f, 88.29f, 0.0f, false, true, -32.94f, -35.77f)
                quadToRelative(-11.6f, -22.68f, -11.59f, -50.89f)
                quadToRelative(0.0f, -27.56f, 11.76f, -50.22f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, true, 32.93f, -35.78f)
                quadToRelative(21.18f, -13.09f, 47.72f, -13.1f)
                arcToRelative(80.87f, 80.87f, 0.0f, false, true, 29.74f, 5.21f)
                quadToRelative(13.28f, 5.21f, 25.0f, 17.0f)
                verticalLineTo(153.0f)
                lineToRelative(55.79f, -12.09f)
                close()
            }
        }
        .build()
        return _dailymotion!!
    }

private var _dailymotion: ImageVector? = null
