package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-48.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.93f, 303.91f)
                arcToRelative(67.49f, 67.49f, 0.0f, false, false, -44.34f, -115.53f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, -4.58f, -3.21f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.21f, 5.21f, 0.0f, false, true, 1.0f, -5.51f)
                arcTo(67.83f, 67.83f, 0.0f, false, false, 378.0f, 66.33f)
                horizontalLineToRelative(-0.25f)
                arcTo(67.13f, 67.13f, 0.0f, false, false, 332.35f, 84.0f)
                arcToRelative(5.21f, 5.21f, 0.0f, false, true, -5.52f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, true, -3.22f, -4.58f)
                arcToRelative(67.68f, 67.68f, 0.0f, false, false, -135.23f, 0.0f)
                arcTo(5.2f, 5.2f, 0.0f, false, true, 185.17f, 85.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.21f, 5.21f, 0.0f, false, true, -5.52f, -1.0f)
                arcToRelative(67.11f, 67.11f, 0.0f, false, false, -45.44f, -17.69f)
                horizontalLineTo(134.0f)
                arcTo(67.91f, 67.91f, 0.0f, false, false, 84.0f, 179.65f)
                arcToRelative(5.21f, 5.21f, 0.0f, false, true, 1.0f, 5.51f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, -4.58f, 3.21f)
                arcToRelative(67.71f, 67.71f, 0.0f, false, false, 0.0f, 135.23f)
                arcTo(5.23f, 5.23f, 0.0f, false, true, 85.0f, 326.83f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.22f, 5.22f, 0.0f, false, true, -1.0f, 5.52f)
                arcToRelative(67.54f, 67.54f, 0.0f, false, false, 50.08f, 113.0f)
                horizontalLineToRelative(0.25f)
                arcTo(67.38f, 67.38f, 0.0f, false, false, 179.65f, 428.0f)
                arcToRelative(5.21f, 5.21f, 0.0f, false, true, 5.51f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, 3.21f, 4.58f)
                arcToRelative(67.71f, 67.71f, 0.0f, false, false, 135.23f, 0.0f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, true, 3.22f, -4.58f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.21f, 5.21f, 0.0f, false, true, 5.51f, 1.0f)
                arcToRelative(67.38f, 67.38f, 0.0f, false, false, 45.29f, 17.42f)
                horizontalLineToRelative(0.25f)
                arcToRelative(67.48f, 67.48f, 0.0f, false, false, 50.08f, -113.0f)
                arcToRelative(5.22f, 5.22f, 0.0f, false, true, -1.0f, -5.52f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, true, 4.58f, -3.22f)
                arcTo(67.31f, 67.31f, 0.0f, false, false, 475.93f, 303.91f)
                close()
                moveTo(256.0f, 336.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 80.0f, -80.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 256.0f, 336.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
