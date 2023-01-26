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

public val SharpGroup.BakeryDining: ImageVector
    get() {
        if (_bakeryDining != null) {
            return _bakeryDining!!
        }
        _bakeryDining = Builder(name = "BakeryDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.36f, 7.58f)
                lineToRelative(-0.86f, 9.41f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(3.16f, -7.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.84f, 9.1f)
                lineToRelative(3.16f, 7.89f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(-0.86f, -9.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 16.99f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(1.0f, -10.99f)
                lineToRelative(-6.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.32f, 12.75f)
                lineToRelative(-1.81f, 4.5f)
                lineToRelative(1.95f, 0.96f)
                lineToRelative(2.06f, -1.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.48f, 16.99f)
                lineToRelative(2.06f, 1.22f)
                lineToRelative(1.95f, -0.96f)
                lineToRelative(-1.81f, -4.5f)
                close()
            }
        }
        .build()
        return _bakeryDining!!
    }

private var _bakeryDining: ImageVector? = null
