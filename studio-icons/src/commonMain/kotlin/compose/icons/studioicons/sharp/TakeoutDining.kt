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

public val SharpGroup.TakeoutDining: ImageVector
    get() {
        if (_takeoutDining != null) {
            return _takeoutDining!!
        }
        _takeoutDining = Builder(name = "TakeoutDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.46f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.59f, 1.58f)
                lineToRelative(0.03f, -0.56f)
                lineToRelative(-4.05f, -4.07f)
                lineToRelative(-5.96f, 0.0f)
                lineToRelative(-4.05f, 4.07f)
                lineToRelative(0.03f, 0.5f)
                lineToRelative(-1.59f, -1.56f)
                lineToRelative(-1.41f, 1.43f)
                lineToRelative(2.66f, 2.56f)
                lineToRelative(14.69f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.93f, 20.0f)
                lineToRelative(12.14f, 0.0f)
                lineToRelative(0.63f, -8.45f)
                lineToRelative(-13.4f, 0.0f)
                close()
            }
        }
        .build()
        return _takeoutDining!!
    }

private var _takeoutDining: ImageVector? = null
