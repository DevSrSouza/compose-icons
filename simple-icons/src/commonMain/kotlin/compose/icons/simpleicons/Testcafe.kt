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

public val SimpleIcons.Testcafe: ImageVector
    get() {
        if (_testcafe != null) {
            return _testcafe!!
        }
        _testcafe = Builder(name = "Testcafe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.315f, 4.319f)
                lineToRelative(-8.69f, 8.719f)
                lineToRelative(-3.31f, -3.322f)
                lineToRelative(-2.069f, 2.076f)
                lineToRelative(5.379f, 5.398f)
                lineToRelative(10.76f, -10.796f)
                close()
                moveTo(5.849f, 14.689f)
                lineTo(0.0f, 19.682f)
                horizontalLineToRelative(24.0f)
                lineToRelative(-5.864f, -4.991f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-1.024f, 0.896f)
                horizontalLineToRelative(3.584f)
                lineToRelative(3.072f, 2.815f)
                horizontalLineTo(3.417f)
                lineToRelative(3.072f, -2.815f)
                horizontalLineToRelative(2.688f)
                lineToRelative(-0.896f, -0.896f)
                close()
            }
        }
        .build()
        return _testcafe!!
    }

private var _testcafe: ImageVector? = null
