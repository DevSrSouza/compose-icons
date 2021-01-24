package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BookReader: ImageVector
    get() {
        if (_bookReader != null) {
            return _bookReader!!
        }
        _bookReader = Builder(name = "BookReader", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 96.0f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 42.98f, -96.0f, 96.0f)
                reflectiveCurveToRelative(42.98f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -42.98f, 96.0f, -96.0f)
                close()
                moveTo(233.59f, 241.1f)
                curveToRelative(-59.33f, -36.32f, -155.43f, -46.3f, -203.79f, -49.05f)
                curveTo(13.55f, 191.13f, 0.0f, 203.51f, 0.0f, 219.14f)
                verticalLineToRelative(222.8f)
                curveToRelative(0.0f, 14.33f, 11.59f, 26.28f, 26.49f, 27.05f)
                curveToRelative(43.66f, 2.29f, 131.99f, 10.68f, 193.04f, 41.43f)
                curveToRelative(9.37f, 4.72f, 20.48f, -1.71f, 20.48f, -11.87f)
                lineTo(240.01f, 252.56f)
                curveToRelative(-0.01f, -4.67f, -2.32f, -8.95f, -6.42f, -11.46f)
                close()
                moveTo(482.2f, 192.05f)
                curveToRelative(-48.35f, 2.74f, -144.46f, 12.73f, -203.78f, 49.05f)
                curveToRelative(-4.1f, 2.51f, -6.41f, 6.96f, -6.41f, 11.63f)
                verticalLineToRelative(245.79f)
                curveToRelative(0.0f, 10.19f, 11.14f, 16.63f, 20.54f, 11.9f)
                curveToRelative(61.04f, -30.72f, 149.32f, -39.11f, 192.97f, -41.4f)
                curveToRelative(14.9f, -0.78f, 26.49f, -12.73f, 26.49f, -27.06f)
                lineTo(512.01f, 219.14f)
                curveToRelative(-0.01f, -15.63f, -13.56f, -28.01f, -29.81f, -27.09f)
                close()
            }
        }
        .build()
        return _bookReader!!
    }

private var _bookReader: ImageVector? = null
