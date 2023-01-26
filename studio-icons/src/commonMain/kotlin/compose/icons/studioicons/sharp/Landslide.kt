package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Landslide: ImageVector
    get() {
        if (_landslide != null) {
            return _landslide!!
        }
        _landslide = Builder(name = "Landslide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.47f, 13.79f)
                lineToRelative(-2.58f, -1.03f)
                lineToRelative(-6.89f, 2.29f)
                lineToRelative(-4.0f, -1.54f)
                lineToRelative(0.0f, 2.1f)
                lineToRelative(4.0f, 1.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.57f, 11.42f)
                lineToRelative(-2.57f, -3.42f)
                lineToRelative(-6.0f, 0.0f)
                lineToRelative(0.0f, 3.61f)
                lineToRelative(4.0f, 1.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.05f)
                lineToRelative(-4.0f, -1.33f)
                lineToRelative(0.0f, 4.28f)
                lineToRelative(20.0f, 0.0f)
                lineToRelative(-4.97f, -6.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(-5.0f, -1.0f)
                lineToRelative(-3.0f, 2.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(3.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 7.0f)
                lineToRelative(-2.5f, 2.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(2.5f, 2.0f)
                lineToRelative(4.5f, -2.0f)
                lineToRelative(0.0f, -4.0f)
                close()
            }
        }
        .build()
        return _landslide!!
    }

private var _landslide: ImageVector? = null
