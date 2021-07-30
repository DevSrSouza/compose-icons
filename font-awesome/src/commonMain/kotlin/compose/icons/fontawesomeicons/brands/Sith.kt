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

public val BrandsGroup.Sith: ImageVector
    get() {
        if (_sith != null) {
            return _sith!!
        }
        _sith = Builder(name = "Sith", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                lineToRelative(69.71f, 118.75f)
                lineToRelative(-58.86f, -11.52f)
                lineToRelative(69.84f, 91.03f)
                arcToRelative(146.741f, 146.741f, 0.0f, false, false, 0.0f, 51.45f)
                lineToRelative(-69.84f, 91.03f)
                lineToRelative(58.86f, -11.52f)
                lineTo(0.0f, 480.0f)
                lineToRelative(118.75f, -69.71f)
                lineToRelative(-11.52f, 58.86f)
                lineToRelative(91.03f, -69.84f)
                curveToRelative(17.02f, 3.04f, 34.47f, 3.04f, 51.48f, 0.0f)
                lineToRelative(91.03f, 69.84f)
                lineToRelative(-11.52f, -58.86f)
                lineTo(448.0f, 480.0f)
                lineToRelative(-69.71f, -118.78f)
                lineToRelative(58.86f, 11.52f)
                lineToRelative(-69.84f, -91.03f)
                curveToRelative(3.03f, -17.01f, 3.04f, -34.44f, 0.0f, -51.45f)
                lineToRelative(69.84f, -91.03f)
                lineToRelative(-58.86f, 11.52f)
                lineTo(448.0f, 32.0f)
                lineToRelative(-118.75f, 69.71f)
                lineToRelative(11.52f, -58.9f)
                lineToRelative(-91.06f, 69.87f)
                curveToRelative(-8.5f, -1.52f, -17.1f, -2.29f, -25.71f, -2.29f)
                reflectiveCurveToRelative(-17.21f, 0.78f, -25.71f, 2.29f)
                lineToRelative(-91.06f, -69.87f)
                lineToRelative(11.52f, 58.9f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(224.0f, 131.78f)
                curveToRelative(31.8f, 0.0f, 63.6f, 12.12f, 87.85f, 36.37f)
                curveToRelative(48.5f, 48.5f, 48.49f, 127.21f, 0.0f, 175.7f)
                reflectiveCurveToRelative(-127.2f, 48.46f, -175.7f, -0.03f)
                curveToRelative(-48.5f, -48.5f, -48.49f, -127.21f, 0.0f, -175.7f)
                curveToRelative(24.24f, -24.25f, 56.05f, -36.34f, 87.85f, -36.34f)
                close()
                moveTo(224.0f, 168.44f)
                curveToRelative(-22.42f, 0.0f, -44.83f, 8.52f, -61.92f, 25.61f)
                curveToRelative(-34.18f, 34.18f, -34.19f, 89.68f, 0.0f, 123.87f)
                reflectiveCurveToRelative(89.65f, 34.18f, 123.84f, 0.0f)
                curveToRelative(34.18f, -34.18f, 34.19f, -89.68f, 0.0f, -123.87f)
                curveToRelative(-17.09f, -17.09f, -39.5f, -25.61f, -61.92f, -25.61f)
                close()
            }
        }
        .build()
        return _sith!!
    }

private var _sith: ImageVector? = null
