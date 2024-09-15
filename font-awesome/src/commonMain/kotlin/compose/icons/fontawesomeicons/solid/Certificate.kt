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

public val SolidGroup.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = Builder(name = "Certificate", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(458.62f, 255.92f)
                lineToRelative(45.99f, -45.01f)
                curveToRelative(13.71f, -12.98f, 7.32f, -36.04f, -10.66f, -40.34f)
                lineToRelative(-62.65f, -15.99f)
                lineToRelative(17.66f, -62.01f)
                curveToRelative(4.99f, -17.84f, -11.83f, -34.66f, -29.66f, -29.67f)
                lineToRelative(-61.99f, 17.67f)
                lineToRelative(-15.98f, -62.67f)
                curveTo(337.08f, 0.2f, 313.77f, -6.28f, 300.99f, 7.23f)
                lineTo(256.0f, 53.57f)
                lineTo(211.01f, 7.23f)
                curveToRelative(-12.63f, -13.35f, -36.05f, -7.23f, -40.33f, 10.67f)
                lineToRelative(-15.98f, 62.67f)
                lineToRelative(-61.99f, -17.67f)
                curveTo(74.87f, 57.91f, 58.06f, 74.74f, 63.05f, 92.57f)
                lineToRelative(17.66f, 62.01f)
                lineToRelative(-62.65f, 15.99f)
                curveTo(0.07f, 174.88f, -6.31f, 197.94f, 7.39f, 210.91f)
                lineToRelative(45.99f, 45.01f)
                lineToRelative(-45.99f, 45.0f)
                curveToRelative(-13.71f, 12.98f, -7.32f, 36.04f, 10.66f, 40.34f)
                lineToRelative(62.65f, 15.99f)
                lineToRelative(-17.66f, 62.01f)
                curveToRelative(-4.99f, 17.84f, 11.83f, 34.66f, 29.66f, 29.67f)
                lineToRelative(61.99f, -17.67f)
                lineToRelative(15.98f, 62.67f)
                curveToRelative(4.44f, 18.58f, 27.7f, 24.02f, 40.33f, 10.67f)
                lineTo(256.0f, 458.61f)
                lineToRelative(44.99f, 46.0f)
                curveToRelative(12.5f, 13.49f, 35.99f, 7.49f, 40.33f, -10.67f)
                lineToRelative(15.98f, -62.67f)
                lineToRelative(61.99f, 17.67f)
                curveToRelative(17.84f, 4.99f, 34.65f, -11.84f, 29.66f, -29.67f)
                lineToRelative(-17.66f, -62.01f)
                lineToRelative(62.65f, -15.99f)
                curveToRelative(17.99f, -4.3f, 24.37f, -27.37f, 10.66f, -40.34f)
                lineToRelative(-45.98f, -45.0f)
                close()
            }
        }
        .build()
        return _certificate!!
    }

private var _certificate: ImageVector? = null
