package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Forest: ImageVector
    get() {
        if (_forest != null) {
            return _forest!!
        }
        _forest = Builder(name = "Forest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                lineToRelative(-7.0f, -10.0f)
                lineToRelative(-7.0f, 10.0f)
                lineToRelative(1.86f, 0.0f)
                lineToRelative(-3.86f, 6.0f)
                lineToRelative(7.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(7.0f, 0.0f)
                lineToRelative(-3.86f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.14f, 12.0f)
                lineToRelative(1.86f, 0.0f)
                lineToRelative(-7.0f, -10.0f)
                lineToRelative(-2.39f, 3.41f)
                lineToRelative(5.31f, 7.59f)
                lineToRelative(-1.92f, 0.0f)
                lineToRelative(-0.03f, 0.0f)
                lineToRelative(3.22f, 5.0f)
                lineToRelative(4.81f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _forest!!
    }

private var _forest: ImageVector? = null
