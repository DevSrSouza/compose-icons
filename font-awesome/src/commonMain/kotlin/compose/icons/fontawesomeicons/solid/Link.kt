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

public val SolidGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(326.61f, 185.39f)
                curveToRelative(59.75f, 59.81f, 58.93f, 155.7f, 0.36f, 214.59f)
                curveToRelative(-0.11f, 0.12f, -0.24f, 0.25f, -0.36f, 0.37f)
                lineToRelative(-67.2f, 67.2f)
                curveToRelative(-59.27f, 59.27f, -155.7f, 59.26f, -214.96f, 0.0f)
                curveToRelative(-59.27f, -59.26f, -59.27f, -155.7f, 0.0f, -214.96f)
                lineToRelative(37.11f, -37.11f)
                curveToRelative(9.84f, -9.84f, 26.79f, -3.3f, 27.29f, 10.61f)
                curveToRelative(0.65f, 17.72f, 3.83f, 35.53f, 9.69f, 52.72f)
                curveToRelative(1.99f, 5.82f, 0.57f, 12.26f, -3.78f, 16.61f)
                lineToRelative(-13.09f, 13.09f)
                curveToRelative(-28.03f, 28.03f, -28.91f, 73.66f, -1.15f, 101.96f)
                curveToRelative(28.02f, 28.58f, 74.09f, 28.75f, 102.32f, 0.51f)
                lineToRelative(67.2f, -67.19f)
                curveToRelative(28.19f, -28.19f, 28.07f, -73.76f, 0.0f, -101.83f)
                curveToRelative(-3.7f, -3.69f, -7.43f, -6.56f, -10.34f, -8.57f)
                arcToRelative(16.04f, 16.04f, 0.0f, false, true, -6.95f, -12.61f)
                curveToRelative(-0.4f, -10.57f, 3.35f, -21.46f, 11.7f, -29.81f)
                lineToRelative(21.05f, -21.06f)
                curveToRelative(5.52f, -5.52f, 14.18f, -6.2f, 20.58f, -1.73f)
                arcToRelative(152.48f, 152.48f, 0.0f, false, true, 20.52f, 17.2f)
                close()
                moveTo(467.55f, 44.45f)
                curveToRelative(-59.26f, -59.26f, -155.69f, -59.27f, -214.96f, 0.0f)
                lineToRelative(-67.2f, 67.2f)
                curveToRelative(-0.12f, 0.12f, -0.25f, 0.25f, -0.36f, 0.37f)
                curveToRelative(-58.57f, 58.89f, -59.39f, 154.78f, 0.36f, 214.59f)
                arcToRelative(152.45f, 152.45f, 0.0f, false, false, 20.52f, 17.2f)
                curveToRelative(6.4f, 4.47f, 15.06f, 3.79f, 20.58f, -1.73f)
                lineToRelative(21.05f, -21.06f)
                curveToRelative(8.35f, -8.35f, 12.09f, -19.24f, 11.7f, -29.81f)
                arcToRelative(16.04f, 16.04f, 0.0f, false, false, -6.95f, -12.61f)
                curveToRelative(-2.91f, -2.01f, -6.64f, -4.88f, -10.34f, -8.57f)
                curveToRelative(-28.07f, -28.07f, -28.19f, -73.64f, 0.0f, -101.83f)
                lineToRelative(67.2f, -67.19f)
                curveToRelative(28.24f, -28.24f, 74.3f, -28.07f, 102.32f, 0.51f)
                curveToRelative(27.75f, 28.3f, 26.87f, 73.93f, -1.15f, 101.96f)
                lineToRelative(-13.09f, 13.09f)
                curveToRelative(-4.35f, 4.35f, -5.77f, 10.79f, -3.78f, 16.61f)
                curveToRelative(5.86f, 17.19f, 9.04f, 35.0f, 9.69f, 52.72f)
                curveToRelative(0.51f, 13.91f, 17.45f, 20.45f, 27.29f, 10.61f)
                lineToRelative(37.11f, -37.11f)
                curveToRelative(59.27f, -59.26f, 59.27f, -155.7f, 0.0f, -214.96f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
