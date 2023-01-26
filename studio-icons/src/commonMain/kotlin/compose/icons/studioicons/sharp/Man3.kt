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

public val SharpGroup.Man3: ImageVector
    get() {
        if (_man3 != null) {
            return _man3!!
        }
        _man3 = Builder(name = "Man3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 8.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 7.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, -7.0f)
                lineToRelative(2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.751f)
                lineToRelative(2.249f, 2.249f)
                lineToRelative(-2.249f, 2.249f)
                lineToRelative(-2.249f, -2.249f)
                close()
            }
        }
        .build()
        return _man3!!
    }

private var _man3: ImageVector? = null
