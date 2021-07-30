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

public val SolidGroup.CommentDollar: ImageVector
    get() {
        if (_commentDollar != null) {
            return _commentDollar!!
        }
        _commentDollar = Builder(name = "CommentDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(114.62f, 32.0f, 0.0f, 125.12f, 0.0f, 240.0f)
                curveToRelative(0.0f, 49.56f, 21.41f, 95.01f, 57.02f, 130.74f)
                curveTo(44.46f, 421.05f, 2.7f, 465.97f, 2.2f, 466.5f)
                arcTo(7.995f, 7.995f, 0.0f, false, false, 8.0f, 480.0f)
                curveToRelative(66.26f, 0.0f, 115.99f, -31.75f, 140.6f, -51.38f)
                curveTo(181.29f, 440.93f, 217.59f, 448.0f, 256.0f, 448.0f)
                curveToRelative(141.38f, 0.0f, 256.0f, -93.12f, 256.0f, -208.0f)
                reflectiveCurveTo(397.38f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(280.0f, 334.44f)
                lineTo(280.0f, 352.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-17.73f)
                curveToRelative(-11.42f, -1.35f, -22.28f, -5.19f, -31.78f, -11.46f)
                curveToRelative(-6.22f, -4.11f, -6.82f, -13.11f, -1.55f, -18.38f)
                lineToRelative(17.52f, -17.52f)
                curveToRelative(3.74f, -3.74f, 9.31f, -4.24f, 14.11f, -2.03f)
                curveToRelative(3.18f, 1.46f, 6.66f, 2.22f, 10.26f, 2.22f)
                horizontalLineToRelative(32.78f)
                curveToRelative(4.66f, 0.0f, 8.44f, -3.78f, 8.44f, -8.42f)
                curveToRelative(0.0f, -3.75f, -2.52f, -7.08f, -6.12f, -8.11f)
                lineToRelative(-50.07f, -14.3f)
                curveToRelative(-22.25f, -6.35f, -40.01f, -24.71f, -42.91f, -47.67f)
                curveToRelative(-4.05f, -32.07f, 19.03f, -59.43f, 49.32f, -63.05f)
                lineTo(232.0f, 128.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(17.73f)
                curveToRelative(11.42f, 1.35f, 22.28f, 5.19f, 31.78f, 11.46f)
                curveToRelative(6.22f, 4.11f, 6.82f, 13.11f, 1.55f, 18.38f)
                lineToRelative(-17.52f, 17.52f)
                curveToRelative(-3.74f, 3.74f, -9.31f, 4.24f, -14.11f, 2.03f)
                arcToRelative(24.516f, 24.516f, 0.0f, false, false, -10.26f, -2.22f)
                horizontalLineToRelative(-32.78f)
                curveToRelative(-4.66f, 0.0f, -8.44f, 3.78f, -8.44f, 8.42f)
                curveToRelative(0.0f, 3.75f, 2.52f, 7.08f, 6.12f, 8.11f)
                lineToRelative(50.07f, 14.3f)
                curveToRelative(22.25f, 6.36f, 40.01f, 24.71f, 42.91f, 47.67f)
                curveToRelative(4.05f, 32.06f, -19.03f, 59.42f, -49.32f, 63.04f)
                close()
            }
        }
        .build()
        return _commentDollar!!
    }

private var _commentDollar: ImageVector? = null
