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

public val SolidGroup.DraftingCompass: ImageVector
    get() {
        if (_draftingCompass != null) {
            return _draftingCompass!!
        }
        _draftingCompass = Builder(name = "DraftingCompass", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(457.01f, 344.42f)
                curveToRelative(-25.05f, 20.33f, -52.63f, 37.18f, -82.54f, 49.05f)
                lineToRelative(54.38f, 94.19f)
                lineToRelative(53.95f, 23.04f)
                curveToRelative(9.81f, 4.19f, 20.89f, -2.21f, 22.17f, -12.8f)
                lineToRelative(7.02f, -58.25f)
                lineToRelative(-54.98f, -95.23f)
                close()
                moveTo(499.5f, 249.86f)
                curveToRelative(4.86f, -7.67f, 1.89f, -17.99f, -6.05f, -22.39f)
                lineToRelative(-28.07f, -15.57f)
                curveToRelative(-7.48f, -4.15f, -16.61f, -1.46f, -21.26f, 5.72f)
                curveTo(403.01f, 281.15f, 332.25f, 320.0f, 256.0f, 320.0f)
                curveToRelative(-23.93f, 0.0f, -47.23f, -4.25f, -69.41f, -11.53f)
                lineToRelative(67.36f, -116.68f)
                curveToRelative(0.7f, 0.02f, 1.34f, 0.21f, 2.04f, 0.21f)
                reflectiveCurveToRelative(1.35f, -0.19f, 2.04f, -0.21f)
                lineToRelative(51.09f, 88.5f)
                curveToRelative(31.23f, -8.96f, 59.56f, -25.75f, 82.61f, -48.92f)
                lineToRelative(-51.79f, -89.71f)
                curveTo(347.39f, 128.03f, 352.0f, 112.63f, 352.0f, 96.0f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 42.98f, -96.0f, 96.0f)
                curveToRelative(0.0f, 16.63f, 4.61f, 32.03f, 12.05f, 45.66f)
                lineToRelative(-68.3f, 118.31f)
                curveToRelative(-12.55f, -11.61f, -23.96f, -24.59f, -33.68f, -39.0f)
                curveToRelative(-4.79f, -7.1f, -13.97f, -9.62f, -21.38f, -5.33f)
                lineToRelative(-27.75f, 16.07f)
                curveToRelative(-7.85f, 4.54f, -10.63f, 14.9f, -5.64f, 22.47f)
                curveToRelative(15.57f, 23.64f, 34.69f, 44.21f, 55.98f, 62.02f)
                lineTo(0.0f, 439.66f)
                lineToRelative(7.02f, 58.25f)
                curveToRelative(1.28f, 10.59f, 12.36f, 16.99f, 22.17f, 12.8f)
                lineToRelative(53.95f, -23.04f)
                lineToRelative(70.8f, -122.63f)
                curveTo(186.13f, 377.28f, 220.62f, 384.0f, 256.0f, 384.0f)
                curveToRelative(99.05f, 0.0f, 190.88f, -51.01f, 243.5f, -134.14f)
                close()
                moveTo(256.0f, 64.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, 14.33f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.33f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _draftingCompass!!
    }

private var _draftingCompass: ImageVector? = null
