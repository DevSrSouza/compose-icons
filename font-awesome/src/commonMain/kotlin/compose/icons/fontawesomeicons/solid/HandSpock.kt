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

public val SolidGroup.HandSpock: ImageVector
    get() {
        if (_handSpock != null) {
            return _handSpock!!
        }
        _handSpock = Builder(name = "HandSpock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(510.9f, 145.27f)
                lineTo(442.6f, 432.09f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 341.44f, 512.0f)
                horizontalLineTo(214.07f)
                arcToRelative(135.97f, 135.97f, 0.0f, false, true, -93.18f, -36.95f)
                lineTo(12.59f, 373.13f)
                arcToRelative(39.99f, 39.99f, 0.0f, false, true, 54.81f, -58.25f)
                lineToRelative(60.59f, 57.03f)
                verticalLineToRelative(0.0f)
                arcToRelative(283.25f, 283.25f, 0.0f, false, false, -11.67f, -80.47f)
                lineTo(73.64f, 147.36f)
                arcToRelative(40.01f, 40.01f, 0.0f, true, true, 76.72f, -22.72f)
                lineToRelative(37.15f, 125.39f)
                arcToRelative(8.33f, 8.33f, 0.0f, false, false, 16.06f, -4.44f)
                lineTo(153.26f, 49.95f)
                arcTo(40.0f, 40.0f, 0.0f, true, true, 230.73f, 30.02f)
                lineToRelative(56.09f, 218.16f)
                arcToRelative(10.42f, 10.42f, 0.0f, false, false, 20.3f, -0.5f)
                lineTo(344.81f, 63.97f)
                arcToRelative(40.05f, 40.05f, 0.0f, false, true, 51.3f, -30.09f)
                curveToRelative(19.86f, 6.3f, 30.86f, 27.67f, 26.68f, 48.08f)
                lineToRelative(-33.84f, 164.97f)
                arcToRelative(7.55f, 7.55f, 0.0f, false, false, 14.74f, 3.27f)
                lineToRelative(29.4f, -123.46f)
                arcToRelative(39.99f, 39.99f, 0.0f, true, true, 77.81f, 18.53f)
                close()
            }
        }
        .build()
        return _handSpock!!
    }

private var _handSpock: ImageVector? = null
