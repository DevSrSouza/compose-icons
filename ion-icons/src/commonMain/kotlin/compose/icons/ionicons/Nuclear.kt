package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Nuclear: ImageVector
    get() {
        if (_nuclear != null) {
            return _nuclear!!
        }
        _nuclear = Builder(name = "Nuclear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(258.9f, 48.0f)
                curveTo(141.92f, 46.42f, 46.42f, 141.92f, 48.0f, 258.9f)
                curveTo(49.56f, 371.09f, 140.91f, 462.44f, 253.1f, 464.0f)
                curveToRelative(117.0f, 1.6f, 212.48f, -93.9f, 210.88f, -210.88f)
                curveTo(462.44f, 140.91f, 371.09f, 49.56f, 258.9f, 48.0f)
                close()
                moveTo(429.0f, 239.92f)
                lineToRelative(-93.08f, -0.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.95f, -1.57f)
                arcToRelative(80.08f, 80.08f, 0.0f, false, false, -27.44f, -44.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.54f, -2.43f)
                lineToRelative(41.32f, -83.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.87f, -0.81f)
                arcTo(176.2f, 176.2f, 0.0f, false, true, 431.0f, 237.71f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 429.0f, 239.92f)
                close()
                moveTo(208.2f, 260.38f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 43.42f, 43.42f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 208.2f, 260.38f)
                close()
                moveTo(164.65f, 108.22f)
                lineTo(206.0f, 191.65f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.54f, 2.43f)
                arcTo(80.08f, 80.08f, 0.0f, false, false, 178.0f, 238.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.57f)
                lineToRelative(-93.08f, 0.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.21f)
                arcToRelative(176.2f, 176.2f, 0.0f, false, true, 80.82f, -130.3f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 164.65f, 108.22f)
                close()
                moveTo(164.28f, 403.56f)
                lineTo(220.59f, 329.47f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.43f, -0.6f)
                arcToRelative(79.84f, 79.84f, 0.0f, false, false, 66.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.43f, 0.6f)
                lineToRelative(56.31f, 74.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.54f, 2.92f)
                arcToRelative(175.65f, 175.65f, 0.0f, false, true, -182.36f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 164.28f, 403.56f)
                close()
            }
        }
        .build()
        return _nuclear!!
    }

private var _nuclear: ImageVector? = null
