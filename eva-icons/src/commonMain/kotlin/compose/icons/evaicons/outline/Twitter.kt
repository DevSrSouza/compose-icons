package compose.icons.evaicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.51f, 20.0f)
                lineTo(8.43f, 20.0f)
                arcToRelative(10.87f, 10.87f, 0.0f, false, true, -4.65f, -1.09f)
                arcTo(1.38f, 1.38f, 0.0f, false, true, 3.0f, 17.47f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 1.16f, -1.18f)
                arcToRelative(6.63f, 6.63f, 0.0f, false, false, 2.54f, -0.89f)
                arcTo(9.49f, 9.49f, 0.0f, false, true, 3.19f, 6.33f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 1.0f, -1.15f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, 1.43f, 0.41f)
                arcToRelative(7.09f, 7.09f, 0.0f, false, false, 4.88f, 2.75f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 1.41f, -3.1f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, true, 6.37f, 0.19f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.78f, 0.1f)
                arcTo(1.39f, 1.39f, 0.0f, false, true, 21.0f, 7.13f)
                arcToRelative(6.66f, 6.66f, 0.0f, false, true, -1.28f, 2.6f)
                arcTo(10.79f, 10.79f, 0.0f, false, true, 8.51f, 20.0f)
                close()
                moveTo(8.51f, 18.0f)
                horizontalLineToRelative(0.08f)
                arcToRelative(8.79f, 8.79f, 0.0f, false, false, 9.09f, -8.59f)
                arcToRelative(1.32f, 1.32f, 0.0f, false, true, 0.37f, -0.85f)
                arcToRelative(5.19f, 5.19f, 0.0f, false, false, 0.62f, -1.0f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, true, -1.91f, -0.85f)
                arcTo(2.45f, 2.45f, 0.0f, false, false, 15.0f, 6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.79f, 0.69f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, false, -0.72f, 2.42f)
                lineToRelative(0.26f, 1.14f)
                lineToRelative(-1.17f, 0.08f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -6.54f, -2.4f)
                arcToRelative(7.12f, 7.12f, 0.0f, false, false, 3.73f, 6.46f)
                lineToRelative(0.95f, 0.54f)
                lineToRelative(-0.63f, 0.9f)
                arcToRelative(5.62f, 5.62f, 0.0f, false, true, -2.68f, 1.92f)
                arcTo(8.34f, 8.34f, 0.0f, false, false, 8.5f, 18.0f)
                close()
                moveTo(19.0f, 6.65f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
