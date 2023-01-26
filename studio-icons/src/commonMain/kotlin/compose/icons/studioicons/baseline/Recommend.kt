package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Recommend: ImageVector
    get() {
        if (_recommend != null) {
            return _recommend!!
        }
        _recommend = Builder(name = "Recommend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(18.0f, 11.8f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.1f, 0.5f)
                lineToRelative(-2.1f, 4.9f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, true, -1.3f, 0.8f)
                lineTo(9.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.28f, 1.28f, 0.0f, false, true, 0.4f, -1.0f)
                lineTo(12.0f, 5.0f)
                lineToRelative(0.69f, 0.69f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, 0.3f, 0.7f)
                verticalLineToRelative(0.2f)
                lineTo(12.41f, 10.0f)
                lineTo(17.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _recommend!!
    }

private var _recommend: ImageVector? = null
