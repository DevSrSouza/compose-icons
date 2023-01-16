package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TestTubeEmpty: ImageVector
    get() {
        if (_testTubeEmpty != null) {
            return _testTubeEmpty!!
        }
        _testTubeEmpty = Builder(name = "TestTubeEmpty", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                moveTo(14.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 18.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _testTubeEmpty!!
    }

private var _testTubeEmpty: ImageVector? = null
