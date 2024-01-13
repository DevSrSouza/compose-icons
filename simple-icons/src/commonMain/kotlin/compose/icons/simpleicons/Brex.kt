package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Brex: ImageVector
    get() {
        if (_brex != null) {
            return _brex!!
        }
        _brex = Builder(name = "Brex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.69f, 2.319f)
                arcToRelative(3.868f, 3.868f, 0.0f, false, false, -3.108f, 1.547f)
                lineToRelative(-0.759f, 1.007f)
                arcToRelative(1.658f, 1.658f, 0.0f, false, true, -1.313f, 0.656f)
                lineTo(0.0f, 5.529f)
                lineTo(0.0f, 21.68f)
                horizontalLineToRelative(5.296f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, 3.108f, -1.547f)
                lineToRelative(0.759f, -1.006f)
                arcToRelative(1.656f, 1.656f, 0.0f, false, true, 1.313f, -0.657f)
                lineTo(24.0f, 18.47f)
                lineTo(24.0f, 2.319f)
                horizontalLineToRelative(-5.31f)
                close()
                moveTo(19.798f, 14.268f)
                horizontalLineToRelative(-5.66f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, -3.108f, 1.547f)
                lineToRelative(-0.759f, 1.007f)
                arcToRelative(1.658f, 1.658f, 0.0f, false, true, -1.313f, 0.656f)
                lineTo(4.202f, 17.478f)
                lineTo(4.202f, 9.731f)
                horizontalLineToRelative(5.661f)
                arcToRelative(3.868f, 3.868f, 0.0f, false, false, 3.107f, -1.547f)
                lineToRelative(0.759f, -1.006f)
                arcToRelative(1.658f, 1.658f, 0.0f, false, true, 1.313f, -0.657f)
                horizontalLineToRelative(4.771f)
                lineToRelative(-0.015f, 7.747f)
                close()
            }
        }
        .build()
        return _brex!!
    }

private var _brex: ImageVector? = null
