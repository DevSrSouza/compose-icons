package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.UnfoldLessDouble: ImageVector
    get() {
        if (_unfoldLessDouble != null) {
            return _unfoldLessDouble!!
        }
        _unfoldLessDouble = Builder(name = "UnfoldLessDouble", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.58f, 1.41f)
                lineToRelative(-1.42f, -1.41f)
                lineToRelative(-3.17f, 3.17f)
                lineToRelative(-3.17f, -3.17f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.58f, 4.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.58f, 6.41f)
                lineToRelative(-1.42f, -1.41f)
                lineToRelative(-3.17f, 3.17f)
                lineToRelative(-3.17f, -3.17f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.58f, 4.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.42f, 17.59f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(3.17f, 3.17f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.58f, -4.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.42f, 22.59f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(3.17f, 3.17f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.58f, -4.59f)
                close()
            }
        }
        .build()
        return _unfoldLessDouble!!
    }

private var _unfoldLessDouble: ImageVector? = null
